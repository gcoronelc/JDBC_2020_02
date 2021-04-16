insert into ventas.categorias values ('C001','ACEITE');
insert into ventas.categorias values ('C002','ARROZ');
insert into ventas.categorias values ('C003','LECHES');
commit;
insert into ventas.tipo_comprobante values('CO01','BOLETA');
insert into ventas.tipo_comprobante values('CO02','FACTURA');
commit;
insert into ventas.tipo_documento values('TD01','DNI');
insert into ventas.tipo_documento values('TD02','RUC');
commit;
insert into ventas.clientes values ('75644765', 'JULIA PEREZ','TD01','75644765','AV LIMA 2393','JPEREZ@HOTMAIL.COM','6544354');
insert into ventas.clientes values ('43546354', 'MIGUEL RAMIREZ','TD01','43546354','AV PERU 3564','MRAMIREZ@HOTMAIL.COM','4536454');
insert into ventas.clientes values ('20131364755', 'ABC EIRL','TD02','20131364755','AV GRAY 234','COMPRAS@ABC.COM','3230222');
commit;
insert into ventas.empleado values ('42425343','MARIA PEREZ','42425343','MPEREZ@EMPRESA.COM','954234343');
insert into ventas.empleado values ('41424341','JULIAN GUTIERREZ','41424341','JGUTIERREZ@EMPRESA.COM','3426575');
insert into ventas.empleado values ('42345243','REBECA SANCHEZ','42345243','RSANCHEZ@EMPRESA.COM','2314232');
commit;
insert into ventas.usuarios values('42425343','U42425343','42425343','1');
insert into ventas.usuarios values('41424341','U41424341','41424341','1');
insert into ventas.usuarios values('42345243','U42345243','42345243','1');
commit;
insert into ventas.productos values('P001','C003','LECHE GLORIA SIN LACTOSA',20,3.50,'VIGENTE');
insert into ventas.productos values('P002','C002','ARROZ ROMPE OLLA 5KG',20,16.90,'VIGENTE');
insert into ventas.productos values('P003','C001','ACEITE NICOLINI 1LT',20,5.60,'VIGENTE');
commit;










