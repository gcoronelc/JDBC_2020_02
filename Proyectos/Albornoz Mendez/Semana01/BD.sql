CREATE TABLE EMPLEADOS(
 EMPLEADOID int NOT NULL,
 NOMBRE char(30) NULL,
 APELLIDO char(30) NULL,
 FECHA_NAC date NULL,
 REPORTA_A int NULL,
 EXTENSION int NULL,
 CONSTRAINT PK_EMPLEADOS PRIMARY KEY (EMPLEADOID)
);

 

CREATE TABLE PROVEEDORES(
 PROVEEDORID int NOT NULL,
 NOMBREPROV char(50) NOT NULL,
 CONTACTO char(50) NOT NULL,
 CELUPROV char(12) NULL,
 FIJOPROV char(12) NULL,
 CONSTRAINT PK_PROVEEDORES PRIMARY KEY (PROVEEDORID )
 );

 

CREATE TABLE CATEGORIAS(
 CATEGORIAID int NOT NULL,
 NOMBRECAT char(50) NOT NULL,
 CONSTRAINT PK_CATEGORIAS PRIMARY KEY
(CATEGORIAID)
);

 

CREATE TABLE CLIENTES(
 CLIENTEID int NOT NULL,
 NOMBRES char(30)NOT NULL,
 APELLIDOS char(30)NOT NULL,
 EMAIL char(50) NULL,
 CELULAR char(12) NULL,
 CONSTRAINT PK_CLIENTES PRIMARY KEY(CLIENTEID)
);

 

CREATE TABLE ORDENES(
 ORDENID int NOT NULL,
 EMPLEADOID int NOT NULL,
 CLIENTEID int NOT NULL,
 FECHAORDEN date NOT NULL,
 DESCUENTO int NULL,
 CONSTRAINT PK_ORDENES PRIMARY KEY(ORDENID),
CONSTRAINT FK_ORDENES_CLIEN_ORD_CLIENTES FOREIGN KEY (CLIENTEID) REFERENCES CLIENTES(CLIENTEID),
CONSTRAINT FK_ORDENES_EMPLE_ORD_EMPLEADO FOREIGN KEY (EMPLEADOID) REFERENCES EMPLEADOS(EMPLEADOID)
);

 

CREATE TABLE PRODUCTOS(
 PRODUCTOID int NOT NULL,
 PROVEEDORID int NOT NULL,
 CATEGORIAID int NOT NULL,
 DESCRIPCION char(50) NULL,
 PRECIOUNIT int NOT NULL,
 EXISTENCIA int NOT NULL,
 CONSTRAINT PK_PRODUCTOS PRIMARY KEY(PRODUCTOID),
CONSTRAINT FK_PRODUCTO_CATE_PROD_CATEGORI FOREIGN KEY (CATEGORIAID) REFERENCES CATEGORIAS(CATEGORIAID),
CONSTRAINT FK_PRODUCTO_PROV_PROD_PROVEEDO FOREIGN KEY (PROVEEDORID) REFERENCES PROVEEDORES(PROVEEDORID)
);

 


CREATE TABLE DETALLE_ORDENES(
 ORDENID int NOT NULL,
 DETALLEID int NOT NULL,
 PRODUCTOID int NOT NULL,
 CANTIDAD int NOT NULL,
 CONSTRAINT PK_DETALLE_ORDENES PRIMARY KEY (ORDENID,DETALLEID ),
CONSTRAINT FK_DETALLE__ORDEN_DET_ORDENES FOREIGN KEY (ORDENID) REFERENCES ORDENES(ORDENID),
CONSTRAINT FK_DETALLE__PROD_DETA_PRODUCTO FOREIGN KEY (PRODUCTOID) REFERENCES PRODUCTOS(PRODUCTOID)
 );

 



