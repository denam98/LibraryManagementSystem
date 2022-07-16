-- MySQL dump 10.13  Distrib 5.5.5-m3, for Win32 (x86)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.5.5-m3

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'denuwan bandara');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `isbn` varchar(45) NOT NULL,
  `author_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `language` varchar(45) NOT NULL,
  `initqty` int(11) NOT NULL,
  `availableqty` int(11) NOT NULL,
  PRIMARY KEY (`isbn`),
  KEY `fk_book_category1_idx` (`category_id`),
  KEY `fk_book_author` (`author_id`),
  CONSTRAINT `fk_book_author` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_category1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('1234567890123',1,7,'new dawn','english',15,14),('1234567890124',1,8,'valhalla','sinhala',5,4),('1234567890125',1,1,'tomarrow','tamil',2,1);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryname` varchar(45) NOT NULL,
  `blockno` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'art & music','block1'),(2,'biographies','block2'),(3,'business','block3'),(4,'comics','block5'),(5,'computers & tech','block4'),(6,'cooking','block6'),(7,'edu & reference','block7'),(8,'entertainment','block5'),(9,'health & fitness','block8'),(10,'history','block9'),(11,'kids','block10'),(12,'literature & fiction','block11'),(13,'science & math','block12'),(14,'mysteries','block13'),(15,'sci-fi & fantacy','block13'),(16,'horror','block13'),(17,'romance','block13'),(18,'sports','block8'),(19,'teen','block8'),(20,'travel','block5');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `nic` varchar(12) NOT NULL,
  `phone` varchar(15) NOT NULL DEFAULT '1',
  `dob` date NOT NULL,
  `gender` varchar(2) NOT NULL,
  `home` varchar(45) NOT NULL,
  `street` varchar(100) NOT NULL,
  `zone` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `postalcode` varchar(10) NOT NULL,
  `stat` tinyint(1) NOT NULL,
  `dateemployeed` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_employee_role1_idx` (`role_id`),
  CONSTRAINT `fk_employee_role1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,1,'denuwan','bandara','982533104v','0763049683','1998-09-09','M','240/B/03','ranawiru street','glahitiyawa','ganemulla','11020',1,'2021-09-19'),(2,2,'shalini','silva','342354103v','0773475435','1999-03-23','F','','','','','',1,'2021-09-19'),(3,3,'kinsi','padmakanthi','774254145v','0774416115','1976-01-04','F','','','','','',1,'2021-09-19'),(4,4,'poornima','bandara','200845762312','0764244933','2008-09-28','F','240/b','niroshan street','galahitiyawa','ganemulla','11020',1,'2021-10-17'),(5,4,'sdgfb','sdgfbs','568734653v','9876456675','2021-11-03','M','sdgfb','sdgbsdfhg','ghjkdfhgn','sfdgn','11234',1,'2021-11-23');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lendbook`
--

DROP TABLE IF EXISTS `lendbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lendbook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_isbn` varchar(45) NOT NULL,
  `member_id` int(11) NOT NULL,
  `lend_date` varchar(45) NOT NULL,
  `due_date` varchar(45) NOT NULL,
  `sysuser_id` int(11) NOT NULL,
  `returned_date` varchar(45) DEFAULT NULL,
  `fines_paid` double NOT NULL DEFAULT '0',
  `reminders` int(11) NOT NULL DEFAULT '0',
  `stat` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_book_has_member_member1_idx` (`member_id`),
  KEY `fk_book_has_member_book1_idx` (`book_isbn`),
  CONSTRAINT `fk_book_has_member_book1` FOREIGN KEY (`book_isbn`) REFERENCES `book` (`isbn`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_has_member_member1` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lendbook`
--

LOCK TABLES `lendbook` WRITE;
/*!40000 ALTER TABLE `lendbook` DISABLE KEYS */;
INSERT INTO `lendbook` VALUES (9,'1234567890125',1,'2022-01-01','2022-01-05',1,'2022-01-14',90,0,0),(10,'1234567890124',2,'2022-01-01','2022-01-02',1,NULL,0,1,1),(11,'1234567890125',3,'2022-01-01','2022-01-04',1,NULL,0,1,1),(12,'1234567890123',3,'2022-01-10','2022-01-28',1,NULL,0,0,1);
/*!40000 ALTER TABLE `lendbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nic` varchar(12) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `home` varchar(20) NOT NULL,
  `street` varchar(30) NOT NULL,
  `zone` varchar(50) NOT NULL,
  `city` varchar(45) NOT NULL,
  `postalcode` varchar(10) NOT NULL,
  `stat` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'982533104v','denuwan','bandara','M','0763049683','240/b','w.n.a.d.niroshan street','galahitiyawa','ganemulla','11020',1),(2,'982533105v','sdfb','sdfb','F','0763049683','acv','asdfbv','asdfbzdsf','dafghbdas','32454',1),(3,'992365123v','shalini','silva','F','0713698718','33/2','wijaya street','madamulla','minuwangoda','11550',1);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member_fee`
--

DROP TABLE IF EXISTS `member_fee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member_fee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `amount` double NOT NULL,
  `date_paid` datetime NOT NULL,
  `sysuser_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `foreign_memid_idx` (`member_id`),
  KEY `foreign_sysuserid_idx` (`sysuser_id`),
  CONSTRAINT `foreign_memid` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member_fee`
--

LOCK TABLES `member_fee` WRITE;
/*!40000 ALTER TABLE `member_fee` DISABLE KEYS */;
INSERT INTO `member_fee` VALUES (3,1,2021,2000,'2021-02-06 11:23:53',0),(4,2,2020,1800,'2020-01-23 12:45:23',1),(5,2,2021,2000,'2021-03-24 11:10:53',1),(6,3,2020,1800,'2021-03-24 09:25:34',1);
/*!40000 ALTER TABLE `member_fee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roletype` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'DIR'),(2,'TECH'),(3,'ASSIS_LIB'),(4,'LIB_AID');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemlog`
--

DROP TABLE IF EXISTS `systemlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemlog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `systemuser_id` int(11) NOT NULL,
  `login` datetime NOT NULL,
  `logout` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_systemlog_systemuser1_idx` (`systemuser_id`),
  CONSTRAINT `fk_systemlog_systemuser1` FOREIGN KEY (`systemuser_id`) REFERENCES `systemuser` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=172 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemlog`
--

LOCK TABLES `systemlog` WRITE;
/*!40000 ALTER TABLE `systemlog` DISABLE KEYS */;
INSERT INTO `systemlog` VALUES (11,1,'2021-11-16 21:28:38','2021-11-16 21:28:40'),(12,1,'2021-11-16 21:29:19','2021-11-16 21:29:30'),(13,2,'2021-11-16 21:30:12','2021-11-16 21:30:17'),(14,3,'2021-11-16 21:30:38','2021-11-16 21:30:44'),(15,4,'2021-11-16 21:31:00','2021-11-16 21:31:06'),(16,4,'2021-11-17 14:01:25',NULL),(17,1,'2021-11-17 14:22:49',NULL),(18,1,'2021-11-17 15:02:11','2021-11-17 15:02:35'),(19,4,'2021-11-17 15:02:43','2021-11-17 15:02:48'),(20,3,'2021-11-17 15:02:54','2021-11-17 15:03:04'),(21,2,'2021-11-17 15:03:13','2021-11-17 15:04:18'),(22,2,'2021-11-17 15:04:53','2021-11-17 15:05:02'),(23,1,'2021-11-17 15:05:09','2021-11-17 15:05:37'),(24,1,'2021-11-17 15:12:30','2021-11-17 15:13:15'),(25,2,'2021-11-17 15:15:15','2021-11-17 15:27:11'),(26,1,'2021-11-18 10:34:27','2021-11-18 10:36:04'),(27,1,'2021-11-23 02:00:26','2021-11-23 02:20:39'),(28,4,'2021-11-24 17:21:04','2021-11-24 17:21:16'),(29,1,'2021-11-24 17:21:23','2021-11-24 17:22:04'),(30,1,'2021-11-25 01:25:00','2021-11-25 01:31:30'),(31,1,'2021-11-25 16:53:35','2021-11-25 16:54:23'),(32,1,'2021-11-25 17:33:35','2021-11-25 17:41:06'),(33,1,'2021-11-25 17:41:20','2021-11-25 17:43:10'),(34,3,'2021-11-25 17:43:32','2021-11-25 17:45:42'),(35,4,'2021-11-25 17:47:42','2021-11-25 21:25:24'),(36,1,'2021-11-25 21:26:24','2021-11-25 21:36:16'),(37,3,'2021-11-25 21:36:24','2021-11-25 21:36:30'),(38,4,'2021-11-25 21:36:37','2021-11-25 21:36:44'),(39,2,'2021-11-25 21:36:52','2021-11-25 21:38:12'),(40,1,'2021-11-25 21:38:16','2021-11-25 21:38:53'),(41,1,'2021-11-25 21:39:08','2021-11-25 21:43:34'),(42,1,'2021-11-30 11:48:19','2021-11-30 11:50:23'),(43,1,'2021-11-30 11:51:56','2021-11-30 11:53:42'),(44,1,'2021-11-30 19:43:07','2021-11-30 19:45:16'),(45,1,'2021-11-30 20:04:30','2021-11-30 22:45:21'),(46,1,'2021-11-30 22:45:47','2021-11-30 22:48:10'),(47,2,'2021-11-30 22:48:33','2021-11-30 22:48:58'),(48,1,'2021-11-30 22:49:11','2021-11-30 22:50:27'),(49,3,'2021-11-30 23:23:29','2021-11-30 23:28:29'),(50,1,'2021-11-30 23:28:33','2021-11-30 23:29:03'),(51,3,'2021-11-30 23:29:31','2021-11-30 23:32:25'),(52,1,'2021-11-30 23:32:49','2021-11-30 23:47:05'),(53,1,'2021-11-30 23:47:19','2021-11-30 23:52:56'),(54,1,'2021-11-30 23:58:01',NULL),(55,1,'2021-12-01 12:27:32','2021-12-01 12:39:21'),(56,1,'2021-12-01 12:39:32',NULL),(57,1,'2021-12-01 12:40:04',NULL),(58,1,'2021-12-01 12:42:33','2021-12-01 13:04:50'),(59,1,'2021-12-01 13:05:06','2021-12-01 13:05:37'),(60,1,'2021-12-01 13:05:54','2021-12-01 13:07:56'),(61,1,'2021-12-01 13:08:10',NULL),(62,1,'2021-12-01 13:12:57','2021-12-01 13:16:58'),(63,1,'2021-12-01 16:19:58','2021-12-01 16:23:18'),(64,1,'2021-12-01 16:24:18','2021-12-01 16:38:12'),(65,1,'2021-12-01 19:30:04','2021-12-01 19:45:54'),(66,1,'2021-12-02 22:56:24',NULL),(67,1,'2021-12-02 23:44:23','2021-12-02 23:46:11'),(68,1,'2021-12-03 00:44:10',NULL),(69,1,'2021-12-03 00:50:53','2021-12-03 00:55:05'),(70,1,'2021-12-03 00:55:18','2021-12-03 01:03:31'),(71,1,'2021-12-03 01:47:20','2021-12-03 01:52:28'),(72,1,'2021-12-03 01:52:42','2021-12-03 01:54:26'),(73,1,'2021-12-03 01:57:48','2021-12-03 02:00:00'),(74,1,'2021-12-03 02:27:06','2021-12-03 02:28:17'),(75,1,'2021-12-03 02:36:52','2021-12-03 02:39:01'),(76,1,'2021-12-03 02:55:36','2021-12-03 02:58:28'),(77,1,'2021-12-03 02:59:48','2021-12-03 03:01:34'),(78,2,'2021-12-03 03:01:48','2021-12-03 03:03:39'),(79,3,'2021-12-03 03:05:12','2021-12-03 03:06:37'),(80,1,'2021-12-03 03:07:03','2021-12-03 03:08:10'),(81,2,'2021-12-03 03:10:05','2021-12-03 03:11:10'),(82,1,'2021-12-03 10:44:10','2021-12-03 10:58:51'),(83,1,'2021-12-03 11:00:14','2021-12-03 11:07:26'),(84,1,'2021-12-03 11:07:36','2021-12-03 11:20:42'),(85,1,'2021-12-03 11:20:58','2021-12-03 12:10:14'),(86,1,'2021-12-03 16:50:04','2021-12-03 17:57:15'),(87,1,'2021-12-04 22:41:43','2021-12-04 23:27:26'),(88,1,'2021-12-05 00:14:14','2021-12-05 00:16:37'),(89,1,'2021-12-05 00:16:50','2021-12-05 00:20:23'),(90,1,'2021-12-05 00:20:41','2021-12-05 00:23:07'),(91,1,'2021-12-05 00:23:19','2021-12-05 00:28:00'),(92,1,'2021-12-05 00:28:14','2021-12-05 00:31:48'),(93,1,'2021-12-05 00:32:01','2021-12-05 00:35:19'),(94,1,'2021-12-05 00:35:37','2021-12-05 00:40:17'),(95,1,'2021-12-05 00:40:33','2021-12-05 00:41:33'),(96,1,'2021-12-05 00:41:46','2021-12-05 00:44:29'),(97,1,'2021-12-05 00:44:54','2021-12-05 00:47:07'),(98,1,'2021-12-05 00:47:20','2021-12-05 00:59:32'),(99,1,'2021-12-05 00:59:55','2021-12-05 01:08:04'),(100,1,'2021-12-05 01:08:20','2021-12-05 01:10:59'),(101,1,'2021-12-05 01:11:31','2021-12-05 01:12:30'),(102,1,'2021-12-10 13:51:29','2021-12-10 13:59:03'),(103,1,'2021-12-10 14:00:31','2021-12-10 14:02:23'),(104,3,'2021-12-10 14:02:44','2021-12-10 14:02:59'),(105,3,'2021-12-10 14:04:08','2021-12-10 14:04:17'),(106,2,'2021-12-10 14:04:33','2021-12-10 14:04:44'),(107,4,'2021-12-10 14:13:27','2021-12-10 14:17:36'),(108,1,'2021-12-10 14:18:24','2021-12-10 14:35:11'),(109,1,'2021-12-10 14:35:28',NULL),(110,1,'2021-12-10 15:00:17','2021-12-10 15:01:14'),(111,1,'2021-12-10 15:15:12','2021-12-10 15:33:03'),(112,1,'2021-12-10 15:47:23','2021-12-10 16:02:18'),(113,1,'2021-12-10 16:18:41','2021-12-10 16:19:31'),(114,1,'2021-12-10 16:29:16','2021-12-10 16:30:59'),(115,3,'2021-12-10 16:31:50','2021-12-10 16:32:45'),(116,1,'2021-12-10 16:32:51','2021-12-10 16:33:13'),(117,1,'2021-12-10 16:46:45','2021-12-10 17:32:28'),(118,1,'2021-12-10 18:32:14',NULL),(119,1,'2021-12-10 18:33:53','2021-12-10 21:47:11'),(120,1,'2021-12-27 12:25:49',NULL),(121,1,'2021-12-28 10:56:29',NULL),(122,1,'2021-12-28 11:02:09',NULL),(123,1,'2021-12-29 01:42:31',NULL),(124,1,'2021-12-29 01:44:43',NULL),(125,1,'2021-12-29 16:25:45',NULL),(126,1,'2021-12-29 23:05:39',NULL),(127,1,'2021-12-31 17:28:39',NULL),(128,1,'2021-12-31 17:32:23',NULL),(129,1,'2022-01-01 16:02:28','2022-01-01 16:26:06'),(130,1,'2022-01-01 16:26:15','2022-01-01 16:30:58'),(131,1,'2022-01-01 16:32:11','2022-01-01 16:33:31'),(132,1,'2022-01-01 16:55:43','2022-01-01 17:33:06'),(133,1,'2022-01-01 17:33:14','2022-01-01 23:14:05'),(134,1,'2022-01-02 23:02:35','2022-01-02 23:09:47'),(135,1,'2022-01-03 21:57:00','2022-01-03 22:02:37'),(136,4,'2022-01-03 22:13:08','2022-01-03 22:13:40'),(137,3,'2022-01-03 22:13:52','2022-01-03 22:14:22'),(138,5,'2022-01-03 22:16:06','2022-01-03 22:16:19'),(139,2,'2022-01-03 22:16:34','2022-01-03 22:20:22'),(140,1,'2022-01-03 22:20:48','2022-01-03 22:26:48'),(141,1,'2022-01-03 22:28:52','2022-01-03 22:29:56'),(142,1,'2022-01-03 23:12:17',NULL),(143,1,'2022-01-03 23:14:25',NULL),(144,1,'2022-01-03 23:19:51','2022-01-03 23:20:24'),(145,4,'2022-01-03 23:20:33','2022-01-03 23:20:38'),(146,3,'2022-01-03 23:20:44','2022-01-03 23:20:50'),(147,2,'2022-01-03 23:20:56','2022-01-03 23:21:30'),(148,1,'2022-01-03 23:21:37','2022-01-03 23:21:51'),(149,1,'2022-01-03 23:22:08','2022-01-03 23:22:13'),(150,2,'2022-01-03 23:22:19','2022-01-03 23:22:25'),(151,1,'2022-01-05 15:46:38','2022-01-05 15:51:19'),(152,1,'2022-01-10 19:51:29','2022-01-10 19:53:15'),(153,1,'2022-01-14 13:58:24','2022-01-14 14:07:14'),(154,3,'2022-01-14 14:07:20','2022-01-14 14:07:30'),(155,2,'2022-01-14 14:07:47','2022-01-14 14:08:23'),(156,4,'2022-01-14 14:08:33','2022-01-14 14:09:06'),(157,1,'2022-01-18 11:09:22','2022-01-18 11:12:52'),(158,1,'2022-01-18 11:51:35','2022-01-18 13:02:52'),(159,1,'2022-02-03 22:25:29','2022-02-03 22:28:13'),(160,2,'2022-02-03 22:28:27','2022-02-03 22:29:27'),(161,1,'2022-02-03 22:44:39','2022-02-03 23:03:55'),(162,1,'2022-02-04 23:35:22','2022-02-04 23:37:12'),(163,1,'2022-02-05 10:42:43','2022-02-05 10:44:50'),(164,1,'2022-02-05 11:06:40','2022-02-05 12:04:58'),(165,1,'2022-02-06 11:31:52','2022-02-06 11:34:13'),(166,1,'2022-02-06 12:17:41','2022-02-06 12:24:06'),(167,1,'2022-02-06 14:17:07','2022-02-06 14:18:28'),(168,1,'2022-02-06 14:18:49','2022-02-06 14:41:21'),(169,1,'2022-02-06 14:41:44','2022-02-06 14:43:08'),(170,1,'2022-02-06 14:43:27','2022-02-06 19:16:27'),(171,1,'2022-02-08 00:57:35','2022-02-08 01:04:40');
/*!40000 ALTER TABLE `systemlog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemuser`
--

DROP TABLE IF EXISTS `systemuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `stat` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_systemuser_employee1_idx` (`employee_id`),
  CONSTRAINT `fk_systemuser_employee1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemuser`
--

LOCK TABLES `systemuser` WRITE;
/*!40000 ALTER TABLE `systemuser` DISABLE KEYS */;
INSERT INTO `systemuser` VALUES (1,1,'denam','Bm199899',1),(2,2,'shali','1999',1),(3,3,'kinsi','1977',1),(4,4,'ruwani','2008',1),(5,5,'unknown','12345678',1);
/*!40000 ALTER TABLE `systemuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `users`
--

DROP TABLE IF EXISTS `users`;
/*!50001 DROP VIEW IF EXISTS `users`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `users` (
  `id` int(11),
  `fname` varchar(45),
  `lname` varchar(45),
  `username` varchar(45),
  `password` varchar(45)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `users`
--

/*!50001 DROP TABLE IF EXISTS `users`*/;
/*!50001 DROP VIEW IF EXISTS `users`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `users` AS select `employee`.`id` AS `id`,`employee`.`fname` AS `fname`,`employee`.`lname` AS `lname`,`systemuser`.`username` AS `username`,`systemuser`.`password` AS `password` from (`employee` join `systemuser`) where (`employee`.`id` = `systemuser`.`employee_id`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-08  1:26:28
