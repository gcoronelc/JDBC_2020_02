REM Empresa        :  EDUUNI
REM Software       :  Sistema de Almacen
REM DBMS           :  ORACLE
REM Esquema        :  SISUNI
REM Script         :  Crea el esquema SISUNI
REM Responsables   :  ALDER FLORES GUTIERREZ y HARRY MINAYA
REM Email          :  softanik2017@gmail.com
REM Sitio Web      :  
REM Blog           :  
REM Youtube        :  



REM 20-SET-2020 Se agrega comentarios a las columnas.



REM ============================================
REM DESHABILITAR SALIDAS
REM ============================================

SET TERMOUT OFF
SET ECHO OFF


-- =============================================
-- CRACIÓN DE LA APLICACIÓN
-- =============================================

DECLARE
	N INT;
	COMMAND VARCHAR2(200);
BEGIN
	COMMAND := 'DROP USER sisuni CASCADE';
	SELECT COUNT(*) INTO N
	FROM DBA_USERS
	WHERE USERNAME = 'sisuni';
	IF ( N = 1 ) THEN
		EXECUTE IMMEDIATE COMMAND;
	END IF;
END;
/


CREATE USER sisuni IDENTIFIED BY admin;

GRANT CONNECT, RESOURCE TO sisuni;

ALTER USER sisuni
QUOTA UNLIMITED ON USERS;

GRANT CREATE VIEW TO sisuni;


-- =============================================
-- CONECTARSE A LA APLICACIÓN
-- =============================================

CONNECT sisuni/admin


-- =============================================
-- CREACIÓN DE LOS OBJETOS DE LA BASE DE DATOS
-- =============================================




CREATE TABLE sisuni.Cliente
(
    chr_clicodcli char(8),
    vch_clicodempre char(10),
    vch_clinomcli varchar2(40),
    vch_clirazonsocial varchar2(40),
    vch_cliusuresp varchar2(40),
    vch_clidireccli varchar2(40),
    vch_clicelucli char(10),
    vch_clitelecli char(16),
    vch_cliruccli  char(11),
    vch_cliemail varchar2(40),
    vch_clicontacto1 varchar2(40),
    vch_clicontacto2 varchar2(40),
    vch_clicontacto3 varchar2(40),
    vch_clicontacto4 varchar2(40),
    vch_clicontacto5 varchar2(40),
CONSTRAINT  PK_cliente PRIMARY KEY (chr_clicodcli),
CONSTRAINT  UN_cliempre UNIQUE (vch_clicodempre)
	
);



COMMENT ON TABLE sisuni.Cliente IS 'Tabla de Cliente con que cuenta la empresa.';


COMMENT ON COLUMN sisuni.Cliente.chr_clicodcli IS 'Código de Cliente.';


COMMENT ON COLUMN sisuni.Cliente.vch_clicodempre IS 'Codigo de la empresa.';


COMMENT ON COLUMN sisuni.Cliente.vch_clinomcli IS 'Nombre del Cliente.';


COMMENT ON COLUMN sisuni.Cliente.vch_clirazonsocial IS 'RAZON SOCIAL del Cliente.';


COMMENT ON COLUMN sisuni.Cliente.vch_cliusuresp IS 'Usuario Responsable.';

COMMENT ON COLUMN sisuni.Cliente.vch_clidireccli IS 'Direccion del cliente.';

COMMENT ON COLUMN sisuni.Cliente.vch_clicelucli IS 'Celular del cliente.';

COMMENT ON COLUMN sisuni.Cliente.vch_clitelecli IS 'Telefono del cliente.';

COMMENT ON COLUMN sisuni.Cliente.vch_cliruccli IS 'Ruc del cliente.';

COMMENT ON COLUMN sisuni.Cliente.vch_cliemail IS 'Email del cliente.';

COMMENT ON COLUMN sisuni.Cliente.vch_clicontacto1 IS 'Datos Contacto1.';

COMMENT ON COLUMN sisuni.Cliente.vch_clicontacto2 IS 'Datos Contacto2.';

COMMENT ON COLUMN sisuni.Cliente.vch_clicontacto3 IS 'Datos Contacto3.';

COMMENT ON COLUMN sisuni.Cliente.vch_clicontacto4 IS 'Datos Contacto4.';

COMMENT ON COLUMN sisuni.Cliente.vch_clicontacto5 IS 'Datos Contacto5.';

