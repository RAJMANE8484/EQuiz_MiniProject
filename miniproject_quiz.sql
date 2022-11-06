-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: miniproject
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `quiz`
--

DROP TABLE IF EXISTS `quiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quiz` (
  `Que_id` int NOT NULL AUTO_INCREMENT,
  `Questions` varchar(255) DEFAULT NULL,
  `Options` varchar(255) DEFAULT NULL,
  `Correct_Answer` int DEFAULT NULL,
  PRIMARY KEY (`Que_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz`
--

LOCK TABLES `quiz` WRITE;
/*!40000 ALTER TABLE `quiz` DISABLE KEYS */;
INSERT INTO `quiz` VALUES (1,'Number of primitive data types in Java are?','1. 6 2. 7 3. 8 4. 9',3),(2,'What is the size of float and double in java?','1. 32 & 64 2. 32 & 32 3. 64 & 32 4. 64 & 64',1),(3,'Automatic type conversion is possible in which of the possible cases?','1. Byte to int 2. Int to Long 3. Long to int 4. short to int',2),(4,'Arrays in java are?','1. Objective refernces 2. ojects 3. primitive datatype 4. none',2),(5,'When is the object created with new keyword?','1. At runtime 2. At compile time 3.depends on code  4.none ',1),(6,'Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.','1.final  2. static  3. volatile 4. abstract ',2),(7,'Identify the return type of a method that does not return any value.','1. int  2. void 3. double 4. none  ',2),(8,'Identify the modifier which cannot be used for constructor.','1. public 2. protected  3. private  4. static ',4),(9,'Exception created by try block is caught in which block','1. catch 2. throw  3. final 4. none',1),(10,'Where is System class defined?','1. java.lang.package 2. java.util.package 3. java.io.package 4. none',1);
/*!40000 ALTER TABLE `quiz` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-06 18:39:44
