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
	COMMAND := 'DROP USER SistemaDeNotas CASCADE';
	SELECT COUNT(*) INTO N                  
	FROM DBA_USERS                          
	WHERE USERNAME = 'SistemaDeNotas';      
	IF ( N = 1 ) THEN                       
		EXECUTE IMMEDIATE COMMAND;      
	END IF;                                 
END;                                            
/                                               
                                                
                                                
CREATE USER SistemaDeNotas IDENTIFIED BY admin; 
                                                
GRANT CONNECT, RESOURCE TO SistemaDeNotas;      
                                                
ALTER USER SistemaDeNotas                       
QUOTA UNLIMITED ON USERS;                       
                                                
GRANT CREATE VIEW TO SistemaDeNotas;            
                                                
                                                
-- =============================================
-- CONECTARSE A LA APLICACIÓN                   
-- =============================================
                                                
CONNECT SistemaDeNotas/admin                    
                                                
                                                
-- =============================================
-- CREACIÓN DE LOS OBJETOS DE LA BASE DE DATOS  
-- =============================================

CREATE TABLE SistemaDeNotas.alumno
(
	idalumno         CHAR(4)      NOT NULL,
	nombres          VARCHAR(60)  NOT NULL,
	apellidos        VARCHAR(60)  NOT NULL,
	fechanacimiento  DATE         NOT NULL,
	grado            VARCHAR(20)  NOT NULL,
	seccion          VARCHAR(20)  NOT NULL,
	direccion        VARCHAR(200) NOT NULL,
	telefono         VARCHAR(20)  NOT NULL,
	email            VARCHAR(100)  NOT NULL,
	nombretutor      VARCHAR(160) NOT NULL,
	telefonotutor    VARCHAR(20)  NOT NULL,
	emailtutor       VARCHAR(100)  NOT NULL,
	clave            VARCHAR(15)  NOT NULL,
CONSTRAINT  PK_ALUMNO PRIMARY KEY (idalumno)
);
COMMENT ON TABLE  SistemaDeNotas.alumno IS 'Tabla de alumnos.';
COMMENT ON COLUMN SistemaDeNotas.alumno.idalumno         IS 'Código del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.nombres          IS 'Nombres del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.apellidos        IS 'Apellidos del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.fechanacimiento  IS 'Fecha de nacimiento del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.grado            IS 'Grado del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.seccion          IS 'Sección del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.direccion        IS 'Dirección del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.telefono         IS 'Teléfono del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.email            IS 'Email del alumno.';
COMMENT ON COLUMN SistemaDeNotas.alumno.nombretutor      IS 'Nombre del tutor.';
COMMENT ON COLUMN SistemaDeNotas.alumno.telefonotutor    IS 'Teléfono del tutor.';
COMMENT ON COLUMN SistemaDeNotas.alumno.emailtutor       IS 'Email del tutor.';
COMMENT ON COLUMN SistemaDeNotas.alumno.clave            IS 'Clave del alumno.';



CREATE TABLE SistemaDeNotas.profesor
(
	idprofesor       CHAR(4)      NOT NULL,
	nombres          VARCHAR(60)  NOT NULL,
	apellidos        VARCHAR(60)  NOT NULL,
	dni              VARCHAR(30)  NOT NULL,
	direccion        VARCHAR(200)  NOT NULL,
	telefono         VARCHAR(20)  NOT NULL,
	email            VARCHAR(100)  NOT NULL,
	clave            VARCHAR(15)  NOT NULL,
CONSTRAINT  PK_PROFESOR PRIMARY KEY (idprofesor)
);
COMMENT ON TABLE  SistemaDeNotas.profesor IS 'Tabla de profesores.';
COMMENT ON COLUMN SistemaDeNotas.profesor.idprofesor       IS 'Código del profesor.';
COMMENT ON COLUMN SistemaDeNotas.profesor.nombres          IS 'Nombres del profesor.';
COMMENT ON COLUMN SistemaDeNotas.profesor.apellidos        IS 'Apellidos del profesor.';
COMMENT ON COLUMN SistemaDeNotas.profesor.dni              IS 'DNI del profesor.';
COMMENT ON COLUMN SistemaDeNotas.profesor.direccion        IS 'Dirección del profesor.';
COMMENT ON COLUMN SistemaDeNotas.profesor.telefono         IS 'Teléfono del profesor.';
COMMENT ON COLUMN SistemaDeNotas.profesor.email            IS 'Email del profesor.';
COMMENT ON COLUMN SistemaDeNotas.profesor.clave            IS 'Clave del profesor.';


CREATE TABLE SistemaDeNotas.curso
(
	idcurso          CHAR(4)      NOT NULL,
	nombrecurso      VARCHAR(100)  NOT NULL,
	idprofesor       CHAR(4)      NOT NULL,
CONSTRAINT  PK_CURSO PRIMARY KEY (idcurso)
);
COMMENT ON TABLE  SistemaDeNotas.curso IS 'Tabla de cursos.';
COMMENT ON COLUMN SistemaDeNotas.curso.idcurso       IS 'Código del curso.';
COMMENT ON COLUMN SistemaDeNotas.curso.nombrecurso   IS 'Nombre del curso.';
COMMENT ON COLUMN SistemaDeNotas.curso.idprofesor    IS 'Código del profesor.';


CREATE TABLE SistemaDeNotas.nota
(
	idnota          CHAR(4)      NOT NULL,
	idalumno        CHAR(4)      NOT NULL,
	idcurso         CHAR(4)      NOT NULL,
	nota1           NUMBER(12,0) NOT NULL,
	nota2           NUMBER(12,0) NOT NULL,
	examenfinal     NUMBER(12,0) NOT NULL,
	promedio        NUMBER(12,0) NOT NULL,
CONSTRAINT  PK_NOTA PRIMARY KEY (idnota),
CONSTRAINT FK_ALUMNO FOREIGN KEY (idalumno) REFERENCES SistemaDeNotas.alumno (idalumno),
CONSTRAINT FK_CURSO  FOREIGN KEY (idcurso)  REFERENCES SistemaDeNotas.curso  (idcurso)
);
COMMENT ON TABLE  SistemaDeNotas.nota IS 'Tabla de notas.';
COMMENT ON COLUMN SistemaDeNotas.notas.idnota    IS 'Código de nota.';
COMMENT ON COLUMN SistemaDeNotas.notas.idalumno  IS 'Código del alumno.';
COMMENT ON COLUMN SistemaDeNotas.notas.idcurso   IS 'Código del curso.';
COMMENT ON COLUMN SistemaDeNotas.notas.nota1     IS 'Nota 1 del alumno.';
COMMENT ON COLUMN SistemaDeNotas.notas.nota2     IS 'Nota 2 del alumno.';
COMMENT ON COLUMN SistemaDeNotas.notas.promedio  IS 'Promedio final del alumno.';


CREATE TABLE SistemaDeNotas.contador
(
	conttabla        VARCHAR(30) NOT NULL ,
	contitem         NUMBER(6,0) NOT NULL ,
	contlongitud     NUMBER(3,0) NOT NULL ,
CONSTRAINT  PK_CONTADOR PRIMARY KEY (conttabla)
);
COMMENT ON TABLE  SistemaDeNotas.contador IS 'Tabla de contadores para generar las PKs.';
COMMENT ON COLUMN SistemaDeNotas.contador.conttabla    IS 'Nombre de  tabla.';
COMMENT ON COLUMN SistemaDeNotas.contador.contitem     IS 'Contador de tabla para generar los PK.';
COMMENT ON COLUMN SistemaDeNotas.contador.contlongitud IS 'Longitud del campo.';


