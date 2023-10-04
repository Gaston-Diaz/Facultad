program adicional1;
const
	dimf = 300;
type
	oficina = record
		codigo: integer;
		dni:integer;
		valor:integer;
	end;
	
	vector = array[1..dimf] of oficina;

procedure imprimir(v:vector;diml:integer);
var
	i:integer;
begin
	for i:= 1 to diml do begin
		writeln(v[i].codigo);
		writeln(v[i].dni);
		writeln(v[i].valor);
		writeln('-----------');
	end;
end;

procedure ordenar(var v:vector;diml:integer);
var
	i,j: integer;
	dato: oficina;
begin
	for i:= 2 to diml do begin
		dato:= v[i];
		j:= i - 1;
		while(j > 0)and(v[j].codigo > dato.codigo) do begin
			V[j+1]:= v[j];
			j:= j - 1;
		end;
		v[j+1]:= dato;
	end;
end;
	
procedure cargarVector(var v: vector; var diml:integer);

procedure leerOficina(var o:oficina);
begin
	writeln('ingrese codigo');
	readln(o.codigo);
	if(o.codigo <> -1)then begin
		writeln('ingrese dni');
		readln(o.dni);	
		writeln('ingrese valor');
		readln(o.valor);	
	end;
end;

var
	o:oficina;
begin
	leerOficina(o);
	while(o.codigo <> -1)do begin
		v[diml]:= o;
		diml:= diml + 1;
		leerOficina(o);
	end;
end;
var
	v:vector;
	diml:integer;
begin
	diml:=1;
	cargarVector(v,diml);
	imprimir(v,diml);
	ordenar(v,diml);
	writeln('---Aca se imprime el vector ordenado');
	imprimir(v,diml);
	writeln('----------------------');
end.
