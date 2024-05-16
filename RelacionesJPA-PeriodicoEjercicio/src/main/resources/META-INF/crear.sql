CREATE TABLE `Comentarios` (`id` INT NOT NULL,`titulo` VARCHAR(255) NOT NULL,`texto` VARCHAR(255) ,`noticias_titulo` VARCHAR(255) ,PRIMARY KEY (`id`));
CREATE TABLE `Noticias` (        `titulo` VARCHAR(255) NOT NULL,`autor` VARCHAR(255) NOT NULL,`fecha`DATE,PRIMARY KEY (`titulo`));
ALTER TABLE `Comentarios` ADD CONSTRAINT `Comentarios_fk0` FOREIGN KEY (`noticias_titulo`) REFERENCES `Noticias`(`titulo`);
  