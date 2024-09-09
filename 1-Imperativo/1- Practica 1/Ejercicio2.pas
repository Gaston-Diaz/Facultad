program ejer2;
const
	total = 300;
type
	oficina = record
		codigo: integer;
		dni: integer;
		valor: integer;
	end;
	
	oficinas = array[1..total]of oficina;

procedure leerOficina(var o:oficina);
begin
	writeln('Ingrese codigo: ');
	readln(o.codigo);
	if(o.codigo <> -1) then begin
		o.dni:= random(2000);
		o.valor:= random(2000);
	end;
end;
	
procedure cargarVector(var v:oficinas; var diml:integer);
var
	o:oficina;
begin
	leerOficina(o);
	while(o.codigo <> -1)do begin
		diml:= diml + 1;
		v[diml]:= o;
		leerOficina(o);
	end;
end;

procedure ordenarVectorInsercion(var v:oficinas; diml:integer);
var
	i,j,aux:integer;
begin
	for i:= 2 to diml do begin
		aux:= v[i].codigo;
		j:= i - 1;
		while(j > 0)and(v[j].codigo > aux)do begin
			v[j+1]:= v[j];
			j:= j - 1;
		end;
		v[j+1].codigo := aux;
	end;
end;

var
	v: oficinas;
	diml: integer;
begin
	randomize;
	diml:= 0;
	cargarVector(v,diml);
	ordenarVectorInsercion(v,diml);
	
end.
