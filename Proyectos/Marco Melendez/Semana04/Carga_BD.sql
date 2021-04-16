
REM ============================================
REM DESHABILITAR SALIDAS
REM ============================================

SET TERMOUT OFF
SET ECHO OFF


-- =============================================
-- CARGAR DATOS DE PRUEBA
-- =============================================


-- Tabla: curso
insert into curso values('0001','Lenguaje 1','0001');
insert into curso values('0002','Matemática 1','0002');
insert into curso values('0003','Ingles 1','0003');
insert into curso values('0004','Lenguaje 2','0004');
insert into curso values('0005','Matemática 2','0005');
insert into curso values('0006','Religión 2','0006');
insert into curso values('0007','Ingles 2','0003');
insert into curso values('0008','Lenguaje 3','0007');
insert into curso values('0009','Matemática 3','0008');
insert into curso values('0010','Historia 3','0009');
insert into curso values('0011','Religión 3','0006');
insert into curso values('0012','Ingles 3','0003');

-- Tabla: profesor
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0001','ABANDO CORITOMA','KATHERINE THALIA','01011248','ASOC TREBOL AZUL CA PARDO, LUIS, 0 H-17','964418217','jermey.abando.07@hotmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0002','ACHALMA MEJIA','YENIFER','01068573','M.ZELAYA 138 MZ E LT 25 PAMPLONA BAJA SJM','964576498','axil.achalma.07@gmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0003','AGUILAR HUAMAN','LUCY ANAI','01083995','MANUEL JARAMILLO 1042 PS 2 ZONA A','967999747','pilar.aguilar.07@hotmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0004','AGUILAR IRALA','JUAN DAVID','01100448','MZ. A-1 LT. 09','969767497','juan.aguilar.07@gmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0005','AGUILAR LOPEZ','ROXANA','01110924','NUMALLONA 1041 UND.C MZ L1 LT 31 SAN JUAN','961537208','ladoshka.aguilar.07@hotmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0006','AGUILAR PARIONA','LUZ DIANA','01156659','JR NUMA LLONA, GENARO, 1072','966945642','marisol.aguilar.07@gmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0007','AGUILAR QUISPE','EMILIANA','01160236','MZ E LT 23 LA RINCONADA','968906324','gabriela.aguilar.07@hotmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0008','AGUIRRE GUEVARA','AYME','01186464','CA VILCHEZ, JOSE MARIA, 822','968628159','yorse.aguirre.07@gmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0009','ALANYA DE LA CRUZ','ROSA MARIA','04340805','NUEVA RINCONADA SECTOR LAS VIOLETAS MZ A LOTE 2 PAMPLONA ALT','961027207','alfredo.alanya.07@hotmail.com','1111');
insert into profesor (idprofesor,apellidos,nombres,dni,direccion,telefono,email,clave) values('0010','ALANYA ROJAS','DEISY','04346522','CA TREBOL AZUL, 0 G-05','963766576','wilber.alanya.07@gmail.com','1111');

