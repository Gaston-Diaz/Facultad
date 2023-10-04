program aerolineas;
type
	pasaje = record
		codVuelo:integer;
		codCliente:integer;
		codCiudad:integer;
		monto:integer;
	end;
	
	regPasaje = record
		codVuelo:integer;
		codCliente:integer;
		monto:integer;
	end;
	
	listaPasajes =^nodo2;
	nodo2 = record
		dato: regPasaje;
		sig:listaPasajes;
	end;
	
	regArbol = record
		codDestino: integer;
		pasajes:listaPasajes;
	end;
	
	arbol = ^nodo;
	nodo = record
		dato: regArbol;
		hi: arbol;
		hd: arbol;
	end;
	
procedure pasajesAciudad(a:arbol;ciudad:integer; var l:listaPasajes);
begin
	if(a = nil)then
		l:= nil
	else
		if(a^.dato.codDestino = ciudad)then
			l:= a^.dato.pasajes
		else
			if(a^.dato.codDestino > ciudad)then
				pasajesAciudad(a^.hi,ciudad,l)
			else
				pasajesAciudad(a^.hd,ciudad,l);
end;
	
procedure cargarArbol(var a: arbol);

	procedure agregar(var a:arbol; p:pasaje);
	
		procedure agregarAtras(var l:listaPasajes; p:pasaje);
		var
			aux,ant,act:listaPasajes;
		begin
			new(aux);
			aux^.dato.codVuelo:= p.codVuelo;
			aux^.dato.codCliente:= p.codCliente;
			aux^.dato.monto:= p.monto;
			aux^.sig:=nil;
			if(l = nil)then
				l:= aux
			else
				act:= l;
				while(act<>nil)do begin
					ant:= act;
					act:= act^.sig;
				end;
				ant^.sig:= aux;
		end;
	
	begin
		if(a = nil)then begin
			new(a);
			a^.dato.codDestino:= p.codCiudad;
			a^.dato.pasajes:= nil;
			agregarAtras(a^.dato.pasajes,p);
			a^.hi:= nil;
			a^.hd:= nil;
		end
		else
			if(a^.dato.codDestino = p.codCiudad)then
				agregarAtras(a^.dato.pasajes,p)
			else
				if(a^.dato.codDestino > p.codCiudad)then
					agregar(a^.hi,p)
				else
					agregar(a^.hd,p);
	end;

	procedure leerPasaje(var p:pasaje);
	begin
		readln(p.monto);
		if(p.monto <> 0)then begin
			readln(p.codVuelo);
			readln(p.codCliente);
			readln(p.codCiudad);
		end;
	end;

var
	p: pasaje;
begin
	leerPasaje(p);
	while(p.monto <> 0)do begin
		agregar(a,p);
		leerPasaje(p);
	end;
end;	
	
var
	a:arbol;
	unaCiudad:integer;
	lPasajes: listaPasajes;
begin
	cargarArbol(a);
	readln(unaCiudad);
	pasajesAciudad(a,unaCiudad,lPasajes);
end.
