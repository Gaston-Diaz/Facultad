program adicionales1;
const
	dimf = 300;
type
	oficina= record
		cod: integer;
		dni: integer;
		valor: integer;
	end;
	
	vector = array [1..dimf] of oficina
	
procedure ordenar(var v:vector; diml:integer);
var
	i,j: integer;
	dato: oficina;
begin
	for i:= 2 to diml do begin
		dato:= v[i].cod;
		j:= i - 1;
		while (j > 0) and (v[j].cod > dato)do begin
			v[j+1]:= v[j];
			j:= j-1;
		end;
		v[j+1]:= dato;
	end;
end;
	
procedure cargarVector(var v: vector; var diml:integer);

procedure leerOficina(var o:oficina)
begin
	readln(o.cod);
	if(o.cod <> -1)then begin
		readln(o.dni);
		readln(o.valor);
	end;
end;

var
	o: oficina
begin
	leerOficina(o);
	while(o.cod <> -1)do begin
		v[diml]:= o;
		diml:= diml + 1;
		leerOficina(o);
	end;
end;


var
	v: vector;
	diml: integer;
BEGIN
	diml:= 0;
	cargarVector(v,diml);
	ordenar(v,diml);
	busquedaDico(v);
END.

