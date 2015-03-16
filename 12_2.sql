
/*7. Realizar una función que nos devuelva el codigo del pedido, el nombre 
del proveedor, el nombre del disco pedido, la cantidad, la fecha del pedido,
 la fecha de entrega y un texto que diga "En fecha" o "No en fecha ", si la 
 diferencia entre fecha pedido y fecha entrega es como máximo de una semana 
 entonces será "En fecha" en caso contrario "No en fecha".*/
 go
 create function f_trabajo
 ()
 
 returns @tablasolucion table(nombreproveedor nvarchar(30), codpedido int, nombredisco nvarchar(30),
							  cantidad int, fechaentrega date,fechapedido date, resultado nvarchar(30))
 begin
	insert @tablasolucion select proveedores.Nombre, Pedidos.CodPedido,Discos.Nombre,discos.Cantidad, Pedidos.FechaEntrega ,
	Pedidos.FechaPedido,'en Fecha' from Discos inner join Proveedores on discos.CodProveedor = Proveedores.CodProveedor
	 inner join Pedidos on Proveedores.CodProveedor= pedidos.CodProveedor
	where ((Pedidos.FechaEntrega)-(Pedidos.FechaEntrega))<=7
	
	insert @tablasolucion select proveedores.Nombre, Pedidos.CodPedido,Discos.Nombre,discos.Cantidad, Pedidos.FechaEntrega ,
	Pedidos.FechaPedido,'no en Fecha' from Discos inner join Proveedores on discos.CodProveedor = Proveedores.CodProveedor
	 inner join Pedidos on Proveedores.CodProveedor= pedidos.CodProveedor
	where ((Pedidos.FechaEntrega)-(Pedidos.FechaEntrega))>7
	
	return
 end
	go
	select* from dbo.f_trabajo() 
go
/*8. Hacer una función que pasándole el nombre de un disco y el nombre del 
cliente, nos devuelva el nombre del cliente, el nombre del disco, la fecha 
de reserva y las unidades reservadas. Si no existe el cliente que le pasemos 
mostrará no existe cliente, si no existe el disco mostrará no existe el disco,
 si no existe ninguno visualizará los dos mensajes, esto la haremos en un select.*/
 create function f_ejercicio8
 (@nombredisco nvarchar(30), @nombrecliente nvarchar(50))
 returns @tabla	table (nombrecliente nvarchar(30),nombredisco nvarchar(30), fechareserva date,
 unidadesreservadas int)
 begin
	insert @tabla
/*9. Hacer una función que nos devuelva la cantidad en euros que hemos gastado 
en pedidos al proveedor entre dos fechas que le pasaremos como parámetro. 
Tener en cuenta que el orden de las fechas puede estar cambiado, o sea , se 
permite que esté primero o segundo la fecha menor. Lo que no se permite es que 
las dos fechas sean superior al día de hoy, en ese caso devolver -1.*/ 
 
 
 
 
 
/*10. Hacer una función escalar que nos devuelva el nombre del proveedor que 
entre dos fechas pasadas como parámetro hemos gastado más dinero en sus pedidos.
 si las dos fechas son superiores al día de hoy, en ese caso devolver -1.*/
 