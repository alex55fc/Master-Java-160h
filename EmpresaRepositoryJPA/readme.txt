Proyecto de JPA manejar una realcion 1 .. M creando la base de datos un data.sql y testing.
Cambiamos la estructura del persistence.xml ya que ahora en MySQLWorkBench solo crearemos el nombre de 
la db, no meteremos ningun dato mas. Hacemos testing usando una clase padre donde instanciaremos la persistencia 
para mejorar el tiempo de respuesta de los test y que asi no se creen y eliminen en la misma clase todo el rato y reduzca la velocidad
