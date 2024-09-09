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
		edad:= random(100);
	end;
end;

procedure agregarNodo(var a:arbol; s:socio);
begin
	if(a = nil) then begin
		a^.dato:= s;
		a^.hi:= nil;
		a^.hd:= nil;
	end
	else
		if(s.numero < a^.dato.numero)then
			agregarNodo(a^.hi,s);
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
	
var
	a:arbol;
begin
	cargarArbol(a);
end.
