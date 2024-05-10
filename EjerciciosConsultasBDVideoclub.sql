/*Inserccion de datos en la tabla pelicula*/
INSERT INTO `videoclub`.`pelicula` (`codigo`, `titulo`, `nomDirector`, `precioAlquiler`) 
VALUES 
(102, 'Titanic', 'Cosme', 3.99),
(203, 'El Padrino', 'Marcos moron', 4.50),
(304, 'Forrest Gump', 'Ana', 3.25),
(405, 'Pulp Fiction', 'Eva', 4.75),
(506, 'La Lista de Schindler', 'Steven Spielberg', 22.75);
/*Mostrar todas las películas*/
select * from videoclub.pelicula;
/*Mostrar las películas cuyo director es Cosme*/
select * from videoclub.pelicula where nomDirector = 'Cosme';
/*Mostrar las películas en las que el nombre del director empieza por M*/
select * from videoclub.pelicula where nomDirector like 'M%';
/*Mostrar las películas cuya directora es Ana o Eva*/
select * from videoclub.pelicula where nomDirector = 'Ana' or nomDirector='Eva';
/*Mostrar sólo los directores de las películas*/
select nomDirector from videoclub.pelicula ;
/*Mostrar las películas cuyo precio es mayor que 20 y menor que 55*/
select * from videoclub.pelicula where precioAlquiler > 20 and precioAlquiler < 55;