-- Tabla: alumno
insert into alumno values('0001','YORSE','ALCARRAZ BORDA',to_date('20130202 16:27:48','YYYYMMDD HH24:MI:SS'),'1','A','PS P1, 0 26-30 BUENOS MILAGROS','968208482','alex.alcarraz.07@hotmail.com','CACÑAHUARAY PALOMINO, LUZ NELY','969121919','bryan.cacnahuaray.07@hotmail.com','1111');
insert into alumno values('0002','ALFREDO','ALCARRAZ ÑAHUI',to_date('20130725 16:27:48','YYYYMMDD HH24:MI:SS'),'1','A','A.H.M.LADERAS DE VILLA MZ K LT 16 S.J.MIRF','963910970','jhonny.alcarraz.07@gmail.com','CAHUANA ACORI, CINTHYA PAMELA','965599242','deivis.cahuana.07@gmail.com','1111');
insert into alumno values('0003','WILBER','ALDAMA DE LA CRUZ',to_date('20130802 16:27:48','YYYYMMDD HH24:MI:SS'),'1','A','PSJ. LAS BRISAS NRO SN PISO 1 MZ E LOTE 13','963619517','dennis.aldama.07@hotmail.com','CAHUANA LOPEZ, YSABEL','964421264','liz.cahuana.07@hotmail.com','1111');
insert into alumno values('0004','MARLENI','ALFARO ASTORIMA',to_date('20130105 16:27:48','YYYYMMDD HH24:MI:SS'),'1','A','MZ H LT 19 COOP DE VIV URANMARCA','963688038','gavi.alfaro.07@gmail.com','CAHUANA QUISPE, EMER','963538618','river.cahuana.07@gmail.com','1111');
insert into alumno values('0005','OSCAR ANTONIO','ALIAGA GUTIERREZ',to_date('20130416 16:27:48','YYYYMMDD HH24:MI:SS'),'1','A','J MORALES 769 UNID.A (B1-6) SN JUAN MIRAFL','966277966','evelyn.aliaga.07@hotmail.com','CAHUANA SOSA, DAVID JONATAN','962161921','rayda.cahuana.07@hotmail.com','1111');
insert into alumno values('0006','MYKE BENGHI','ARAUJO QUISPE',to_date('20120610 16:27:48','YYYYMMDD HH24:MI:SS'),'2','A','LA REFORMA C10-14 L.PRADO PAMPL.ALTA','963861209','roy.araujo.07@hotmail.com','CARRERA MALLQUI, EDUARDO ENRIQUE','967289698','naun.carrera.07@hotmail.com','1111');
insert into alumno values('0007','AGNES','ARAUJO RODRIGUEZ',to_date('20120824 16:27:48','YYYYMMDD HH24:MI:SS'),'2','A','MZ.76 LT.01 AMP.LAURELES P.ALTA','961578779','eduardo.araujo.07@gmail.com','CARRILLO MAYORGA, MIGUEL ANGEL','969174649','angela.carrillo.07@gmail.com','1111');
insert into alumno values('0008','EDWIN ERWIN','ARAUJO SANTIAGO',to_date('20120401 16:27:48','YYYYMMDD HH24:MI:SS'),'2','A','CALLE S','962190375','evelin.araujo.07@hotmail.com','CASA FALCONI, WILDER','965684518','pilar.casa.07@hotmail.com','1111');
insert into alumno values('0009','WILLIAM','ARESTEGUI CARDENAS',to_date('20120507 16:27:48','YYYYMMDD HH24:MI:SS'),'2','A','CA PARDO, LUIS, 0 N-05','968532281','yuriko.arestegui.07@gmail.com','CASAS PALOMINO, LUCILA','969414729','leiddy.casas.07@gmail.com','1111');
insert into alumno values('0010','MIJAIL','ARI CCAPA',to_date('20120520 16:27:48','YYYYMMDD HH24:MI:SS'),'2','A','PS 6, 0 D-09 AH INDOAMERICA','965654573','luis.ari.07@hotmail.com','CASTRO FLORES, GUILLERMO','964903099','yimi.castro.07@hotmail.com','1111');
insert into alumno values('0011','NHADIR SHENIA','BARBOZA GARAGUNDO',to_date('20111123 16:27:48','YYYYMMDD HH24:MI:SS'),'3','A','AV. PEDRO JOSÉ MIOTA 273','962826297','jhon.barboza.07@hotmail.com','LOPE TERRES, LOURDES','965866299','yessica.lope.12@hotmail.com','1111');
insert into alumno values('0012','KEVIN','BARBOZA SANCHEZ',to_date('20110611 16:27:48','YYYYMMDD HH24:MI:SS'),'3','A','CA CEDROS, LOS, 0 B-06','965658426','mayty.barboza.07@gmail.com','LOPEZ ALANYA, RONALD','960535955','luis.lopez.12@gmail.com','1111');
insert into alumno values('0013','ERIKA FELICITA','BARRIOS ÑAUPA',to_date('20110328 16:27:48','YYYYMMDD HH24:MI:SS'),'3','A','UNID D MZ L2 LT 39 S J DE MIRAF.','963973777','yudita.barrios.07@hotmail.com','LOPEZ AUCCAPUCLLA, TAIS ESMERALDA','960648373','gilmer.lopez.12@hotmail.com','1111');
insert into alumno values('0014','DAVID ENRIQUE','BARZOLA CASTRO',to_date('20110716 16:27:48','YYYYMMDD HH24:MI:SS'),'3','A','PS LIBERTAD, LA, 0 X-10 AH TREBOLA ZUL','968536304','angel.barzola.07@gmail.com','LOPEZ HUAYHUA, HIRSA RUCINA','968832228','rayda.lopez.12@gmail.com','1111');
insert into alumno values('0015','SONIA JASMINA','BARZOLA CURO',to_date('20110708 16:27:48','YYYYMMDD HH24:MI:SS'),'3','A','PS 4, 0 B-26 PJ VILLA SOLIDARIDAD','962001844','ronny.barzola.07@hotmail.com','LOPEZ LOPEZ, SONIA','969738675','rossio.lopez.12@hotmail.com','1111');

