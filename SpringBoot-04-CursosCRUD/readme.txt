Ejercicio Cursos CRUD & Querys pero con acceso a bases de datos.
Usaremos el aplication propertys con la sentencia 
#spring.jpa.hibernate.ddl-auto=update
Para generar las tablas de la base de datos automaticamente, los nombres de las tablas las generaremos iguales a las de los modelos
----
CRUD cursos 

Desarrollar un servicio que permita operar contra una base de datos de cursos. Un curso 
estará identificado por los siguientes campos: 

. codCurso: Código asignado al curso 
. nombre: Nombre del curso 
. duración: Duración en número de horas del curso 
. precio: precio del curso 


El servicio deberá exponer los siguientes recursos: 

 Alta de curso. Recibirá en el cuerpo de la petición un JSON con los datos del curso y lo 
dará de alta, devolviendo como resultado una lista con los cursos existentes. 
 Eliminación de curso. Recibirá en la url el código del curso y lo eliminará, devolviendo 
como resultado una lista con los cursos existentes. 
 Actualización duración. Recibe en la url el código del curso y el número de horas, 
procediendo a la actualización de dicho dato en el almacen. No devuelve ningún 
resultado. 
 Buscar curso. A partir del código del curso recibido en la url, devolverá un JSON con los 
datos del curso. 
 Cursos por precio. Recibirá en la url un precio mínimo y un precio máximo, 
devolviendo todos los cursos que se encuentren en dicho rango de precios. 


Realizar el testeo de los recursos a través de Postman 

