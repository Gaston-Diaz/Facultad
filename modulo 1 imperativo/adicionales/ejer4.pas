program ejer4;
type
	reclamo= record
		cod:integer;
		dni:integer;
		anio:integer;
		tipo:string;
	end;
	
	listaReclamos=^nodo2;
	nodo2= record
		dato:reclamo;
		sig:listaReclamos;
	end;
	
	regReclamos= record
		dni: integer;
		reclamos: listaReclamos;
		total:integer;
	end;
	
	arbol=^nodo;
	nodo= record
		dato: regReclamos;
		hi:arbol;
		hd:arbol;
	end;
	
procedure reclamosPorAnio(a:arbol;anio:integer);

procedure mostrarCodigosReclamos(l:listaReclamos;anio:integer);
begin
	while(l <> nil)do begin
		if(l^.dato.anio = anio)then
			writeln(l^.dato.cod);
		l:=l^.sig;
	end;
end;

begin
	if(a <> nil)then begin
		reclamosPorAnio(a^.hi,anio);
			mostrarCodigosReclamos(a^.dato.reclamos,anio);
		reclamosPorAnio(a^.hd,anio);
	end;
end;
	
procedure reclamosEntreDni(a:arbol;dni1:integer;dni2:integer;var cant:integer);
begin
	if(a <> nil)then begin
		reclamosEntreDni(a^.hi,dni1,dni2,cant);
		if(a^.dato.dni >= dni1)and(a^.dato.dni <= dni2)then
			cant:= cant + a^.dato.total;
		reclamosEntreDni(a^.hd,dni1,dni2,cant);
	end;
end;
	
function buscarDni(a:arbol; dni:integer):integer;
begin
	if(a = nil)then
		buscarDni:= 0
	else
		if(a^.dato.dni = dni)then
			buscarDni:= a^.dato.total
		else
			if(a^.dato.dni > dni)then
				buscarDni(a^.hi,dni)
			else
				buscarDni(a^.hd,dni);
end;
	
procedure cargarArbol(var a:arbol);

procedure leerReclamo(var r:reclamo);
begin
	writeln('Ingrese el codigo');
	readln(r.cod);
	if(r.cod <> -1)then begin
		writeln('Ingrese el dni');
		readln(r.dni);
		writeln('Ingrese el anio');
		readln(r.anio);
		writeln('Ingrese el tipo');
		readln(r.tipo);
	end;
end;


procedure cargar(var a:arbol; r:reclamo);

procedure agregarFin(var l:listaReclamos; r:reclamo);
var
aux,ant,act:listaReclamos;
begin
	new(aux);
	aux^.dato:= r;
	aux^.sig:= nil;
	if(l = nil)then
		l:= aux
	else
		act:= l;
		while(act <> nil)do begin
			ant:= act;
			act:= act^.sig;
		end;
		ant^.sig:= act;
end;

begin
	if(a = nil)then begin
		new(a);
		a^.dato.dni:= r.dni;
		a^.dato.reclamos:= nil;
		agregarFin(a^.dato.reclamos,r);
		a^.dato.total:= 1;
		a^.hi:= nil;
		a^.hd:= nil;
	end
	else
		if(a^.dato.dni = r.dni)then begin
			agregarFin(a^.dato.reclamos,r);
			a^.dato.total:= a^.dato.total + 1;
		end
		else
			if(a^.dato.dni > r.dni)then
				cargar(a^.hi,r)
			else
				cargar(a^.hd,r);	
end;

var
	r:reclamo;
begin
	leerReclamo(r);
	while(r.cod <> -1)do begin
		cargar(a,r);
		leerReclamo(r);
	end;
end;
	
var
	a:arbol;
	unDni:integer;
	cantReclamosDNI:integer;
	dni1,dni2,cant:integer;
	unAnio: integer;
begin
	cargarArbol(a); //punto a
	writeln('ingrese un dni');
	readln(unDni);
	cantReclamosDNI:= buscarDni(a,unDni); //punto b
	write('la cantidad de reclamos para el dni son',cantReclamosDNI);
	readln(dni1);
	readln(dni2);
	cant:=0;
	reclamosEntreDni(a,dni1,dni2,cant); //punto c RECORRE TODO EL ARBOL, DEBERIA LLEGAR SOLO AL DNI MINIMO y AL MAXIMO
	readln(unAnio);
	reclamosPorAnio(a,unAnio); //punto d
end.
