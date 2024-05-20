
CREATE TABLE `Departamentos` (`idDepartamento` INT NOT NULL,`nombre` VARCHAR(255) NOT NULL, `localidad` VARCHAR(255) NOT NULL, PRIMARY KEY(`idDepartamento`)); 
CREATE TABLE `Empleados` (`idEmpleado` INT NOT NULL, `nombre` VARCHAR(255) NOT NULL,`fecha` DATE,`sueldo` DOUBLE NOT NULL,`id_departamento` INT, PRIMARY KEY (`idEmpleado`), CONSTRAINT `Empleados_fk0` FOREIGN KEY (`id_departamento`) REFERENCES `Departamentos`(`idDepartamento`));
