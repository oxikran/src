/*1. Hacer una funci�n escalar que en caso de recibir como par�metro de 
entrada (siendo un entero) un valor null devuelva el valor �no definido� 
y si no es null devuelva el valor recibido. Utilizar esta funci�n visualizando 
de la tabla discos el c�digo, nombre y cantidadMinima. Si no tienes ninguna cantidad 
minima a null modifica alg�n registro para que lo puedas probar. */
 create function f_cantidadinfinita
 (@cantidad varchar(30))
 returns varchar(30)
 begin
	if @cantidad is null
	set @cantidad = 'no hay'
	return @cantidad
end
go
select coddiscos, Nombre, dbo.f_cantidadinfinita(Cantidad) from Discos

/*2. Realiza una funci�n en la que le pasaremos como par�metros de entrada el nombre de un 
proveedor y una fecha y nos devuelva la cantidad (la suma de cantidades) que tenemos de los
 discos de ese proveedor del a�o indicado. Tener en cuenta que no se puede introducir una fecha
  con un a�o superior al actual, en ese caso devolver -2 y si el proveedor no existe devolver -3*/
create function f_nosecual
(@nombre varchar (30), @fecha int)
returns int
begin 
	if @fecha= yEAR( GETDATE())
	return -2
	if @nombre <> (select Nombre from Proveedores)
	return -3
end
	
	
	

	select * from Proveedores
	select* from Discos