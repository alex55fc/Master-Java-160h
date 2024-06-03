Posible solucion hecho por Isabel
Microservicio pedidos Desarrollar un microservicio que permita operar con pedidos.  
 
El microservicio recibirá los datos del pedido y los dará de alta. Permitirá recuperar todos los 
pedidos existentes. Tendrá que interactuar con el microservicio de productos para las 
actualizaciones de stock y obtención del precio.  
 
O sea, el servicio de pedidos expone dos recursos: 
	• Un recurso que dará de alta un nuevo pedido al recibir en una petición de tipo post que 
	incluirá en el cuerpo de la misma los datos del pedido. Desde este servicio se realizarán las 
	correspondientes llamadas a los recursos del servicio de productos para actualizar el stock. 
	• Un recurso que al recibir una petición get devuelva todos los pedidos registrados. 
	 
El microservicio estará disponible en el puerto 7000