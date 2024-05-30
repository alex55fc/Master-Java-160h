Desarrollar un microservicio que permita operar con pedidos.  
 
El microservicio recibirá los datos del pedido y los dará de alta. Permitirá recuperar todos los 
pedidos existentes. Tendrá que interactuar con el microservicio de productos para las 
actualizaciones de stock y obtención del precio.  
 
O sea, el servicio de pedidos expone dos recursos: 
• Un recurso que dará de alta un nuevo pedido al recibir en una petición de tipo post que 
incluirá en el cuerpo de la misma los datos del pedido. Desde este servicio se realizarán las 
correspondientes llamadas a los recursos del servicio de productos para actualizar el stock. 
• Un recurso que al recibir una petición get devuelva todos los pedidos registrados. 
 
El microservicio estará disponible en el puerto 7000.
--------------------------------------------------------------------------------------------------------------
Instrucciones

Proyecto vinculado a SpringBoot-08-Pedidos
Este sera el cliente de los Microservicios conectados. En este casi si tendra acceso a DB por lo que necesitaremos DAO
1- Añadir dependencias.
2- Definir modelo
2.5- Añadir capa DAO
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