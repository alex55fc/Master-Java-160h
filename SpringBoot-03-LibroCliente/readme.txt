Este sera el cliente de los Microservicios conectados. Por lo que no tendra acceso a bases de datos 
1- Unica dependencia Starter SpringWeb.
2- Definir modelo
3- Trabajar con la capa de servicio 
	3.1 Crear la interfaz
	3.2 Crear la calse que implemente la interfaz
4- Implementar controlador
5- Configuraciones 
	5.1 Indicar paquetes a escanear(en el Application)
	5.2 Crear un @Bean del RestTemplate, para que nos permita la comunicacion entre servicios
	5.3 asignar un port disponible, ya que tendremos dos servicios inciados a la vez(y originalmente usan el mismo Port)
6- Probar el PostMan

	Probar http://localhost:9090/ejemplar/{isbn}/{titulo}/{tematica}. Si funciona en postman.