-- Tabla: nota
insert into nota values('0001','0001','0001',10,16,12,13);
insert into nota values('0002','0001','0002',13,16,14,14);
insert into nota values('0003','0001','0003',17,18,19,18);
insert into nota values('0004','0002','0001',12,11,11,11);
insert into nota values('0005','0002','0002',14,10,18,14);
insert into nota values('0006','0002','0003',19,16,11,15);
insert into nota values('0007','0003','0001',19,19,13,17);
insert into nota values('0008','0003','0002',11,13,14,13);
insert into nota values('0009','0003','0003',20,13,15,16);
insert into nota values('0010','0004','0001',13,18,12,14);
insert into nota values('0011','0004','0002',19,11,12,14);
insert into nota values('0012','0004','0003',20,16,14,17);
insert into nota values('0013','0005','0001',18,16,19,18);
insert into nota values('0014','0005','0002',15,12,19,15);
insert into nota values('0015','0005','0003',13,12,20,15);
insert into nota values('0016','0006','0004',12,11,15,13);
insert into nota values('0017','0006','0005',13,19,20,17);
insert into nota values('0018','0006','0006',13,11,17,14);
insert into nota values('0019','0006','0007',11,19,12,14);
insert into nota values('0020','0007','0004',14,17,12,14);
insert into nota values('0021','0007','0005',15,13,13,14);
insert into nota values('0022','0007','0006',19,14,10,14);
insert into nota values('0023','0007','0007',17,18,18,18);
insert into nota values('0024','0008','0004',13,15,18,15);
insert into nota values('0025','0008','0005',18,15,13,15);
insert into nota values('0026','0008','0006',14,20,15,16);
insert into nota values('0027','0008','0007',15,17,10,14);
insert into nota values('0028','0009','0004',11,16,11,13);
insert into nota values('0029','0009','0005',13,17,19,16);
insert into nota values('0030','0009','0006',15,11,19,15);
insert into nota values('0031','0009','0007',18,18,12,16);
insert into nota values('0032','0010','0004',18,10,13,14);
insert into nota values('0033','0010','0005',11,17,12,13);
insert into nota values('0034','0010','0006',16,18,19,18);
insert into nota values('0035','0010','0007',19,14,10,14);
insert into nota values('0036','0011','0008',20,20,15,18);
insert into nota values('0037','0011','0009',20,15,13,16);
insert into nota values('0038','0011','0010',16,12,11,13);
insert into nota values('0039','0011','0011',14,14,19,16);
insert into nota values('0040','0011','0012',16,20,11,16);
insert into nota values('0041','0012','0008',12,12,16,13);
insert into nota values('0042','0012','0009',14,12,16,14);
insert into nota values('0043','0012','0010',17,19,14,17);
insert into nota values('0044','0012','0011',14,11,15,13);
insert into nota values('0045','0012','0012',16,17,11,15);
insert into nota values('0046','0013','0008',17,20,13,17);
insert into nota values('0047','0013','0009',16,13,18,16);
insert into nota values('0048','0013','0010',14,11,13,13);
insert into nota values('0049','0013','0011',12,19,13,15);
insert into nota values('0050','0013','0012',10,20,18,16);
insert into nota values('0051','0014','0008',17,13,20,17);
insert into nota values('0052','0014','0009',11,18,14,14);
insert into nota values('0053','0014','0010',20,13,15,16);
insert into nota values('0054','0014','0011',13,20,19,17);
insert into nota values('0055','0014','0012',12,17,17,15);
insert into nota values('0056','0015','0008',18,13,14,15);
insert into nota values('0057','0015','0009',14,17,12,14);
insert into nota values('0058','0015','0010',15,14,20,16);
insert into nota values('0059','0015','0011',18,13,14,15);
insert into nota values('0060','0015','0012',14,17,15,15);


--  Tabla: Contador

insert into contador Values( 'alumno', 2, 4 );
insert into contador Values( 'profesor', 10, 4 );
insert into contador Values( 'curso', 6, 4 );
insert into contador Values( 'nota', 6, 4 );
    
update contador set contitem = (select count(*) from alumno) where conttabla = 'alumno';
update contador set contitem = (select count(*) from profesor) where conttabla = 'profesor';
update contador set contitem = (select count(*) from curso) where conttabla = 'curso';
update contador set contitem = (select count(*) from nota) where conttabla = 'nota';

commit;
