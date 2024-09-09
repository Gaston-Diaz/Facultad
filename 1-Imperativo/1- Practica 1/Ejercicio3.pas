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
begin
end;
	
procedure leerPelicula(var p: pelicula);
begin
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
