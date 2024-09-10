program ejercicio1;
type
	socio = record
		numero: integer;
		nombre: string;
		edad: integer;
	end;
	
	arbol=^nodo;
	nodo = record
		dato: socio;
		hi: arbol;
		hd: arbol;
	end;
	
procedure cargarArbol(var a:arbol);

procedure leerSocio(var s: socio);
begin
	writeln('ingrese el numero de socio: ');
	readln(s.numero);
	if(s.numero <> 0)then begin
		writeln('Ingrese nombre: ');
		readln(s.nombre);
		s.edad:= random(100);
	end;
end;

procedure agregarNodo(var a:arbol; s:socio);
begin
	if(a = nil) then begin
		new(a);
		a^.dato:= s;
		a^.hi:= nil;
		a^.hd:= nil;
	end
	else begin
		if(s.numero < a^.dato.numero)then
			agregarNodo(a^.hi,s)
		else
			agregarNodo(a^.hd,s);
	end;
end;

var
	s:socio;
begin
	leerSocio(s);
	while(s.numero <> 0)do begin
		agregarNodo(a,s);
		leerSocio(s);
	end;
end;	

procedure mostrarSocio(s:socio);
begin
	writeln('numero',s.numero);
	writeln('nombre',s.nombre);
	writeln('edad',s.edad);
end;

procedure inOrden(a: arbol); //muestro primero desde los de mas a la izquierda osea los menores
begin
	if(a <> nil)then begin
		inOrden(a^.hi);
		mostrarSocio(a^.dato);
		inOrden(a^.hd);
	end;
end;

procedure posOrden(a: arbol);// muestro primero los que estan mas a la derecha osea los mas grandes
begin
	if(a <> nil)then begin
		posOrden(a^.hd);
		mostrarSocio(a^.dato);
		posOrden(a^.hi);
	end;
end;

procedure buscarMayor(a:arbol; var mayorEdad:integer; var socioMayor:socio);
begin
	if(a <> nil)then begin
		buscarMayor(a^.hi,mayorEdad,socioMayor);
		if(mayorEdad < a^.dato.edad)then begin
			mayorEdad:= a^.dato.edad;
			socioMayor:= a^.dato;
		end;
		buscarMayor(a^.hd,mayorEdad,socioMayor);
	end;
end;

procedure aumentarEdad(var a: arbol; var sociosImpar: integer);
begin
	if(a <> nil)then begin
		aumentarEdad(a^.hi,sociosImpar);
		if(a^.dato.edad mod 2 <> 0)then begin
			sociosImpar:= sociosImpar + 1;
			a^.dato.edad:= a^.dato.edad + 1;
		end;
		aumentarEdad(a^.hd,sociosImpar);
	end;
end;

function existeNombre(a: arbol; nombreB:string): boolean;
begin
	if(a = nil)then
		existeNombre:= false
	else if (a^.dato.nombre = nombreB) then
		existeNombre:= true
	else
		existeNombre:= (existeNombre(a^.hi,nombreB))or (existeNombre(a^.hd,nombreB));	
end;

procedure sumarSocios(a: arbol; var totalSocios:integer);
begin
	if(a <> nil)then begin
		sumarSocios(a^.hi, totalSocios);
		sumarSocios(a^.hd, totalSocios);
		totalSocios:= totalSocios + 1;
	end;
end;
	
var
	a:arbol;
	mayorEdad:integer;
	socioMayor:socio;
	sociosImpar:integer;
	nombreBuscado:string;
	totalSocios:integer;
begin
	randomize;
	a:= nil;
	mayorEdad:= -1;
	sociosImpar:= 0;
	totalSocios:=0;
	cargarArbol(a);
	writeln('mostrar los socios de forma creciente');
	inOrden(a);
	writeln('mostrar los socios de manera decreciente');
	posOrden(a);
	writeln('se busca al usuario con mayor edad');
	buscarMayor(a,mayorEdad,socioMayor);
	writeln('el socio Mayor es: ');
	mostrarSocio(socioMayor);
	writeln('se aumenta la edad de los socios en 1');
	aumentarEdad(a,sociosImpar);
	writeln('Ingrese un nombre: ');
	readln(nombreBuscado);
	if(existeNombre(a,nombreBuscado))then
		writeln('el nombre buscado existe')
	else
		writeln('el nombre buscado no existe');
	sumarSocios(a,totalSocios);
	writeln('la cantidad total de socios es: ',totalSocios);
end.
