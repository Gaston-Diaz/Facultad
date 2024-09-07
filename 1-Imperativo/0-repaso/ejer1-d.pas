Program NumAleatorio;
var
	ale: integer;
	i,a,b,r: integer;
begin
	i:= 0;
	randomize;
	writeln('Ingrese la cantidad de numeros: ');
	readln(r);
	writeln('Ingrese el primer numero del rango: ');
	readln(a);
	writeln('Ingrese el ultimo numero del rango');
	readln(b);
	while(i <= r)do begin
		ale:= random(b);
		if(ale >= a)then begin
			writeln(ale);
			i:= i + 1;
		end;
	end;
	readln;
end.
