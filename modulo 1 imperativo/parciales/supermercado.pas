program supermercado;
type
	compra = record
		codCliente: integer;
		mes: integer;
		monto: integer;
	end;
	
	vector = array[1..12]of integer;
	
	regArbol = record
		codCliente: integer;
		meses: vector;
	end;
	
	arbol = ^nodo;
	nodo = record
		dato: regArbol;
		hi:arbol;
		hd:arbol;
	end;
	
procedure noGastaron(a:arbol; mes:integer; ok:boolean);

	function gastoEnMes(v:vector; mes:integer):boolean;
	begin
		if(v[mes] = 0)then
			gastoEnMes:= true
		else
			gastoEnMes:= false;
	end;

begin
	if(a <> nil)then begin
		noGastaron(a^.hi,mes,ok);
		ok := gastoEnMes(a^.dato.meses, mes);
		if(ok)then
			writeln('no tuvo gastos en el mes el codigo de cliente' ,a^.dato.codCliente);
		noGastaron(a^.hd,mes,ok);
	end;
end;
	
procedure mayorCompra(a:arbol; cliente:integer; var max:integer);

	procedure maximo(v: vector; var max:integer);
	var
		i,act:integer;
	begin
		act:= -1;
		for i:= 1 to 12 do begin
			if(v[i] > act)then begin
				act:= v[i];
				max:= i;
			end;
		end;
	end;

begin
	if(a = nil)then
		max:= 0
	else
		if(a^.dato.codCliente = cliente)then
			maximo(a^.dato.meses, max)
		else
			if(a^.dato.codCliente > cliente)then
				mayorCompra(a^.hi,cliente,max)
			else
				mayorCompra(a^.hd,cliente,max);
end;
	
procedure cargarArbol(var a:arbol);

	procedure agregar(var a:arbol; c:compra);
	
		procedure sumar(var v: vector; c:compra);
		begin
			v[c.mes]:= v[c.mes] + c.monto;
		end;
	
		procedure inicializarVec(var v: vector);
		var
			i:integer;
		begin
			for i:= 1 to 12 do begin
				v[i]:= 0;
			end;
		end;
	
	begin
		if(a = nil)then begin
			new(a);
			a^.dato.codCliente:= c.codCliente;
			inicializarVec(a^.dato.meses);
			sumar(a^.dato.meses, c);
			a^.hi:= nil;
			a^.hd:= nil;
		end
		else
			if(a^.dato.codCliente = c.codCliente)then
				sumar(a^.dato.meses,c)
			else
				if(a^.dato.codCliente > c.codCliente)then
					agregar(a^.hi,c)
				else
					agregar(a^.hd,c);
	end;

	procedure leerCompra(var c:compra);
	begin
		readln(c.codCliente);
		if(c.codCliente <> 0)then begin
			readln(c.mes);
			readln(c.monto);
		end;
	end;

var
	c:compra;
begin
	leerCompra(c);
	while(c.codCliente <> 0)do begin
		agregar(a,c);
		leerCompra(c);
	end;
end;

var
	a:arbol;
	numCli:integer;
	max: integer;
	unMes:integer;
	ok: boolean;
begin
	ok:=false;
	cargarArbol(a);
	readln(numCli);
	mayorCompra(a,numCli,max);
	readln(unMes);
	noGastaron(a,unMes,ok);
end.
