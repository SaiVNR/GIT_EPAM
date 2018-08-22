-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: autoparking
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `current_slot_details`
--

DROP TABLE IF EXISTS `current_slot_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `current_slot_details` (
  `tid` int(10) NOT NULL AUTO_INCREMENT,
  `vid` int(10) NOT NULL,
  `in_time` varchar(100) DEFAULT NULL,
  `slot_number` int(10) NOT NULL,
  `parked_by` int(10) NOT NULL,
  `basement_level` int(3) DEFAULT NULL,
  PRIMARY KEY (`tid`),
  KEY `current_slot_details_fk0` (`vid`),
  KEY `fk_blevel` (`basement_level`),
  CONSTRAINT `current_slot_details_fk0` FOREIGN KEY (`vid`) REFERENCES `vehicle_details` (`vid`),
  CONSTRAINT `fk_blevel` FOREIGN KEY (`basement_level`) REFERENCES `slot_count` (`area_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `current_slot_details`
--

LOCK TABLES `current_slot_details` WRITE;
/*!40000 ALTER TABLE `current_slot_details` DISABLE KEYS */;
INSERT INTO `current_slot_details` VALUES (4,4,'Tue Aug 21 12:08:24 IST 2018',4,1,1),(6,6,'Tue Aug 21 12:08:45 IST 2018',6,1,1),(7,7,'Tue Aug 21 12:08:52 IST 2018',7,1,1),(9,9,'Tue Aug 21 12:09:09 IST 2018',9,1,1),(10,10,'Tue Aug 21 12:09:19 IST 2018',10,1,1),(12,12,'Tue Aug 21 14:10:19 IST 2018',2,1,2),(13,13,'Tue Aug 21 14:10:32 IST 2018',3,1,2),(16,3,'Tue Aug 21 14:37:48 IST 2018',3,1,1),(17,14,'Tue Aug 21 14:38:01 IST 2018',4,1,2),(18,2,'Tue Aug 21 15:02:08 IST 2018',1,1,1),(22,15,'Tue Aug 21 15:17:20 IST 2018',1,1,3),(23,1,'Tue Aug 21 16:09:49 IST 2018',2,1,1),(24,16,'Tue Aug 21 16:14:51 IST 2018',2,1,3);
/*!40000 ALTER TABLE `current_slot_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `roles` (
  `rid` int(2) NOT NULL AUTO_INCREMENT,
  `access_permission` varchar(15) NOT NULL,
  PRIMARY KEY (`rid`),
  UNIQUE KEY `access_permission` (`access_permission`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'park'),(3,'stats'),(2,'unpark');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `slot_count`
--

DROP TABLE IF EXISTS `slot_count`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `slot_count` (
  `numberOfSlots` int(10) NOT NULL,
  `parking_area` varchar(15) DEFAULT NULL,
  `area_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`area_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `slot_count`
--

LOCK TABLES `slot_count` WRITE;
/*!40000 ALTER TABLE `slot_count` DISABLE KEYS */;
INSERT INTO `slot_count` VALUES (10,'Basement-1',1),(10,'Basement-2',2),(10,'Basement-3',3);
/*!40000 ALTER TABLE `slot_count` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `slot_log`
--

DROP TABLE IF EXISTS `slot_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `slot_log` (
  `log_id` int(10) NOT NULL AUTO_INCREMENT,
  `vid` int(15) NOT NULL,
  `slot_number` int(10) NOT NULL,
  `in_time` varchar(100) DEFAULT NULL,
  `out_time` varchar(100) DEFAULT NULL,
  `parked_by` varchar(15) NOT NULL,
  `unparked_by` varchar(15) NOT NULL,
  PRIMARY KEY (`log_id`),
  KEY `slot_log_fk0` (`vid`),
  CONSTRAINT `slot_log_fk0` FOREIGN KEY (`vid`) REFERENCES `vehicle_details` (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `slot_log`
--

LOCK TABLES `slot_log` WRITE;
/*!40000 ALTER TABLE `slot_log` DISABLE KEYS */;
INSERT INTO `slot_log` VALUES (1,1,2,'Tue Aug 21 15:09:36 IST 2018','Tue Aug 21 15:09:42 IST 2018','1','1'),(2,5,5,'Tue Aug 21 12:08:38 IST 2018','Tue Aug 21 16:15:55 IST 2018','1','1'),(3,8,8,'Tue Aug 21 12:09:01 IST 2018','Tue Aug 21 16:16:01 IST 2018','1','1'),(4,11,1,'Tue Aug 21 12:28:43 IST 2018','Tue Aug 21 16:16:10 IST 2018','1','1');
/*!40000 ALTER TABLE `slot_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `uid` int(2) NOT NULL AUTO_INCREMENT,
  `uname` varchar(15) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` int(2) NOT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uname` (`uname`),
  KEY `Users_fk0` (`role`),
  CONSTRAINT `Users_fk0` FOREIGN KEY (`role`) REFERENCES `roles` (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'park_admin','park_admin',1),(2,'unpark_admin','unpark_admin',2),(3,'stats_admin','stats_admin',3);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_details`
--

DROP TABLE IF EXISTS `vehicle_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vehicle_details` (
  `vid` int(10) NOT NULL AUTO_INCREMENT,
  `vnumber` varchar(10) NOT NULL,
  `type` int(10) NOT NULL,
  `number_of_visits` int(10) DEFAULT NULL,
  PRIMARY KEY (`vid`),
  UNIQUE KEY `vnumber` (`vnumber`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_details`
--

LOCK TABLES `vehicle_details` WRITE;
/*!40000 ALTER TABLE `vehicle_details` DISABLE KEYS */;
INSERT INTO `vehicle_details` VALUES (1,'TS07EU7639',4,1),(2,'TS07EU7633',4,1),(3,'QW12QW1212',4,1),(4,'FA78HF7535',4,1),(5,'TS07EU7631',4,1),(6,'TS07EU7632',4,1),(7,'TS07EU7634',4,1),(8,'TS07EU7635',4,1),(9,'TS07EU7636',4,1),(10,'TS07EU7638',4,1),(11,'QW12QW1213',4,1),(12,'TS07EU8639',4,1),(13,'TS07EU9639',4,1),(14,'TS07EU3639',4,1),(15,'TS07EU7263',4,1),(16,'QW12QW9090',4,1);
/*!40000 ALTER TABLE `vehicle_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-22 17:14:34
