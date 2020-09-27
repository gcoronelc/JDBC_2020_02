create database proyectojava2;
use proyectojava2;
create table cliente
(
codcli char(8) primary key,
codempre char(10)unique,
nomcli varchar(40),
razonsocial varchar(40),
usuresp varchar(40),
direccli varchar(40),
celucli char(10),
telecli char(16),
ruccli  char(11),
email varchar(40),
contacto1 varchar(40),
contacto2 varchar(40),
contacto3 varchar(40),
contacto4 varchar(40),
contacto5 varchar(40)
);
create table empleado
(
codemple char(8) primary key,
nomemple varchar(40)unique,
direcemple varchar(40),
teleemple char(16),
celuemple char(10),
emailemple varchar(40)
);
create table proveedor
(
codprove char(8) primary key,
nomprove varchar(40)unique,
direcprove varchar(40),
rucprove char(11),
teleprove char(16),
celuprove char(10),
emailprove varchar(40)
);
create table categoria
(
codcateg char(8) primary key,
desccateg varchar(40)unique
);
create table producto
(
codprod char(8) primary key,
descripcion varchar(40)unique,
unidadmed char(2),
codcateg char(8)not null,
codprove char(8)not null,
preciounit decimal(10,2),
precioxmayor decimal(10,2),
stock int,
stockmin int,
FOREIGN KEY (codcateg) REFERENCES categoria(codcateg),
FOREIGN KEY (codprove) REFERENCES proveedor(codprove)
);
create table facturacomp
(
codfact char(11)primary key,
n1 char(3),
n2 char(9),
fecha date,
codprove char(8) not null,
codemple char(8)not null,
subtotal decimal(10,2),
igv decimal(10,2),
total decimal(10,2),
tipodoc char(1),
darbaja char(1),
FOREIGN KEY (codprove) REFERENCES proveedor(codprove),
FOREIGN KEY (codemple) REFERENCES empleado(codemple)
);
create table notacredito
(
codnota char(11)primary key,
n1 char(3),
n2 char(9),
fecha date,
codcli char(8) not null,
codemple char(8)not null,
descripcion varchar(500)null,
subtotal decimal(10,2),
igv decimal(10,2),
total decimal(10,2),
tipodoc char(1),
darbaja char(1),
FOREIGN KEY (codcli) REFERENCES cliente(codcli),
FOREIGN KEY (codemple) REFERENCES empleado(codemple)
);
create table notadebito
(
codnota char(11)primary key,
n1 char(3),
n2 char(9),
fecha date,
codprove char(8) not null,
codemple char(8)not null,
descripcion varchar(500)null,
subtotal decimal(10,2),
igv decimal(10,2),
total decimal(10,2),
tipodoc char(1),
darbaja char(1),
FOREIGN KEY (codprove) REFERENCES proveedor(codprove),
FOREIGN KEY (codemple) REFERENCES empleado(codemple)
);
create table boletacomp
(
codbol char(11)primary key,
n1 char(3),
n2 char(9),
fecha date,
codprove char(8) not null,
codemple char(8)not null,
subtotal decimal(10,2),
igv decimal(10,2),
total decimal(10,2),
tipodoc char(1),
darbaja char(1),
FOREIGN KEY (codprove) REFERENCES proveedor(codprove),
FOREIGN KEY (codemple) REFERENCES empleado(codemple)
);
create table boletavent
(
codbol char(11)primary key,
n1 char(3),
n2 char(9),
fecha date,
codcli char(8) not null,
codemple char(8)not null,
subtotal decimal(10,2),
igv decimal(10,2),
total decimal(10,2),
tipodoc char(1),
darbaja char(1),
FOREIGN KEY (codcli) REFERENCES cliente(codcli),
FOREIGN KEY (codemple) REFERENCES empleado(codemple)
);
create table facturavent
(
codfact char(11)primary key,
n1 char(3),
n2 char(9),
fecha date,
codcli char(8) not null,
codemple char(8)not null,
subtotal decimal(10,2),
igv decimal(10,2),
total decimal(10,2),
tipodoc char(1),
darbaja char(1),
FOREIGN KEY (codcli) REFERENCES cliente(codcli),
FOREIGN KEY (codemple) REFERENCES empleado(codemple)
);
create table detalle_factcomp
(
codfact char(11)not null,
codprod char(8)not null,
cantidad int,
precioventa decimal(10,2),
FOREIGN KEY (codfact) REFERENCES facturacomp(codfact),
FOREIGN KEY (codprod) REFERENCES producto(codprod)
);
create table detalle_boletacomp
(
codbol char(11)not null,
codprod char(8)not null,
cantidad int,
precioventa decimal(10,2),
FOREIGN KEY (codbol) REFERENCES boletacomp(codbol),
FOREIGN KEY (codprod) REFERENCES producto(codprod)
);
create table detalle_boletavent
(
codbol char(11)not null,
codprod char(8)not null,
cantidad int,
precioventa decimal(10,2),
FOREIGN KEY (codbol) REFERENCES boletavent(codbol),
FOREIGN KEY (codprod) REFERENCES producto(codprod)
);
create table detalle_factvent
(
codfact char(11)not null,
codprod char(8)not null,
cantidad int,
precioventa decimal(10,2),
FOREIGN KEY (codfact) REFERENCES facturavent(codfact),
FOREIGN KEY (codprod) REFERENCES producto(codprod)
);