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
