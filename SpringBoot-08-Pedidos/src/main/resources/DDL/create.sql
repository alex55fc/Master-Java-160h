CREATE TABLE `pedidos` (
  `id_pedido` int NOT NULL,
  `direccion_envio` varchar(255) DEFAULT NULL,
  `fecha_pedido` date DEFAULT NULL,
  `id_producto` int DEFAULT NULL,
  `nom_cliente` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci