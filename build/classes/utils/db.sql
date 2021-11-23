CREATE DATABASE IF NOT EXISTS hc_lasmercedes;

USE hc_lasmercedes;

CREATE TABLE usuario (
    identificacion INT(10) NOT NULL,
    primer_nombre VARCHAR(20) NOT NULL,
    segundo_nombre VARCHAR(20) NOT NULL,
    primer_apellido VARCHAR(20) NOT NULL,
    segundo_apellido VARCHAR(20),
    telefono VARCHAR(15) NOT NULL,
    contraseña VARCHAR(200),
    tipo VARCHAR(15) NOT NULL,
    ultimo_acceso DATE,

    PRIMARY KEY (identificacion)
);

CREATE TABLE administrador (
    id_administrador INT(10) NOT NULL AUTO_INCREMENT,
    cargo VARCHAR(20) NOT NULL,
    id_usuario INT(10) NOT NULL,

    PRIMARY KEY (id_administrador),
    CONSTRAINT info_admin_fk FOREIGN KEY (id_usuario) REFERENCES usuario(identificacion)
);

CREATE TABLE funcionario (
    id_funcionario INT(10) NOT NULL AUTO_INCREMENT,
    cargo VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    verificado INT(1) NOT NULL,
    fecha_creacion DATE NOT NULL,
    id_usuario INT(10) NOT NULL,

    PRIMARY KEY (id_funcionario),
    CONSTRAINT info_funcionario_fk FOREIGN KEY (id_usuario) REFERENCES usuario(identificacion)
);

CREATE TABLE paciente (
    id_paciente INT(10) NOT NULL AUTO_INCREMENT,
    email VARCHAR(100),
    direccion VARCHAR(150) NOT NULL,
    edad INT(2) NOT NULL,
    verificado VARCHAR(1) NOT NULL,
    fecha_creacion DATE NOT NULL,
    id_usuario INT(10) NOT NULL,

    PRIMARY KEY (id_paciente),
    CONSTRAINT info_paciente_fk FOREIGN KEY (id_usuario) REFERENCES usuario(identificacion)
);

CREATE TABLE vacuna (
    id_vacuna INT(10) NOT NULL AUTO_INCREMENT,
    farmaceutica VARCHAR(20) NOT NULL,
    refuerzo INT(1) NOT NULL,

    PRIMARY KEY (id_vacuna)
);

CREATE TABLE lote_vacuna (
    id_lote INT(10) NOT NULL AUTO_INCREMENT,
    numero_dosis INT(5) NOT NULL, 
    numero_dosis_restante INT(5) NOT NULL,
    id_vacuna INT(10) NOT NULL,

    PRIMARY KEY (id_lote),
    CONSTRAINT id_vacuna_fk FOREIGN KEY (id_vacuna) REFERENCES vacuna(id_vacuna)
);

CREATE TABLE reporte_vacuna (
    id_reporte INT(10) NOT NULL AUTO_INCREMENT,
    fecha_aplicacion DATE NOT NULL,
    fecha_refuerzo DATE,
    id_paciente INT(10) NOT NULL,
    id_funcionario INT(10) NOT NULL,
    id_lote INT(10) NOT NULL,

    PRIMARY KEY (id_reporte),
    CONSTRAINT id_paciente_fk FOREIGN KEY (id_paciente) REFERENCES paciente(id_paciente),
    CONSTRAINT id_funcionario_fk FOREIGN KEY (id_funcionario) REFERENCES funcionario(id_funcionario),
    CONSTRAINT id_lote_fk FOREIGN KEY (id_lote) REFERENCES lote_vacuna(id_lote)
);