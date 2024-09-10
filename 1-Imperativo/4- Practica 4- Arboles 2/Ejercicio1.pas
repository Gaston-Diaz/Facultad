program ejercicio1;
type
	producto = record
		codigoP: integer;
		cantidad: integer;
		vendidos: integer;
		montoTotal: integer;
	end;
	
	venta = record
		codigoV: integer;
		codigoP: integer;
		cantidadVendidas: integer;
		precioUnitario: integer;		
	end;
	
	arbol = ^nodo;
	nodo = record
		dato: producto;
		hi: arbol;
		hd: arbol;
	end;
	
procedure mostrarRegistro(p: producto);
begin
	writeln(p.codigoP);
	writeln(p.cantidad);
	writeln(p.vendidos);
	writeln(p.montoTotal);
end;
	
procedure cargarArbol(var a: arbol);

procedure agregarNodo(var a: arbol; v:venta);

procedure cargaRegistro(var dato: producto; v: venta);
begin
	dato.codigoP:= v.codigoP;
	dato.cantidad:= v.cantidadVendidas;
	dato.montoTotal:= v.cantidadVendidas * v.precioUnitario;
end;

begin
	if(a = nil)then begin
		new(a);
		cargaRegistro(a^.dato, v);
		a^.hi:= nil;
		a^.hd:= nil;
	end
	else begin
		if(a^.dato.codigoP = v.codigoP)then begin
				a^.dato.vendidos:= a^.dato.vendidos + v.cantidadVendidas;
				a^.dato.montoTotal:= a^.dato.montoTotal + (v.cantidadVendidas * v.precioUnitario); 
		end
		else
			if(a^.dato.codigoP > v.codigoP)then
				agregarNodo(a^.hi,v)
			else
				agregarNodo(a^.hd,v);
	end;
end;

procedure leerVenta(var v:venta);
begin
	writeln('Ingrese codigo de venta');
	readln(v.codigoV);
	if(v.codigoV <> 0) then begin
		v.codigoP:= random(20);
		v.cantidadVendidas:= random(20);
		v.precioUnitario:= random(100);
	end;
end;

var
	v: venta;
begin
	leerVenta(v);
	while(v.codigoV <> 0)do begin
		agregarNodo(a,v);
		leerVenta(v);
	end;
end;	

procedure mostrarArbol(a:arbol);
begin
	if(a <> nil)then begin
		mostrarArbol(a^.hi);
		mostrarRegistro(a^.dato);
		mostrarArbol(a^.hd);
	end;
end;

function menorProducto(a: arbol): producto;
begin
	if(a^.hi = nil)then
		menorProducto := a^.dato
	else
		menorProducto:= menorProducto(a^.hi);
end;

function contarMenores(a:arbol; num: integer):integer;
begin
	if(a = nil)then
		contarMenores:= 0
	else begin
		if(a^.dato.codigoP < num)then
			contarMenores:= 1 + contarMenores(a^.hi,num) + contarMenores(a^.hd,num)
		else
			contarMenores:= contarMenores(a^.hi,num);
	end;
end;

function contarEntre(a:arbol; min:integer; max:integer):integer;
begin
	if(a = nil)then
		contarEntre:= 0
	else begin
		contarEntre:= 0;
		if(a^.dato.codigoP > min)and(a^.dato.codigoP < max)then
			contarEntre:= contarEntre + a^.dato.montoTotal;
		if(a^.dato.codigoP > min)then
			contarEntre:= contarEntre + contarEntre(a^.hi,min,max);
		if(a^.dato.codigoP < max )then
			contarEntre:= contarEntre + contarEntre(a^.hd,min,max);
	end;
end;
	
var
	a:arbol;
	menorP:producto;
	num,cantMenores:integer;
	min,max: integer;
	cant:integer;
begin
	randomize;
	cantMenores:= 0;
	cant:=0;
	a:= nil;
	cargarArbol(a);
	mostrarArbol(a);
	menorP:= menorProducto(a);
	mostrarRegistro(menorP);
	readln(num);
	cantMenores:= contarMenores(a,num);
	writeln(cantMenores);
	readln(min);
	readln(max);
	cant:= contarEntre(a,min,max);
	writeln(cant);
end.
