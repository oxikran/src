create trigger tg_atunte
on apunte
for insert  
as 
if((select concepto from inserted)like 'I')
begin
update Cuenta
set Saldo = Saldo+(select importe from inserted)
where CCC = (select CCC from inserted)	
end 
else begin
update Cuenta
set Saldo = Saldo-(select importe from inserted)
where CCC = (select CCC from inserted)
end
if (@@ERROR <> 0)
	rollback transaction
go
-- ejercicio 2/1º --
create trigger tg_ejercicio2
on apunte
for delete
as
if ((select concepto from deleted)like 'I')
begin
update cuenta
set Saldo= Saldo-(select importe from deleted)
where CCC= (select CCC from deleted)
end
else
begin
update cuenta
set Saldo= Saldo+(select importe from deleted)
where CCC= (select CCC from deleted)
end
if (@@ERROR <> 0)
	rollback
go
-- ejercicio 2/2º --
create trigger tg_ejercicio2_2
on apunte
for update
as
if ((select concepto from deleted)like 'I' and (select concepto from inserted)like 'I')
begin
update cuenta
set Saldo = Saldo+(select importe from inserted)
where CCC=(select CCC from inserted)
end
else
begin
update cuenta
set Saldo = Saldo-(select importe from inserted)
where CCC=(select CCC from inserted)
end
go
-- ejercicio 3 --
-- creacion de tabla --
create table apuntes_Borrados (ref integer identity, 
DNI char (12), CCC char (20), 
Concepto char (1),
fecha datetime CONSTRAINT DF_fecha default(getdate()),
Importe money,CONSTRAINT PK_apunte PRIMARY KEY(Ref))

Alter table apuntes_Borrados
ADD CONSTRAINT FK_apunte_CCC foreign key (CCC)
references cuenta(CCC)

Alter table apuntes_Borrados
ADD CONSTRAINT FK_apunte_DNI foreign key (DNI)
references cliente(DNI)

 Alter table Apuntes_Borrados
add constraint Ck_Apunte_Concepto
CHECK (concepto = 'I' or concepto = 'R');

 Alter table Apuntes_Borrados
add constraint Ck_Apunte_importe
CHECK (importe > 0);
-- trigger --
go
create trigger tg_ejercicio3
on apunte
for delete
as 
begin
if((select COUNT(Ref)from deleted)>0)
begin
INSERT apuntes_Borrados 
VALUES(select * from deleted)

end

go
-- ejercicio 4 --
create trigger tg_ejercico4
on apunte 
for insert
as
if ((select estado from cuenta)= 'B')
begin 
	rollback
end
go
create trigger tg_ejercico4_1
on apunte 
for delete
as
if ((select estado from cuenta)= 'B')
begin 
	rollback
end
go

/* Crear un trigger de modo que los clientes sólo pueden hacer reintegro con las cuentas de 
las que son titulares y sólo pueden operar según  sus privilegios. */
CREATE TRIGGER tg_ejercicio5
on apunte
for insert
as 
if ((select DNI from Cuenta_Cliente)=



/* Crear un trigger que no  permita ningún reintegro a ningún cliente que sea menor de edad.*/



select * from Cuenta_Cliente