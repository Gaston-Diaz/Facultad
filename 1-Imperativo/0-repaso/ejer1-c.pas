Program NumAleatorio;
var
	ale: integer;
	i: integer;
begin
	randomize;
	for i:= 1 to 20 do begin
		ale:= random(100);
		writeln('El numero aleatorio generado es: ',ale);
	end;
	readln;
end.
