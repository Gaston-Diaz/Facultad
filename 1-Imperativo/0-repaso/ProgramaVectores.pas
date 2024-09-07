Program Vectores;
type
	vector = array[1..50] of integer;
	
function generarRandom(min: integer; max: integer): integer;
var
	num:integer;
	ok:boolean;
begin
	ok:= true;
	num:= random(max); //genero numero random
	while(ok) do begin //mientras el numero no este en el rango sigo
		if(num >= min)then //si el numero esta en el rango
			ok:= false; //pongo ok en falso para salir del bucle
		num:= random(max); // sino, genero un nuevo numero random
	end;
	generarRandom:= num;
end;	
	
procedure CargarVector(var v:vector; var diml:integer; min:integer; max:integer);
var
	dato:integer;
begin
	dato:= generarRandom(min,max);
	while(diml < 50)and(dato <> 0)do begin
		v[diml]:= dato;
		diml:= diml + 1;
		dato:= generarRandom(min,max);
	end;
	if(diml = 50)then
		writeln('vector cargado hasta su maxima capacidad')
	else
		writeln('vector cargado hasta su posicion: ', diml);
end;

var
	v: vector;
	max,min,diml: integer;
begin
	randomize;
	diml:=0;
	writeln('Ingrese valor inicio: ');
	readln(min);
	writeln('Ingrese valor maximo: ');
	readln(max);
	CargarVector(v,diml,min,max);
end.
