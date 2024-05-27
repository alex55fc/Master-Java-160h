Ejercicio Gorras CRUD & Querys pero con acceso a bases de datos.
RECURSO: Gorra

Vamos a exponer un CRUD de libro que está almacenado en una base de datos

GET---->recuperar
POST--->insertar
PUT---->actualizar
DELETE->eliminar

http://localhost:8080/gorras              GET: expone todos las gorras
http://localhost:8080/gorras/{codGorra}   GET: recupere el libro con el codGorra indicado en la url
http://localhost:8080/gorras              POST: dar de alta una gorra del que paso los datos en el cuerpo en formato JSON(@RequestBody)
http://localhost:8080/gorras              PUT: actualizar una gorra del que paso los datos en el cuerpo en formato JSON (@RequestBody)
http://localhost:8080/gorras/{codGorra}   DELETE: borrar una gorra con el codGorra indicado en la url   


ORDEN DE CREACION:
1- Crear el proyecto y poner las dependencias necesarias
2- Definir el modelo de datos  (com.gorras.model)
3- Crear capa dao (com.gorras.dao)
	Crear interface que extends de JpaRepository<T, ID>
	donde T --> tipo entidad
	y     ID--> tipo de la primary key
	Si se necesitan más métodos que los que estan en JpaRepository se incorporan aquí
	@Query("     ")
	tipoDevuelve metodo(tipoArg arg)

4-Capa de la lógica de negocio, capa de servicio (com.gorras.service) 
  4.1 Crear la interface
  4.2 Crear clase que implemente esa interface (no olvidar incluir @Service) y declarar una variable de tipo XXDao y anotarla 
  con  @Autowired
5- Implementar el controlador (com.gorras.controller)   (no olvidar @RestController en la clase y   @Autowired GorrasService service)
6- Configuraciones 

   6.1 En la clase lanzadora añadir los paquetes que tienen clases con anotaciones de spring
   	@EntityScan(basePackages="com.curso.model")  -->paquete donde esta la entidad
	@EnableJpaRepositories(basePackages="com.curso.dao")--->paquete donde esta la interface que herada de JpaRepository
	@SpringBootApplication(scanBasePackages= {"com.curso.controller", "com.curso.service"})
   6.2  En el application.properties incorporar las propiedades necesarias para poder trabajar con la base de datos
   
   
   
   
   
   
   
   
   