Program Ejercicio1;
const
	cod = 15;
	cant = 99;
type
	venta = record
		dia: integer;
		codigo: integer;
		cantidad: integer;
	end;
	
ventas = array [1..50] of venta;

function random1 (max: integer): integer;
var
	num:integer;
begin
	num:= random(max);
	random1 := num;
end;

procedure leerVenta(var ve: venta);
begin
	write('ingrese dia: ');
	readln(ve.dia);
	if (ve.dia <> 0)then begin
		ve.codigo:= random1(cod);
		ve.cantidad:= random1(cant);
	end;
end;

procedure cargarVector(var v:ventas; var diml: integer);
var
	ve: venta;
begin
	leerVenta(ve);
	while(ve.dia <> 0) do begin
		diml:= diml + 1;
		v[diml]:= ve;
		leerVenta(ve);
	end;
end;

procedure mostrarVenta(ve:venta);
begin
	writeln('dia: ', ve.dia);
	writeln('codigo: ', ve.codigo);
	writeln('cantidad: ', ve.cantidad);
end;

procedure mostrarVector(v:ventas; diml:integer);
var
	i:integer;
begin
	for i:= 1 to diml do begin
		mostrarVenta(v[i]);
		writeln('-------');
	end;
end;

procedure ordenarVector(var v:ventas; diml:integer);
var
	i, j, actual: integer;
begin
	for i := 2 to diml do begin
		actual := v[i].codigo;
		j := i - 1;
		while (j >= 1) and (v[j].codigo > actual) do begin
			v[j+1] := v[j];
			j := j - 1;
		end;
		v[j+1].codigo:= actual;
	end;
	mostrarVector(v, diml);
end;


var
	v:ventas;
	diml:integer;
begin
	randomize;
	diml:=0;
	cargarVector(v,diml); //a
	mostrarVector(v,diml); //b
	writeln('desde aca se ordena el vector');
	ordenarVector(v,diml); //c
end.
