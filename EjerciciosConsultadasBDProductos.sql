CREATE TABLE `producto` (
`codigo` int NOT NULL,
`nombre` varchar(45) DEFAULT NULL,
`precio` int DEFAULT NULL,
`fabricante` int DEFAULT NULL,
PRIMARY KEY (`codigo`),
KEY `fk_fabricante_idx` (`fabricante`),
CONSTRAINT `fk_fabricante` FOREIGN KEY (`fabricante`) REFERENCES `fabricantes` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `fabricantes` (
`codigo` int NOT NULL,
`nombre` varchar(45) DEFAULT NULL,
PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 1. Obtener el nombre de los productos de la tienda
select nombre from articulos.productos;

-- 2. Obtener el nombre y el precio de los productos de la tienda
select nombre, precio from articulos.productos;

-- 3. Obtener el nombre de los productos cuyo precio sea menor o igual a 200€
SELECT nombre, precio FROM articulos.articulos WHERE precio <= 200;

-- 4. Obtener todos los datos de los articulos cuyo precio esté entre los 60 y los 120€
SELECT * FROM articulos.articulos WHERE precio > 60 AND precio < 120;
        
-- 5. Obtener el nombre y el precio en pesetas (es decir, el precio en euros multiplicado por 166.386
SELECT nombre, precio*(166.386) as precio_pesetas FROM articulos;
 
-- 6. Seleccionar el precio medio de todos los productos
SELECT AVG(precio) FROM articulos;
        
-- 7. Obtener el precio medio de los artículos cuyo código de fabricante sea 2
SELECT AVG(precio) as "PRECIO_MEDIO
from bdarticulos.articulos
where fabrincatne =2";

-- 8. Obtener el número de artículos cuyo precio sea mayor o igual a 180 €.
SELECT count(*) FROM articulos WHERE pvp>=180;

-- 9.  Obtener el nombre y el de artículos cuyo precio sea mayor o igual a 180 € y ordenarlos descendentemente por precio, y luego ascendentemente por nombre.
SELECT nombre, precio FROM bdarticulos.articulos
WHERE precio >= 180 
ORDER BY precio DESC, nombre;

#10-        Obtener un listado completo de artículos, incluyendo por cada artículo los datos del artículo y de su fabricante.

SELECT a.codigo_articulo, a.nombre, a.precio, a.codigo_fabricante, f.nombre
FROM articulos a JOIN fabricantes f
WHERE a.codigo_fabricante = f.codigo_fabricante;

#11-  Obtener un listado de artículos, incluyendo el nombre del artículo, su precio y el nombre de su fabricante

SELECT a.nombreArticulo, a.precio, f.nombre as 'Nombre Fabricante' FROM articulos a JOIN fabricantes f ON  a.codigoFabricante = f.codigo;

#12-  Obtener el precio medio de los productos de cada fabricante, mostrando solo los códigos de fabricante.

SELECT avg(precio) AS 'Precio Medio', codigoFabricante FROM articulos GROUP BY codigoFabricante;

#13. Obtener el precio medio de los productos de cada fabricante, mostrando el nombre del fabricante.

select f.nombre, avg(p.precio) from articulos.productos as p
    INNER JOIN articulos.fabricantes as f 
    WHERE f.codigo = p.fabricante GROUP BY f.nombre;
    
#14. Obtener los nombres de los fabricantes que ofrezcan productos cuyo precio medio sea mayor o igual a 15 €

select f.nombre AS nombre_fabricante from articulos.fabricantes as f
    INNER JOIN articulos.productos as a WHERE f.codigo = a.fabricante
    GROUP BY f.nombre HAVING AVG(a.precio) >= 15;

# 15. Obtener el nombre y el precio del artículo más barato.
SELECT nombre, precio
FROM articulo
WHERE precio = (SELECT MIN(precio) FROM articulo);


# 16. Obtener una lista con el nombre y precio de los artículos más caros de cada proveedor (incluyendo el nombre del proveedor)
SELECT fa.nombre, ar.precio
FROM articulo AS ar, fabricante AS fa
WHERE ar.fabricante = fa.codigo AND ar.precio = (SELECT MAX(ar.precio) FROM articulo)
GROUP BY fa.nombre, ar.precio;

#17-      Añadir un nuevo producto: Altavoces de 70 € (del fabricante 2)
INSERT INTO articulos (nombre, precio, fabricante)
VALUES (“altavoces”, 70, 2);

# 18-      Cambiar el nombre del producto 8 a  “Impresora laser”
UPDATE articulos SET nombre = “Impresora_laser”
WHERE codigo = 8;

#19-        Aplicar un descuento del 10% a todos los productos
UPDATE articulos.productos SET precio = precio * 0.9;

#20-        Aplicar un descuento de 10 € a todos los productos cuyo precio sea mayor o igual a 120€ 
UPDATE articulos.productos SET precio = precio - 10 WHERE precio >=120;
