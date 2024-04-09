
create database proyecto;

CREATE TABLE Usuario(
	id_usuario INT PRIMARY KEY, 
    username VARCHAR(45) NOT NULL, 
    password VARCHAR(45) NOT NULL
);

CREATE TABLE Proyecto(
	uuid_proyecto INT PRIMARY KEY, 
    nombre VARCHAR(45) NOT NULL, 
    descripcion VARCHAR(100) NOT NULL, 
    status_p VARCHAR(45) NOT NULL,
    createdDate DATETIME NOT NULL,
    lastUpdatedTime DATETIME NOT NULL
);

CREATE TABLE task(
	uuid_tarea INT PRIMARY KEY, 
    nombre VARCHAR(45) NOT NULL, 
    descripcion VARCHAR(100) NOT NULL,  
    status_t VARCHAR(45) NOT NULL,
    startDate DATETIME NOT NULL,
    dueDate DATETIME NOT NULL,
    createdDate DATETIME NOT NULL,
    lastUpdatedTime DATETIME NOT NULL
);

INSERT INTO usuario (id_usuario, username, password)
VALUES 
    (1, 'ana', '123'),
    (2, 'juan', '214'),
    (3, 'monica', '632'),
    (4, 'ramon', '124'),
    (5, 'laura', '789'),
    (6, 'carlos', '456'),
    (7, 'maria', '321'),
    (8, 'pedro', '987'),
    (9, 'sara', '567'),
    (10, 'javier', '890');

INSERT INTO Proyecto (uuid_proyecto, nombre, descripcion, status, createdDate, lastUpdatedDate)
VALUES 
    (1, 'Proyecto A', 'Desarrollo de una aplicación móvil', 'ACTIVE', '2024-04-01', '2024-04-01'),
    (2, 'Proyecto B', 'Implementación de un sistema de gestión de inventario', 'ACTIVE', '2024-03-15', '2024-03-30'),
    (3, 'Proyecto C', 'Diseño de un sitio web corporativo', 'ACTIVE', '2024-02-20', '2024-03-10'),
    (4, 'Proyecto D', 'Investigación en inteligencia artificial', 'ACTIVE', '2024-03-10', '2024-03-25'),
    (5, 'Proyecto E', 'Desarrollo de una plataforma de e-learning', 'INACTIVE', '2024-02-05', '2024-02-20'),
    (6, 'Proyecto F', 'Implementación de un sistema de gestión de ventas', 'INACTIVE', '2024-01-15', '2024-02-05'),
    (7, 'Proyecto G', 'Desarrollo de un juego para dispositivos móviles', 'INACTIVE', '2024-03-20', '2024-04-02'),
    (8, 'Proyecto H', 'Creación de un portal de noticias', 'INACTIVE', '2024-02-10', '2024-02-25'),
    (9, 'Proyecto I', 'Investigación en energías renovables', 'PAUSED', '2024-01-05', '2024-01-20'),
    (10, 'Proyecto J', 'Desarrollo de una aplicación para la gestión de citas médicas', 'PAUSED', '2024-04-03', '2024-04-03');

INSERT INTO Task (uuid_tarea, nombre, descripcion, status, startDate, dueDate, createdDate, lastUpdatedDate, proyecto_uuid_proyecto)
VALUES 
    (1, 'Diseño de interfaz de usuario', 'Crear mockups y prototipos', 'TO DO', '2024-04-01', '2024-04-15', '2024-04-01', '2024-04-02', 1),
    (2, 'Desarrollo de backend', 'Implementar la lógica de negocio', 'TO DO', '2024-03-15', '2024-03-30', '2024-03-15', '2024-03-15', 1),
    (3, 'Pruebas de calidad', 'Realizar pruebas de funcionalidad', 'TO DO', '2024-02-20', '2024-03-10', '2024-02-20', '2024-02-20', 5),
    (4, 'Optimización de código', 'Refactorizar código existente', 'TO DO', '2024-03-10', '2024-03-25', '2024-03-10', '2024-03-10', 8),
    (5, 'Configuración de servidores', 'Configurar servidores de producción', 'IN PROGRESS', '2024-02-05', '2024-02-20 ', '2024-02-05', '2024-02-15', 3),
    (6, 'Implementación de pruebas unitarias', 'Desarrollar casos de prueba', 'IN PROGRESS', '2024-01-15', '2024-02-20', '2024-01-15', '2024-01-30', 3),
    (7, 'Configuración de base de datos', 'Configurar bases de datos relacionales', 'IN PROGRESS', '2024-03-20', '2024-04-02', '2024-03-20', '2024-03-28', 3),
    (8, 'Elaboración de documentación', 'Crear documentación técnica', 'BLOCKED', '2024-02-10', '2024-02-25', '2024-02-10', '2024-02-10', 6),
    (9, 'Despliegue de aplicación', 'Realizar el despliegue en entorno de producción', 'DONE', '2024-01-05', '2024-01-20', '2024-01-05', '2024-01-20', 9),
    (10, 'Reunión de seguimiento', 'Realizar reunión de seguimiento con el equipo', 'DONE', '2024-04-03', '2024-04-15', '2024-04-03', '2024-04-15', 10);

select * from usuario;
select * from Proyecto;
select * from Task;