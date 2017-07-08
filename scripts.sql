CREATE TABLE `cuenta_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_template` varchar(200) DEFAULT NULL,
  `concepto` varchar(200) DEFAULT NULL,
  `monto` decimal(19,2) DEFAULT NULL,
  `fecha_limite` datetime DEFAULT NULL,
  `destino` varchar(200) DEFAULT NULL,
  `entidad_id` int(11) DEFAULT NULL,
  `moneda_id` INT NULL,
  PRIMARY KEY (`id`)
);