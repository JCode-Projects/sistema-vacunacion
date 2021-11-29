-- CREACIÓN DE LA BASE DE DATOS
CREATE DATABASE `hc_lasmercedes`;

USE `hc_lasmercedes`;

-- CREACIÓN DE LA TABLA DE USUARIOS
CREATE TABLE `usuario` (
  `identificacion` int NOT NULL,
  `primer_nombre` varchar(20) NOT NULL,
  `segundo_nombre` varchar(20) NOT NULL,
  `primer_apellido` varchar(20) NOT NULL,
  `segundo_apellido` varchar(20) DEFAULT NULL,
  `telefono` varchar(15) NOT NULL,
  `contraseña` varchar(200) DEFAULT NULL,
  `tipo` varchar(15) NOT NULL,
  `ultimo_acceso` date DEFAULT NULL,
  PRIMARY KEY (`identificacion`)
);


-- CREACIÓN DE LA TABLA DE ADMINISTRADORES
CREATE TABLE `administrador` (
  `id_administrador` int NOT NULL AUTO_INCREMENT,
  `cargo` varchar(20) NOT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id_administrador`),
  KEY `info_admin_fk` (`id_usuario`),
  CONSTRAINT `info_admin_fk` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`identificacion`)
);

-- CREACIÓN DE LA TABLA DE FUNCIONARIOS
CREATE TABLE `funcionario` (
  `id_funcionario` int NOT NULL AUTO_INCREMENT,
  `cargo` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `verificado` int NOT NULL,
  `fecha_creacion` date NOT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  KEY `info_funcionario_fk` (`id_usuario`),
  CONSTRAINT `info_funcionario_fk` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`identificacion`)
);

-- CREACIÓN DE LA TABLA DE PACIENTES
CREATE TABLE `paciente` (
  `id_paciente` int NOT NULL AUTO_INCREMENT,
  `email` varchar(100) DEFAULT NULL,
  `direccion` varchar(150) NOT NULL,
  `edad` int NOT NULL,
  `verificado` int NOT NULL,
  `fecha_creacion` date NOT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id_paciente`),
  KEY `info_paciente_fk` (`id_usuario`),
  CONSTRAINT `info_paciente_fk` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`identificacion`)
);

-- CREACIÓN DE LA TABLA DE VACUNAS
CREATE TABLE `vacuna` (
  `id_vacuna` int NOT NULL AUTO_INCREMENT,
  `farmaceutica` varchar(20) NOT NULL,
  `refuerzo` int NOT NULL,
  PRIMARY KEY (`id_vacuna`)
);

-- CREACIÓN DE LA TABLA DE LOTE DE VACUNAS
CREATE TABLE `lote_vacuna` (
  `id_lote` int NOT NULL AUTO_INCREMENT,
  `numero_dosis` int NOT NULL,
  `numero_dosis_restante` int NOT NULL,
  `id_vacuna` int NOT NULL,
  PRIMARY KEY (`id_lote`),
  KEY `id_vacuna_fk` (`id_vacuna`),
  CONSTRAINT `id_vacuna_fk` FOREIGN KEY (`id_vacuna`) REFERENCES `vacuna` (`id_vacuna`)
);

-- CREACIÓN DE LA TABLA DE VACUNACIONES
CREATE TABLE `reporte_vacuna` (
  `id_reporte` int NOT NULL AUTO_INCREMENT,
  `fecha_aplicacion` date NOT NULL,
  `fecha_refuerzo` date DEFAULT NULL,
  `id_paciente` int NOT NULL,
  `id_funcionario` int NOT NULL,
  `id_lote` int NOT NULL,
  PRIMARY KEY (`id_reporte`),
  KEY `id_paciente_fk` (`id_paciente`),
  KEY `id_funcionario_fk` (`id_funcionario`),
  KEY `id_lote_fk` (`id_lote`),
  CONSTRAINT `id_funcionario_fk` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario` (`id_funcionario`),
  CONSTRAINT `id_lote_fk` FOREIGN KEY (`id_lote`) REFERENCES `lote_vacuna` (`id_lote`),
  CONSTRAINT `id_paciente_fk` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`)
);

-- INSERTAR DATOS DE USUARIOS
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (11223344, 'Luis V2', 'Jose', 'Linzares', 'Lor', '2321212', NULL, 'FUN', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (101010101, 'Josefina', 'Coral', 'Romero', 'Durán', '31454678976', NULL, 'USU', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (123456789, 'Yeferson', 'Camilo', 'Zaque', 'Bautista', '3116789089', 'admin', 'ADM', '2021-11-29');
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (828190291, 'Maritza', 'Julieta', 'Gonzales', 'Prada', '3146782341', 'maritza', 'FUN', '2021-11-22');
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (987654321, 'Maria', 'Juliana', 'Romero', 'Lopez', '3156371289', 'funcionario', 'FUN', '2021-11-29');
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1010101010, 'Martha', 'Lucia', 'Peréz', 'Gúzman', '3219871234', 'paciente', 'USU', '2021-11-29');
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1111111111, 'Karla', 'Maria', 'Marin', 'Lopez', '3124567625', NULL, 'USU', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1313131313, 'Luis', 'José', 'Romero', 'Prieto', '314234576543', 'luis', 'USU', '2021-11-22');
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1378982718, 'Lucas', 'Luis', 'Romero', 'Perez', '3124567890', NULL, 'USU', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1414141414, 'Dora', 'Maria', 'Ramirez', 'Perez', '3142564521', NULL, 'USU', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1515151515, 'Edwin', 'Steven', 'Marin', 'Nogal', '3124566721', NULL, 'USU', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1616161616, 'Oscar', 'Antonio', 'Romero', 'Pinzon', '3256276754', NULL, 'USU', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1717171717, 'Julieta', 'Maria', 'Rosales', 'Perdomo', '3125467654', NULL, 'USU', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (1818181818, 'José', 'Duvan', 'Cifuentes', 'Santos', '3156728765', NULL, 'USU', NULL);
INSERT INTO hc_lasmercedes.usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, contraseña, tipo, ultimo_acceso) VALUES (2020202020, 'José', 'Antonio', 'Ramirez', 'Romero', '3167897621', NULL, 'USU', NULL);

