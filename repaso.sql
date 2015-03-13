select numVuelo, COUNT(fecha)as cantidad
from PARTE
group by PARTE.numVuelo

select matricula, tipoavion
from AVION
where tipoavion='F20'

select top 1 PILOTO.id, PILOTO.nombre,PILOTO.horasVuelo
from PILOTO

