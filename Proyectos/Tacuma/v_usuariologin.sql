create or replace view ventas.v_usuariologin(
idempleado,idusuario,indestado,desclave,desempleado)
as
select
u.idempleado idempleado,
u.idusuario idusuario,
u.indestado indestado,
u.desclave desclave,
e.desempleado desempleado
from ventas.usuarios u
join ventas.empleado e on u.idempleado=e.idempleado;