CREATE TABLE sisuni.Empleado
(
chr_empcodemple char(8) ,
vch_empnomemple varchar2(40),
vch_empdirecemple varchar2(40),
vch_empteleemple char(16),
vch_empceluemple char(10),
vch_empemailemple varchar2(40),
CONSTRAINT  PK_EMPLEADO PRIMARY KEY (chr_empcodemple),
CONSTRAINT  UN_empleado UNIQUE (vch_empnomemple)
);



COMMENT ON TABLE sisuni.Empleado IS 'Tabla de empleados.';

COMMENT ON COLUMN sisuni.Empleado.chr_empcodemple IS 'Código del empleado.';

COMMENT ON COLUMN sisuni.Empleado.vch_empnomemple IS 'Apellidos y Nombres empleado.';

COMMENT ON COLUMN sisuni.Empleado.vch_empdirecemple IS 'Direccion empleado.';

COMMENT ON COLUMN sisuni.Empleado.vch_empteleemple IS 'Telefono Empleado.';

COMMENT ON COLUMN sisuni.Empleado.vch_empceluemple IS 'Celular Empleado.';

COMMENT ON COLUMN sisuni.Empleado.vch_empemailemple IS 'Email Empleado.';




CREATE TABLE sisuni.Proveedor
(
chr_codprove char(8) ,
vch_nomprove varchar2(40),
vch_direcprove varchar2(40),
vch_rucprove char(11),
vch_teleprove char(16),
vch_celuprove char(10),
vch_emailprove varchar2(40),
CONSTRAINT  PK_PROVEEDOR PRIMARY KEY (chr_codprove),
CONSTRAINT  UN_proveedor UNIQUE (vch_nomprove)
);



COMMENT ON TABLE sisuni.Proveedor IS 'Tabla Proveedor.';

COMMENT ON COLUMN sisuni.Proveedor.chr_codprove IS 'Código de Proveedor.';

COMMENT ON COLUMN sisuni.Proveedor.vch_nomprove IS 'Nombre del Proveedor.';

COMMENT ON COLUMN sisuni.Proveedor.vch_direcprove IS 'Direccion del Proveedor.';

COMMENT ON COLUMN sisuni.Proveedor.vch_rucprove IS 'Ruc del Proveedor.';

COMMENT ON COLUMN sisuni.Proveedor.vch_teleprove IS 'Telefono del Proveedor.';

COMMENT ON COLUMN sisuni.Proveedor.vch_celuprove IS 'Celular del proveedor.';

COMMENT ON COLUMN sisuni.Proveedor.vch_emailprove IS 'Email del proveedor.';



CREATE TABLE sisuni.Categoria
(
chr_codcateg char(8),
vch_desccateg varchar2(40),
CONSTRAINT  PK_CATEGORIA PRIMARY KEY (chr_codcateg),
CONSTRAINT  UN_CATEGORIA UNIQUE (vch_desccateg)
);



COMMENT ON TABLE sisuni.Categoria IS 'Tabla Categoria.';

COMMENT ON COLUMN sisuni.Categoria.chr_codcateg IS 'Código de Categoria.';

COMMENT ON COLUMN sisuni.Categoria.vch_desccateg IS 'Descripcion de la Categoría.';

CREATE TABLE sisuni.Producto
(
chr_codprod char(8) ,
vch_descripcion varchar2(40),
vch_unidadmed char(2),
vch_codcateg char(8)not null,
vch_codprove char(8)not null,
vch_preciounit decimal(10,2),
vch_precioxmayor decimal(10,2),
vch_stock int,
vch_stockmin int,
CONSTRAINT  PK_PRODUCTO PRIMARY KEY (chr_codprod),
CONSTRAINT  UN_PRODUCTO UNIQUE (vch_descripcion),
CONSTRAINT FK_PRODUCT1 FOREIGN KEY (vch_codcateg) REFERENCES sisuni.categoria(chr_codcateg),
CONSTRAINT FK_PRODUCT2 FOREIGN KEY (vch_codprove) REFERENCES sisuni.proveedor(chr_codprove)
);

COMMENT ON TABLE sisuni.Producto IS 'Tabla donde se registran todos los Productos.';

COMMENT ON COLUMN sisuni.Producto.chr_codprod IS 'Código del producto.';

