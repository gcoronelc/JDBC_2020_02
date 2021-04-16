
CREATE TABLE Categorias (
       IdCategoria          VARCHAR2(4) NULL,
       DesCategoria         VARCHAR2(25) NULL,
       PRIMARY KEY (IdCategoria)
);

DROP INDEX XPKCategorias;

CREATE UNIQUE INDEX XPKCategorias ON Categorias
(
       IdCategoria                    ASC
);


CREATE TABLE Productos (
       IdProducto           VARCHAR2(4) NULL,
       IdCategoria          VARCHAR2(4) NULL,
       DesProducto          VARCHAR2(35) NULL,
       StockProduct         INTEGER NULL,
       PreUnit              DECIMAL(18,2) NULL,
       ObsProducto          VARCHAR2(25) NULL,
       PRIMARY KEY (IdProducto), 
       FOREIGN KEY (IdCategoria)
                             REFERENCES Categorias
);

DROP INDEX XPKProductos;

DROP INDEX XIF15Productos;

CREATE UNIQUE INDEX XPKProductos ON Productos
(
       IdProducto                     ASC
);

CREATE INDEX XIF15Productos ON Productos
(
       IdCategoria                    ASC
);


CREATE TABLE Empleado (
       IdEmpleado           VARCHAR2(8) NULL,
       DesEmpleado          VARCHAR2(45) NULL,
       DocIdentidad         VARCHAR2(8) NULL,
       Email                VARCHAR2(25) NULL,
       Telefono             VARCHAR2(9) NULL,
       PRIMARY KEY (IdEmpleado)
);

DROP INDEX XPKEmpleado;

CREATE UNIQUE INDEX XPKEmpleado ON Empleado
(
       IdEmpleado                     ASC
);


CREATE TABLE Tipo_Documento (
       IdTipoDoc            VARCHAR2(4) NULL,
       DesTipoDoc           VARCHAR2(15) NULL,
       PRIMARY KEY (IdTipoDoc)
);

DROP INDEX XPKTipo_Documento;

CREATE UNIQUE INDEX XPKTipo_Documento ON Tipo_Documento
(
       IdTipoDoc                      ASC
);


CREATE TABLE Clientes (
       DniCliente           VARCHAR2(11) NULL,
       Cliente              VARCHAR2(35) NULL,
       IdTipoDoc            VARCHAR2(4) NULL,
       NroDocumento         VARCHAR2(11) NULL,
       Direccion            VARCHAR2(45) NULL,
       Email                VARCHAR2(25) NULL,
       Telefono             VARCHAR2(20) NULL,
       PRIMARY KEY (DniCliente), 
       FOREIGN KEY (IdTipoDoc)
                             REFERENCES Tipo_Documento
);

DROP INDEX XPKClientes;

DROP INDEX XIF14Clientes;

CREATE UNIQUE INDEX XPKClientes ON Clientes
(
       DniCliente                     ASC
);

CREATE INDEX XIF14Clientes ON Clientes
(
       IdTipoDoc                      ASC
);


CREATE TABLE Tipo_Comprobante (
       IdTipoComprobante    VARCHAR2(4) NULL,
       DesTipoComprobante   VARCHAR2(20) NULL,
       PRIMARY KEY (IdTipoComprobante)
);

DROP INDEX XPKTipo_Comprobante;

CREATE UNIQUE INDEX XPKTipo_Comprobante ON Tipo_Comprobante
(
       IdTipoComprobante              ASC
);


CREATE TABLE Comprobante_Cabacera (
       NumComprobante       VARCHAR2(11) NULL,
       FeEmision            DATE NULL,
       IdTipoComprobante    VARCHAR2(4) NULL,
       DniCliente           VARCHAR2(11) NULL,
       FormaPago            VARCHAR2(15) NULL,
       TipoTarjeta          VARCHAR2(15) NULL,
       DigitoTarjeta        VARCHAR2(4) NULL,
       ValorVenta           DECIMAL(18,2) NULL,
       Impuesto             DECIMAL(18,2) NULL,
       ImpAPagar            DECIMAL(18,2) NULL,
       IdEmpleado           VARCHAR2(8) NULL,
       PRIMARY KEY (NumComprobante, FeEmision, IdTipoComprobante), 
       FOREIGN KEY (IdEmpleado)
                             REFERENCES Empleado, 
       FOREIGN KEY (DniCliente)
                             REFERENCES Clientes, 
       FOREIGN KEY (IdTipoComprobante)
                             REFERENCES Tipo_Comprobante
);

DROP INDEX XPKComprobante_Cabacera;

DROP INDEX XIF13Comprobante_Cabacera;

DROP INDEX XIF16Comprobante_Cabacera;

DROP INDEX XIF8Comprobante_Cabacera;

CREATE UNIQUE INDEX XPKComprobante_Cabacera ON Comprobante_Cabacera
(
       NumComprobante                 ASC,
       FeEmision                      ASC,
       IdTipoComprobante              ASC
);

CREATE INDEX XIF13Comprobante_Cabacera ON Comprobante_Cabacera
(
       IdTipoComprobante              ASC
);

CREATE INDEX XIF16Comprobante_Cabacera ON Comprobante_Cabacera
(
       DniCliente                     ASC
);

CREATE INDEX XIF8Comprobante_Cabacera ON Comprobante_Cabacera
(
       IdEmpleado                     ASC
);


CREATE TABLE Comprobante_Detalle (
       NumComprobante       VARCHAR2(11) NULL,
       FeEmision            DATE NULL,
       IdTipoComprobante    VARCHAR2(4) NULL,
       IdProducto           VARCHAR2(4) NULL,
       CantProducto         INTEGER NULL,
       PreUnit              DECIMAL(18,2) NULL,
       ImpProducto          DECIMAL(18,2) NULL,
       PRIMARY KEY (NumComprobante, FeEmision, IdTipoComprobante, 
              IdProducto), 
       FOREIGN KEY (IdProducto)
                             REFERENCES Productos, 
       FOREIGN KEY (NumComprobante, FeEmision, IdTipoComprobante)
                             REFERENCES Comprobante_Cabacera
);

DROP INDEX XPKComprobante_Detalle;

DROP INDEX XIF19Comprobante_Detalle;

DROP INDEX XIF20Comprobante_Detalle;

CREATE UNIQUE INDEX XPKComprobante_Detalle ON Comprobante_Detalle
(
       NumComprobante                 ASC,
       FeEmision                      ASC,
       IdTipoComprobante              ASC,
       IdProducto                     ASC
);

CREATE INDEX XIF19Comprobante_Detalle ON Comprobante_Detalle
(
       IdTipoComprobante              ASC,
       NumComprobante                 ASC,
       FeEmision                      ASC
);

CREATE INDEX XIF20Comprobante_Detalle ON Comprobante_Detalle
(
       IdProducto                     ASC
);


CREATE TABLE Usuarios (
       IdEmpleado           VARCHAR2(8) NOT NULL,
       IdUsuario            VARCHAR2(9) NULL,
       DesClave             VARCHAR2(8) NULL,
       IndEstado            INTEGER NULL,
       PRIMARY KEY (IdEmpleado), 
       FOREIGN KEY (IdEmpleado)
                             REFERENCES Empleado
);

DROP INDEX XPKUsuarios;

CREATE UNIQUE INDEX XPKUsuarios ON Usuarios
(
       IdEmpleado                     ASC
);

