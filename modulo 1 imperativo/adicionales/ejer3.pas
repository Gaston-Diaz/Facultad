program ejer3;
const
	dimf = 10;
type
	producto= record
		cod: integer;
		rubro: integer;
		stock: integer;
		precio: integer;
	end;
	
	arbol=^nodo;
	nodo= record
		dato:producto;
		hi:arbol;
		hd:arbol;
	end;
	
	vector = array[1..dimf]of arbol;
	
procedure buscarEntre(v:vector; var cod1:integer; var cod2:integer);

procedure sumar(a:arbol; cod1:integer; cod2:integer; var result:integer);
begin
	if(a <> nil) then begin
		sumar(a^.hi,cod1,cod2,result);
		if(a^.dato.cod >= cod1)and(a^.dato.cod <= cod2)then
			result:= result + 1;
		sumar(a^.hd,cod1,cod2,result)
	end;
end;

var
	i:integer;
	result:integer;
begin
	for i:= 1 to dimf do begin
		result:= 0;
		sumar(v[i],cod1,cod2, result);
		writeln(result);
	end;
end;
	
procedure stockProductoMayor(v:vector);

function buscarMaximo(a:arbol): arbol;
begin
	if(a = nil)then
		buscarMaximo:= nil
	else
		while(a^.hd <> nil)do begin
			a:= a^.hd;
		end;
		buscarMaximo:= a;
end;

var
	i:integer;
	aux:arbol;
begin
	for i:= 1 to dimf do begin
		aux:= buscarMaximo(v[i]);
		write(aux^.dato.cod);
		write(aux^.dato.stock);
	end;
end;
	
function buscar(a:arbol; cod:integer):boolean;
begin
	if(a = nil)then
		buscar:= false
	else
		if(a^.dato.cod = cod)then
			buscar:= true
		else
			if(a^.dato.cod > cod)then
				buscar:= buscar(a^.hi, cod)
			else
				buscar:= buscar(a^.hd, cod);
end;
	
procedure cargarVector(var v:vector);

procedure agregar(var a: arbol; p:producto);
begin
	if(a = nil)then begin
		new(a);
		a^.dato:= p;
		a^.hi:= nil;
		a^.hd:= nil;
	end
	else
		if(a^.dato.cod > p.cod)then
			agregar(a^.hi,p)
		else
			agregar(a^.hd,p);
end;

procedure leerProducto(var p:producto);
begin
	writeln('ingresar codigo producto');
	readln(p.cod);
	if(p.cod <> -1)then begin
		writeln('ingresar rubro producto');
		readln(p.rubro);
		writeln('ingresar stock producto');
		readln(p.stock);
		writeln('ingresar precio producto');
		readln(p.precio);
	end;
end;

var
	p:producto;
begin
	leerProducto(p);
	while(p.cod <> -1) do begin
		agregar(v[p.rubro],p);
		leerProducto(p);
	end;
end;
	
procedure inicializarVector(var v:vector);
var
	i:integer;
begin
	for i:= 1 to dimf do begin
		v[i]:= nil;
	end;
end;

var
	v: vector;
	rubro: integer;
	codigo: integer;
	existe: boolean;
	cod1: integer;
	cod2: integer;
begin
	inicializarVector(v);
	cargarVector(v);			//punto a
	writeln('ingrese un rubro');
	readln(rubro);
	writeln('ingrese un codigo');
	readln(codigo);
	if(v[rubro] <> nil)then begin
		existe:= buscar(v[rubro],codigo);  //punto b
		if(existe)then
			writeln('el codigo existe para ese rubro')
		else
			writeln('el codigo no existe para ese rubro');
	end;
	stockProductoMayor(v);   //punto c
	writeln('ingrese un codigo');
	readln(cod1);
	writeln('ingrese otro codigo');
	readln(cod2);
	buscarEntre(v,cod1,cod2); //d
end.