COMMENT ON COLUMN sisuni.Producto.vch_descripcion IS 'Descripcion del producto.';

COMMENT ON COLUMN sisuni.Producto.vch_unidadmed IS 'Unidad de Medida.';

COMMENT ON COLUMN sisuni.Producto.vch_codcateg IS 'Codigo de Categoria.';

COMMENT ON COLUMN sisuni.Producto.vch_codprove IS 'Codigo del proveedor.';

COMMENT ON COLUMN sisuni.Producto.vch_preciounit IS 'Precio unitario.';

COMMENT ON COLUMN sisuni.Producto.vch_precioxmayor IS 'Precio x mayor.';

COMMENT ON COLUMN sisuni.Producto.vch_stock IS 'Stock.';

COMMENT ON COLUMN sisuni.Producto.vch_stockmin IS 'Stock minimo.';



CREATE TABLE sisuni.FacturaComp
(
chr_codfact char(11),
vch_n1 char(3),
vch_n2 char(9),
vch_fecha date,
vch_codprove char(8) not null,
vch_codemple char(8)not null,
vch_subtotal decimal(10,2),
vch_igv decimal(10,2),
vch_total decimal(10,2),
vch_tipodoc char(1),
vch_darbaja char(1),
CONSTRAINT  PK_FACTURACOMP PRIMARY KEY (chr_codfact),
CONSTRAINT FK_FACTURACOMP1 FOREIGN KEY (vch_codprove) REFERENCES sisuni.proveedor(chr_codprove),
CONSTRAINT FK_FACTURACOMP2 FOREIGN KEY (vch_codemple) REFERENCES sisuni.empleado(chr_empcodemple)

);

COMMENT ON TABLE sisuni.FacturaComp IS 'Tabla donde se registran todas las Facturas de Compra.';

COMMENT ON COLUMN sisuni.FacturaComp.chr_codfact IS 'Código de la Factura de Compra.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_n1 IS 'Primer parte del numero de serie de la factura de compra.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_n2 IS 'Segunda parte del numero de serie de la factura de compra';

COMMENT ON COLUMN sisuni.FacturaComp.vch_fecha IS 'Fecha de la Factura de Compra.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_codprove IS 'Codigo del proveedor.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_codemple IS 'Codigo del Empleado.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_subtotal IS 'Subtotal de la Factura de Compra.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_igv IS 'IGV de la Factura de Compra.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_total IS 'Total de la Factura de Compra.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_tipodoc IS 'Tipo de documento.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_darbaja IS 'Dar de baja.';

CREATE TABLE sisuni.BoletaComp
(
chr_codbol char(11),
vch_n1 char(3),
vch_n2 char(9),
vch_fecha date,
vch_codprove char(8) not null,
vch_codemple char(8)not null,
vch_subtotal decimal(10,2),
vch_igv decimal(10,2),
vch_total decimal(10,2),
vch_tipodoc char(1),
vch_darbaja char(1),
CONSTRAINT  PK_BOLETACOMP PRIMARY KEY (chr_codbol),
CONSTRAINT FK_BOLETACOMP1 FOREIGN KEY (vch_codprove) REFERENCES sisuni.proveedor(chr_codprove),
CONSTRAINT FK_BOLETACOMP2 FOREIGN KEY (vch_codemple) REFERENCES sisuni.empleado(chr_empcodemple)

);

COMMENT ON TABLE sisuni.BoletaComp IS 'Tabla donde se registran todas las Boletas de Compra.';

COMMENT ON COLUMN sisuni.BoletaComp.chr_codbol IS 'Código de la Boleta de Compra.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_n1 IS 'Primer parte del numero de serie de la Boleta de compra.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_n2 IS 'Segunda parte del numero de serie de la Boleta de compra';

COMMENT ON COLUMN sisuni.BoletaComp.vch_fecha IS 'Fecha de la Boleta de Compra.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_codprove IS 'Codigo del proveedor.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_codemple IS 'Codigo del Empleado.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_subtotal IS 'Subtotal de la Boleta de Compra.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_igv IS 'IGV de la Boleta de Compra.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_total IS 'Total de la Boleta de Compra.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_tipodoc IS 'Tipo de documento.';

COMMENT ON COLUMN sisuni.BoletaComp.vch_darbaja IS 'Dar de baja.';

