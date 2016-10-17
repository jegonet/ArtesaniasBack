/**
 * Author:  Jorge Eliecer Gantiva Ochoa
 * Scripts de generación de base datos
    
   Nombre base de datos: artesanias
   Usuario: postgres
   Contraseña: 1234
 */

/**
 * Author:  Jorge Eliecer Gantiva Ochoa
 * Scripts de generación de base datos
 */

create table producto (
    id int primary key, 
    nombre varchar(50) not null,
    descripcion varchar(1000) not null,
    precio numeric(7) not null,
    descuento int not null default 0,
    codigo varchar(50) not null,
    habilitado boolean not null default true
);


insert into producto values (1, 'Bolso Mediano Iraca', 'Bolso Mediano Iraca', 120000, 0, 'P1', true);
insert into producto values (2, 'Balay Mediano', 'Balay Mediano', 110000, 0, 'P2', true);
insert into producto values (3, 'Abrecartas Carnaval', 'Abrecartas Carnaval', 100000, 0, 'P3', true);         
insert into producto values (4, 'Batea Cuadrada', 'Batea Cuadrada',  125000, 0, 'P4', true);
insert into producto values (5, 'Bandeja Werregue', 'Bandeja Werregue', 90000, 0, 'P5', true);


select id, nombre, descripcion, precio, descuento, codigo from producto where habilitado = true order by id desc;


create table contacto(
	id SERIAL,
	fecha timestamp not null default(now()),
	nombreCompleto varchar(100) not null,
	email varchar(1000) not null,
	comentarios varchar(1000) not null
);


--insert into contacto(nombreCompleto, email, comentarios) values('', '', '')