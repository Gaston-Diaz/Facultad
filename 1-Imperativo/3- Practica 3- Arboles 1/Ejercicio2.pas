program ejer2;
type
	venta = record
		codigo: integer;
		fecha: integer;
		cantidad: integer;
	end;
	
	venta2 = record
		fecha: integer;
		cantidad: integer;
	end;
	
	lista = ^nodo1;
	nodo1 = record
		dato: venta2;
		sig:lista;
	end;
	
	arbol2nodo = record
		codigo: integer;
		listaV: lista;
	end;
	
	arbol1= ^nodo;
	nodo= record
		dato: venta;
		hi:arbol1;
		hd:arbol1;
	end;
	
	arbol2 = ^nodo3;
	nodo3= record
		dato:arbol2nodo;
		hi:arbol2;
		hd:arbol2;
	end;
	
procedure generarArbol(var a1:arbol1; var a2:arbol1; var a3:arbol2);

procedure guardarDatoA3(var a3:arbol2; v:venta);

procedure agregarFinal(var l:lista; v: venta);
var
	aux,ant,act:lista;
begin
	new(aux);
	aux^.dato.fecha:= v.fecha;
	aux^.dato.cantidad:= v.cantidad;
	aux^.sig:=nil;
	if(l = nil)then
		l:= aux
	else begin
		act:=l;
		while(act <> nil)do begin
			ant:= act;
			act:= act^.sig;
		end;
		ant^.sig:= aux;
	end;
end;

begin
	if(a3 = nil)then begin
		new(a3);
		a3^.dato.codigo:= v.codigo;
		agregarFinal(a3^.dato.listaV,v);
		a3^.hi:= nil;
		a3^.hd:= nil;
	end
	else begin
		if(a3^.dato.codigo = v.codigo)then
			agregarFinal(a3^.dato.listaV,v)
		else begin
			if(a3^.dato.codigo > v.codigo)then
				guardarDatoA3(a3^.hi,v)
			else
				guardarDatoA3(a3^.hi,v)
		end;
	end;
end;


procedure guardarDatoA2(var a2:arbol1; v:venta);
begin
	if(a2 = nil)then begin
		new(a2);
		a2^.dato:= v;
		a2^.hi:= nil;
		a2^.hd:= nil;
	end
	else begin
		if (a2^.dato.codigo = v.codigo)then
			a2^.dato.cantidad:= a2^.dato.cantidad + v.cantidad
		else begin
			if(a2^.dato.codigo > v.codigo)then
				guardarDatoA2(a2^.hi,v)
			else
				guardarDatoA2(a2^.hd,v);
		end;	
	end;		
end;


procedure guardarDatoA1(var a1:arbol1; v:venta);
begin
	if(a1 = nil)then begin
		new(a1);
		a1^.dato:= v;
		a1^.hi:= nil;
		a1^.hd:= nil;
	end
	else begin
		if(a1^.dato.codigo > v.codigo)then
			guardarDatoA1(a1^.hi,v)
		else
			guardarDatoA1(a1^.hd,v);
	end;
end;

procedure leerVenta(var v:venta);
begin
	writeln('ingrese codigo de producto');
	readln(v.codigo);
	if(v.codigo <> 0)then begin
		v.fecha:= random(1000);
		v.cantidad:= random(10);
	end;
end;

var
	v:venta;
begin
	leerVenta(v);
	while(v.codigo <> 0) do begin
		guardarDatoA1(a1,v);
		guardarDatoA2(a2,v);
		guardarDatoA3(a3,v);
		leerVenta(v);
	end;
end;

var
	a1:arbol1;
	a2:arbol1;
	a3:arbol2;
begin
	randomize;
	a1:=nil;
	a2:=nil;
	a3:=nil;
	generarArbol(a1,a2,a3);
end.