CREATE TABLE sisuni.BoletaVent
(
chr_codbol char(11),
vch_n1 char(3),
vch_n2 char(9),
vch_fecha date,
vch_codcli char(8) not null,
vch_codemple char(8)not null,
vch_subtotal decimal(10,2),
vch_igv decimal(10,2),
vch_total decimal(10,2),
vch_tipodoc char(1),
vch_darbaja char(1),
CONSTRAINT  PK_BOLETAVENT PRIMARY KEY (chr_codbol),
CONSTRAINT FK_BOLETAVENT1 FOREIGN KEY (vch_codcli) REFERENCES sisuni.cliente(chr_clicodcli),
CONSTRAINT FK_BOLETAVENT2 FOREIGN KEY (vch_codemple) REFERENCES sisuni.empleado(chr_empcodemple)
);

COMMENT ON TABLE sisuni.BoletaVent IS 'Tabla donde se registran todas las Boletas de Venta.';

COMMENT ON COLUMN sisuni.BoletaVent.chr_codbol IS 'Código de la Boleta de Venta.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_n1 IS 'Primer parte del numero de serie de la Boleta de venta.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_n2 IS 'Segunda parte del numero de serie de la Boleta de venta';

COMMENT ON COLUMN sisuni.BoletaVent.vch_fecha IS 'Fecha de la Boleta de Venta.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_codcli IS 'Codigo del Cliente.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_codemple IS 'Codigo del Empleado.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_subtotal IS 'Subtotal de la Boleta de Venta.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_igv IS 'IGV de la Boleta de Venta.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_total IS 'Total de la Boleta de Venta.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_tipodoc IS 'Tipo de documento.';

COMMENT ON COLUMN sisuni.BoletaVent.vch_darbaja IS 'Dar de baja.';

CREATE TABLE sisuni.FacturaVent
(
chr_codfact char(11),
vch_n1 char(3),
vch_n2 char(9),
vch_fecha date,
vch_codcli char(8) not null,
vch_codemple char(8)not null,
vch_subtotal decimal(10,2),
vch_igv decimal(10,2),
vch_total decimal(10,2),
vch_tipodoc char(1),
vch_darbaja char(1),
CONSTRAINT  PK_FACTURAVENT PRIMARY KEY (chr_codfact),
CONSTRAINT FK_FACTURAVENT1 FOREIGN KEY (vch_codcli) REFERENCES sisuni.cliente(chr_clicodcli),
CONSTRAINT FK_FACTURAVENT2 FOREIGN KEY (vch_codemple) REFERENCES sisuni.empleado(chr_empcodemple)

);

COMMENT ON TABLE sisuni.FacturaVent IS 'Tabla donde se registran todas las Facturas de Venta.';

COMMENT ON COLUMN sisuni.FacturaVent.chr_codfact IS 'Código de la Factura de Venta.';

COMMENT ON COLUMN sisuni.FacturaVent.vch_n1 IS 'Primer parte del numero de serie de la factura de venta.';

COMMENT ON COLUMN sisuni.FacturaVent.vch_n2 IS 'Segunda parte del numero de serie de la factura de venta';

COMMENT ON COLUMN sisuni.FacturaVent.vch_fecha IS 'Fecha de la Factura de Venta.';

COMMENT ON COLUMN sisuni.FacturaVent.vch_codcli IS 'Codigo del cliente.';

COMMENT ON COLUMN sisuni.FacturaVent.vch_codemple IS 'Codigo del Empleado.';

COMMENT ON COLUMN sisuni.FacturaVent.vch_subtotal IS 'Subtotal de la Factura de Venta.';

COMMENT ON COLUMN sisuni.FacturaVent.vch_igv IS 'IGV de la Factura de Venta.';

COMMENT ON COLUMN sisuni.FacturaVent.vch_total IS 'Total de la Factura de Venta.';

COMMENT ON COLUMN sisuni.FacturaVent.vch_tipodoc IS 'Tipo de documento.';

COMMENT ON COLUMN sisuni.FacturaComp.vch_darbaja IS 'Dar de baja.';



CREATE TABLE sisuni.Detalle_factcomp
(
vch_codfact char(11)not null,
vch_codprod char(8)not null,
vch_cantidad int,
vch_precioventa decimal(10,2),
CONSTRAINT FK_DETALLEFACTCOMP1 FOREIGN KEY (vch_codfact) REFERENCES sisuni.facturacomp(chr_codfact),
CONSTRAINT FK_DETALLEFACTCOMP2 FOREIGN KEY (vch_codprod) REFERENCES sisuni.producto(chr_codprod)
);

