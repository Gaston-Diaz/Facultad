program ejer3p1;
const
	fin = 8;
type
	pelicula = record;
		codP: integer;
		codG: integer;
		puntaje: integer;
	end;
	
	lista =^nodo;
	nodo = record
		dato:pelicula
		sig:lista;
	end;
	vector = array[1..fin] of lista;
	vectorP = array[1..fin] of pelicula;
	
procedure ordenarVectorPuntaje(var vp: vectorP); // punto c
var
	i:integer;
	dato: integer;
begin
	for i:= 2 to fin do begin
		dato:= vp[i];
		j:= i-1;
		while(j>0)and(vp[j] > dato) do begin
			v[j+1]:= v[j];
			j:= j -1;
		end;
		v[j+1]:= dato;
	end;
end;
	
procedure cargarVectorPuntaje(var vp: vectorP;v vector); // punto b

procedure buscarMaximo(l: lista; var max: integer, var aux: pelicula);

begin
	while (l <> nil) do begin
		if (l^.dato.puntaje > max) then
			max:= l^.dato.puntaje
			maxcCod:= l^.dato; // obtengo el codigo de la pelicula con mayor puntaje
		l:= l^.sig;
	end;	
end;

var
	i, max, aux: integer;
begin
	for i:= 1 to fin do begin
		max:= -1;
		buscarMaximo(v[i], max, aux);
		v[i]:= aux;
	end;
end;
	
procedure cargarVector(var v: vector); //punto a

procedure agregarFin(var l: lista, p:pelicula);
var
	ant,act,aux: lista;
begin
	new(aux);
	aux^.dato:= p;
	aux^.sig:= nil;
	if(l = nil) then
		l:= aux;
	else
		act:= l;
		while(act<>nil) do begin
			ant:= act;
			act:= act^.sig;
		end;
		ant^.sig:= aux;
end;

procedure leerPelicula(var p);
begin
	readln(p.codP);
	if(p.codP <> -1)then begin
		readln(p.codG);
		readln(p.puntaje);
	end;
end;

procedure inicializar(var v:vector);
var
	i: integer
begin
	for i:= 1 to fin do begin
		v[i]:= nil;
	end;
end;

var
	p:pelicula;
begin
	leerPelicula(p);
	while(p.codP <> -1) do begin
		agregarFin(v[p.codG],p);
		leerPelicula(p);
	end;
end;

var
	v: vector;
	vp: vectorP;
	l1: lista;
begin
	inicializar(v);
	cargarVector(v); // punto a
	cargarVectorPuntaje(vp,v); // punto b
	ordenarVectorPuntaje(vp); //punto c
	maximoYminimo()
end.
