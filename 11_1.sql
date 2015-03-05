/*1. Hacer una función escalar que en caso de recibir como parámetro de 
entrada (siendo un entero) un valor null devuelva el valor “no definido” 
y si no es null devuelva el valor recibido. Utilizar esta función visualizando 
de la tabla discos el código, nombre y cantidadMinima. Si no tienes ninguna cantidad 
minima a null modifica algún registro para que lo puedas probar. */
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
go
/*2. Realiza una función en la que le pasaremos como parámetros de entrada el nombre de un 
proveedor y una fecha y nos devuelva la cantidad (la suma de cantidades) que tenemos de los
 discos de ese proveedor del año indicado. Tener en cuenta que no se puede introducir una fecha
  con un año superior al actual, en ese caso devolver -2 y si el proveedor no existe devolver -3*/
create function f_nosecual
(@nombre varchar (30), @fecha int)
returns int
begin 
	if year(@fecha)= yEAR( GETDATE())
	set @fecha =-2
	return @fecha
	if @nombre <> (select Nombre from Proveedores
					where @Nombre=Nombre)
	set @nombre = -3
	return @nombre
end
go
	select* from f_nosecual('sony','2001')
go
	
	
	/*3. Hacer una función a la que le pasaremos los mismos parámetros 
	de la anterior, pero ahora visualizaremos todos los discos que tenemos
	 de ese proveedor y ese año. Visualizar nombre del disco y cantidad. 
	 Hacerlo de las dos formas que se puede. */
	 
create function f_nueva
 (@nombre varchar (30), @fecha int)
 returns table
 begin 
	select Discos.anio, Proveedores.nombre 
	from Discos inner join Proveedores on Discos.CodGenero= proveedores.CodGenero
	where Discos.anio = @fecha and proveedores.nombre=@nombre
	return table
end