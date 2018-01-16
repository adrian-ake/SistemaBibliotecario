/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  adrianake
 * Created: Oct 13, 2017
 */
DROP DATABASE biblioteca_aake;
CREATE DATABASE IF NOT EXISTS biblioteca_aake;
USE biblioteca_aake ;

DROP TABLE IF EXISTS perfiles;
CREATE TABLE perfiles (
    idperfil int(11) NOT NULL  primary key,
    descripcion varchar(100) NOT NULL,
    esvisible tinyint(1) DEFAULT '1',
    created_at timestamp NULL DEFAULT NULL,
    updated_at timestamp NULL DEFAULT NULL
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
insert into perfiles values(1,'Alumno',1,curdate(),curdate());
insert into perfiles values(2,'Administrador',1,curdate(),curdate());
insert into perfiles values(3,'Anonimo',1,curdate(),curdate());

DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario (
    idusuario int(11) NOT NULL AUTO_INCREMENT primary key,
    idperfil int(11) NOT NULL,
    nombres varchar(100) NOT NULL,
    apellidos varchar(100) NOT NULL,
    correo varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    activo tinyint(1) DEFAULT '1',
    created_at timestamp NULL DEFAULT NULL,
    updated_at timestamp NULL DEFAULT NULL,
    foreign key (idperfil) references perfiles (idperfil)  on delete cascade on update cascade
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO usuario VALUES(0,1,'Alumno','Alumno','alumno@gmail.com','c4ca4238a0b923820dcc509a6f75849b',1,curdate(),curdate());
INSERT INTO usuario VALUES(0,2,'Admin','Admon','admon@gmail.com','c4ca4238a0b923820dcc509a6f75849b',1,curdate(),curdate());
INSERT INTO usuario VALUES(0,3,'Anonimo','Anonim','anonim@gmail.com','c4ca4238a0b923820dcc509a6f75849b',1,curdate(),curdate());

DROP TABLE IF EXISTS nacionalidad;
CREATE TABLE nacionalidad (
   idpais int(11) NOT NULL AUTO_INCREMENT primary key,
   pais varchar(100) NOT NULL,
   nacionalidad varchar(100) NOT NULL,
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS autor;
CREATE TABLE autor (
   idautor int(11) NOT NULL AUTO_INCREMENT primary key,
   idpais int(11) NOT NULL,
   nombres varchar(100) NOT NULL,
   apellidos varchar(100) NOT NULL,
   foreign key (idpais) references nacionalidad (idpais)  on delete cascade on update cascade
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS editorial;
CREATE TABLE editorial (
   ideditorial int(11) NOT NULL AUTO_INCREMENT primary key,   
   nombres varchar(100) NOT NULL,   
   foreign key (idpais) references nacionalidad (idpais)  on delete cascade on update cascade
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS anaquel;
CREATE TABLE anaquel (
    idlibro varchar(13) NOT NULL primary key,    
    idautor int(11) NOT NULL, 
    ideditorial int(11) NOT NULL, 
    titulo varchar(100) NOT NULL,
    descripcion text NOT NULL,
    mes_publicacion int(2) NULL,
    anio_publicacion int(4) NULL,    
    activo tinyint(1) DEFAULT '1',
    created_at timestamp NULL DEFAULT NULL,
    updated_at timestamp NULL DEFAULT NULL,
    foreign key (idautor) references autor (idautor)  on delete cascade on update cascade,
    foreign key (ideditorial) references editorial (ideditorial)  on delete cascade on update cascade
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS libro;
CREATE TABLE libro (
    idlibro varchar(13) NOT NULL primary key,    
    idautor int(11) NOT NULL, 
    ideditorial int(11) NOT NULL, 
    titulo varchar(100) NOT NULL,
    descripcion text NOT NULL,
    mes_publicacion int(2) NULL,
    anio_publicacion int(4) NULL,    
    activo tinyint(1) DEFAULT '1',
    created_at timestamp NULL DEFAULT NULL,
    updated_at timestamp NULL DEFAULT NULL,
    foreign key (idautor) references autor (idautor)  on delete cascade on update cascade,
    foreign key (ideditorial) references editorial (ideditorial)  on delete cascade on update cascade
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;