-- INSERTAR DATOS DE ADMINISTRADORES
INSERT INTO hc_lasmercedes.administrador (id_administrador, cargo, id_usuario) VALUES (2, 'Especialista', 123456789);

-- INSERTAR DATOS DE FUNCIONARIOS
INSERT INTO hc_lasmercedes.funcionario (id_funcionario, cargo, email, verificado, fecha_creacion, id_usuario) VALUES (1, 'Epidemiologo', 'funcionario@funcionario.com', 1, '2021-11-18', 987654321);
INSERT INTO hc_lasmercedes.funcionario (id_funcionario, cargo, email, verificado, fecha_creacion, id_usuario) VALUES (3, 'Doctora', 'maritza@maritza.com', 1, '2021-11-22', 828190291);
INSERT INTO hc_lasmercedes.funcionario (id_funcionario, cargo, email, verificado, fecha_creacion, id_usuario) VALUES (4, 'Epimediologo', 'luisjose@luisjose.com', 0, '2021-11-22', 11223344);

-- INSERTAR DATOS DE PACIENTES
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (1, 'paciente@paciente.com', 'Vereda San Bernardo 2', 54, 1, '2021-11-20', 1010101010);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (3, 'devops@devops.com', 'Villavicencio', 34, 0, '2021-11-21', 2020202020);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (4, 'karla@karla.com', 'Bogotá', 34, 0, '2021-11-21', 1111111111);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (5, 'luis@luis.com', 'Cartagena', 23, 1, '2021-11-21', 1313131313);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (6, 'dora@dora.com', 'Medellín', 32, 0, '2021-11-21', 1414141414);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (7, 'edwin@edwin.com', 'Cartagena', 23, 0, '2021-11-21', 1515151515);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (8, 'oscar@oscar.com', 'Tunja', 23, 0, '2021-11-21', 1616161616);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (9, 'julieta@julieta.com', 'Bogotá', 23, 0, '2021-11-21', 1717171717);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (10, 'email@email.com', 'Cartagena', 23, 0, '2021-11-21', 1378982718);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (11, 'jose@jose.com', 'Manta', 23, 0, '2021-11-21', 1818181818);
INSERT INTO hc_lasmercedes.paciente (id_paciente, email, direccion, edad, verificado, fecha_creacion, id_usuario) VALUES (15, 'josefina@josefina.com', 'San Pedro', 67, 0, '2021-11-21', 101010101);

-- INSERTAR DATOS DE VACUNAS
INSERT INTO hc_lasmercedes.vacuna (id_vacuna, farmaceutica, refuerzo) VALUES (1, 'Moderna', 1);
INSERT INTO hc_lasmercedes.vacuna (id_vacuna, farmaceutica, refuerzo) VALUES (3, 'Pfizer', 0);

-- INSERTAR DATOS DE LOTES DE VACUNAS
INSERT INTO hc_lasmercedes.lote_vacuna (id_lote, numero_dosis, numero_dosis_restante, id_vacuna) VALUES (2, 270, 0, 1);
INSERT INTO hc_lasmercedes.lote_vacuna (id_lote, numero_dosis, numero_dosis_restante, id_vacuna) VALUES (3, 250, 248, 3);

-- INSERTAR DATOS DE VACUNAS APLICADAS
INSERT INTO hc_lasmercedes.reporte_vacuna (id_reporte, fecha_aplicacion, fecha_refuerzo, id_paciente, id_funcionario, id_lote) VALUES (1, '2021-11-10', '2021-12-28', 1, 1, 2);
INSERT INTO hc_lasmercedes.reporte_vacuna (id_reporte, fecha_aplicacion, fecha_refuerzo, id_paciente, id_funcionario, id_lote) VALUES (3, '2021-11-13', '2021-12-13', 1, 1, 2);
INSERT INTO hc_lasmercedes.reporte_vacuna (id_reporte, fecha_aplicacion, fecha_refuerzo, id_paciente, id_funcionario, id_lote) VALUES (5, '2021-12-13', NULL, 4, 4, 2);
INSERT INTO hc_lasmercedes.reporte_vacuna (id_reporte, fecha_aplicacion, fecha_refuerzo, id_paciente, id_funcionario, id_lote) VALUES (6, '2021-11-29', NULL, 3, 1, 3);
INSERT INTO hc_lasmercedes.reporte_vacuna (id_reporte, fecha_aplicacion, fecha_refuerzo, id_paciente, id_funcionario, id_lote) VALUES (7, '2021-11-29', NULL, 15, 4, 3);