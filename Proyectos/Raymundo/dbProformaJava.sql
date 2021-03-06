USE [master]
GO
/****** Object:  Database [dbProformaJava]    Script Date: 05/10/2020 08:20:42 p.m. ******/
CREATE DATABASE [dbProformaJava]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'dbProforma', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\dbProformaJava.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'dbProforma_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\dbProformaJava_log.ldf' , SIZE = 5696KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [dbProformaJava] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [dbProformaJava].[dbo].[sp_fulltext_database] @action = 'disable'
end
GO
ALTER DATABASE [dbProformaJava] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [dbProformaJava] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [dbProformaJava] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [dbProformaJava] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [dbProformaJava] SET ARITHABORT OFF 
GO
ALTER DATABASE [dbProformaJava] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [dbProformaJava] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [dbProformaJava] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [dbProformaJava] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [dbProformaJava] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [dbProformaJava] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [dbProformaJava] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [dbProformaJava] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [dbProformaJava] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [dbProformaJava] SET  DISABLE_BROKER 
GO
ALTER DATABASE [dbProformaJava] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [dbProformaJava] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [dbProformaJava] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [dbProformaJava] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [dbProformaJava] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [dbProformaJava] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [dbProformaJava] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [dbProformaJava] SET RECOVERY FULL 
GO
ALTER DATABASE [dbProformaJava] SET  MULTI_USER 
GO
ALTER DATABASE [dbProformaJava] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [dbProformaJava] SET DB_CHAINING OFF 
GO
ALTER DATABASE [dbProformaJava] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [dbProformaJava] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [dbProformaJava] SET DELAYED_DURABILITY = DISABLED 
GO
USE [dbProformaJava]
GO
/****** Object:  UserDefinedFunction [dbo].[insertaCodigoEntidad]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	<Description, ,>
-- =============================================
CREATE FUNCTION [dbo].[insertaCodigoEntidad]()
RETURNS nvarchar(3)
AS
BEGIN
	DECLARE @ultimoId SMALLINT;
	DECLARE @cnt INT;
	SET @cnt=(SELECT COUNT (idEntidad) FROM entidad);
		IF (@cnt = 0)
			BEGIN
				SET @ultimoId=1;
			END
		ELSE
			BEGIN
				SELECT TOP 1 @ultimoId=CONVERT(INT,RIGHT(idEntidad,10)) from entidad order by idEntidad desc
				SET  @ultimoId=@ultimoId+1;
		END
RETURN RIGHT(('00'+RTRIM(CONVERT(NVARCHAR(3),@ultimoId))),3)
END
GO
/****** Object:  UserDefinedFunction [dbo].[insertaCodigoMaterial]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	<Description, ,>
-- =============================================
CREATE FUNCTION [dbo].[insertaCodigoMaterial]()
RETURNS nvarchar(3)
AS
BEGIN
	DECLARE @ultimoId SMALLINT;
	DECLARE @cnt INT;
	SET @cnt=(SELECT COUNT (idMaterial) FROM material);
		IF (@cnt = 0)
			BEGIN
				SET @ultimoId=1;
			END
		ELSE
			BEGIN
				SELECT TOP 1 @ultimoId=CONVERT(INT,RIGHT(idMaterial,3)) from material order by idMaterial desc
				SET  @ultimoId=@ultimoId+1;
		END
RETURN RIGHT(('00'+RTRIM(CONVERT(NVARCHAR(3),@ultimoId))),3)
END


GO
/****** Object:  UserDefinedFunction [dbo].[insertaNumeroProforma]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	<Description, ,>
-- =============================================
CREATE FUNCTION [dbo].[insertaNumeroProforma]()
RETURNS nvarchar(4)
AS
BEGIN
	DECLARE @ultimoId SMALLINT;
	DECLARE @cnt INT;
	SET @cnt=(SELECT COUNT (idProforma) FROM proforma);
		IF (@cnt = 0)
			BEGIN
				SET @ultimoId=1;
			END
		ELSE
			BEGIN
				SELECT TOP 1 @ultimoId=CONVERT(INT,RIGHT(idProforma,4)) from proforma order by idProforma desc
				SET  @ultimoId=@ultimoId+1;
		END
RETURN RIGHT(('000'+RTRIM(CONVERT(NVARCHAR(4),@ultimoId))),4)
END


GO
/****** Object:  Table [dbo].[detalle]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detalle](
	[idProforma] [nvarchar](4) NOT NULL,
	[idMaterial] [nvarchar](3) NOT NULL,
	[precio] [float] NOT NULL,
	[cantidad] [float] NOT NULL,
	[subTotal] [float] NOT NULL,
 CONSTRAINT [PK_detalle] PRIMARY KEY CLUSTERED 
(
	[idProforma] ASC,
	[idMaterial] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[empleado]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[empleado](
	[idEmpleado] [char](3) NOT NULL,
	[nombre] [nvarchar](50) NULL,
	[apellido] [nvarchar](50) NULL,
	[dni] [nvarchar](50) NULL,
	[usuario] [nvarchar](50) NULL,
	[clave] [nvarchar](50) NULL,
 CONSTRAINT [PK_empleado] PRIMARY KEY CLUSTERED 
(
	[idEmpleado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[entidad]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[entidad](
	[idEntidad] [nvarchar](3) NOT NULL CONSTRAINT [DF_entidad_idEntidad]  DEFAULT ([dbo].[insertaCodigoEntidad]()),
	[nombre] [nvarchar](100) NOT NULL,
	[ruc] [nvarchar](11) NULL,
	[direccion] [nvarchar](50) NULL,
	[telefono] [nvarchar](9) NULL,
 CONSTRAINT [PK_entidad] PRIMARY KEY CLUSTERED 
(
	[idEntidad] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[material]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[material](
	[idMaterial] [nvarchar](3) NOT NULL CONSTRAINT [DF_material_idMaterial]  DEFAULT ([dbo].[insertaCodigoMaterial]()),
	[nombre] [nvarchar](100) NULL,
	[unidad] [nvarchar](50) NULL,
 CONSTRAINT [PK_material] PRIMARY KEY CLUSTERED 
(
	[idMaterial] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[proforma]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[proforma](
	[idProforma] [nvarchar](4) NOT NULL,
	[idEmpleado] [char](3) NOT NULL,
	[idEntidad] [nvarchar](3) NOT NULL,
	[fecha] [smalldatetime] NOT NULL,
	[estado] [bit] NOT NULL,
	[direccion] [nvarchar](50) NOT NULL,
	[total] [float] NOT NULL,
 CONSTRAINT [PK_proforma_1] PRIMARY KEY CLUSTERED 
(
	[idProforma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[proforma] ADD  CONSTRAINT [DF_proforma_estado]  DEFAULT ((1)) FOR [estado]
GO
ALTER TABLE [dbo].[detalle]  WITH CHECK ADD  CONSTRAINT [FK_detalle_material] FOREIGN KEY([idMaterial])
REFERENCES [dbo].[material] ([idMaterial])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[detalle] CHECK CONSTRAINT [FK_detalle_material]
GO
ALTER TABLE [dbo].[detalle]  WITH CHECK ADD  CONSTRAINT [FK_detalle_proforma] FOREIGN KEY([idProforma])
REFERENCES [dbo].[proforma] ([idProforma])
GO
ALTER TABLE [dbo].[detalle] CHECK CONSTRAINT [FK_detalle_proforma]
GO
ALTER TABLE [dbo].[proforma]  WITH CHECK ADD  CONSTRAINT [FK_proforma_empleado] FOREIGN KEY([idEmpleado])
REFERENCES [dbo].[empleado] ([idEmpleado])
GO
ALTER TABLE [dbo].[proforma] CHECK CONSTRAINT [FK_proforma_empleado]
GO
ALTER TABLE [dbo].[proforma]  WITH CHECK ADD  CONSTRAINT [FK_proforma_entidad] FOREIGN KEY([idEntidad])
REFERENCES [dbo].[entidad] ([idEntidad])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[proforma] CHECK CONSTRAINT [FK_proforma_entidad]
GO
/****** Object:  StoredProcedure [dbo].[insertaDetalle]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[insertaDetalle]
(
	@varIdProforma NVARCHAR(4),
	@varIdMaterial NVARCHAR(3),
	@varPrecio FLOAT,
	@varCantidad FLOAT,
	@varSubTotal FLOAT
)
AS
SET NOCOUNT OFF;
INSERT INTO dbo.detalle([idProforma], [idMaterial],[precio],[cantidad],[subTotal])
VALUES (@varIdProforma,@varIdMaterial,@varPrecio,@varCantidad,@varSubTotal)
GO
/****** Object:  StoredProcedure [dbo].[insertaEntidad]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[insertaEntidad](
	@varNombre nvarchar(100),
	@varRuc nvarchar(11),
	@varDireccion nvarchar(50),
	@varTelefono nvarchar(9)
	)
	AS
	SET NOCOUNT OFF;
	INSERT INTO dbo.entidad([nombre],[ruc],[direccion],[telefono])
	VALUES (@varNombre,@varRuc,@varDireccion,@varTelefono)

GO
/****** Object:  StoredProcedure [dbo].[insertaMaterial]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[insertaMaterial](
	@varNombre nvarchar(100),
	@varUnidad nvarchar(50)
	)
	AS
	SET NOCOUNT OFF;
	INSERT INTO material([nombre],[unidad])
	VALUES (@varNombre,@varUnidad)
GO
/****** Object:  StoredProcedure [dbo].[insertaProforma]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[insertaProforma]
(
	@varidProforma NVARCHAR(4),
	@varidEntidad NVARCHAR(3),
	@varfecha SMALLDATETIME,
	@vardireccion NVARCHAR(50),
	@varTotal FLOAT
)
AS
SET NOCOUNT OFF;
INSERT INTO dbo.proforma([idProforma], [idEntidad],[fecha],[direccion],[total])
VALUES (@varidProforma,@varidEntidad,@varfecha,@vardireccion,@varTotal)
GO
/****** Object:  StoredProcedure [dbo].[modificaEntidad]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[modificaEntidad] 
	@idEntidad nvarchar(3),
	@nombre nvarchar(100),
	@ruc nvarchar(11),
	@direccion nvarchar(50),
	@telefono nvarchar(9)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	UPDATE entidad SET nombre=@nombre, ruc=@ruc, direccion=@direccion, telefono=@telefono
	WHERE idEntidad=@idEntidad
END

GO
/****** Object:  StoredProcedure [dbo].[modificaMaterial]    Script Date: 05/10/2020 08:20:42 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[modificaMaterial] 
	@idMaterial nvarchar(3),
	@nombre nvarchar(100),
	@unidad nvarchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	UPDATE material SET nombre=@nombre, unidad=@unidad
	WHERE idMaterial=@idMaterial
END

GO
USE [master]
GO
ALTER DATABASE [dbProformaJava] SET  READ_WRITE 
GO