COMMENT ON TABLE sisuni.Detalle_factcomp IS 'Tabla Detalle de la Factura de Compra.';

COMMENT ON COLUMN sisuni.Detalle_factcomp.vch_codfact IS 'Codigo de la Factura de compra.';

COMMENT ON COLUMN sisuni.Detalle_factcomp.vch_codprod IS 'Codigo del producto.';

COMMENT ON COLUMN sisuni.Detalle_factcomp.vch_cantidad IS 'Cantidad de pedido';

COMMENT ON COLUMN sisuni.Detalle_factcomp.vch_precioventa IS 'Precio de venta del producto';

CREATE TABLE sisuni.Detalle_boletacomp
(
vch_codbol char(11)not null,
vch_codprod char(8)not null,
vch_cantidad int,
vch_precioventa decimal(10,2),
CONSTRAINT FK_DETALLEBOLETACOMP1 FOREIGN KEY (vch_codbol) REFERENCES sisuni.boletacomp(chr_codbol),
CONSTRAINT FK_DETALLEBOLETACOMP2 FOREIGN KEY (vch_codprod) REFERENCES sisuni.producto(chr_codprod)
);

COMMENT ON TABLE sisuni.Detalle_boletacomp IS 'Tabla Detalle de la Boleta de Compra.';

COMMENT ON COLUMN sisuni.Detalle_boletacomp.vch_codbol IS 'Codigo de la Boleta de compra.';

COMMENT ON COLUMN sisuni.Detalle_boletacomp.vch_codprod IS 'Codigo del producto.';

COMMENT ON COLUMN sisuni.Detalle_boletacomp.vch_cantidad IS 'Cantidad de pedido';

COMMENT ON COLUMN sisuni.Detalle_boletacomp.vch_precioventa IS 'Precio de venta del producto';

CREATE TABLE sisuni.Detalle_boletavent
(
vch_codbol char(11)not null,
vch_codprod char(8)not null,
vch_cantidad int,
vch_precioventa decimal(10,2),
CONSTRAINT FK_DETALLEBOLETAVENT1 FOREIGN KEY (vch_codbol) REFERENCES sisuni.boletavent(chr_codbol),
CONSTRAINT FK_DETALLEBOLETAVENT2 FOREIGN KEY (vch_codprod) REFERENCES sisuni.producto(chr_codprod)
);

COMMENT ON TABLE sisuni.Detalle_boletavent IS 'Tabla Detalle de la Boleta de Venta.';

COMMENT ON COLUMN sisuni.Detalle_boletavent.vch_codbol IS 'Codigo de la Boleta de venta.';

COMMENT ON COLUMN sisuni.Detalle_boletavent.vch_codprod IS 'Codigo del producto.';

COMMENT ON COLUMN sisuni.Detalle_boletavent.vch_cantidad IS 'Cantidad de pedido';

COMMENT ON COLUMN sisuni.Detalle_boletavent.vch_precioventa IS 'Precio de venta del producto';

CREATE TABLE sisuni.Detalle_factvent
(
vch_codfact char(11)not null,
vch_codprod char(8)not null,
vch_cantidad int,
vch_precioventa decimal(10,2),
CONSTRAINT FK_DETALLEFACTVENT1 FOREIGN KEY (vch_codfact) REFERENCES sisuni.facturavent(chr_codfact),
CONSTRAINT FK_DETALLEFACTVENT2 FOREIGN KEY (vch_codprod) REFERENCES sisuni.producto(chr_codprod)
);

COMMENT ON TABLE sisuni.Detalle_factvent IS 'Tabla Detalle de la Factura de Venta.';

COMMENT ON COLUMN sisuni.Detalle_factvent.vch_codfact IS 'Codigo de la Factura de venta.';

COMMENT ON COLUMN sisuni.Detalle_factvent.vch_codprod IS 'Codigo del producto.';

COMMENT ON COLUMN sisuni.Detalle_factvent.vch_cantidad IS 'Cantidad de pedido';

COMMENT ON COLUMN sisuni.Detalle_factvent.vch_precioventa IS 'Precio de venta del producto';

