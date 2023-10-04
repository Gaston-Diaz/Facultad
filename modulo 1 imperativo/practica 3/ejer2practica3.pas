program ejer2p3;
type
	venta = record
		codigo: integer;
		fecha: string;
		cantV: integer;
	end;
	
	vendidos = record
		codigo: integer;
		cantV: integer;
	end;
	
	arbol=^nodo
	nodo = record
		dato: venta;
		hi: arbol;
		hd: arbol;
	end;
	
	arbolV=^.nodo
	nodo = record
		dato: vendidos;
		hi: arbolV;
		hd: arbolV;
	end;

procedure cargarArbol(var a1:arbol, var a2:arbolV);

procedure agregar(var a1:arbol, v:venta);
begin
	if(a1 = nil)then begin
		a1.^dato:= v;
		a1^.hi:= nil;
		a1^.hd:= nil
	end
	else
		if(v.codigo <= a1^.dato.codigo)then
			agregar(a1^.hi,v)
		else
			agregar(a1^.hd,v);
end;

procedure leerVenta(var v: venta);
begin
	readln(v.codigo);
	if(v.codigo <> 0)then begin
		readln(v.fecha);
		readln(v.cantV);
	end;
end;

var
	v: venta
begin
	leerVenta(v);
	while(v.codigo <> 0) do begin
		agregar(a1,v);
		leerVenta(v)
	end;
end;
	
var	
	a1: arbol;
	a2:arbolV;
BEGIN
	a1:=nil;
	a2:=nil;
	cargarArboles(a1,a2);
END.

