program ejer1p3;
type
	socio = record;
		nombre: string;
		numero: string;
		edad: integer;
	end;
	
	arbol =^nodo;
	nodo= record
		dato:socio;
		hi:arbol;
		hd:arbol;
	end;

function cantidadSocios(a:arbol): integer;
begin
	if(a = nil)then cantidadSocios:= 0
	else
		cantidadSocios:= 1 + cantidadSocios(a^.hi) + cantidadSocios(a^.hd); 
end;
	
function exiteNombre(a:arbol, nom:string, var ok: boolean): boolean
begin
	if(a <> nil) then begin
		existeNombre:= existeNombre(a^.hi,nom,ok);
		if(a^.dato.nombre = nom)then ok:= true;
		existeNombre:= existeNombre(a^.hd,nom,ok);
	end;
	existeNombre:= ok;
end;
	
function existeSocio(a:arbol, num:integer): boolean
begin
	if(a = nil)then existeSocio:= false
	else(a^.dato.numero = num)then existeSocio:= true
	else
		if(a^.dato.numero < num)then existeSocio:= existeSocio(a^.hd, num)
		else
			existeSocio:= existeSocio(a^.hi,num);
end;
	
procedure aumentarEdad(var a:arbol);
begin
	if(a <> nil) then begin
		aumentarEdad(a^.hi)
		a^.dato.edad:= a^.dato .edad + 1;
		aumentarEdad(a^.hd);
	end;
end;

procedure socioMayorEdad(a:arbol);

procedure enOrden(a:arbol,var e:integer,var s:integer)
begin
	if(a <> nil)then begin
		enOrden(a^.hi,e,s)
		if(a^.dato.edad > e)then begin
			e:= a^.dato.edad;
			s:= a^.dato.numero;
		end;
		enOrden(a^.hd;e,s);
	end;
end;

var
	edadMax,socio: integer;
begin
	edadMax:= -1;
	socio:= 0;
	enOrden(a,edadMax,socio);
end;
	
procedure socioMasChico(a:arbol);

function buscarSocioMasChico(a: arbol): socio;
begin
	if(a^.hi = nil) then
		buscarSocioMasChico:= a^.dato
	else
		buscarSocioMasChico:= buscarSocioMasChico(a^.hi);
end;

var
	smc: socio;
begin
	smc:= buscarSocioMasChico(a);
		writeln(smc.nombre);
		writeln(smc.numero);
		writeln(smc.edad);
end;

function numeroSocioMasGrande(a: arbol): integer;
begin
	if (a^.hd = nil) then begin
		numeroSocioMasGrande:= a^.dato.numero;
	else
		numeroSocioMasGrande:= numeroSocioMasGrande(a^.hd);
end;
	
procedure cargarArbol(var a: arbol);

procedure agregar(var a:arbol, s:socio);
begin
	if (a = nil) then begin
		a^.dato:= s;
		a^.hi:= nil;
		a^.hd:= nil;
	end
	else
		if(s.numero < a^.dato.numero)then
			agregar(a^.hi, s)
		else
			agregar(a^.hd, s);
end;

procedure leerSocio(var s: socio);
begin
	readln(s.numero);
	if(s.numero <> 0) then begin
		readln(s.nombre);
		readln(s.edad);
	end;
end;

var
	s: socio;
begin
	leerSocio(s);
	while(s.numero <> 0)do begin
		agregar(a,s);
		leerSocio(s);
	end;
end;

var
	a:arbol;
	num: integer;
	nombre: string;
	ok: boolean
	cantSocios: integer;
BEGIN
	a:= nil; 
	cargarArbol(a); // punto a
	if (a <> nil) then begin
		writeln(numeroSocioMasGrande(a)); //punto b-i
		socioMasChico(a); //punto b-ii	
		socioMayorEdad(a); //punto b-iii
		aumentarEdad(a);  //punto b-iv
		readln(num);
		existe:= existesocio(a,num);  //punto b-v
		readln(nombre);
		ok:= false;
		exiteNom:= existeNombre(a,nombre,ok); //punto b-vi
		cantSocios:= cantidadSocios(a); // punto b-vii
END.

