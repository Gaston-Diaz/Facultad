program ejer2;
type
	autoA= record
		patente:string;
		anio:integer;
		marca:string;
		modelo:string;
	end;
	
	arbolA=^nodo;
	nodo= record
		dato:autoA;
		hi:arbolA;
		hd:arbolA;
	end;
	
	autoB=record
		patente:string;
		anio:integer;
		modelo:string;
	end;
	
	listaAutos=^nodo3;
	nodo3= record
		dato: autoB;
		sig:listaAutos;
	end;
	
	regMarca= record
		marca:string;
		autos:listaAutos;
	end;
	
	arbolB=^nodo2;
	nodo2= record
		dato: regMarca;
		hi:arbolB;
		hd:arbolB;
	end;

procedure imprimir(ab1:arbolA);
begin
	if(ab1 <> nil)then begin
		imprimir(ab1^.hi);
		writeln(ab1^.dato.patente);
		writeln(ab1^.dato.anio);
		writeln(ab1^.dato.modelo);
		writeln(ab1^.dato.marca);
		imprimir(ab1^.hd)
	end;
end;

procedure imprimir2(ab2:arbolB);

procedure recorrerlista(l:listaAutos);
begin
	while(l <> nil)do begin
		writeln(l^.dato.patente);
		writeln(l^.dato.anio);
		writeln(l^.dato.modelo);
		l:=l^.sig;
	end;
end;

begin
	if(ab2 <> nil)then begin
		imprimir2(ab2^.hi);
		writeln(ab2^.dato.marca);
		recorrerlista(ab2^.dato.autos);
		imprimir2(ab2^.hd);
	end;
end;
	
procedure cargarArboles(var ab1:arbolA; var ab2:arbolB);

procedure leerAuto(var a:autoA);
begin
	writeln('ingresar patente');
	readln(a.patente);
	if(a.patente <> 'zzz')then begin
		writeln('ingresar anio');
		readln(a.anio);
		writeln('ingresar marca');
		readln(a.marca);
		writeln('ingresar modelo');
		readln(a.modelo);	
	end;
end;

procedure cargaPorPatente(var ab1:arbolA; a:autoA);
begin
	if(ab1 = nil)then begin
		new(ab1);
		ab1^.dato:= a;
		ab1^.hi:= nil;
		ab1^.hd:= nil;
	end
	else
		if(ab1^.dato.patente > a.patente)then
			cargaPorPatente(ab1^.hi,a)
		else
			cargaPorPatente(ab1^.hd,a);
end;

procedure cargarPorMarca(var ab2:arbolB; a:autoA);

procedure cargarListaAutos(var l:listaAutos; a:autoA);
var
	aux,ant,act: listaAutos;
begin
	new(aux);
	aux^.dato.patente:= a.patente;
	aux^.dato.anio:= a.anio;
	aux^.dato.modelo:= a.modelo;
	aux^.sig:= nil;
	if(l = nil)then
		l:= aux
	else
		act:= l;
		while(act <> nil)do begin
			ant:= act;
			act:= act^.sig;
		end;
		ant^.sig:= aux;
end;

begin
	if(ab2 = nil)then begin
		new(ab2);
		ab2^.dato.marca:= a.marca;
		ab2^.dato.autos:= nil;
		cargarListaAutos(ab2^.dato.autos,a);
		ab2^.hi:=nil;
		ab2^.hd:=nil;
	end
	else
		if(ab2^.dato.marca = a.marca)then
			cargarListaAutos(ab2^.dato.autos,a)
		else
			if(ab2^.dato.marca > a.marca)then
				cargarPorMarca(ab2^.hi,a)
			else
				cargarPorMarca(ab2^.hd,a);
end;

var
	auto: autoA;
begin
	leerAuto(auto);
	while(auto.patente <> 'zzz')do begin
		cargaPorPatente(ab1,auto);
		cargarPorMarca(ab2,auto);
		leerAuto(auto);
	end;
end;

var
	ab1: arbolA;
	ab2: arbolB;
begin
	cargarArboles(ab1,ab2);
	writeln('---imprime arbol 1-------');
	imprimir(ab1);
	writeln('----imprime arbol 2------');
	imprimir2(ab2);
end.
