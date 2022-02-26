-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.21-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para repuesto
CREATE DATABASE IF NOT EXISTS `repuesto` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `repuesto`;

-- Volcando estructura para procedimiento repuesto.Consultar
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar`()
BEGIN
 select *  from trepuesto;
END//
DELIMITER ;

-- Volcando estructura para procedimiento repuesto.Eliminar
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar`()
BEGIN
delete from trepuesto 
where idrepuesto=Pidrepuesto;
END//
DELIMITER ;

-- Volcando estructura para procedimiento repuesto.Guardar
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `Guardar`()
BEGIN
insert into trepuesto(nrepuesto,drepuesto,prepuesto,frepuesto)
values(Pnrepuesto,Pdrepuesto,Pprepuesto,Pfrepuesto);
END//
DELIMITER ;

-- Volcando estructura para procedimiento repuesto.Modificar
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `Modificar`()
BEGIN
update repuesto
set nrepuesto =Prepuesto,
drepuesto=Pdrepuesto,
prepuesto=Pprepuesto,
frepuesto=Pfrepuesto
where idrepuesto=Pidrepuesto;
END//
DELIMITER ;

-- Volcando estructura para tabla repuesto.trepuesto
CREATE TABLE IF NOT EXISTS `trepuesto` (
  `Idrepuesto` int(11) NOT NULL AUTO_INCREMENT,
  `nrepuesto` varchar(50) DEFAULT NULL,
  `drepuesto` varchar(50) DEFAULT NULL,
  `prepuesto` decimal(10,0) DEFAULT NULL,
  `frepuesto` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Idrepuesto`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COMMENT='tabla repuestos';

-- Volcando datos para la tabla repuesto.trepuesto: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `trepuesto` DISABLE KEYS */;
INSERT INTO `trepuesto` (`Idrepuesto`, `nrepuesto`, `drepuesto`, `prepuesto`, `frepuesto`) VALUES
	(1, 'Repuesto1', 'Descripcion1', 10000, 'http://www.repuestos-geminis.com.ar/images/portfolio/aboutme/porfo-motor-repuesto-2.jpg'),
	(2, 'Repuesto2', 'Descripcion2', 20000, 'files\\30-home_default.jpg'),
	(3, 'Repuesto3', 'Descripcion3', 30000, 'files\\36-home_default.jpg'),
	(4, 'Repuesto4', 'Descripcion4', 40000, 'files\\42-home_default.jpg'),
	(5, 'Repuesto5', 'Descripcion5', 50000, 'files\\48-home_default.jpg');
/*!40000 ALTER TABLE `trepuesto` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
