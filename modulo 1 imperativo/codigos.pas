{*
	AGREGAR EN UN ABB
	* 
	Procedure agregar(var: a: arbol, aux:dato);
	begin
	* 	if( a = nil) then begin
	* 		a^.dato := aux; 
	* 		a^.hi := nil;
	* 		a^.hd := nil;
	* 	end
	* 	else
	* 		if(aux < a^.dato)then
	* 			agregar(a^.hi,aux);
	* 		else
	* 			agregar(a^.hd,aux);
	* 	end;
	end;
	* 
	* RECORRER ENORDEN, PREORDEN Y POST ORDEN
	* 
	* procedure enOrden(a:arbol);
	* begin
	* 		if (a <> nil) then begin
	* 			enOrden(a^.hi);
	* 			writeln(a^.dato);
	* 			enOrden(a^.hd);
	* 		end;
	* end;
	* 
	* 	* procedure preorden(a:arbol);
	* begin
	* 		if (a <> nil) then begin
	* 			writeln(a^.dato);			
	* 			preorden(a^.hi);
	* 			preorden(a^.hd);
	* 		end;
	* end;
	* 
	* 	* procedure postorden(a:arbol);
	* begin
	* 		if (a <> nil) then begin
	* 			postOrden(a^.hi);
	* 			postOrden(a^.hd);
	* 			writeln(a^.dato);
	* 		end;
	* end;
	* 
	* DEVOLVER EL VALOR MINIMO EN UN ABB
	* 
	* begin
	* 	cargarArbol(a);
	* 	if(a <> nil) then begin
	* 		min:= minimo(a,min);
	* 		writeln(min);
	* 	end
	* end;
	* 
	* function minimo(a:arbol): integer;
	* begin
	* 		while(a^.hi <> nil) do begin
	* 			a:= a^.hi;
	* 		end;
	* 		minimo:= a^.dato;
	* end;
	* 
	*  DEVOLVER EL NODO MINIMO EN UN ABB
	* 
	* begin
	* 	cargarArbol(a);
	* min:= minimoNodo(a);
	* if (a <> nil)then
	* 	writeln(min^.dato);
	* end;
	* 
	* function minimoNodo(a: arbol): arbol;
	* begin
	* 		if (a = nil) then 
	* 			minimoNodo:= nil;
	* 		else
	* 			while(a^.hi <> nil) do begin
	* 				a:= a^.hi;
	* 			end;
	* 			minimoNodo:= a;
	* end;
	* 
	* 	* DEVOLVER EL VALOR MAXIMO EN UN ABB
	* 
	* begin
	* 	cargarArbol(a);
	* 	if(a <> nil) then begin
	* 		max:= maximo(a,max);
	* 		writeln(max);
	* 	end
	* end;
	* 
	* function maximo(a:arbol): integer;
	* begin
	* 		while(a^.hd <> nil) do begin
	* 			a:= a^.hd;
	* 		end;
	* 		maximo:= a^.dato;
	* end;
	* 
	* DEVOLVER EL NODO MAXIMO EN UN ABB
	* 
	* begin
	* 	cargarArbol(a);
	* max:= maximoNodo(a);
	* if (a <> nil)then
	* 	writeln(max^.dato);
	* end;
	* 
	* function maximoNodo(a: arbol): arbol;
	* begin
	* 		if (a = nil) then 
	* 			maximoNodo:= nil;
	* 		else
	* 			while(a^.hd <> nil) do begin
	* 				a:= a^.hd;
	* 			end;
	* 			maximoNodo:= a;
	* end;
	* 
	* DEVOLVER MINIMO RECURSIVO
	* 
	* function minimo(a:arbol): integer;
	* begin
	* 	if (a^.hi = nil) then
	* 		minimo:= a^.dato
	* 	else
		minimo:= minimo(a^.hi);
	* end;
	* 
	* DEVOLVER NODO MINIMO RECURSIVO
	* 
	* function minimo(a: arbol): arbol;
	* begin
	* 	if (a = nil) then begin
	* 		minimo:= nil;
	* 	if(a^.hi = nil)then begin
	* 		minimo:= a;
	* 	else
	* 		minimo:= minimo(a^.hi);
	* end;
	* 
	* DEVOLVER MAXIMO RECURSIVO
	* 
	* function maximo(a:arbol): integer;
	* begin
	* 	if (a^.hd = nil) then
	* 		maximo:= a^.dato
	* 	else
		maximo:= maximo(a^.hd);
	* end;
	* 
	* DEVOLVER NODO MAXIMO RECURSIVO
	* 
	* function maximo(a: arbol): arbol;
	* begin
	* 	if (a = nil) then begin
	* 		maximo:= nil;
	* 	if(a^.hd = nil)then begin
	* 		maximo:= a;
	* 	else
	* 		maximo:= maximo(a^.hd);
	* end;
	* 
	* BUSQUEDA DEVOLVER BOOLEAN
	* 
	* function buscar(a:arbol, x:integer): boolean
	* begin
	* 	if(a = nil) then buscar:= false
	*	else (a^.dato = x) then buscar:= true;
	* 	else 
	* 		if(a^.dato < x) then buscar:= buscar(a^.hd,x)
	* 	else buscar:=buscar(a^.hi,x);
	* end;
	* 
	* BUSQUEDA DEVOLVER NODO
	* 
	* function buscar(a:arbol,x:integer): arbol
	* begin
	* 	if(a = nil)then buscar:= nil
	* 	else(a^.dato = x)then buscar:= a;
	* 	else
	* 		if(a^.dato < x)then buscar:= buscar(a^.hd,x)
	* 	else buscar:= buscar(a^.hi,x);
	* end;
	* 
	* LISTAS 
	* 
	* AGREGAR ADELANTE
	* 
	* procedure adelante(var l: lista, d:dato)
	* var
	* 	aux:lista
	* begin
	* 	new(aux);
	* 	aux^.dato:= d;
	* 	aux^.sig:= l;
	* end;
	* 
	* AGREGAR ATRAS
	* 
	* procedure atras(var l:ista, d:dato)
	* var
	* 	aux,ant,act: lista
	* begin
	* 	new(aux);
	* 	aux^.dato:= d;
	* 	aux^.sig:= nil;
	* 	if(l = nil) then
	* 		l:=aux
	* 	else
	* 		act:=l;
	* 		while(act <> nil) do begin
	* 			ant:= act;
	* 			act:= act^.sig;
	* 		end;
	* 		ant^.sig:= aux;
	* end;
	* 
	* INSERTAR
	* 
	* procedure insertarOrdenado(var l:lista, d:dato)
	* var
	* 	aux,ant,act: lista;
	* begin
	* 	new(aux);
	* 	aux^.dato:= d;
	* 	act:= l;
	* 	while(act <> nil) and (act^.dato < dato) do begin
	* 		ant:= act;
	* 		act:= act^.sig;
	* 	end;
	* 	if (ant = act) then
	* 		l:= aux;
	* 	else
	* 		ant^.sig:= aux;
	* 		aux^.sig:= act;
	* end;
	* 
	* VECTORES
	* ORDENAR
	* 
	* procedure ordenarVector(v: vector;  diml:integer)
	var
		i,j: integer;
		actual: venta;
	begin
	for i:= 2 to diml do begin
		actual := v[i].codVenta;
		j:= i-1;
		while (j > 0) and (v[j].codVenta > actual) do begin
			v[j+1] := v[j];
			j:= j - 1;
		end;
		v[j+1]:= actual;	
	end;
	end;
	* 
	* ELIMINAR ENTRE DOS
	* 
	* procedure eliminarEntre(vo: vector,var vb:vector, var dimlb: integer, v1:integer,v2:integer)
	var
		i,inicio,fin: integer;
	begin
	for i:= 1 to diml do begin
		if (v[i].codVenta >= v1)then  //si el codigo de venta es mayor al primer numero pasado
			inicio:= i;
		if(v[i].codVenta >= v2)then // si el codigo de venta es mayor al segundo numero pasado
			fin:= i;
	end;
	
	for fin + 1 to dimlb do begin
		v[inicio]:= v[fin];
		inicio:= inicio +1;
	end;
	//actualizar dimension logica inicio - fin
	
	end;
*}
