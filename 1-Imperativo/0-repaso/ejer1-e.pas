Program NumAleatorio;
var
	ale: integer;
	a,b,f: integer;
begin
	randomize;
	writeln('Ingrese el numero de corte: ');
	readln(f);
	writeln('Ingrese el primer numero del rango: ');
	readln(a);
	writeln('Ingrese el ultimo numero del rango');
	readln(b);
	ale:= random(b);
	while(ale <> f)do begin
		if(ale >= a) then
			writeln('numero: ',ale);
		ale:= random(b);
	end;
	readln;
end.
