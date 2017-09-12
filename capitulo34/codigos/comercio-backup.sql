CREATE DATABASE comercio;
USE comercio;

DROP TABLE IF EXISTS `comercio`.`categoria`;
CREATE TABLE  `comercio`.`categoria` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(50) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

INSERT INTO `comercio`.`categoria` (`CODIGO`,`DESCRICAO`) VALUES 
 (1,'Livros'),
 (2,'Alimentos e bebidas'),
 (3,'Higiene pessoal'),
 (4,'Limpeza'),
 (5,'Perfumaria e beleza'),
 (6,'Informática'),
 (7,'Móveis'),
 (8,'Eletrodomésticos'),
 (9,'Eletroportáteis');

DROP TABLE IF EXISTS `comercio`.`cliente`;
CREATE TABLE  `comercio`.`cliente` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) NOT NULL,
  `CPF` char(11) NOT NULL,
  `NASCIMENTO` date NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

INSERT INTO `comercio`.`cliente` (`CODIGO`,`NOME`,`CPF`,`NASCIMENTO`) VALUES 
 (1,'Eliane Guimarães','64441173300','1980-04-14'),
 (2,'Carlos Soares','56329782490','1985-08-23'),
 (3,'Marcelo Vieira','58766857201','1979-10-02'),
 (4,'Ricardo Gonçalves','31144414830','1977-02-28'),
 (5,'Gabriela Siqueira','36547611868','1988-05-15'),
 (6,'Fernanda Machado','80172162114','1989-09-18'),
 (7,'Patrícia Duarte','62504891342','1984-03-26'),
 (8,'Angélica Menezes','34146810728','1983-06-07'),
 (9,'Sandro Ribeiro','27913176512','1982-11-22'),
 (10,'Ronaldo Moreira','25645271165','1991-08-16');

DROP TABLE IF EXISTS `comercio`.`item`;
CREATE TABLE  `comercio`.`item` (
  `ID_PEDIDO` int(11) NOT NULL,
  `ID_PRODUTO` int(11) NOT NULL,
  `QUANTIDADE` int(11) NOT NULL,
  `UNITARIO` decimal(15,2) NOT NULL,
  PRIMARY KEY (`ID_PEDIDO`,`ID_PRODUTO`),
  KEY `FK_ITEM_PRODUTO` (`ID_PRODUTO`),
  CONSTRAINT `FK_ITEM_PEDIDO` FOREIGN KEY (`ID_PEDIDO`) REFERENCES `pedido` (`NUMERO`),
  CONSTRAINT `FK_ITEM_PRODUTO` FOREIGN KEY (`ID_PRODUTO`) REFERENCES `produto` (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `comercio`.`pedido`;
CREATE TABLE  `comercio`.`pedido` (
  `NUMERO` int(11) NOT NULL AUTO_INCREMENT,
  `DATA` date NOT NULL,
  `HORARIO` time NOT NULL,
  `ID_CLIENTE` int(11) NOT NULL,
  `STATUS` char(1) NOT NULL,
  PRIMARY KEY (`NUMERO`),
  KEY `FK_PEDIDO_CLIENTE` (`ID_CLIENTE`),
  CONSTRAINT `FK_PEDIDO_CLIENTE` FOREIGN KEY (`ID_CLIENTE`) REFERENCES `cliente` (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `comercio`.`produto`;
CREATE TABLE  `comercio`.`produto` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(50) NOT NULL,
  `PRECO` decimal(15,2) NOT NULL,
  `ID_CATEGORIA` int(11) NOT NULL,
  PRIMARY KEY (`CODIGO`),
  KEY `FK_PRODUTO_CATEGORIA` (`ID_CATEGORIA`),
  CONSTRAINT `FK_PRODUTO_CATEGORIA` FOREIGN KEY (`ID_CATEGORIA`) REFERENCES `categoria` (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

INSERT INTO `comercio`.`produto` (`CODIGO`,`DESCRICAO`,`PRECO`,`ID_CATEGORIA`) VALUES 
 (1,'Guarda-roupa - 6 portas','399.00',7),
 (2,'Criado-mudo - 2 gavetas','199.00',7),
 (3,'Refrigerador Frost Free 403 litros','1999.00',8),
 (4,'Forno elétrico 45 litros','329.00',8),
 (5,'Liquidificador 5 velocidades','169.00',9),
 (6,'Cafeteira para 12 cafés','45.90',9),
 (7,'Pen drive 8GB','99.00',6),
 (8,'Cabo USB 2.0','4.90',6),
 (9,'Java na Web','75.00',1),
 (10,'Programando em Java 2','89.00',1),
 (11,'Vinho Cabernet Sauvignon','24.90',2),
 (12,'Vinho Merlot','29.90',2),
 (13,'Shampoo anti-caspa','12.50',3),
 (14,'Cotonetes de algodão','5.80',3),
 (15,'Sabão líquido','3.20',4),
 (16,'Sabão em pó 500 g','7.50',4),
 (17,'Colônia masculina de café','45.00',5),
 (18,'Protetor labial sabor morango','8.50',5);
