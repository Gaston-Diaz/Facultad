program adicionales2;
type
	auto = record
		patente: string;
		año: integer;
		fabricacion:string;
		marca: string;
		modelo: string;
	end;
	
	auto2 = record
		patente: string;
		año: integer;
		fabricacion:string;
		modelo: string;
	end;

	lAutos=^nodo1
	nodo1= record
		dato:auto2;
		sig:lAutos;
	end;
		
	arbol=^nodo2
	nodo2= record
		dato: auto
		hi: arbol;
		hd: arbol;
	end;
		
	marcas = record
		marca: string;
		listaAutos: lAutos
	end;
	
	arbol2=^nodo3
	nodo3= record
		dato:marcas;
		hi:arbol;
		hd:arbol;
	end;
//------------------------------------------------PUNTO F---------------------------------------------------------------------------------//
procedure buscarPatenteA2(a2:arbol2,patente:string,aux:string)

function buscar(l:listaAutos, patente): boolean // busco en la lista
var
	ok:boolean
begin
	ok:= false;
	while(l <> nil)do begin
		if(l^.dato.patente = patente)then
			ok:= true;
		l:= l^.sig;
	end;
	buscar:= ok;					//si esta la patente devuelvo true
end;

begin
	if(a2 <> nil)then
			buscarPatenteA2(a2^.hi, patente,aux);
			ok:= buscar(a2^.dato.listaAutos,patente);
			if(ok)then				//si es verdadero entonces puedo devolver el campo marca del nodo del arbol
				aux:= a2^.dato.marca;
			else
				aux:= 'noExiste';
			buscarPatenteA2(a2^.hd,patente,aux);
end;
//------------------------------------------------PUNTO E---------------------------------------------------------------------------------//
function buscarPatenteA1(a1:arbol, patente:string):string
begin
	if(a1 = nil)then
		buscarPatenteA1:= 'noExiste'
	else
		if(a1^.dato.patente = patente)then
			buscarPatenteA1:= a1^.dato.patente
		else
			if(a1^.dato.patente > patente)then
				buscarPatenteA1:= buscarPatenteA1(a1^.hi, patente)
			else
				buscarPatenteA1:= buscarPatenteA1(a1^.hd; patente);
		
end;
//------------------------------------------------PUNTO C---------------------------------------------------------------------------------//
procedure cantidadDeAutos2(a2: arbol2, marca:string, var cant2:integer)

procedure sumar(l: lAutos, var cant2: integer)
begin
	while(l <> nil) do begin
		cant2:= cant2 + 1;
		l:= l^.sig;
	end;
end;

function buscar(a2:arbol, marca:string): lAutos //busco la marca y devuelvo la lista 
begin
	if(a = nil)then buscar:= nil;
	else
		if(a^.dato.marca = marca)then
			buscar:= a^.dato.listaAutos
		else
			if(a^.dato.marca > marca)then
				buscar:= buscar(a^.hi, marca)
			else
				buscar:= buscar(a^.hd, marca)
end;

var
	l:lAutos;
begin
	l:= buscar(a2,marca); // me quedo con la lista
	if (l <> nil)then     //si encontre la marca
		sumar(l,cant2);   // recorro y sumo
end;
//------------------------------------------------PUNTO B---------------------------------------------------------------------------------//
procedure cantidadDeAutosA1(a1: arbol, marca:string, var cant1: integer)
begin
	if(a1 <> nil) then begin
		cantidadDeAutosA1(a1^.hi, marca, cant1);
		if(a1^.dato.marca = marca)then
			cant1:= cant1 + 1;				// sumo 1 si encuentro un auto de esa marca
		cantidadDeAutosA1(a1^.hd, marca, cant1);
	end; 			
end;
//--------------------------------------------------PUNTO A------------------------------------------------------------------------------//
procedure cargarArbol(var a1: arbol);

procedure agregar2(var a2:arbol, a:auto)  //PUNTO a-ii agrega por marca en un arbol de listas

procedure llenarDatos(var l:lAutos, a:auto)//cargo la lista con los autos de forma ordenada por algun criterio(patente)
var
	aux,ant,act: lAutos;
begin
	new(aux);
	aux^.dato:= a;
	if(l = nil)then
		l:= aux
	else
		act:= l;
		while(act <> nil)and(act^.dato.patente < a.patente)do begin
			ant:= act;
			act:= act^.sig;
		end;
		if(ant = nil)then
			ant^.sig:= aux;
			aux^.sig:= nil
		else
			ant^.sig:= aux;
			aux^.sig:= act;	
end;

begin
	if(a2 = nil)then                  		//si el arbol esta vacio
		new(a)					      		//pido espacio
		a2^.dato.marca:= a.marca;     		//agrego al campo marca
		a^.dato.listaAutos:= nil;	  		//inicializo la lista vacia
		llenarDatos(a2^.dato.listaAutos,a); //mando el primer elemento a la lista
	else
		if (a^.dato.marca = a.marca)then	 //si es igual a la marca
			llenarDatos(a^.dato.listaAutos,a)//agrego a la lista el elemento
		if (a^.dato.marca > a.marca)then	 //si la marca es mas chica
			agregar2(a^.hi, a)				 //llamo al agregar por la izquierda
		else
			agregar2(a^.hd, a);				 //llamo al agregar por derecha

end;

procedure agregar(var a1: arbol; a: auto) //PUNTO a-i agregar en el arbol ordenado por patente
begin
	if(a1 = nil)then begin
		a1^.dato:= a;
		a1^.hi:= nil;
		a1^.hd:= nil;
	end
	else
		if (a1^.dato.patente >= a.patente)then
			agregar(a1^.hi)
		else
			agregar(a1^.hd);
end;

procedure leerAuto(a:auto);
begin
	readln(a.patente);
	if(a.patente <> -1) then begin
		readln(a.año);
		readln(a.fabricacion);
		readln(a.marca);
		readln(a.modelo);
	end;
end;

var
	a: auto
begin
	leerAuto(a);
	while(a.patente <> -1)do begin
		agregar(a1,a);
		agregar2(a2,a);
		leerAuto(a);
	end;
end;		
//----------------------------------------------------PROGRAMA PRINCIPAL-------------------------------------------------------------------//
var
	a1: arbol;
	a2: arbol2;
	cant1: integer;
	cant2: integer;
	marca: string;
	patente: string;
	aux: string;
BEGIN
	a1:= nil;
	a2:= nil;  
	cargarArbol(a1,a2);    //punto a
	readln(marca)
	readln(patente);
	if (a1 <> nil)then begin
		cant1:= 0;
		cantcantidadDeAutosA1(a1, marca,cant1); //punto b busca en todos los nodos la marca y los cuenta
		write('la cantidad de autos es:' cant1); 
		
		write('el modelo del auto con la patente es:' buscarPatenteA1(a1,patente));// punto e
	end;
	if (a2 <> nil) then begin	
		cant2:= 0;
		cantidadDeAutosA2(a2, marca, cant2); //punto c busca la marca que esta en un nodo y devuelve la cantidad de elementos de la lista
		write('la cantidad de autos es:' cant2);
		
		buscarPatenteA2(a2,marca,aux);
		write('el modelo del auto con la patente es:'aux); //punto f
	end;
	
END.

