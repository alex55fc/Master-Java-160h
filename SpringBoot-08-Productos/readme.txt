 
Microservicio productos Desarrollar un microservicio que permita operar con productos.  
El microservicio deberá exponer los siguientes recursos:  
• Lista de productos existentes.  
• Actualizar el stock del producto. 
• Obtener el precio de un producto.  
 
O sea, el servicio de productos expone tres recursos: 
• Un recurso que ante una petición get, devuelve la lista de productos existentes. 
• Un recurso que al recibir una petición put, actualiza el stock del producto indicado. En la 
URL de la petición se reciben el código de producto y las unidades compradas. 
• Un recurso que al recibir una petición get con el código del producto devuelve el precio 
unitario del mismo. 
 
El microservicio estará disponible en el puerto 8000.