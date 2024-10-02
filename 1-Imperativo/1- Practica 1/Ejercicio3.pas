program ejer3;
type
	pelicula = record
		codigo: integer;
		genero: integer;
		puntaje: integer;
	end;
	
	lista=^nodo;
	nodo = record
		dato: pelicula;
		sig: lista;
	end;
	
procedure insertarOrdenado(var l:lista; p:pelicula);
var
	aux,ant,act: lista;
begin
	new(aux);
	aux^.dato:= p;
	act:=l;
	while(act <> nil) and (act.dato.codigo > p.codigo)do begin
		ant:= act;
		act:= act^.sig;
	end;
	if(ant = act)then
		l:=aux;
	else
		ant^.sig.= aux;
		aux.sig:= act;
		
end;
	
procedure leerPelicula(var p: pelicula);
begin
	writeln('Ingrese el codigo de pelicula');
	readln(p.codigo);
	if(p.codigo <> -1)then begin
		p.genero:= random(9);
		p.puntaje:= random(11);
	end;
end;

	
procedure cargarLista(var l:lista; var diml:integer);
var
	p:pelicula;
begin
	leerPelicula(p);
	while(p.codigo <> -1)do begin
		insertarOrdenado(l,p);
		diml:= diml + 1;
		leerPelicula(p);
	end;
end;

var
	l:lista; 
	diml: integer;
begin
	diml:= 0;
	cargarLista(l,diml);
end.
