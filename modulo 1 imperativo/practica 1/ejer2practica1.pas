program ejer2p1;
const
	fin = 300;
type
	oficina = record
		codId: integer;
		dniPro: integer;
		valor: integer; //real
	end;
	
	vector = array[1..fin] of oficina;
	
procedure ordenarVector2(var v2:vector, diml: integer);
var
	i,j,pos: integer:
	item: oficina;
begin
	for i:= 2 to diml do begin
		item:= v[i].codId;
		j:= i-1;
		while (j > 0)and(v[j].codId > item) do begin
			v[j+1]:= v[j]
			j:= j-1;
		end;
		v[j+1]:= item;
	end;
end;
	
procedure ordenarVector(var v1:vector, diml: integer);
var
	i,j,pos: integer:
	item: oficina;
begin
	for i:= 1 to diml -1 do begin
		pos:= i;
		for j:= i+1 to diml do begin
			if (v[j].codId < v[pos].codId)then
				pos:= j;
		end;
		item := v[pos];
		v[pos] := v[i];
		v[i] := item;
	end;
end;
	
procedure cargarVector(var v1:vector, var diml:integer);

procedure leerOficina(var o:oficina);
begin
	readln(o.codId)
	if(o.codId <> -1) then begin
		readln(o.dniPro);
		readln(o.valor);
	end;
end;

var
	o: oficina
begin
	leerOficina(o);
	while(o.codId <> -1)do begin
		v[diml]:= o;
		diml:= diml + 1;
	end;
end;

var
	v1,v2: vector
	diml: integer
begin
	diml:= 0;
	cargarVector(v1,diml);
	v2:= v1;
	ordenarVector(v1,diml);
	ordenarVector2(v2,diml);
end.
