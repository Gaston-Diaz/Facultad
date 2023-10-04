program practica1ejercicio1;
const
	fin = 50;
type
	venta = record
		diaVenta: integer;
		codVenta: integer;
		cantVendida: integer;
	end;
	
	vector = array[1..fin] of venta;
	
procedure eliminarEntre(vo: vector,var vb:vector, var dimlb: integer, v1:integer,v2:integer)
var
	i,inicio,fin: integer;
begin
	for i:= 1 to diml do begin
		if (v[i].codVenta >= v1)then  //si el codigo de venta es mayor al primer numero pasado
			inicio:= i;
		if(v[i].codVenta >= v2)then // si el codigo de venta es mayor al segundo numero pasado
			fin:= i;
	end;
	
	for fin + 1 to dimlb do begin
		v[inicio]:= v[fin];
		inicio:= inicio +1;
	end;
	//actualizar dimension logica inicio - fin
	
end;
	
procedure ordenarVector(v: vector; var vo: vector diml:integer)
var
	i,j: integer;
	actual: venta;
begin
	for i:= 2 to diml do begin
		actual := v[i].codVenta;
		j:= i-1;
		while (j > 0) and (v[j].codVenta > actual) do begin
			v[j+1] := v[j];
			j:= j - 1;
		end;
		v[j+1]:= actual;	
	end;
	vo:= v;
end;

procedure recorrerVector(v: vector; diml: integer);// punto b
var
	i: integer;
begin
	for (i:= 0; i < diml; i++) then begin
		writeln(v[i].diaVenta);
		writeln(v[i].codVenta);
		writeln(v[i].cantVendida);
	end;
end;
	
procedure cargarVector(var v: vector; var diml: integer) //punto a

	procedure leerProducto(var p: producto);
	begin
		writeln('Ingrese codigo de venta');
		readln(p.codVenta);
		if (p.codVenta <> 0) then begin
			writeln('Ingrese dia de venta');
			readln(p.diaVenta);
			writeln('Ingrese cantidad vendida');
			readln(p.cantVendida);
		end;
	end;
	
var
	p: producto;
	i: integer;
begin
	i:= 0;
	leerProducto(p);
	while(p.diaVenta <> 0) and (fin <= diml) do begin
		v[i]:= p;
		diml:= diml + 1;
		i:= i + 1;
		leerProducto(p);
	end;
	
end;
var
	v: vector;
	vo: vector;
	vb: vector;
	diml: integer;
	dimlb: integer;
	valor1,valor2: integer;
begin
	diml:= 0;
	cargarVector(v,diml);//punto a
	recorrerVector(v,diml);// punto b
	ordenarVector(v,vo, diml);// punto c
	recorrerVector(vo,diml);//punto d
	dimlb := diml;
	writeln('Ingrese en primer valor');
	readln(valor1);
	writeln('Ingrese el segundo valor');
	readln(valor2);
	eliminarEntre(vo,vb,dimlb,valor1, valor2);//punto e
	recorrerVector(vo,dimlb);//punto f
end.

