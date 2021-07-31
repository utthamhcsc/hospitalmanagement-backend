-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hospital_management
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `ambulance_call`
--

DROP TABLE IF EXISTS `ambulance_call`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ambulance_call` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `amount` float NOT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `driver` varchar(255) DEFAULT NULL,
  `patien_name` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  `vehicle_model` varchar(255) DEFAULT NULL,
  `vehicle_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ambulance_call`
--

LOCK TABLES `ambulance_call` WRITE;
/*!40000 ALTER TABLE `ambulance_call` DISABLE KEYS */;
INSERT INTO `ambulance_call` VALUES (76,'UK',10,'7676','2020-02-27 10:20:20.415','2020-02-02','r','gvgvv','2020-02-27 10:20:20.415','123','1997');
/*!40000 ALTER TABLE `ambulance_call` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `id` int NOT NULL,
  `appointment_no` varchar(255) DEFAULT NULL,
  `appointment_status` varchar(255) DEFAULT NULL,
  `apt_id` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES (1061,NULL,'approve','apt-20200415180047PM',NULL,'2020-04-06T18:30:00.000Z','999','doctor-20200404173803PM','doctor@demo.com','Male','fddfbvbbbbg','9874563210','pat-20200406175306PM','df',NULL,NULL,'ffff'),(1064,NULL,'pending','apt-20200406185310PM',NULL,'2020-04-06T18:30:00.000Z','999','doctor-20200404173803PM','ggg@gmail.com','Male','ff','9874563210','pat-20200406185310PM','jjfjfj',NULL,NULL,'dfsfs'),(1066,NULL,'approve','apt-20200422173956PM',NULL,'2020-04-06T18:30:00.000Z','999','doctor-20200407165934PM','hghg@gmail.com','Male','ddf','9632587410','pat-20200406185521PM','ggg',NULL,NULL,'dds'),(1084,NULL,'cancel','apt-20200422115930AM',NULL,'2020-04-07T18:30:00.000Z',NULL,'doctor-20200407165934PM','patient@gmail.com','Male','ffjgjg','9874563210','pat-20200410115726AM','demo',NULL,NULL,'sdfghj'),(1186,NULL,'cancel','apt-20200422115656AM',NULL,'2020-04-07T18:30:00.000Z',NULL,'doctor-20200407165934PM','patient@gmail.com','Male','ffhjgjgj','9874563210','pat-20200410115726AM','demo',NULL,NULL,'sdfghj'),(1187,NULL,'cancel','apt-20200422174714PM',NULL,'2020-04-21T18:30:00.000Z',NULL,'doctor-20200407165934PM','patient@gmail.com','Male','ffhjgjgj','9874563210','pat-20200410115726AM','demo',NULL,NULL,'sdfghj'),(1292,NULL,'pending','apt-20200509195023PM',NULL,'2020-05-14T18:30:00.000Z','','','ramu@gmail.com','Male','dfdd','9874563210','pat-20200509195023PM','ramu',NULL,NULL,'hddhd'),(1337,NULL,'pending','apt-20200716185329PM',NULL,'2020-07-16T18:30:00.000Z','999','doctor-20200407165934PM','utthamcsc@gmail.com','Male','ffff','8966542633','pat-20200716185316PM','uttham',NULL,NULL,'jhsjh'),(1340,NULL,'pending','apt-20200716190254PM',NULL,'2020-07-16T18:30:00.000Z','999','doctor-20200407165934PM','utthamhmanju@gmail.com','Male','ffff','8966542633','pat-20200716190242PM','uttham',NULL,NULL,'jhsjh'),(1343,NULL,'pending','apt-20200716190740PM',NULL,'2020-07-16T18:30:00.000Z','999','doctor-20200407165934PM','utthamhmanju@gmail.com','Male','ffff','8966542633','pat-20200716190612PM','uttham',NULL,NULL,'jhsjh'),(1346,NULL,'pending','apt-20200716191330PM',NULL,'2020-07-16T18:30:00.000Z','999','doctor-20200407165934PM','utthamhmanju@gmail.com','Male','ffff','8966542633','pat-20200716191318PM','uttham',NULL,NULL,'jhsjh'),(1351,NULL,'pending','apt-20200716192957PM',NULL,'2020-07-16T18:30:00.000Z','999','doctor-20200407165934PM','utthamcsc@gmail.com','Male','ffff','8966542633','pat-20200716192945PM','uttham',NULL,NULL,'jhsjh'),(1356,NULL,'pending','apt-20200716205005PM',NULL,'2020-07-16T18:30:00.000Z','','','utthamhmanju@gmail.com','Male','ffff','9874563210','pat-20200716205000PM','uttham',NULL,NULL,'bangalore'),(1359,NULL,'pending','apt-20200716205343PM',NULL,'2020-07-16T18:30:00.000Z','','','utthamcsc@gmail.com','Male','ffff','9874563210','pat-20200716205334PM','uttham',NULL,NULL,'bangalore');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bank_account_details`
--

DROP TABLE IF EXISTS `bank_account_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank_account_details` (
  `id` int NOT NULL,
  `account_number` varchar(255) DEFAULT NULL,
  `account_title` varchar(255) DEFAULT NULL,
  `bank_branch_name` varchar(255) DEFAULT NULL,
  `bank_name` varchar(255) DEFAULT NULL,
  `ifsc_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_account_details`
--

LOCK TABLES `bank_account_details` WRITE;
/*!40000 ALTER TABLE `bank_account_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank_account_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bed`
--

DROP TABLE IF EXISTS `bed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bed` (
  `id` int NOT NULL,
  `bed_group_id` int NOT NULL,
  `bed_type_id` int NOT NULL,
  `is_active` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bed`
--

LOCK TABLES `bed` WRITE;
/*!40000 ALTER TABLE `bed` DISABLE KEYS */;
INSERT INTO `bed` VALUES (926,920,922,0,'name');
/*!40000 ALTER TABLE `bed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bed_group`
--

DROP TABLE IF EXISTS `bed_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bed_group` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `floor_id` int NOT NULL,
  `is_active` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bed_group`
--

LOCK TABLES `bed_group` WRITE;
/*!40000 ALTER TABLE `bed_group` DISABLE KEYS */;
INSERT INTO `bed_group` VALUES (917,NULL,0,0,NULL),(918,NULL,0,0,NULL),(920,'ss',916,0,'ga'),(923,NULL,0,0,'dd'),(924,NULL,0,0,'dd');
/*!40000 ALTER TABLE `bed_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bed_type`
--

DROP TABLE IF EXISTS `bed_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bed_type` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bed_type`
--

LOCK TABLES `bed_type` WRITE;
/*!40000 ALTER TABLE `bed_type` DISABLE KEYS */;
INSERT INTO `bed_type` VALUES (922,'name');
/*!40000 ALTER TABLE `bed_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_summery`
--

DROP TABLE IF EXISTS `bill_summery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill_summery` (
  `id` int NOT NULL,
  `consultant_charge` float NOT NULL,
  `discount` float NOT NULL,
  `discountpercentage` float NOT NULL,
  `grosstotal` float NOT NULL,
  `net_payable_amount` float NOT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  `other_charge` float NOT NULL,
  `tax` float NOT NULL,
  `taxpercentage` float NOT NULL,
  `total_charge` float NOT NULL,
  `total_payment` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_summery`
--

LOCK TABLES `bill_summery` WRITE;
/*!40000 ALTER TABLE `bill_summery` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill_summery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `birth_record`
--

DROP TABLE IF EXISTS `birth_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `birth_record` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `birth_date` varchar(255) DEFAULT NULL,
  `child_name` varchar(255) DEFAULT NULL,
  `child_photo` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `father_photo` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `ipd_or_opd_no` varchar(255) DEFAULT NULL,
  `mother_name` varchar(255) DEFAULT NULL,
  `mother_photo` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `birth_record`
--

LOCK TABLES `birth_record` WRITE;
/*!40000 ALTER TABLE `birth_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `birth_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_bank_status`
--

DROP TABLE IF EXISTS `blood_bank_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blood_bank_status` (
  `id` int NOT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `ceated_at` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_bank_status`
--

LOCK TABLES `blood_bank_status` WRITE;
/*!40000 ALTER TABLE `blood_bank_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `blood_bank_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_donar`
--

DROP TABLE IF EXISTS `blood_donar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blood_donar` (
  `id` int NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `agemonth` int NOT NULL,
  `ageyear` int NOT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `donar_name` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_donar`
--

LOCK TABLES `blood_donar` WRITE;
/*!40000 ALTER TABLE `blood_donar` DISABLE KEYS */;
INSERT INTO `blood_donar` VALUES (1245,'Male','jgjggj',56,29,'A+','987456321','hghghg','hghghg');
/*!40000 ALTER TABLE `blood_donar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_donor`
--

DROP TABLE IF EXISTS `blood_donor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blood_donor` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `donor_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `month` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_donor`
--

LOCK TABLES `blood_donor` WRITE;
/*!40000 ALTER TABLE `blood_donor` DISABLE KEYS */;
INSERT INTO `blood_donor` VALUES (646,NULL,NULL,NULL,NULL,'2020-03-07 21:53:03.580000',NULL,NULL,NULL,'2020-03-07 21:53:03.580000');
/*!40000 ALTER TABLE `blood_donor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_donor_cycle`
--

DROP TABLE IF EXISTS `blood_donor_cycle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blood_donor_cycle` (
  `id` int NOT NULL,
  `bag_no` varchar(255) DEFAULT NULL,
  `blood_donor_id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `donate_date` varchar(255) DEFAULT NULL,
  `institution` varchar(255) DEFAULT NULL,
  `lot` varchar(255) DEFAULT NULL,
  `quantity` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_donor_cycle`
--

LOCK TABLES `blood_donor_cycle` WRITE;
/*!40000 ALTER TABLE `blood_donor_cycle` DISABLE KEYS */;
/*!40000 ALTER TABLE `blood_donor_cycle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_issue`
--

DROP TABLE IF EXISTS `blood_issue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blood_issue` (
  `id` int NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `amount` float NOT NULL,
  `bag_no` varchar(255) DEFAULT NULL,
  `bill_no` varchar(255) DEFAULT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `date_of_issue` varchar(255) DEFAULT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `donor_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `institution` varchar(255) DEFAULT NULL,
  `lot` varchar(255) DEFAULT NULL,
  `recieve_to` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `technician` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `donor_id` int NOT NULL,
  `issue_date` datetime(6) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_issue`
--

LOCK TABLES `blood_issue` WRITE;
/*!40000 ALTER TABLE `blood_issue` DISABLE KEYS */;
INSERT INTO `blood_issue` VALUES (1248,NULL,400,'jgjg',NULL,'A+',NULL,NULL,NULL,NULL,NULL,NULL,'hghg',NULL,NULL,'hghgh',NULL,'doctor-20200419125525PM','ddd ddddd',1245,'2020-05-20 00:00:00.000000','pat-20200410115726AM','jgjgj');
/*!40000 ALTER TABLE `blood_issue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_status`
--

DROP TABLE IF EXISTS `blood_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blood_status` (
  `blood_group` varchar(255) NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`blood_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_status`
--

LOCK TABLES `blood_status` WRITE;
/*!40000 ALTER TABLE `blood_status` DISABLE KEYS */;
INSERT INTO `blood_status` VALUES ('A-',3),('A+',4),('AB-',6),('AB+',5),('B-',5),('B+',6),('O-',9),('O+',9);
/*!40000 ALTER TABLE `blood_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calender_event`
--

DROP TABLE IF EXISTS `calender_event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calender_event` (
  `id` int NOT NULL,
  `background_color` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `end` varchar(255) DEFAULT NULL,
  `start` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calender_event`
--

LOCK TABLES `calender_event` WRITE;
/*!40000 ALTER TABLE `calender_event` DISABLE KEYS */;
INSERT INTO `calender_event` VALUES (1324,'#cd8888','desc','2020-06-19T18:30:00.000Z','2020-06-11T18:30:00.000Z','private','ffff',NULL),(1325,'#d24141','desc','2020-06-25T18:30:00.000Z','2020-06-11T18:30:00.000Z','public','dsdssds',NULL),(1327,'#e6adad','desc','','','public','ggg','admin-20200418183551PM'),(1328,'#e6adad','desc','2020-06-25T18:30:00.000Z','2020-06-11T18:30:00.000Z','private','ggg','admin-20200418183551PM');
/*!40000 ALTER TABLE `calender_event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `case_history`
--

DROP TABLE IF EXISTS `case_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `case_history` (
  `id` int NOT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `instruction` varchar(255) DEFAULT NULL,
  `medician_category` varchar(255) DEFAULT NULL,
  `medicine` varchar(255) DEFAULT NULL,
  `pr_fk` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKl47s0aaetq231vsamb7wl794c` (`pr_fk`),
  CONSTRAINT `FKl47s0aaetq231vsamb7wl794c` FOREIGN KEY (`pr_fk`) REFERENCES `prescription` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `case_history`
--

LOCK TABLES `case_history` WRITE;
/*!40000 ALTER TABLE `case_history` DISABLE KEYS */;
INSERT INTO `case_history` VALUES (583,'ll','jjjnjn','tonic','kk',610),(584,'ll','jjjnjn','ytt','kk',610),(585,'ll','jjjnjn','ghghg','kk',610),(586,'ll','jjjnjn','tonic','kk',610),(611,'','',NULL,'',610),(622,'','','','',610),(627,'5MI','dd','Syrup','DIA FORMIN FORTE',626),(628,'10MI','gg','Syrup','DIA FORMIN FORTE',626),(631,'5MI','ghjj','Capsule','DOLOROLE FORTE',630),(632,'10MI','yhkjk','Capsule','DIA FORMIN FORTE',630),(659,'10MI','sdfg','Capsule','DOLOROLE FORTE',658),(662,'10MI','sdfghj','Diaper','DOLOROLE FORTE',661),(696,'10MI','asdfghj','Syrup','DIA FORMIN FORTE',695),(700,'5MI','zxcvbn','Injection','DOLOROLE FORTE',699),(722,'','','','',721);
/*!40000 ALTER TABLE `case_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `charge_categories`
--

DROP TABLE IF EXISTS `charge_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charge_categories` (
  `id` int NOT NULL,
  `charge_type` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charge_categories`
--

LOCK TABLES `charge_categories` WRITE;
/*!40000 ALTER TABLE `charge_categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `charge_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `charge_category`
--

DROP TABLE IF EXISTS `charge_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charge_category` (
  `id` int NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `charge_type` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charge_category`
--

LOCK TABLES `charge_category` WRITE;
/*!40000 ALTER TABLE `charge_category` DISABLE KEYS */;
INSERT INTO `charge_category` VALUES (997,'ww','Procedures','ww'),(1095,'hjhdjsjs','Procedures','hfhfhf'),(1206,'hdhdh','Investigations','gdgdg'),(1207,'hdhdh122','Investigations','gdgdgdd'),(1225,'ot1','Operation Theatre','gdgd'),(1226,'ot2','Operation Theatre','gdgd');
/*!40000 ALTER TABLE `charge_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `charge_type`
--

DROP TABLE IF EXISTS `charge_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charge_type` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charge_type`
--

LOCK TABLES `charge_type` WRITE;
/*!40000 ALTER TABLE `charge_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `charge_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `charges`
--

DROP TABLE IF EXISTS `charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charges` (
  `id` int NOT NULL,
  `charge_category_id` int NOT NULL,
  `charge_type_id` int NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `standard_charge` float DEFAULT NULL,
  `applied_charge` varchar(255) DEFAULT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `charge_type` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tpa_charge` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charges`
--

LOCK TABLES `charges` WRITE;
/*!40000 ALTER TABLE `charges` DISABLE KEYS */;
/*!40000 ALTER TABLE `charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complain_type`
--

DROP TABLE IF EXISTS `complain_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complain_type` (
  `id` int NOT NULL,
  `action_taken` varchar(255) DEFAULT NULL,
  `assigned` varchar(255) DEFAULT NULL,
  `attached_document` varchar(255) DEFAULT NULL,
  `complain_by` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complain_type`
--

LOCK TABLES `complain_type` WRITE;
/*!40000 ALTER TABLE `complain_type` DISABLE KEYS */;
INSERT INTO `complain_type` VALUES (769,'asdfg','sdfg',NULL,'asdc','2020-03-13T06:36:36.536Z','sdfg','sdfg','1234567788','Online Advertising'),(770,NULL,'asdfgh','//home//madarsha//Desktop//D//database.sql','tuuikj','Fri Mar 13 2020 12:13:19 GMT+0530 (India Standard Time)','sdfghj','wertyu','9876543210','From Visitors'),(1043,'fff','sdfg','//home//madarsha//Desktop//D//WIN_20200224_16_14_39_Pro.jpg','asdc','2020-03-13T06:36:36.536Z','sdfg','sdfg','1234567788','Online Advertising'),(1051,NULL,'sdfg','uploads/WIN_20200224_16_14_39_Pro.jpg','asdc','2020-03-13T06:36:36.536Z','sdfg','sdfg','1234567788','Online Advertising');
/*!40000 ALTER TABLE `complain_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaint`
--

DROP TABLE IF EXISTS `complaint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complaint` (
  `id` int NOT NULL,
  `action_taken` varchar(255) DEFAULT NULL,
  `assigned` varchar(255) DEFAULT NULL,
  `complaint_type` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaint`
--

LOCK TABLES `complaint` WRITE;
/*!40000 ALTER TABLE `complaint` DISABLE KEYS */;
/*!40000 ALTER TABLE `complaint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaint_type`
--

DROP TABLE IF EXISTS `complaint_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complaint_type` (
  `id` int NOT NULL,
  `complaint_type` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `complain_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaint_type`
--

LOCK TABLES `complaint_type` WRITE;
/*!40000 ALTER TABLE `complaint_type` DISABLE KEYS */;
INSERT INTO `complaint_type` VALUES (928,NULL,NULL,'demo','demo');
/*!40000 ALTER TABLE `complaint_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consultant_instruction`
--

DROP TABLE IF EXISTS `consultant_instruction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consultant_instruction` (
  `id` int NOT NULL,
  `applied_date` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `instruction` varchar(255) DEFAULT NULL,
  `instruction_date` varchar(255) DEFAULT NULL,
  `mc_fk` int NOT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKd1x831lx5928ry4ij13p96fn6` (`mc_fk`),
  CONSTRAINT `FKd1x831lx5928ry4ij13p96fn6` FOREIGN KEY (`mc_fk`) REFERENCES `consultant_register` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultant_instruction`
--

LOCK TABLES `consultant_instruction` WRITE;
/*!40000 ALTER TABLE `consultant_instruction` DISABLE KEYS */;
INSERT INTO `consultant_instruction` VALUES (676,'2020-03-09T18:30:00.000Z','P-20200212115220','gfew','2020-03-09T11:43:59.118Z',675,'revan'),(679,'2020-03-10T00:30:00.000Z','P-20200212115220','sgsahd','2020-03-09T12:32:30.236Z',678,'revan'),(680,'2020-03-11T13:30:00.000Z','P-20200212115220','drgfhjhkj','2020-03-09T12:33:00.754Z',678,'revan'),(692,'2020-03-11T05:30:00.000Z','P-20200212115220','sdfgh','2020-03-10T05:17:13.569Z',691,'revan'),(711,'2020-03-11T11:00:00.000Z','P-20200212115220','gffhn','2020-03-10T10:54:52.065Z',710,'revan'),(713,'2020-03-11T11:00:00.000Z','P-20200212115220','gffhn','2020-03-10T10:54:52.065Z',712,'revan'),(715,'2020-03-11T11:00:00.000Z','P-20200212115220','sfhj','2020-03-10T10:56:13.173Z',714,'revan'),(717,'2020-03-11T11:00:00.000Z','P-20200212115220','sfhj','2020-03-10T10:56:13.173Z',716,'revan'),(1086,'2020-04-18T07:30:00.000Z',NULL,'gvg','2020-04-10T07:23:18.050Z',1085,NULL);
/*!40000 ALTER TABLE `consultant_instruction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consultant_register`
--

DROP TABLE IF EXISTS `consultant_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consultant_register` (
  `id` int NOT NULL,
  `ipd_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultant_register`
--

LOCK TABLES `consultant_register` WRITE;
/*!40000 ALTER TABLE `consultant_register` DISABLE KEYS */;
INSERT INTO `consultant_register` VALUES (666,NULL),(667,NULL),(668,NULL),(669,NULL),(670,NULL),(671,NULL),(673,NULL),(674,NULL),(675,'IPDID-20200309041736'),(678,'IPDID-20200309041736'),(691,'IPDID-20200309041736'),(710,'undefined'),(712,'undefined'),(714,'IPDID-20200309041736'),(716,'IPDID-20200309041736'),(1085,'IPDID-20200311061837');
/*!40000 ALTER TABLE `consultant_register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `content_for`
--

DROP TABLE IF EXISTS `content_for`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `content_for` (
  `id` int NOT NULL,
  `content_id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content_for`
--

LOCK TABLES `content_for` WRITE;
/*!40000 ALTER TABLE `content_for` DISABLE KEYS */;
/*!40000 ALTER TABLE `content_for` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contents`
--

DROP TABLE IF EXISTS `contents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contents` (
  `id` int NOT NULL,
  `class_id` int NOT NULL,
  `cls_sec_id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `created_by` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `file` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `is_public` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contents`
--

LOCK TABLES `contents` WRITE;
/*!40000 ALTER TABLE `contents` DISABLE KEYS */;
/*!40000 ALTER TABLE `contents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `death_record`
--

DROP TABLE IF EXISTS `death_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `death_record` (
  `id` int NOT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  `death_date` varchar(255) DEFAULT NULL,
  `guardian_name` varchar(255) DEFAULT NULL,
  `ipd_or_opd_no` varchar(255) DEFAULT NULL,
  `reciever_name` varchar(255) DEFAULT NULL,
  `report` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `death_record`
--

LOCK TABLES `death_record` WRITE;
/*!40000 ALTER TABLE `death_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `death_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` int NOT NULL,
  `department_name` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (999,NULL,NULL,'department1'),(1062,NULL,NULL,'hfhfh');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `designation`
--

DROP TABLE IF EXISTS `designation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `designation` (
  `id` int NOT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `designation`
--

LOCK TABLES `designation` WRITE;
/*!40000 ALTER TABLE `designation` DISABLE KEYS */;
INSERT INTO `designation` VALUES (1000,NULL,'designation1');
/*!40000 ALTER TABLE `designation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnosis`
--

DROP TABLE IF EXISTS `diagnosis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diagnosis` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `patient_id` int NOT NULL,
  `report_date` varchar(255) DEFAULT NULL,
  `report_type` varchar(255) DEFAULT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnosis`
--

LOCK TABLES `diagnosis` WRITE;
/*!40000 ALTER TABLE `diagnosis` DISABLE KEYS */;
INSERT INTO `diagnosis` VALUES (506,'jnjnjnjnjn','//home//madarsha//Desktop//SPRING//download.jpeg',132,'2020-02-02','jhjjn',NULL),(507,'jnjnjnjnjn','//home//madarsha//Desktop//SPRING//download.jpeg',132,'2020-02-02','jhjjn',NULL),(612,NULL,NULL,0,NULL,NULL,NULL),(613,'Demo','//home//madarsha//Desktop//SPRING//database.sql',0,'','Demo',NULL),(616,'ghg','//home//madarsha//Desktop//SPRING//database.sql',0,'','yuy',NULL);
/*!40000 ALTER TABLE `diagnosis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dispatch_receive`
--

DROP TABLE IF EXISTS `dispatch_receive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dispatch_receive` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `from_title` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `reference_no` varchar(255) DEFAULT NULL,
  `to_title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dispatch_receive`
--

LOCK TABLES `dispatch_receive` WRITE;
/*!40000 ALTER TABLE `dispatch_receive` DISABLE KEYS */;
/*!40000 ALTER TABLE `dispatch_receive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `id` int NOT NULL,
  `specilist` varchar(255) DEFAULT NULL,
  `address_line2` varchar(255) DEFAULT NULL,
  `addressline1` varchar(255) DEFAULT NULL,
  `expenducture` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (517,NULL,'sbdjhwqs',NULL,'10000','REVAN;','DDDDDDD,','999999',NULL,NULL,'1'),(518,'hshddchcgdsgf','sbdjhwqs','tyygshuijok','10000','REVAN;','DDDDDDD,','999999','12345','mbbs','2'),(519,'hshddchcgdsgf','sbdjhwqs','tyygshuijok','10000','REVAN;','DDDDDDD,','999999','12345','mbbs','3');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_charges`
--

DROP TABLE IF EXISTS `doctor_charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor_charges` (
  `id` int NOT NULL,
  `charges` varchar(255) DEFAULT NULL,
  `organisation_id` int NOT NULL,
  `organisation_name` varchar(255) DEFAULT NULL,
  `pid` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_charges`
--

LOCK TABLES `doctor_charges` WRITE;
/*!40000 ALTER TABLE `doctor_charges` DISABLE KEYS */;
INSERT INTO `doctor_charges` VALUES (1073,'30',944,'dsds',1072),(1074,'35',945,'uvcvudv',1072),(1075,'40',964,'dsf',1072),(1174,'50',944,'dsds',1173),(1175,'500',945,'uvcvudv',1173),(1176,'500',964,'dsf',1173),(1177,'500',1087,'hdhf',1173),(1181,'600',944,'dsds',1180),(1182,'600',945,'uvcvudv',1180),(1183,'600',964,'dsf',1180),(1184,'600',1087,'hdhf',1180);
/*!40000 ALTER TABLE `doctor_charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_opd_charge`
--

DROP TABLE IF EXISTS `doctor_opd_charge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor_opd_charge` (
  `id` int NOT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `standard_charge` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_opd_charge`
--

LOCK TABLES `doctor_opd_charge` WRITE;
/*!40000 ALTER TABLE `doctor_opd_charge` DISABLE KEYS */;
INSERT INTO `doctor_opd_charge` VALUES (1173,'doctor-20200407165934PM','Pramod Shhelvanth',500),(1180,'doctor-20200419125525PM','ddd ddddd',600);
/*!40000 ALTER TABLE `doctor_opd_charge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donate_blood`
--

DROP TABLE IF EXISTS `donate_blood`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donate_blood` (
  `id` int NOT NULL,
  `bag_no` varchar(255) DEFAULT NULL,
  `donare_id` int NOT NULL,
  `donate_date` datetime(6) DEFAULT NULL,
  `institution` varchar(255) DEFAULT NULL,
  `lot` varchar(255) DEFAULT NULL,
  `quantity` float NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donate_blood`
--

LOCK TABLES `donate_blood` WRITE;
/*!40000 ALTER TABLE `donate_blood` DISABLE KEYS */;
INSERT INTO `donate_blood` VALUES (1246,'ffff',1245,'2020-05-21 00:00:00.000000','jgjgjg','788',6552,NULL,NULL),(1268,'ddd',0,'2020-05-27 00:00:00.000000','dsd','jgjg',4545,NULL,'A+'),(1269,'hhh',0,'2020-05-27 00:00:00.000000','jjy','th',455,NULL,'A+'),(1270,'ff',0,'2020-06-04 00:00:00.000000','ff','ff',55,NULL,'A+'),(1271,'ff',1245,'2020-06-03 00:00:00.000000','ff','ff',45,NULL,'A+');
/*!40000 ALTER TABLE `donate_blood` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email_config`
--

DROP TABLE IF EXISTS `email_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `email_config` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `email_type` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `smtp_password` varchar(255) DEFAULT NULL,
  `smtp_port` varchar(255) DEFAULT NULL,
  `smtp_server` varchar(255) DEFAULT NULL,
  `smtp_username` varchar(255) DEFAULT NULL,
  `ssl_tls` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email_config`
--

LOCK TABLES `email_config` WRITE;
/*!40000 ALTER TABLE `email_config` DISABLE KEYS */;
/*!40000 ALTER TABLE `email_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enquiry`
--

DROP TABLE IF EXISTS `enquiry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enquiry` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `assigned` varchar(255) DEFAULT NULL,
  `clas` int NOT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `follow_up_date` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `no_of_child` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enquiry`
--

LOCK TABLES `enquiry` WRITE;
/*!40000 ALTER TABLE `enquiry` DISABLE KEYS */;
/*!40000 ALTER TABLE `enquiry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enquiry_type`
--

DROP TABLE IF EXISTS `enquiry_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enquiry_type` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `enquiry_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enquiry_type`
--

LOCK TABLES `enquiry_type` WRITE;
/*!40000 ALTER TABLE `enquiry_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `enquiry_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events`
--

DROP TABLE IF EXISTS `events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `events` (
  `id` int NOT NULL,
  `end_date` varchar(255) DEFAULT NULL,
  `event_color` varchar(255) DEFAULT NULL,
  `event_description` varchar(255) DEFAULT NULL,
  `event_for` varchar(255) DEFAULT NULL,
  `event_title` varchar(255) DEFAULT NULL,
  `event_type` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `start_date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events`
--

LOCK TABLES `events` WRITE;
/*!40000 ALTER TABLE `events` DISABLE KEYS */;
/*!40000 ALTER TABLE `events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expense_head`
--

DROP TABLE IF EXISTS `expense_head`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expense_head` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `exp_category` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `is_deleted` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  `expense_head` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expense_head`
--

LOCK TABLES `expense_head` WRITE;
/*!40000 ALTER TABLE `expense_head` DISABLE KEYS */;
INSERT INTO `expense_head` VALUES (1243,NULL,'hghgh',NULL,NULL,NULL,NULL,'hfhf');
/*!40000 ALTER TABLE `expense_head` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_expense_head`
--

DROP TABLE IF EXISTS `finance_expense_head`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `finance_expense_head` (
  `id` int NOT NULL,
  `amount` varchar(255) DEFAULT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `expense_head_id` int NOT NULL,
  `invoice_number` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_expense_head`
--

LOCK TABLES `finance_expense_head` WRITE;
/*!40000 ALTER TABLE `finance_expense_head` DISABLE KEYS */;
INSERT INTO `finance_expense_head` VALUES (1263,'45564654','','2020-05-13 00:00:00.000000','nndnd',1243,'ggyhghg','ggg');
/*!40000 ALTER TABLE `finance_expense_head` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_income_head`
--

DROP TABLE IF EXISTS `finance_income_head`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `finance_income_head` (
  `id` int NOT NULL,
  `amount` varchar(255) DEFAULT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `income_head_id` int NOT NULL,
  `invoice_number` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_income_head`
--

LOCK TABLES `finance_income_head` WRITE;
/*!40000 ALTER TABLE `finance_income_head` DISABLE KEYS */;
INSERT INTO `finance_income_head` VALUES (1262,'987987','','2020-05-07 00:00:00.000000','nfnfn',1242,'nggj','jgjgj');
/*!40000 ALTER TABLE `finance_income_head` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `floor`
--

DROP TABLE IF EXISTS `floor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `floor` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `floor`
--

LOCK TABLES `floor` WRITE;
/*!40000 ALTER TABLE `floor` DISABLE KEYS */;
INSERT INTO `floor` VALUES (916,'desc','test');
/*!40000 ALTER TABLE `floor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `follow_up`
--

DROP TABLE IF EXISTS `follow_up`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `follow_up` (
  `id` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `enquiry_id` int NOT NULL,
  `followup_by` varchar(255) DEFAULT NULL,
  `next_date` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `response` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `follow_up`
--

LOCK TABLES `follow_up` WRITE;
/*!40000 ALTER TABLE `follow_up` DISABLE KEYS */;
/*!40000 ALTER TABLE `follow_up` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_cms_media_gallery`
--

DROP TABLE IF EXISTS `front_cms_media_gallery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `front_cms_media_gallery` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `dir_path` varchar(255) DEFAULT NULL,
  `file_size` varchar(255) DEFAULT NULL,
  `file_type` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `img_name` varchar(255) DEFAULT NULL,
  `thumb_name` varchar(255) DEFAULT NULL,
  `thumb_path` varchar(255) DEFAULT NULL,
  `vid_title` varchar(255) DEFAULT NULL,
  `vid_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_cms_media_gallery`
--

LOCK TABLES `front_cms_media_gallery` WRITE;
/*!40000 ALTER TABLE `front_cms_media_gallery` DISABLE KEYS */;
/*!40000 ALTER TABLE `front_cms_media_gallery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_cms_menu_items`
--

DROP TABLE IF EXISTS `front_cms_menu_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `front_cms_menu_items` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `ext_url` varchar(255) DEFAULT NULL,
  `ext_url_link` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `menu` varchar(255) DEFAULT NULL,
  `menu_id` int NOT NULL,
  `open_new_tab` int NOT NULL,
  `page_id` int NOT NULL,
  `parent_id` int NOT NULL,
  `publish` int NOT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `weight` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_cms_menu_items`
--

LOCK TABLES `front_cms_menu_items` WRITE;
/*!40000 ALTER TABLE `front_cms_menu_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `front_cms_menu_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_cms_menus`
--

DROP TABLE IF EXISTS `front_cms_menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `front_cms_menus` (
  `id` int NOT NULL,
  `content_type` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `ext_url` varchar(255) DEFAULT NULL,
  `ext_url_link` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `menu` varchar(255) DEFAULT NULL,
  `ope_new_tab` int NOT NULL,
  `publish` int NOT NULL,
  `slug` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_cms_menus`
--

LOCK TABLES `front_cms_menus` WRITE;
/*!40000 ALTER TABLE `front_cms_menus` DISABLE KEYS */;
/*!40000 ALTER TABLE `front_cms_menus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_cms_page_contents`
--

DROP TABLE IF EXISTS `front_cms_page_contents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `front_cms_page_contents` (
  `id` int NOT NULL,
  `content_type` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `page_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_cms_page_contents`
--

LOCK TABLES `front_cms_page_contents` WRITE;
/*!40000 ALTER TABLE `front_cms_page_contents` DISABLE KEYS */;
/*!40000 ALTER TABLE `front_cms_page_contents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_cms_pages`
--

DROP TABLE IF EXISTS `front_cms_pages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `front_cms_pages` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `feature_image` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `is_homepage` int NOT NULL,
  `meta_description` varchar(255) DEFAULT NULL,
  `meta_keyword` varchar(255) DEFAULT NULL,
  `meta_title` varchar(255) DEFAULT NULL,
  `page_type` varchar(255) DEFAULT NULL,
  `publish` int NOT NULL,
  `publish_date` varchar(255) DEFAULT NULL,
  `sidebar` int NOT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_cms_pages`
--

LOCK TABLES `front_cms_pages` WRITE;
/*!40000 ALTER TABLE `front_cms_pages` DISABLE KEYS */;
/*!40000 ALTER TABLE `front_cms_pages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_cms_program_photos`
--

DROP TABLE IF EXISTS `front_cms_program_photos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `front_cms_program_photos` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `media_gallery_id` int NOT NULL,
  `program_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_cms_program_photos`
--

LOCK TABLES `front_cms_program_photos` WRITE;
/*!40000 ALTER TABLE `front_cms_program_photos` DISABLE KEYS */;
/*!40000 ALTER TABLE `front_cms_program_photos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_cms_programs`
--

DROP TABLE IF EXISTS `front_cms_programs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `front_cms_programs` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `event_end` varchar(255) DEFAULT NULL,
  `event_start` varchar(255) DEFAULT NULL,
  `event_venue` varchar(255) DEFAULT NULL,
  `feature_image` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `meta_description` varchar(255) DEFAULT NULL,
  `meta_keyword` varchar(255) DEFAULT NULL,
  `meta_title` varchar(255) DEFAULT NULL,
  `publish` varchar(255) DEFAULT NULL,
  `publish_date` varchar(255) DEFAULT NULL,
  `sidebar` int NOT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_cms_programs`
--

LOCK TABLES `front_cms_programs` WRITE;
/*!40000 ALTER TABLE `front_cms_programs` DISABLE KEYS */;
/*!40000 ALTER TABLE `front_cms_programs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `front_cms_settings`
--

DROP TABLE IF EXISTS `front_cms_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `front_cms_settings` (
  `id` int NOT NULL,
  `complain_form_email` varchar(255) DEFAULT NULL,
  `contact_us_email` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `fav_icon` varchar(255) DEFAULT NULL,
  `fb_url` varchar(255) DEFAULT NULL,
  `footer_text` varchar(255) DEFAULT NULL,
  `google_analytics` varchar(255) DEFAULT NULL,
  `google_plus` varchar(255) DEFAULT NULL,
  `instagram_url` varchar(255) DEFAULT NULL,
  `is_active_front_cms` int NOT NULL,
  `is_active_rtl` int NOT NULL,
  `is_active_sidebar` int NOT NULL,
  `linkedin_url` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `pinterest_url` varchar(255) DEFAULT NULL,
  `sidebar_options` varchar(255) DEFAULT NULL,
  `theme` varchar(255) DEFAULT NULL,
  `twitter_url` varchar(255) DEFAULT NULL,
  `youtube_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `front_cms_settings`
--

LOCK TABLES `front_cms_settings` WRITE;
/*!40000 ALTER TABLE `front_cms_settings` DISABLE KEYS */;
/*!40000 ALTER TABLE `front_cms_settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genarate_bills`
--

DROP TABLE IF EXISTS `genarate_bills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genarate_bills` (
  `id` int NOT NULL,
  `amount` float NOT NULL,
  `batch_no` varchar(255) DEFAULT NULL,
  `bill_no` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `discount` float NOT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `expire_date` varchar(255) DEFAULT NULL,
  `hospital_doctor` varchar(255) DEFAULT NULL,
  `medician_category` varchar(255) DEFAULT NULL,
  `medician_name` varchar(255) DEFAULT NULL,
  `net_amount` float NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `pid` int NOT NULL,
  `quantity` varchar(255) DEFAULT NULL,
  `sale_price` float NOT NULL,
  `tax` float NOT NULL,
  `total` float NOT NULL,
  `medicine_category` varchar(255) DEFAULT NULL,
  `medicine_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genarate_bills`
--

LOCK TABLES `genarate_bills` WRITE;
/*!40000 ALTER TABLE `genarate_bills` DISABLE KEYS */;
/*!40000 ALTER TABLE `genarate_bills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `general_calls`
--

DROP TABLE IF EXISTS `general_calls`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `general_calls` (
  `id` int NOT NULL,
  `call_dureation` varchar(255) DEFAULT NULL,
  `call_type` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `follow_up_date` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `general_calls`
--

LOCK TABLES `general_calls` WRITE;
/*!40000 ALTER TABLE `general_calls` DISABLE KEYS */;
/*!40000 ALTER TABLE `general_calls` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367),(1367);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `human_resorce`
--

DROP TABLE IF EXISTS `human_resorce`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `human_resorce` (
  `staff_id` varchar(255) NOT NULL,
  `account_title` varchar(255) DEFAULT NULL,
  `bank_account_number` varchar(255) DEFAULT NULL,
  `bank_branch_name` varchar(255) DEFAULT NULL,
  `bank_name` varchar(255) DEFAULT NULL,
  `basic_salary` varchar(255) DEFAULT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `contract_type` varchar(255) DEFAULT NULL,
  `current_address` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `date_of_joining` varchar(255) DEFAULT NULL,
  `department_id` int NOT NULL,
  `designation_id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `epf_num` varchar(255) DEFAULT NULL,
  `facebook_url` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `ifsc_code` varchar(255) DEFAULT NULL,
  `instagram_url` varchar(255) DEFAULT NULL,
  `joining_letter` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `linked_in_url` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `marital_status` varchar(255) DEFAULT NULL,
  `mother_name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `other_documents` varchar(255) DEFAULT NULL,
  `permanent_address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  `resume` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `specialization` varchar(255) DEFAULT NULL,
  `twitter_url` varchar(255) DEFAULT NULL,
  `work_experiance` varchar(255) DEFAULT NULL,
  `work_shift` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `human_resorce`
--

LOCK TABLES `human_resorce` WRITE;
/*!40000 ALTER TABLE `human_resorce` DISABLE KEYS */;
INSERT INTO `human_resorce` VALUES ('admin-20200418183551PM','null','null','null','null','null','null','null','null','null','null',999,1000,'a@b.com','null','null','fff','phfh','null','null','null','null','sdfdsf','null','null','null','null','null','null','null','null','null','null','null','admin','null','null','null','null'),('doctor-20200407165934PM','null','null','null','null','null','null','null','null','null','null',999,1000,'ddd@gmail.com','null','null','null','Pramod','null','null','null','null','Sheelvant','null','null','null','null','null','null','null','null','null','null','null','doctor','null','null','null','null'),('doctor-20200419125525PM','hdhdhd','ndhjdhj','djdjd','hdhdh','1245378','O+','null','ss','Wed Apr 08 2020 00:00:00 GMT+0530 (India Standard Time)','Sat May 02 2020 00:00:00 GMT+0530 (India Standard Time)',999,1000,'doctor@demo.com','sss','null','dd','ddd','Male','jdjdj','null','null','ddddd','null','hjjfj','Single','dd','ss','null','null','98744563210','uploads/WIN_20200224_16_14_39_Pro.jpg','fhfhf','null','doctor','ss','null','sss','day');
/*!40000 ALTER TABLE `human_resorce` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `in_patient`
--

DROP TABLE IF EXISTS `in_patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `in_patient` (
  `id` int NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `appointment_date` varchar(255) DEFAULT NULL,
  `bed_group` varchar(255) DEFAULT NULL,
  `bed_number` varchar(255) DEFAULT NULL,
  `bp` varchar(255) DEFAULT NULL,
  `case_type` varchar(255) DEFAULT NULL,
  `casulity` varchar(255) DEFAULT NULL,
  `cons_doctor` varchar(255) DEFAULT NULL,
  `credit_limit` varchar(255) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) NOT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `tpa` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL,
  `old_patient` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `ipd_id` varchar(255) DEFAULT NULL,
  `dis_charge_status` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `dis_charge_date` varchar(255) DEFAULT NULL,
  `summer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `in_patient`
--

LOCK TABLES `in_patient` WRITE;
/*!40000 ALTER TABLE `in_patient` DISABLE KEYS */;
INSERT INTO `in_patient` VALUES (657,'sdfghj','2020-03-09T18:30:00.000Z','Private Ward-2nd Floor','1','2345','sdfghj','No','','345678','2345',NULL,'USER-20200306125416','sdfghj','CGHS','2345',NULL,'P-20200212115220','IPDID-20200309034621','YES',NULL,NULL,NULL),(660,'asdfgh','2020-03-09T18:30:00.000Z','Generic Ward Male-3rd Floor','2','23456','asdfgh','Yes','','asdfg','23456',NULL,'USER-20200306125258','sdfgh','Star Health Insurance','21345',NULL,'P-20200212115220','IPDID-20200309041736','YES',NULL,NULL,NULL),(677,'jkl;','2020-03-08T18:30:00.000Z','Private Ward-2nd Floor','3','8789','hjkl','No','','4563513','45',NULL,'USER-20200306125513','fghjk','IDBI Federal','45',NULL,'P-20200212115220','IPDID-20200309055959','YES',NULL,'2020-03-11T12:15:08.547Z','sdfg'),(743,'uhjlk','2020-03-10T18:30:00.000Z','VIP Ward-1st Floor','2','55','ythujk','No',NULL,'524545','545',NULL,'PAT-20200309113039','hgjkh','IDBI Federal','54','No',NULL,'IPDID-20200311060321','YES','',NULL,NULL),(744,'iujoijlk','2020-03-11T18:30:00.000Z','VIP Ward-1st Floor','2','55','yuhjk','No',NULL,'4525','445',NULL,'USER-20200306125416','gyhkj','IDBI Federal','55',NULL,'P-20200212115220','IPDID-20200311061837','NO',NULL,NULL,NULL),(779,'sdf','2020-03-17T18:30:00.000Z','VIP Ward-1st Floor','1','12','ert','Yes',NULL,'34','12',NULL,'USER-20200306125416','sdf','IDBI Federal','12',NULL,'P-20200212115220','IPDID-20200313090011','NO',NULL,NULL,NULL),(911,'3','2020-03-23T18:30:00.000Z','VIP Ward-1st Floor','1','3','3','Yes',NULL,'33','3',NULL,'USER-20200306125416','3','CGHS','3',NULL,'STAFFID-20200314085655','IPDID-20200322050055','NO',NULL,NULL,NULL);
/*!40000 ALTER TABLE `in_patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `income_head`
--

DROP TABLE IF EXISTS `income_head`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `income_head` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `income_category` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `is_deleted` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  `income_head` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `income_head`
--

LOCK TABLES `income_head` WRITE;
/*!40000 ALTER TABLE `income_head` DISABLE KEYS */;
INSERT INTO `income_head` VALUES (1242,NULL,'hfhfhf',NULL,NULL,NULL,NULL,'hfhfhf'),(1260,NULL,'jghghg',NULL,NULL,NULL,NULL,'hghg');
/*!40000 ALTER TABLE `income_head` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ipd_billing`
--

DROP TABLE IF EXISTS `ipd_billing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ipd_billing` (
  `id` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `discount` int NOT NULL,
  `generated_by` int NOT NULL,
  `gross_total` varchar(255) DEFAULT NULL,
  `net_amount` float NOT NULL,
  `other_charge` varchar(255) DEFAULT NULL,
  `patient_id` int NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tax` int NOT NULL,
  `total_amount` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ipd_billing`
--

LOCK TABLES `ipd_billing` WRITE;
/*!40000 ALTER TABLE `ipd_billing` DISABLE KEYS */;
/*!40000 ALTER TABLE `ipd_billing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ipd_consutant_register`
--

DROP TABLE IF EXISTS `ipd_consutant_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ipd_consutant_register` (
  `id` int NOT NULL,
  `applied_date` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `instruction` varchar(255) DEFAULT NULL,
  `instruction_date` varchar(255) DEFAULT NULL,
  `ipd_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ipd_consutant_register`
--

LOCK TABLES `ipd_consutant_register` WRITE;
/*!40000 ALTER TABLE `ipd_consutant_register` DISABLE KEYS */;
INSERT INTO `ipd_consutant_register` VALUES (1150,'2020-04-23T18:30:00.000Z','doctor-20200407165934PM',NULL,'fdfdsf','2020-04-16T11:32:22.549Z',NULL),(1151,'2020-04-24T18:30:00.000Z','doctor-20200407165934PM',NULL,'dfsdffd','2020-04-16T11:32:25.413Z',NULL),(1152,'2020-04-22T18:30:00.000Z','doctor-20200407165934PM',NULL,'dffd','2020-04-16T11:34:49.764Z',NULL),(1153,'2020-04-23T18:30:00.000Z','doctor-20200407165934PM',NULL,'sasdadeee','2020-04-16T11:36:34.921Z','ipd-2020Apr16123245PM'),(1154,'2020-04-30T18:30:00.000Z','doctor-20200407165934PM',NULL,'dfdfgf','2020-04-16T11:55:33.553Z',NULL),(1155,'2020-05-01T18:30:00.000Z','doctor-20200407165934PM',NULL,'fhgf','2020-04-16T11:55:34.027Z',NULL),(1156,'2020-04-29T18:30:00.000Z','doctor-20200407165934PM',NULL,'fgfhfgfhgfgfgfhgfhgfhgfhgfhg','2020-04-16T11:55:34.717Z',NULL),(1158,'2020-04-17T18:30:00.000Z','doctor-20200407165934PM',NULL,'sdsdfdff','2020-04-16T12:25:56.469Z',NULL),(1159,'2020-04-18T18:30:00.000Z','doctor-20200407165934PM',NULL,'xss','2020-04-16T12:25:57.129Z',NULL),(1161,'2020-04-23T18:30:00.000Z','doctor-20200407165934PM','Pramod','dsdsdf','2020-04-16T12:28:06.307Z',NULL),(1162,'2020-04-18T18:30:00.000Z','doctor-20200407165934PM',NULL,'ffdsdsf','2020-04-16T12:28:06.515Z','ipd-2020Apr16123245PM'),(1163,'2020-04-19T18:30:00.000Z','doctor-20200407165934PM',NULL,'sfsdf','2020-04-16T12:28:06.723Z','ipd-2020Apr16123245PM'),(1164,'2020-04-16T18:30:00.000Z','doctor-20200407165934PM','Pramod','xsxs','2020-04-16T12:36:25.810Z',NULL),(1165,'2020-04-23T18:30:00.000Z','doctor-20200407165934PM',NULL,'dsds','2020-04-16T12:38:21.046Z','ipd-2020Apr16123245PM'),(1166,'2020-04-23T18:30:00.000Z','doctor-20200407165934PM',NULL,'ds','2020-04-16T12:41:34.911Z','ipd-2020Apr16123245PM'),(1167,'2020-04-16T18:30:00.000Z','doctor-20200407165934PM','Pramod','kjhkjkjbb','2020-04-16T12:46:30.332Z',NULL),(1185,'2020-04-19T18:30:00.000Z','doctor-20200419125525PM',NULL,'hhh','2020-04-19T15:04:11.137Z','ipd-2020Apr19083334PM'),(1360,'2021-07-31T07:30:00.000Z','doctor-20200419125525PM',NULL,'hjhfjdhfjdhfjdhfj','2021-07-30T07:47:38.736Z','ipd-2020Apr17100356AM'),(1361,'2021-07-30T09:00:00.000Z','doctor-20200407165934PM',NULL,'hjdhjdf','2021-07-30T07:47:55.843Z','ipd-2020Apr17100356AM');
/*!40000 ALTER TABLE `ipd_consutant_register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ipd_detail`
--

DROP TABLE IF EXISTS `ipd_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ipd_detail` (
  `id` int NOT NULL,
  `amount` varchar(255) DEFAULT NULL,
  `bed` varchar(255) DEFAULT NULL,
  `bed_group` varchar(255) DEFAULT NULL,
  `bed_no` varchar(255) DEFAULT NULL,
  `bp` varchar(255) DEFAULT NULL,
  `case_type` varchar(255) DEFAULT NULL,
  `casualty` varchar(255) DEFAULT NULL,
  `consultant_doctor` varchar(255) DEFAULT NULL,
  `credits_limit` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `ipd_no` varchar(255) DEFAULT NULL,
  `known_allergies` varchar(255) DEFAULT NULL,
  `payment_mode` varchar(255) DEFAULT NULL,
  `refference` varchar(255) DEFAULT NULL,
  `room` varchar(255) DEFAULT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `tax` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ipd_detail`
--

LOCK TABLES `ipd_detail` WRITE;
/*!40000 ALTER TABLE `ipd_detail` DISABLE KEYS */;
INSERT INTO `ipd_detail` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'qw','qw',NULL,NULL,NULL,'qws',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `ipd_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ipd_diagnosis`
--

DROP TABLE IF EXISTS `ipd_diagnosis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ipd_diagnosis` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `patient_id` int NOT NULL,
  `report_date` varchar(255) DEFAULT NULL,
  `report_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ipd_diagnosis`
--

LOCK TABLES `ipd_diagnosis` WRITE;
/*!40000 ALTER TABLE `ipd_diagnosis` DISABLE KEYS */;
/*!40000 ALTER TABLE `ipd_diagnosis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `item_category_id` int NOT NULL,
  `item_photo` varchar(255) DEFAULT NULL,
  `item_store_id` int NOT NULL,
  `item_supplier_id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `quantity` int NOT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_category`
--

DROP TABLE IF EXISTS `item_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_category` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `item_category` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_category`
--

LOCK TABLES `item_category` WRITE;
/*!40000 ALTER TABLE `item_category` DISABLE KEYS */;
INSERT INTO `item_category` VALUES (938,NULL,'ddd',NULL,'dsds',NULL);
/*!40000 ALTER TABLE `item_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_issue`
--

DROP TABLE IF EXISTS `item_issue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_issue` (
  `id` int NOT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `is_active` datetime(6) DEFAULT NULL,
  `is_returned` int NOT NULL,
  `issue_by` varchar(255) DEFAULT NULL,
  `issue_date` varchar(255) DEFAULT NULL,
  `issue_to` varchar(255) DEFAULT NULL,
  `issue_type` varchar(255) DEFAULT NULL,
  `item_category_id` int NOT NULL,
  `item_id` int NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `quantity` int NOT NULL,
  `return_date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_issue`
--

LOCK TABLES `item_issue` WRITE;
/*!40000 ALTER TABLE `item_issue` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_issue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_stock`
--

DROP TABLE IF EXISTS `item_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_stock` (
  `id` int NOT NULL,
  `attachment` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `item_id` int NOT NULL,
  `quantity` int NOT NULL,
  `store_id` int NOT NULL,
  `supplier_id` int NOT NULL,
  `symbol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_stock`
--

LOCK TABLES `item_stock` WRITE;
/*!40000 ALTER TABLE `item_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_store`
--

DROP TABLE IF EXISTS `item_store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_store` (
  `id` int NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `item_store` varchar(255) DEFAULT NULL,
  `item_stock_code` varchar(255) DEFAULT NULL,
  `item_store_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_store`
--

LOCK TABLES `item_store` WRITE;
/*!40000 ALTER TABLE `item_store` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_store` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_supplier`
--

DROP TABLE IF EXISTS `item_supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_supplier` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact_person_email` varchar(255) DEFAULT NULL,
  `contact_person_name` varchar(255) DEFAULT NULL,
  `contact_person_phone` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `item_supplier` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_supplier`
--

LOCK TABLES `item_supplier` WRITE;
/*!40000 ALTER TABLE `item_supplier` DISABLE KEYS */;
INSERT INTO `item_supplier` VALUES (796,'asdf','','asdf','asdf','','','sdfg123','sadfg123');
/*!40000 ALTER TABLE `item_supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lab`
--

DROP TABLE IF EXISTS `lab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lab` (
  `id` int NOT NULL,
  `lab_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lab`
--

LOCK TABLES `lab` WRITE;
/*!40000 ALTER TABLE `lab` DISABLE KEYS */;
/*!40000 ALTER TABLE `lab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `languages`
--

DROP TABLE IF EXISTS `languages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `languages` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `is_deleted` varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `short_code` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `languages`
--

LOCK TABLES `languages` WRITE;
/*!40000 ALTER TABLE `languages` DISABLE KEYS */;
/*!40000 ALTER TABLE `languages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave_type`
--

DROP TABLE IF EXISTS `leave_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leave_type` (
  `id` int NOT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_type`
--

LOCK TABLES `leave_type` WRITE;
/*!40000 ALTER TABLE `leave_type` DISABLE KEYS */;
INSERT INTO `leave_type` VALUES (935,NULL,'fdds'),(1010,NULL,'fhgh');
/*!40000 ALTER TABLE `leave_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave_types`
--

DROP TABLE IF EXISTS `leave_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leave_types` (
  `id` int NOT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_types`
--

LOCK TABLES `leave_types` WRITE;
/*!40000 ALTER TABLE `leave_types` DISABLE KEYS */;
/*!40000 ALTER TABLE `leave_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medician`
--

DROP TABLE IF EXISTS `medician`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medician` (
  `id` int NOT NULL,
  `medicine_photo` varchar(255) DEFAULT NULL,
  `medicine_category` varchar(255) DEFAULT NULL,
  `medicine_company` varchar(255) DEFAULT NULL,
  `medicine_composition` varchar(255) DEFAULT NULL,
  `medicine_group` varchar(255) DEFAULT NULL,
  `medicine_name` varchar(255) DEFAULT NULL,
  `min_level` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `packing` varchar(255) DEFAULT NULL,
  `re_order_level` varchar(255) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `vat` varchar(255) DEFAULT NULL,
  `vat_ac` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medician`
--

LOCK TABLES `medician` WRITE;
/*!40000 ALTER TABLE `medician` DISABLE KEYS */;
INSERT INTO `medician` VALUES (152,'//home//madarsha//Desktop//SPRING//doctor.jpg',NULL,'aas','jhvf','ghffhf','ass','vjvu','hjvf','hjvhjv','hjjh','asdf','jhv','sdfgh'),(153,'//home//madarsha//Desktop//SPRING//doctor.jpg',NULL,'aas','jhvf','ghffhf','ass','vjvu','hjvf','hjvhjv','hjjh','asdf','jhv','sdfgh'),(154,'//home//madarsha//Desktop//SPRING//doctor.jpg','Syrup','dfgh','xdfgh','fghj','asdfgh','dfghj','xdfghj','vbn','cvb','fgh','fgh','ghj'),(155,NULL,'Syrup','dfgh','xdfgh','fghj','asdfgh','dfghj','xdfghj','vbn','cvb','fgh','fgh','ghj'),(156,NULL,'Syrup','dfgh','xdfgh','fghj','asdfgh','dfghj','xdfghj','vbn','cvb','fgh','fgh','ghj');
/*!40000 ALTER TABLE `medician` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medician_details`
--

DROP TABLE IF EXISTS `medician_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medician_details` (
  `mid` int NOT NULL AUTO_INCREMENT,
  `bill_no` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `discount` float NOT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `hospital_doctor` varchar(255) DEFAULT NULL,
  `net_amount` float NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `tax` float NOT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=287 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medician_details`
--

LOCK TABLES `medician_details` WRITE;
/*!40000 ALTER TABLE `medician_details` DISABLE KEYS */;
INSERT INTO `medician_details` VALUES (259,'string','string',0,'string','string',0,'string','string',0),(270,'123','2020-02-02',10,'revan','modicum',110,'hgghg','1232',10),(274,'string','string',0,'string','string',0,'string','string',0),(275,'string','string',0,'string','string',0,'string','string',0),(284,'string','string',0,'string','string',0,'string','string',0),(285,'string','string',0,'string','string',0,'string','string',0),(286,'string','string',0,'string','string',0,'string','string',0);
/*!40000 ALTER TABLE `medician_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicine_bad_stock`
--

DROP TABLE IF EXISTS `medicine_bad_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicine_bad_stock` (
  `id` int NOT NULL,
  `batch_no` varchar(255) DEFAULT NULL,
  `expiry_date` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `outward_date` varchar(255) DEFAULT NULL,
  `pharmacy_id` int NOT NULL,
  `quantity` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine_bad_stock`
--

LOCK TABLES `medicine_bad_stock` WRITE;
/*!40000 ALTER TABLE `medicine_bad_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicine_bad_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicine_batch_details`
--

DROP TABLE IF EXISTS `medicine_batch_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicine_batch_details` (
  `id` int NOT NULL,
  `amount` float NOT NULL,
  `available_quantity` float NOT NULL,
  `batch_num` varchar(255) DEFAULT NULL,
  `batchamt` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `expiry_date` varchar(255) DEFAULT NULL,
  `inward_date` varchar(255) DEFAULT NULL,
  `medicine_category_id` int NOT NULL,
  `mrp` float NOT NULL,
  `packingqty` varchar(255) DEFAULT NULL,
  `pharmacy_id` int NOT NULL,
  `purchase_price` varchar(255) DEFAULT NULL,
  `quantity` float NOT NULL,
  `saleprice` float NOT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  `mc_fk` int NOT NULL,
  `medicine_category` varchar(255) DEFAULT NULL,
  `medicine_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4seec4oyuoian6m95w1wkt9k2` (`mc_fk`),
  CONSTRAINT `FK4seec4oyuoian6m95w1wkt9k2` FOREIGN KEY (`mc_fk`) REFERENCES `purchase_medicine_modal` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine_batch_details`
--

LOCK TABLES `medicine_batch_details` WRITE;
/*!40000 ALTER TABLE `medicine_batch_details` DISABLE KEYS */;
INSERT INTO `medicine_batch_details` VALUES (1281,200,0,'89797','52',NULL,'2020-06-05T18:30:00.000Z','2020-05-08T14:57:24.614Z',800,1562,'010',855,'010',20,100,NULL,1280,'test','demo2'),(1283,2000,200,'26','20',NULL,'2020-06-04T18:30:00.000Z','2020-05-08T14:59:18.591Z',800,50,'200',855,'010',200,100,NULL,1282,'test','demo2');
/*!40000 ALTER TABLE `medicine_batch_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicine_category`
--

DROP TABLE IF EXISTS `medicine_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicine_category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `charges` float DEFAULT NULL,
  `expiredate` varchar(255) DEFAULT NULL,
  `medician_cat_id` varchar(255) DEFAULT NULL,
  `medician_name` varchar(255) DEFAULT NULL,
  `medicine_category` varchar(255) DEFAULT NULL,
  `quentity` varchar(255) DEFAULT NULL,
  `sale_price` varchar(255) DEFAULT NULL,
  `medician_details_mid` int DEFAULT NULL,
  `mc_fk` int DEFAULT NULL,
  `pr_fk` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1q0faoyiebvgimrmno7c01br4` (`medician_details_mid`),
  KEY `FKkbht4t60hja9wk4hey6020kp7` (`mc_fk`),
  CONSTRAINT `FKkbht4t60hja9wk4hey6020kp7` FOREIGN KEY (`mc_fk`) REFERENCES `medician_details` (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=278 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine_category`
--

LOCK TABLES `medicine_category` WRITE;
/*!40000 ALTER TABLE `medicine_category` DISABLE KEYS */;
INSERT INTO `medicine_category` VALUES (258,0,'string','string','string','string','string','string',NULL,275,0),(259,110,'2020-0405','1','dolo','v','8','1000',NULL,270,0),(262,1110,'232','322323','rff','gg','17','15',NULL,NULL,0),(270,0,'string','212','string','string','string','string',NULL,284,0),(271,0,'string','2909','string','string','string','string',NULL,285,0),(272,0,'string','8989','string','string','string','string',NULL,285,0),(273,0,'string','8787','string','string','string','string',NULL,286,0),(274,0,'string','5454','string','string','string','string',NULL,286,0),(275,0,'string','7676','string','string','string','string',NULL,286,0),(276,0,'string','4343','string','string','string','string',NULL,286,0),(277,0,'string','90909','string','string','string','string',NULL,286,0);
/*!40000 ALTER TABLE `medicine_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicine_dosage`
--

DROP TABLE IF EXISTS `medicine_dosage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicine_dosage` (
  `id` int NOT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `medicine_category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine_dosage`
--

LOCK TABLES `medicine_dosage` WRITE;
/*!40000 ALTER TABLE `medicine_dosage` DISABLE KEYS */;
INSERT INTO `medicine_dosage` VALUES (803,'','6'),(804,'sdfg','6'),(805,'sdfg','6'),(806,'sdfg','6'),(807,'sdfg','799'),(1121,'gfgfg','800'),(1122,'gfgf','800');
/*!40000 ALTER TABLE `medicine_dosage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicinecategory`
--

DROP TABLE IF EXISTS `medicinecategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicinecategory` (
  `id` int NOT NULL,
  `medicine_category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicinecategory`
--

LOCK TABLES `medicinecategory` WRITE;
/*!40000 ALTER TABLE `medicinecategory` DISABLE KEYS */;
INSERT INTO `medicinecategory` VALUES (800,'test'),(801,'test3');
/*!40000 ALTER TABLE `medicinecategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `messages` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `group_list` varchar(255) DEFAULT NULL,
  `is_class` int NOT NULL,
  `is_group` varchar(255) DEFAULT NULL,
  `is_individual` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `send_mail` varchar(255) DEFAULT NULL,
  `send_sms` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  `user_list` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `migrations`
--

DROP TABLE IF EXISTS `migrations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `migrations` (
  `version` int NOT NULL,
  PRIMARY KEY (`version`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `migrations`
--

LOCK TABLES `migrations` WRITE;
/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;
/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_birth_record`
--

DROP TABLE IF EXISTS `my_birth_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_birth_record` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `child_name` varchar(255) DEFAULT NULL,
  `child_photo` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `father_photo` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `ipdopd_no` varchar(255) DEFAULT NULL,
  `mother_name` varchar(255) DEFAULT NULL,
  `mother_photo` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `report` varchar(255) DEFAULT NULL,
  `responsibility` varchar(255) DEFAULT NULL,
  `weight` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_birth_record`
--

LOCK TABLES `my_birth_record` WRITE;
/*!40000 ALTER TABLE `my_birth_record` DISABLE KEYS */;
INSERT INTO `my_birth_record` VALUES (1266,'asdsad','','2020-05-15','fhfhfhf','','sdsd','','Male','445','sadsad','','4454','dddd','nfnfn',4545);
/*!40000 ALTER TABLE `my_birth_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_death_record`
--

DROP TABLE IF EXISTS `my_death_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_death_record` (
  `id` int NOT NULL,
  `death_date` date DEFAULT NULL,
  `guardian_name` varchar(255) DEFAULT NULL,
  `ipdopd_no` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `receiver_name` varchar(255) DEFAULT NULL,
  `report` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_death_record`
--

LOCK TABLES `my_death_record` WRITE;
/*!40000 ALTER TABLE `my_death_record` DISABLE KEYS */;
INSERT INTO `my_death_record` VALUES (1267,'2020-05-27','ddd','ddd','USER-20200306125416','ddd','ddd');
/*!40000 ALTER TABLE `my_death_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_ipd_case_history`
--

DROP TABLE IF EXISTS `my_ipd_case_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_ipd_case_history` (
  `id` int NOT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `instruction` varchar(255) DEFAULT NULL,
  `medician_category` varchar(255) DEFAULT NULL,
  `medicine` varchar(255) DEFAULT NULL,
  `pr_fk` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdbvsw7q358srqkyuplwnjeapf` (`pr_fk`),
  CONSTRAINT `FKdbvsw7q358srqkyuplwnjeapf` FOREIGN KEY (`pr_fk`) REFERENCES `my_ipdprescription` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_ipd_case_history`
--

LOCK TABLES `my_ipd_case_history` WRITE;
/*!40000 ALTER TABLE `my_ipd_case_history` DISABLE KEYS */;
INSERT INTO `my_ipd_case_history` VALUES (1144,'gfgfg','dfd','800','demo2',1143),(1145,'gfgf','fdcfdcvd','800','demo2',1143),(1147,'gfgfg','fvfvf','800','demo2',1146),(1149,'gfgfg','dvfd','800','demo2',1148);
/*!40000 ALTER TABLE `my_ipd_case_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_ipd_consultant_instruction`
--

DROP TABLE IF EXISTS `my_ipd_consultant_instruction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_ipd_consultant_instruction` (
  `id` int NOT NULL,
  `applied_date` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `instruction` varchar(255) DEFAULT NULL,
  `instruction_date` varchar(255) DEFAULT NULL,
  `mc_fk` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsc8purgirxx2t566ek60qjs4b` (`mc_fk`),
  CONSTRAINT `FKsc8purgirxx2t566ek60qjs4b` FOREIGN KEY (`mc_fk`) REFERENCES `myipdconsultant_register` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_ipd_consultant_instruction`
--

LOCK TABLES `my_ipd_consultant_instruction` WRITE;
/*!40000 ALTER TABLE `my_ipd_consultant_instruction` DISABLE KEYS */;
/*!40000 ALTER TABLE `my_ipd_consultant_instruction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_ipd_payment`
--

DROP TABLE IF EXISTS `my_ipd_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_ipd_payment` (
  `id` int NOT NULL,
  `amount` float NOT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `ipd_id` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `payment_mode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_ipd_payment`
--

LOCK TABLES `my_ipd_payment` WRITE;
/*!40000 ALTER TABLE `my_ipd_payment` DISABLE KEYS */;
INSERT INTO `my_ipd_payment` VALUES (1133,400,'uploads/WIN_20200224_16_14_39_Pro.jpg','Fri Apr 17 2020 00:00:00 GMT+0530 (India Standard Time)','ipd-2020Apr16123514PM','hfhf','Check'),(1362,100,'fade.gif','Fri Jul 30 2021 00:00:00 GMT+0530 (India Standard Time)','ipd-2020Apr17100356AM','hdsjhdjs',NULL);
/*!40000 ALTER TABLE `my_ipd_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_ipdcharges`
--

DROP TABLE IF EXISTS `my_ipdcharges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_ipdcharges` (
  `id` int NOT NULL,
  `applied_charge` float NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `charge_type` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `ipd_id` varchar(255) DEFAULT NULL,
  `standard_charge` float NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tpa_charge` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_ipdcharges`
--

LOCK TABLES `my_ipdcharges` WRITE;
/*!40000 ALTER TABLE `my_ipdcharges` DISABLE KEYS */;
INSERT INTO `my_ipdcharges` VALUES (1136,44,'ww','Procedures','124','2020-04-16T18:30:00.000Z',NULL,'ipd-2020Apr16123514PM',44,NULL,944),(1168,44,'ww','Procedures','124','2020-04-01T18:30:00.000Z',NULL,'ipd-2020Apr16123245PM',44,NULL,944),(1197,44,'ww','Procedures','124','2020-04-28T18:30:00.000Z',NULL,'ipd-2020Apr19083334PM',44,NULL,945),(1198,44,'ww','Procedures','124','2020-04-28T18:30:00.000Z',NULL,'ipd-2020Apr19083334PM',44,NULL,945);
/*!40000 ALTER TABLE `my_ipdcharges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_ipddiagnosis`
--

DROP TABLE IF EXISTS `my_ipddiagnosis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_ipddiagnosis` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `ipd_id` varchar(255) DEFAULT NULL,
  `report_date` varchar(255) DEFAULT NULL,
  `report_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_ipddiagnosis`
--

LOCK TABLES `my_ipddiagnosis` WRITE;
/*!40000 ALTER TABLE `my_ipddiagnosis` DISABLE KEYS */;
INSERT INTO `my_ipddiagnosis` VALUES (1138,'sds','uploads/WIN_20200224_16_14_39_Pro.jpg','ipd-2020Apr16123514PM','Fri Apr 24 2020 00:00:00 GMT+0530 (India Standard Time)','dssgfdgfg'),(1140,'sds','uploads/WIN_20200224_16_14_39_Pro.jpg','ipd-2020Apr16123514PM','Wed Apr 01 2020 00:00:00 GMT+0530 (India Standard Time)','dss');
/*!40000 ALTER TABLE `my_ipddiagnosis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_ipdmodal`
--

DROP TABLE IF EXISTS `my_ipdmodal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_ipdmodal` (
  `ipd_id` varchar(255) NOT NULL,
  `admission_date` varchar(255) DEFAULT NULL,
  `bed_number` int NOT NULL,
  `bp` float NOT NULL,
  `case_type` varchar(255) DEFAULT NULL,
  `casuality` varchar(255) DEFAULT NULL,
  `department` int NOT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `height` float NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `old_patient` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `tpa` int NOT NULL,
  `weight` float NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `discharge_date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ipd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_ipdmodal`
--

LOCK TABLES `my_ipdmodal` WRITE;
/*!40000 ALTER TABLE `my_ipdmodal` DISABLE KEYS */;
INSERT INTO `my_ipdmodal` VALUES ('ipd-2020Apr1608068PM','2020-04-16T18:30:00.000Z',926,120,'bdbd',NULL,999,'doctor-20200407165934PM',NULL,30,'bdbdb','Yes','USER-20200306125416','ref','dbdb',944,230,'YES',NULL),('ipd-2020Apr161012AM','2020-04-16T18:30:00.000Z',926,120,'mfmf',NULL,999,'doctor-20200407165934PM',NULL,30,'jfjf','Yes','USER-20200306125416','nfnf','jfjf',944,30,'YES',NULL),('ipd-2020Apr16123245PM','2020-04-16T18:30:00.000Z',926,50,'fhfh',NULL,999,'doctor-20200407165934PM',NULL,50,'60','Yes','pat-20200410115726AM','ndndn','60',944,50,'YES',NULL),('ipd-2020Apr16123514PM','2020-04-16T18:30:00.000Z',926,50,'fhfh',NULL,999,'doctor-20200407165934PM',NULL,50,'60','Yes','USER-20200306125416','ndndn','60',944,50,'YES',NULL),('ipd-2020Apr17093527AM','2020-04-17T18:30:00.000Z',926,55,'55',NULL,999,'doctor-20200407165934PM',NULL,7675,'55','Yes','pat-20200410115726AM','55','55',944,555,'YES',NULL),('ipd-2020Apr17100356AM','2020-04-17T18:30:00.000Z',926,120,'gdfg',NULL,999,'doctor-20200407165934PM',NULL,50,'jdjdj','Yes','USER-20200306125416','500','200',944,50,'YES','2021-07-30T14:17:40.236067400'),('ipd-2020Apr19080956PM','2020-04-21T18:30:00.000Z',926,30,'kgkg',NULL,999,'doctor-20200419125525PM',NULL,30,'jfjfjf','Yes','USER-20200306125258','nfnfn','jfjfj',944,30,'YES',NULL),('ipd-2020Apr19082149PM','2020-04-21T18:30:00.000Z',926,55,'555',NULL,999,'doctor-20200419125525PM',NULL,55,'ddd','Yes','pat-20200406185521PM','nknjn','dd',944,55,'YES',NULL),('ipd-2020Apr19083334PM','2020-04-19T18:30:00.000Z',926,66,'66',NULL,999,'doctor-20200419125525PM',NULL,50,'66','Yes','pat-20200410115726AM','jfjfj','66',944,66,'YES','2021-07-30T14:17:47.722922500');
/*!40000 ALTER TABLE `my_ipdmodal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_ipdprescription`
--

DROP TABLE IF EXISTS `my_ipdprescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_ipdprescription` (
  `id` int NOT NULL,
  `date` datetime(6) DEFAULT NULL,
  `footer` varchar(255) DEFAULT NULL,
  `header` varchar(255) DEFAULT NULL,
  `ipd_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_ipdprescription`
--

LOCK TABLES `my_ipdprescription` WRITE;
/*!40000 ALTER TABLE `my_ipdprescription` DISABLE KEYS */;
INSERT INTO `my_ipdprescription` VALUES (1143,'2020-04-16 15:45:49.000000','dfdsf','dsfdf','ipd-2020Apr16123514PM'),(1146,'2020-04-16 15:46:38.000000','dscdcdscds','ds fvdv','ipd-2020Apr16123514PM'),(1148,'2020-04-16 15:48:31.000000','vfvv','fgfdsgf','ipd-2020Apr16123514PM');
/*!40000 ALTER TABLE `my_ipdprescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_message`
--

DROP TABLE IF EXISTS `my_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_message` (
  `id` int NOT NULL,
  `message` text,
  `notice_date` varchar(255) DEFAULT NULL,
  `publish_date` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_message`
--

LOCK TABLES `my_message` WRITE;
/*!40000 ALTER TABLE `my_message` DISABLE KEYS */;
INSERT INTO `my_message` VALUES (1299,'dfdfdfdf','2020-05-14T09:07:46.386Z','2020-05-14T09:07:46.386Z','fdfdf'),(1302,'hdhdh','2020-05-14T09:14:17.956Z','2020-05-14T09:14:17.956Z','gfgf'),(1305,'fffffffffff','2020-05-14T09:34:17.838Z','2020-05-14T09:34:17.838Z','ffff'),(1308,'fdfdsf','2020-05-14T09:35:49.762Z','2020-05-14T09:35:49.762Z','dfdsfd'),(1312,'iuhiusancjdncjndsacudsnciudsnndscciundscnsncsncnjsnckdsnclknclknocndsnmckdsncoindosncndsocnoscnodsncokdncokndcokncokndcokndsokcnoknokdfhidhfndsfknsfhsfnksdhfiudhfnfdkvnifgkfdnvkfdngfdgknfdkhgfsjgkfdngdfhgjfdhgkjfdkgjhfdgijhfdkjgdhfkjgfdhghfdgnfdlv lknvdhghghkjgnfghgjfvnkjfdvffgnfjfgjds','2020-05-14T09:38:05.087Z','2020-05-14T09:38:05.087Z','kdsjfksdkfsdkjfhkshdfkjsdkjfhdkjhf'),(1319,'cisnjcndjcnknkjc dskjcsckjnskcbkjckcnkchkjnkcnnc','2020-05-18T11:04:53.903Z','2020-05-18T11:04:53.903Z','hi');
/*!40000 ALTER TABLE `my_message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_message_to`
--

DROP TABLE IF EXISTS `my_message_to`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_message_to` (
  `id` int NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  `mymessage_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjl56vsquhi3fuolxjpnfrfvfu` (`mymessage_id`),
  CONSTRAINT `FKjl56vsquhi3fuolxjpnfrfvfu` FOREIGN KEY (`mymessage_id`) REFERENCES `my_message` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_message_to`
--

LOCK TABLES `my_message_to` WRITE;
/*!40000 ALTER TABLE `my_message_to` DISABLE KEYS */;
INSERT INTO `my_message_to` VALUES (1300,'admin',1299),(1301,'doctor',1299),(1303,'admin',1302),(1304,'doctor',1302),(1306,'accountant',1305),(1307,'admin',1305),(1309,'pathologist',1308),(1313,'pathologist',1312),(1320,'admin',1319),(1321,'pathologist',1319),(1322,'receptionist',1319),(1323,'doctor',1319);
/*!40000 ALTER TABLE `my_message_to` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_opd_case_history`
--

DROP TABLE IF EXISTS `my_opd_case_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_opd_case_history` (
  `id` int NOT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `instruction` varchar(255) DEFAULT NULL,
  `medician_category` varchar(255) DEFAULT NULL,
  `medicine` varchar(255) DEFAULT NULL,
  `pr_fk` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKda41t7e8p3i8dek7gkbycp00s` (`pr_fk`),
  CONSTRAINT `FKda41t7e8p3i8dek7gkbycp00s` FOREIGN KEY (`pr_fk`) REFERENCES `myopdprescription` (`opd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_opd_case_history`
--

LOCK TABLES `my_opd_case_history` WRITE;
/*!40000 ALTER TABLE `my_opd_case_history` DISABLE KEYS */;
INSERT INTO `my_opd_case_history` VALUES (1093,'gfgf','sadsa','800','demo2','OPD-20200410122000PM'),(1094,'gfgf','sadsa','800','demo2','OPD-20200410122000PM'),(1123,'','gfhfgg','801','','OPD-20200410122000PM'),(1124,'gfgfg','hfhf','800','demo2','OPD-20200410122000PM'),(1125,'gfgfg','hgh','800','demo2','OPD-20200412174503PM');
/*!40000 ALTER TABLE `my_opd_case_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_opd_payment`
--

DROP TABLE IF EXISTS `my_opd_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_opd_payment` (
  `id` int NOT NULL,
  `amount` float NOT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  `payment_mode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_opd_payment`
--

LOCK TABLES `my_opd_payment` WRITE;
/*!40000 ALTER TABLE `my_opd_payment` DISABLE KEYS */;
INSERT INTO `my_opd_payment` VALUES (1118,400,'uploads/WIN_20200224_16_14_39_Pro.jpg','Thu Apr 16 2020 00:00:00 GMT+0530 (India Standard Time)','hfhf','OPD-20200410122000PM','Check'),(1127,2000,NULL,'Wed Apr 15 2020 00:00:00 GMT+0530 (India Standard Time)','hfhf','OPD-20200410122000PM','Check'),(1195,2000,NULL,'Wed Apr 29 2020 00:00:00 GMT+0530 (India Standard Time)','hfhf','OPD-20200419125850PM',NULL);
/*!40000 ALTER TABLE `my_opd_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_opdmodal`
--

DROP TABLE IF EXISTS `my_opdmodal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `my_opdmodal` (
  `opd_id` varchar(255) NOT NULL,
  `applied_charge` float NOT NULL,
  `appointment_date` varchar(255) DEFAULT NULL,
  `bp` float NOT NULL,
  `case_type` varchar(255) DEFAULT NULL,
  `casuality` varchar(255) DEFAULT NULL,
  `department` int NOT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `height` float NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `old_patient` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `payment_mode` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `standard_charge` float NOT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `tpa` int NOT NULL,
  `weight` float NOT NULL,
  PRIMARY KEY (`opd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_opdmodal`
--

LOCK TABLES `my_opdmodal` WRITE;
/*!40000 ALTER TABLE `my_opdmodal` DISABLE KEYS */;
INSERT INTO `my_opdmodal` VALUES ('OPD-20200407174745PM',30,'2020-04-07T18:30:00.000Z',54,'54','Yes',999,'doctor-20200407165934PM','',54,'45','Yes','pat-20200406175306PM','cash','',44,'45',944,54),('OPD-20200407180620PM',30,'2020-04-15T18:30:00.000Z',54,'54','Yes',999,'doctor-20200407165934PM','',54,'45','Yes','pat-20200406175306PM','cash','',44,'45',944,54),('OPD-20200408121238PM',30,'2020-04-08T18:30:00.000Z',0,'','Yes',999,'doctor-20200407165934PM','',0,'','','pat-20200406175306PM','cash','',44,'',944,0),('OPD-20200408121629PM',30,'2020-04-08T18:30:00.000Z',0,'','',999,'doctor-20200407165934PM','',0,'','','pat-20200406175306PM','cash','',44,'',944,0),('OPD-20200408180309PM',30,'2020-04-08T18:30:00.000Z',0,'','',999,'doctor-20200407165934PM','',0,'','','PAT-20200322044938','cash','',44,'',944,0),('OPD-20200410122000PM',30,'2020-04-16T18:30:00.000Z',32,'232','Yes',999,'doctor-20200407165934PM','',23,'322','Yes','pat-20200410115726AM','cash','dsd',44,'3223',944,3223),('OPD-20200419124127PM',50,'2020-04-08T18:30:00.000Z',50,'hfhf','Yes',0,'doctor-20200407165934PM','',20,'kfdldlf','Yes','USER-20200306125416','cash','',500,'inmdsknf',944,40),('OPD-20200419125850PM',600,'2020-04-08T18:30:00.000Z',50,'d,d,d','Yes',0,'doctor-20200419125525PM','',50,'ndnd','Yes','USER-20200306125416','cash','dsddd',600,'ndnd',944,50),('OPD-20210730132916PM',50,'2021-07-30T18:30:00.000Z',0,'hjdhjsd','Yes',999,'doctor-20200407165934PM','',0,'','Yes','pat-20200410115726AM','cash','',500,'',944,0);
/*!40000 ALTER TABLE `my_opdmodal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mycharges`
--

DROP TABLE IF EXISTS `mycharges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mycharges` (
  `id` int NOT NULL,
  `charge_category_id` int NOT NULL,
  `charge_type_id` int NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `standard_charge` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mycharges`
--

LOCK TABLES `mycharges` WRITE;
/*!40000 ALTER TABLE `mycharges` DISABLE KEYS */;
/*!40000 ALTER TABLE `mycharges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `myipdconsultant_register`
--

DROP TABLE IF EXISTS `myipdconsultant_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `myipdconsultant_register` (
  `id` int NOT NULL,
  `ipd_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `myipdconsultant_register`
--

LOCK TABLES `myipdconsultant_register` WRITE;
/*!40000 ALTER TABLE `myipdconsultant_register` DISABLE KEYS */;
/*!40000 ALTER TABLE `myipdconsultant_register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `myopdcharges`
--

DROP TABLE IF EXISTS `myopdcharges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `myopdcharges` (
  `id` int NOT NULL,
  `applied_charge` float NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `charge_type` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  `standard_charge` float NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tpa_charge` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `myopdcharges`
--

LOCK TABLES `myopdcharges` WRITE;
/*!40000 ALTER TABLE `myopdcharges` DISABLE KEYS */;
INSERT INTO `myopdcharges` VALUES (1111,0,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,0),(1112,44,'ww','Procedures','124','2020-04-09T18:30:00.000Z','',NULL,44,'',945),(1113,44,'ww','Procedures','124','2020-04-15T18:30:00.000Z',NULL,NULL,44,NULL,944),(1114,44,'ww','Procedures','124','2020-04-08T18:30:00.000Z',NULL,NULL,44,NULL,944),(1115,44,'ww','Procedures','124','2020-04-14T18:30:00.000Z',NULL,NULL,44,NULL,944),(1116,44,'ww','Procedures','124','2020-04-12T18:30:00.000Z',NULL,NULL,44,NULL,944),(1126,44,'ww','Procedures','124','2020-04-13T18:30:00.000Z',NULL,'OPD-20200412174503PM',44,NULL,944),(1129,44,'ww','Procedures','124','2020-04-12T18:30:00.000Z',NULL,'OPD-20200410122000PM',44,NULL,944),(1130,44,'ww','Procedures','124','2020-04-30T18:30:00.000Z',NULL,'OPD-20200410122000PM',44,NULL,944),(1196,44,'ww','Procedures','124','2020-04-28T18:30:00.000Z',NULL,'OPD-20200419125850PM',44,NULL,944);
/*!40000 ALTER TABLE `myopdcharges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `myopddiagnosis`
--

DROP TABLE IF EXISTS `myopddiagnosis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `myopddiagnosis` (
  `opd_id` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `report_date` varchar(255) DEFAULT NULL,
  `report_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`opd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `myopddiagnosis`
--

LOCK TABLES `myopddiagnosis` WRITE;
/*!40000 ALTER TABLE `myopddiagnosis` DISABLE KEYS */;
INSERT INTO `myopddiagnosis` VALUES ('ipd-2020Apr16123514PM','dfdf','uploads/WIN_20200224_16_14_39_Pro.jpg','Fri Apr 17 2020 00:00:00 GMT+0530 (India Standard Time)','hfhf'),('OPD-20200410122000PM','pojdpcmkmc','','Fri Apr 17 2020 00:00:00 GMT+0530 (India Standard Time)','jcimkmfcd');
/*!40000 ALTER TABLE `myopddiagnosis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `myopdprescription`
--

DROP TABLE IF EXISTS `myopdprescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `myopdprescription` (
  `opd_id` varchar(255) NOT NULL,
  `date` datetime(6) DEFAULT NULL,
  `footer` varchar(255) DEFAULT NULL,
  `header` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`opd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `myopdprescription`
--

LOCK TABLES `myopdprescription` WRITE;
/*!40000 ALTER TABLE `myopdprescription` DISABLE KEYS */;
INSERT INTO `myopdprescription` VALUES ('OPD-20200410122000PM',NULL,'sdds','sdsda123'),('OPD-20200412174503PM',NULL,'hfhfkjkfmkfv','hfhf');
/*!40000 ALTER TABLE `myopdprescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notification_roles`
--

DROP TABLE IF EXISTS `notification_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notification_roles` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` int NOT NULL,
  `role_id` int NOT NULL,
  `send_notification_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification_roles`
--

LOCK TABLES `notification_roles` WRITE;
/*!40000 ALTER TABLE `notification_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `notification_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notification_setting`
--

DROP TABLE IF EXISTS `notification_setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notification_setting` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_mail` varchar(255) DEFAULT NULL,
  `is_sms` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification_setting`
--

LOCK TABLES `notification_setting` WRITE;
/*!40000 ALTER TABLE `notification_setting` DISABLE KEYS */;
/*!40000 ALTER TABLE `notification_setting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opd_billing`
--

DROP TABLE IF EXISTS `opd_billing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opd_billing` (
  `id` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `discount` int NOT NULL,
  `gross_total` float NOT NULL,
  `net_amount` float NOT NULL,
  `other_charge` varchar(255) DEFAULT NULL,
  `patient_id` int NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tax` float NOT NULL,
  `total_amount` float NOT NULL,
  `total_charges` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opd_billing`
--

LOCK TABLES `opd_billing` WRITE;
/*!40000 ALTER TABLE `opd_billing` DISABLE KEYS */;
/*!40000 ALTER TABLE `opd_billing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opd_detail`
--

DROP TABLE IF EXISTS `opd_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opd_detail` (
  `id` int NOT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `applied_charge` varchar(255) DEFAULT NULL,
  `appointment_date` varchar(255) DEFAULT NULL,
  `bp` varchar(255) DEFAULT NULL,
  `case_type` varchar(255) DEFAULT NULL,
  `casuality` varchar(255) DEFAULT NULL,
  `cons_doctor` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `old_patient` varchar(255) DEFAULT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `payment_mode` varchar(255) DEFAULT NULL,
  `standard_charge` varchar(255) DEFAULT NULL,
  `tpa` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opd_detail`
--

LOCK TABLES `opd_detail` WRITE;
/*!40000 ALTER TABLE `opd_detail` DISABLE KEYS */;
INSERT INTO `opd_detail` VALUES (609,'ddd','123','2020-03-13T18:30:00.000Z','120','fdf','No','Dr.Soniya','1234','185','dd','No','OPDID-20200306030448','USER-20200306125416','Cash','123','IDBI Federal','85','Uttham',NULL),(625,'66','66','2020-03-11T18:30:00.000Z','66','66','No','Dr.Soniya',NULL,'66','66','No','OPDID-20200306051002','USER-20200306125513','Check','66','IDBI Federal','66','Arun',NULL),(629,'kjl','400','2020-03-06T18:30:00.000Z','55','kjkm,','Yes','Dr.Thapa',NULL,'55','lk;l','Yes','OPDID-20200306054422','USER-20200306125258','Net Banking','452','IDBI Federal','5','Revan',NULL),(641,'rtyufdghjgfh','4556','2020-03-06T18:30:00.000Z','455','fhjkhghj','No','Dr.Thapa',NULL,'56','tryuifgjkhgg','Yes','OPDID-20200306060507','USER-20200306125258','Net Banking','45562','IDBI Federal','455','Revan',NULL),(742,'','100','2020-03-11T18:30:00.000Z','','','',NULL,'','','','','OPDID-20200311055751','PAT-20200309113039','','','','','Manju','Dr.Amit'),(877,'33','55','2020-03-26T18:30:00.000Z','32','33','Yes',NULL,'STAFFID-20200314085655','1','33','Yes','OPDID-20200320051735','USER-20200306125258','Check','55','CGHS','3','Revan',''),(881,'w','33','2020-03-20T18:30:00.000Z','','ew','Yes',NULL,'STAFFID-20200314085655','-1','w','Yes','OPDID-20200320053914','USER-20200306125513','Check','33','CGHS','1','Arun',''),(910,'3','30','2020-03-21T18:30:00.000Z','3','3','Yes',NULL,'STAFFID-20200314085655','3','3','Yes','OPDID-20200322045056','PAT-20200322044938','Check','30','CGHS','3','patient',''),(1247,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'doctor-20200407165934PM',NULL,NULL,NULL,'OPDID-20200503055316','USER-20200306125416',NULL,NULL,NULL,NULL,'Uttham','Pramod Shhelvanth'),(1257,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'OPDID-20200504091744','',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `opd_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opddiagnosis`
--

DROP TABLE IF EXISTS `opddiagnosis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opddiagnosis` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  `report_date` varchar(255) DEFAULT NULL,
  `report_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opddiagnosis`
--

LOCK TABLES `opddiagnosis` WRITE;
/*!40000 ALTER TABLE `opddiagnosis` DISABLE KEYS */;
INSERT INTO `opddiagnosis` VALUES (617,'sdfghj','//home//madarsha//Desktop//SPRING//database.sql','opdDiagnosisBean.getPatientId()','','rdr'),(618,'sdfghj','//home//madarsha//Desktop//SPRING//database.sql','opdDiagnosisBean.getPatientId()','','sadfg'),(619,'sdfghj','//home//madarsha//Desktop//SPRING//database.sql','opdDiagnosisBean.getPatientId()','','sadfg'),(620,'dfghj','//home//madarsha//Desktop//SPRING//database.sql','opdDiagnosisBean.getPatientId()','Thu Mar 19 2020 00:00:00 GMT+0530 (India Standard Time)','sdfg'),(633,'hgjkhkh','//home//madarsha//Desktop//SPRING//database.sql','opdDiagnosisBean.getPatientId()','Sat Mar 07 2020 00:00:00 GMT+0530 (India Standard Time)','fjhk'),(634,'ryuioilk','//home//madarsha//Desktop//SPRING//database.sql','opdDiagnosisBean.getPatientId()','Sat Mar 07 2020 00:00:00 GMT+0530 (India Standard Time)','ygkj'),(635,'uyoljl\n','//home//madarsha//Desktop//SPRING//database.sql','undefined','Fri Mar 06 2020 17:57:14 GMT+0530 (India Standard Time)','ryutru'),(636,'rdghjk','//home//madarsha//Desktop//SPRING//database.sql','OPDID-20200306054422','Fri Mar 06 2020 17:58:13 GMT+0530 (India Standard Time)','tryoiu'),(637,'ytuio','//home//madarsha//Desktop//SPRING//database.sql','OPDID-20200306051002','Sat Mar 14 2020 00:00:00 GMT+0530 (India Standard Time)','gjkl'),(663,'asdfghj','//home//madarsha//Desktop//SPRING//database.sql','IPDID-20200309041736','Tue Mar 17 2020 00:00:00 GMT+0530 (India Standard Time)','sdfgh'),(664,'sdfghj','//home//madarsha//Desktop//SPRING//database.sql','IPDID-20200309041736','Wed Mar 11 2020 00:00:00 GMT+0530 (India Standard Time)','sdfgh'),(685,'JKHKKLN','//home//madarsha//Desktop//SPRING//database.sql','IPDID-20200309041736','Tue Mar 10 2020 00:00:00 GMT+0530 (India Standard Time)','KLJL'),(725,'rgrgrg','//home//madarsha//Desktop//SPRING//RevanR.docx','undefined','Thu Mar 12 2020 00:00:00 GMT+0530 (India Standard Time)','2'),(727,'sd','//home//madarsha//Desktop//SPRING//RevanR.docx','undefined','Wed Mar 11 2020 00:00:00 GMT+0530 (India Standard Time)','zsdfg'),(729,'dds','//home//madarsha//Desktop//SPRING//RevanR.docx','undefined','Tue Mar 17 2020 00:00:00 GMT+0530 (India Standard Time)','2'),(1076,'ggf','//home//madarsha//Desktop//D//WIN_20200224_16_14_39_Pro.jpg','OPD-20200407184056PM','Thu Apr 09 2020 00:00:00 GMT+0530 (India Standard Time)','ffs'),(1078,'sdsds',NULL,'OPD-20200407183215PM','Thu Apr 09 2020 00:00:00 GMT+0530 (India Standard Time)','dssd'),(1079,'sdsds','//home//madarsha//Desktop//D//WIN_20200224_16_14_39_Pro.jpg','OPD-20200407183215PM','Thu Apr 09 2020 00:00:00 GMT+0530 (India Standard Time)','dssd');
/*!40000 ALTER TABLE `opddiagnosis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operation_theater`
--

DROP TABLE IF EXISTS `operation_theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operation_theater` (
  `id` int NOT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `anasthesist` varchar(255) DEFAULT NULL,
  `anasthesist_type` varchar(255) DEFAULT NULL,
  `applied_charge` float NOT NULL,
  `assistant_consultant1` varchar(255) DEFAULT NULL,
  `assistant_consultant2` varchar(255) DEFAULT NULL,
  `bp` float NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `height` float NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `operation_date` varchar(255) DEFAULT NULL,
  `operation_name` varchar(255) DEFAULT NULL,
  `operation_type` varchar(255) DEFAULT NULL,
  `ot_assistant` varchar(255) DEFAULT NULL,
  `ot_technician` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `standard_charge` float NOT NULL,
  `tpa_id` int NOT NULL,
  `weight` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operation_theater`
--

LOCK TABLES `operation_theater` WRITE;
/*!40000 ALTER TABLE `operation_theater` DISABLE KEYS */;
INSERT INTO `operation_theater` VALUES (1249,NULL,'dfdf','dsfsfd',500,'dsfdsf','fdfd',120,'ot1','124','doctor-20200407165934PM',40,'fdfds','2020-05-11T18:30:00.000Z','dfdsf','fddf','sdfdf','dfdfd','pat-20200410115726AM',500,944,50);
/*!40000 ALTER TABLE `operation_theater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operation_theatre`
--

DROP TABLE IF EXISTS `operation_theatre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operation_theatre` (
  `id` int NOT NULL,
  `allied_charge` varchar(255) DEFAULT NULL,
  `anesthetist` varchar(255) DEFAULT NULL,
  `anesthetist_type` varchar(255) DEFAULT NULL,
  `ass_consultant1` varchar(255) DEFAULT NULL,
  `ass_consultant2` varchar(255) DEFAULT NULL,
  `bp` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `consultant_doctor` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `operation_date` varchar(255) DEFAULT NULL,
  `operation_name` varchar(255) DEFAULT NULL,
  `operation_type` varchar(255) DEFAULT NULL,
  `ot_assistant` varchar(255) DEFAULT NULL,
  `ot_technician` varchar(255) DEFAULT NULL,
  `patient_id` int NOT NULL,
  `select_ctegory` varchar(255) DEFAULT NULL,
  `standard_charge` varchar(255) DEFAULT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `tpa` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL,
  `applied_charge` varchar(255) DEFAULT NULL,
  `action` varchar(255) DEFAULT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operation_theatre`
--

LOCK TABLES `operation_theatre` WRITE;
/*!40000 ALTER TABLE `operation_theatre` DISABLE KEYS */;
INSERT INTO `operation_theatre` VALUES (160,NULL,'sdfghjk','dfghj','dfghjk','fghjk','667','','Dr','2020-02-06 11:30:27.968000','5','dfghj','2020-02-11T18:30:00.000Z','xfghj','dfghj','xcvbn','ertyu',0,NULL,'4567','cfghj','IDBI Federal','2020-02-06 11:30:27.968000','56',NULL,NULL,'revan'),(162,NULL,'','','','','','','','2020-02-06 12:21:51.126000','','','','','','','',0,NULL,'','','','2020-02-06 12:21:51.126000','',NULL,NULL,NULL),(163,NULL,'','','','','','','','2020-02-06 12:21:51.126000','','','','','','','',0,NULL,'','','','2020-02-06 12:21:51.126000','',NULL,NULL,NULL),(164,NULL,'hgy','uyuy','vhgcy','hjbjhb','44','','Dr','2020-02-06 12:24:14.832000','2','hgy','2020-02-06T06:53:35.335Z','hgvhgv','uyvv','gcgc','yuyu',0,'','34567','hjvj','State Bank Of India','2020-02-06 12:24:14.832000','343',NULL,NULL,NULL),(165,NULL,'yes','No','Bean','Ammm','240','','Dr','2020-02-06 12:27:06.220000','5','Nothing','2020-02-06T18:30:00.000Z','Heart','Normal','asdfgh','qwert',0,'Sterilization & Cleaning Equipment','45678','Low Bp','IDBI Federal','2020-02-06 12:27:06.220000','67',NULL,NULL,NULL),(166,NULL,'hjvh','hioo','hjvhuv','jhvh','77','','Dr','2020-02-06 12:37:08.913000','33','vuyg','2020-02-06T07:06:42.353Z','vhvu','hvuvu','dvg','hjhj',0,'Leg Bone Fracture','678','bhg','State Bank Of India','2020-02-06 12:37:08.913000','33','9876',NULL,NULL);
/*!40000 ALTER TABLE `operation_theatre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organisation`
--

DROP TABLE IF EXISTS `organisation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `organisation` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `contact_person_name` varchar(255) DEFAULT NULL,
  `contact_person_phone` varchar(255) DEFAULT NULL,
  `organisation_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organisation`
--

LOCK TABLES `organisation` WRITE;
/*!40000 ALTER TABLE `organisation` DISABLE KEYS */;
INSERT INTO `organisation` VALUES (944,'dds','ff','ffd','fdf','dff','dsds'),(945,'cbdibc','cdud','dcndunc','uciuds','idcidsbc','uvcvudv'),(964,'fdf','fdf','dff','dff','ff','dsf'),(1087,'dsf','123','984757','dfdf','fds','hdhf');
/*!40000 ALTER TABLE `organisation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ot_consultant_register`
--

DROP TABLE IF EXISTS `ot_consultant_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ot_consultant_register` (
  `id` int NOT NULL,
  `applied_date` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `instruction` varchar(255) DEFAULT NULL,
  `instruction_date` varchar(255) DEFAULT NULL,
  `otid` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ot_consultant_register`
--

LOCK TABLES `ot_consultant_register` WRITE;
/*!40000 ALTER TABLE `ot_consultant_register` DISABLE KEYS */;
INSERT INTO `ot_consultant_register` VALUES (1251,'2020-05-20T15:30:00.000Z','doctor-20200419125525PM','hghghg','2020-05-03T14:30:33.016Z',0),(1252,'2020-05-22T13:00:00.000Z','doctor-20200407165934PM','ggg','2020-05-04T12:54:31.191Z',0),(1253,'2020-05-28T14:00:00.000Z','doctor-20200419125525PM','ffff','2020-05-04T12:57:14.129Z',1249),(1254,'2020-05-28T14:00:00.000Z','doctor-20200419125525PM','ff','2020-05-04T12:57:17.333Z',0),(1256,'2020-05-28T18:30:00.000Z','doctor-20200419125525PM','hh','2020-05-04T12:59:35.689Z',1249);
/*!40000 ALTER TABLE `ot_consultant_register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pathology`
--

DROP TABLE IF EXISTS `pathology`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pathology` (
  `id` int NOT NULL,
  `category` int NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `report_days` int NOT NULL,
  `short_name` varchar(255) DEFAULT NULL,
  `standard_charge` float NOT NULL,
  `sub_category` varchar(255) DEFAULT NULL,
  `test_name` varchar(255) DEFAULT NULL,
  `test_type` varchar(255) DEFAULT NULL,
  `unit` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pathology`
--

LOCK TABLES `pathology` WRITE;
/*!40000 ALTER TABLE `pathology` DISABLE KEYS */;
INSERT INTO `pathology` VALUES (1214,1199,'hdhdh','120','dd',60,'ddd',100,'dd','ddd','dd',55);
/*!40000 ALTER TABLE `pathology` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pathology_category`
--

DROP TABLE IF EXISTS `pathology_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pathology_category` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pathology_category`
--

LOCK TABLES `pathology_category` WRITE;
/*!40000 ALTER TABLE `pathology_category` DISABLE KEYS */;
INSERT INTO `pathology_category` VALUES (1199,'pho1'),(1200,'pho2');
/*!40000 ALTER TABLE `pathology_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pathology_patient`
--

DROP TABLE IF EXISTS `pathology_patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pathology_patient` (
  `id` int NOT NULL,
  `applied_charge` float NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `pathology_id` int NOT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `standard_charge` float NOT NULL,
  `test_report` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pathology_patient`
--

LOCK TABLES `pathology_patient` WRITE;
/*!40000 ALTER TABLE `pathology_patient` DISABLE KEYS */;
INSERT INTO `pathology_patient` VALUES (1216,0,NULL,NULL,NULL,NULL,NULL,0,NULL,0,NULL),(1218,100,'hdhdh','120','2020-05-29','jdjd','doctor-20200407165934PM',1214,'USER-20200306125416',100,''),(1220,100,'hdhdh','120','2020-05-29 00:00:00','fff','doctor-20200419125525PM',1214,'pat-20200410115726AM',100,''),(1295,100,'hdhdh','120','2020-05-21','ffdd','doctor-20200407165934PM',1214,'pat-20200410115726AM',100,'');
/*!40000 ALTER TABLE `pathology_patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `id` int NOT NULL,
  `admissiondate` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `bloodgroup` varchar(255) DEFAULT NULL,
  `createdat` varchar(255) DEFAULT NULL,
  `creditlimit` varchar(255) DEFAULT NULL,
  `date_ofbirth` varchar(255) DEFAULT NULL,
  `disableat` varchar(255) DEFAULT NULL,
  `emil` varchar(255) DEFAULT NULL,
  `guardianaddress` varchar(255) DEFAULT NULL,
  `guardianemail` varchar(255) DEFAULT NULL,
  `image` longblob,
  `isactive` varchar(255) DEFAULT NULL,
  `maritalstatus` varchar(255) DEFAULT NULL,
  `mobilenumber` varchar(255) DEFAULT NULL,
  `month` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `oldpatient` varchar(255) DEFAULT NULL,
  `organisation` varchar(255) DEFAULT NULL,
  `patientname` varchar(255) DEFAULT NULL,
  `patienttype` varchar(255) DEFAULT NULL,
  `pid` int NOT NULL,
  `updatedat` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_address`
--

DROP TABLE IF EXISTS `patient_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_address` (
  `id` int NOT NULL,
  `adress_line` varchar(255) DEFAULT NULL,
  `adress_line2` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `pincode` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `taluk` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_address`
--

LOCK TABLES `patient_address` WRITE;
/*!40000 ALTER TABLE `patient_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_charges`
--

DROP TABLE IF EXISTS `patient_charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_charges` (
  `id` int NOT NULL,
  `apply_charge` varchar(255) DEFAULT NULL,
  `charge_id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `org_charge_id` int NOT NULL,
  `patient_id` int NOT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_charges`
--

LOCK TABLES `patient_charges` WRITE;
/*!40000 ALTER TABLE `patient_charges` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_discharge`
--

DROP TABLE IF EXISTS `patient_discharge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_discharge` (
  `id` int NOT NULL,
  `admissionb_date` varchar(255) DEFAULT NULL,
  `charge` float NOT NULL,
  `consultant` varchar(255) DEFAULT NULL,
  `dis_charge_date` varchar(255) DEFAULT NULL,
  `discount` float NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `other_charges` float NOT NULL,
  `paid_amount` float NOT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `tax` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_discharge`
--

LOCK TABLES `patient_discharge` WRITE;
/*!40000 ALTER TABLE `patient_discharge` DISABLE KEYS */;
INSERT INTO `patient_discharge` VALUES (739,NULL,0,NULL,NULL,0,NULL,NULL,0,0,NULL,NULL,0),(740,NULL,0,NULL,NULL,0,NULL,NULL,0,0,NULL,NULL,0);
/*!40000 ALTER TABLE `patient_discharge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_profile`
--

DROP TABLE IF EXISTS `patient_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_profile` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `guardian_name` varchar(255) DEFAULT NULL,
  `merital_status` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `patient_profile` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_profile`
--

LOCK TABLES `patient_profile` WRITE;
/*!40000 ALTER TABLE `patient_profile` DISABLE KEYS */;
INSERT INTO `patient_profile` VALUES (510,'asdfghj','21','abc@gmail.com','male','Dave Batista',NULL,NULL,'P-PPPP',NULL,'7411467085',NULL),(511,'asdfghjvgcvggvcvccgvg','26','abc@gmail.com','male','Dave Batista',NULL,NULL,'P-20200212115220',NULL,'7411467085',NULL),(512,'asdfghj','26','abc@gmail.com','male','Dave Batista',NULL,NULL,'P-HGGH',NULL,'7411467085',NULL),(1194,'sss','27','revanhj1993@gmail.com','male','56','single','Demo','pat-20200410115726AM',NULL,'98565262','patient'),(1290,'hddhd',NULL,'ramu@gmail.com','Male',NULL,NULL,'ramu','pat-20200509195023PM',NULL,'9874563210','patient'),(1329,'sdfghj',NULL,'utthamcsc@gmail.com','Male',NULL,NULL,'hjhhj','pat-20200605122104PM',NULL,'0987654321','patient'),(1331,'sdfghj',NULL,'utthamhmanju@gmail.com','Male',NULL,NULL,'hjhhj','pat-20200605123308PM',NULL,'0987654321','patient'),(1333,'986',NULL,'manjumadesh1993@gmail.com','Male',NULL,NULL,'Manju','pat-20200714113410AM',NULL,'8865995668','patient'),(1335,'jhsjh',NULL,'utthamcsc@gmail.com','Male',NULL,NULL,'uttham','pat-20200716185316PM',NULL,'8966542633','patient'),(1338,'jhsjh',NULL,'utthamhmanju@gmail.com','Male',NULL,NULL,'uttham','pat-20200716190242PM',NULL,'8966542633','patient'),(1341,'jhsjh',NULL,'utthamhmanju@gmail.com','Male',NULL,NULL,'uttham','pat-20200716190612PM',NULL,'8966542633','patient'),(1344,'jhsjh',NULL,'utthamhmanju@gmail.com','Male',NULL,NULL,'uttham','pat-20200716191318PM',NULL,'8966542633','patient'),(1347,'jhsjh',NULL,'utthamcsc@gmail.com','Male',NULL,NULL,'uttham','pat-20200716192633PM',NULL,'8966542633','patient'),(1349,'jhsjh',NULL,'utthamcsc@gmail.com','Male',NULL,NULL,'uttham','pat-20200716192945PM',NULL,'8966542633','patient'),(1352,'bangalore',NULL,'utthamhmanju@gmail.com','Male',NULL,NULL,'uttham','pat-20200716204622PM',NULL,'9874563210','patient'),(1354,'bangalore',NULL,'utthamhmanju@gmail.com','Male',NULL,NULL,'uttham','pat-20200716205000PM',NULL,'9874563210','patient'),(1357,'bangalore',NULL,'utthamcsc@gmail.com','Male',NULL,NULL,'uttham','pat-20200716205334PM',NULL,'9874563210','patient');
/*!40000 ALTER TABLE `patient_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_registration`
--

DROP TABLE IF EXISTS `patient_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_registration` (
  `patient_id` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `gurdian_name` varchar(255) DEFAULT NULL,
  `known_allergies` varchar(255) DEFAULT NULL,
  `marital_status` varchar(255) DEFAULT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `patient_photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_registration`
--

LOCK TABLES `patient_registration` WRITE;
/*!40000 ALTER TABLE `patient_registration` DISABLE KEYS */;
INSERT INTO `patient_registration` VALUES ('P-20200211042203','gulb','10','B+','2020-02-11 16:22:03.502000','2020-02-02','revanhj@mail.com','male','hhhhhhhhh','callllal',NULL,'tgtgtgtg','jnjnn',NULL,'1234567','2020-02-11 16:22:03.502000',NULL),('P-20200211042705','banglore','20','O-','2020-02-11 16:27:05.998000','1995--02-02','hbbhbhb@gmail.com','male','pppppppp','alllujnjnasa','no','njjjjjjjjjjjj','hsghdvchgsdvc',NULL,'1234567','2020-02-11 16:27:05.998000',NULL),('P-20200211050133',NULL,NULL,NULL,'2020-02-11 17:01:33.284000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-02-11 17:01:33.284000',NULL),('P-20200211050931',NULL,NULL,NULL,'2020-02-11 17:09:31.988000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-02-11 17:09:31.988000',NULL),('P-20200211053249',NULL,NULL,NULL,'2020-02-11 17:32:49.588000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-02-11 17:32:49.588000',NULL),('P-20200211054156',NULL,NULL,NULL,'2020-02-11 17:41:56.085000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-02-11 17:41:56.085000',NULL),('P-20200211054756',NULL,NULL,NULL,'2020-02-11 17:47:56.348000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-02-11 17:47:56.348000','//home//madarsha//Desktop//SPRING//D//Untitled Folderda.jpg'),('P-20200211055103','sdfg','0 years1 months','A+','2020-02-11 17:51:03.928000','Tue Jan 28 2020 00:00:00 GMT+0530 (India Standard Time)','sdfgh','Male',NULL,'sdfg','Married','sdfghj','asdfg',NULL,'sdfgh','2020-02-11 17:51:03.928000','//home//madarsha//Desktop//SPRING//D//logo512.png'),('P-20200211055111','sdfg','0 years1 months','A+','2020-02-11 17:51:11.113000','Tue Jan 28 2020 00:00:00 GMT+0530 (India Standard Time)','sdfgh','Male',NULL,'sdfg','Married','sdfghj','asdfg',NULL,'sdfgh','2020-02-11 17:51:11.113000','//home//madarsha//Desktop//SPRING//D//logo512.png'),('P-20200211061507',NULL,NULL,NULL,'2020-02-11 18:15:07.089000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-02-11 18:15:07.089000','//home//madarsha//Desktop//SPRING//D//da.jpg'),('P-20200212111723','bbb','19','A','2020-02-12 11:17:23.139000','1995-05-05','rrrrr@gmail.com','male','saharaaaa','gvgv','married','gggggg','hbhbhbhb',NULL,'0987654321','2020-02-12 11:17:23.139000',NULL),('P-20200212113332',NULL,NULL,NULL,'2020-02-12 11:33:32.472000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-02-12 11:33:32.472000',NULL),('P-20200212114422',NULL,NULL,NULL,'2020-02-12 11:44:22.428000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2020-02-12 11:44:22.428000','//home//madarsha//Desktop//SPRING//D//download.jpeg'),('P-20200212114627','asdfg','1 years4 months','A+','2020-02-12 11:46:27.897000','Wed Oct 31 2018 00:00:00 GMT+0530 (India Standard Time)','sdfgh@sdf.sd','Male',NULL,'asdfgh','Married','asdfgh','sdfgh',NULL,'123456','2020-02-12 11:46:27.897000','//home//madarsha//Desktop//SPRING//D//logo512.png'),('P-20200212115220','asdfg','0 years1 months','O+','2020-02-12 11:52:20.841000','Mon Jan 27 2020 00:00:00 GMT+0530 (India Standard Time)','asdfg@df.sdfg','Male',NULL,'sdfgh','Married','sdfghj','asdfgh',NULL,'123456','2020-02-12 11:52:20.841000','//home//madarsha//Desktop//SPRING//D//logo512.png');
/*!40000 ALTER TABLE `patient_registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_timeline`
--

DROP TABLE IF EXISTS `patient_timeline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_timeline` (
  `id` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `patient_id` int NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `timeline_date` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_timeline`
--

LOCK TABLES `patient_timeline` WRITE;
/*!40000 ALTER TABLE `patient_timeline` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_timeline` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `id` int NOT NULL,
  `balance_amount` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `paid_amount` float NOT NULL,
  `patient_id` int NOT NULL,
  `payment_mode` varchar(255) DEFAULT NULL,
  `total_amount` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_settings`
--

DROP TABLE IF EXISTS `payment_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_settings` (
  `id` int NOT NULL,
  `account_no` varchar(255) DEFAULT NULL,
  `api_email` varchar(255) DEFAULT NULL,
  `api_password` varchar(255) DEFAULT NULL,
  `api_publishable_key` varchar(255) DEFAULT NULL,
  `api_secret_key` varchar(255) DEFAULT NULL,
  `api_signature` varchar(255) DEFAULT NULL,
  `api_username` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `payment_type` varchar(255) DEFAULT NULL,
  `paypal_demo` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_settings`
--

LOCK TABLES `payment_settings` WRITE;
/*!40000 ALTER TABLE `payment_settings` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment_settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payslip_allowance`
--

DROP TABLE IF EXISTS `payslip_allowance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payslip_allowance` (
  `id` int NOT NULL,
  `allowance_type` varchar(255) DEFAULT NULL,
  `amount` int NOT NULL,
  `cal_type` varchar(255) DEFAULT NULL,
  `payslip_id` int NOT NULL,
  `staff_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payslip_allowance`
--

LOCK TABLES `payslip_allowance` WRITE;
/*!40000 ALTER TABLE `payslip_allowance` DISABLE KEYS */;
/*!40000 ALTER TABLE `payslip_allowance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permission_category`
--

DROP TABLE IF EXISTS `permission_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permission_category` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `enable_add` int NOT NULL,
  `enable_delete` int NOT NULL,
  `enable_edit` int NOT NULL,
  `enable_view` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `perm_group_id` int NOT NULL,
  `short_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission_category`
--

LOCK TABLES `permission_category` WRITE;
/*!40000 ALTER TABLE `permission_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `permission_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permission_group`
--

DROP TABLE IF EXISTS `permission_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permission_group` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `short_code` varchar(255) DEFAULT NULL,
  `sort_order` int NOT NULL,
  `system` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission_group`
--

LOCK TABLES `permission_group` WRITE;
/*!40000 ALTER TABLE `permission_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `permission_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pharmacy`
--

DROP TABLE IF EXISTS `pharmacy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pharmacy` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `medicine_category_id` int NOT NULL,
  `medicine_company` varchar(255) DEFAULT NULL,
  `medicine_composition` varchar(255) DEFAULT NULL,
  `medicine_group` varchar(255) DEFAULT NULL,
  `medicine_image` varchar(255) DEFAULT NULL,
  `medicine_name` varchar(255) DEFAULT NULL,
  `min_level` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `reorder_level` varchar(255) DEFAULT NULL,
  `supplier` varchar(255) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `unit_packing` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  `vat` varchar(255) DEFAULT NULL,
  `vat_ac` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pharmacy`
--

LOCK TABLES `pharmacy` WRITE;
/*!40000 ALTER TABLE `pharmacy` DISABLE KEYS */;
INSERT INTO `pharmacy` VALUES (838,NULL,799,'mycomp','mycomp','sd','','Demo','3','s',NULL,NULL,'3',NULL,NULL,'3','3'),(855,NULL,800,'asdf','asdfg','asdfgh','','demo2','123','asdf',NULL,NULL,'23',NULL,NULL,'12','12');
/*!40000 ALTER TABLE `pharmacy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pharmacy_bill_basic`
--

DROP TABLE IF EXISTS `pharmacy_bill_basic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pharmacy_bill_basic` (
  `id` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `discount` float NOT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  `netamount` float NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  `tax` float NOT NULL,
  `total` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pharmacy_bill_basic`
--

LOCK TABLES `pharmacy_bill_basic` WRITE;
/*!40000 ALTER TABLE `pharmacy_bill_basic` DISABLE KEYS */;
INSERT INTO `pharmacy_bill_basic` VALUES (864,'2020-03-19T08:52:32.491Z',0,'STAFFID-20200314085655','Pramod',20,'22','USER-20200306125258','Revan',0,20),(866,'2020-03-19T09:55:06.472Z',1,'STAFFID-20200314085655','Pramod',2000,'222','USER-20200306125513','Arun',1,20),(873,'2020-03-20T06:09:53.803Z',0,'STAFFID-20200314085655','Pramod',20,'asdf','USER-20200306125258','Revan',0,20),(882,'2020-03-20T12:50:21.234Z',0,'STAFFID-20200314085655','Pramod',20,'sdfg','USER-20200306125258','Revan',0,20),(884,'2020-03-20T12:50:21.234Z',0,'STAFFID-20200314085655','Pramod',2000,'sdfg','USER-20200306125258','Revan',0,2000),(886,'2020-03-20T12:50:21.234Z',0,'STAFFID-20200314085655','Pramod',2000,'sdfg','USER-20200306125258','Revan',0,2000),(888,'2020-03-20T13:04:45.830Z',0,'','',200,'','',NULL,0,200),(890,'2020-03-20T13:04:45.830Z',0,'','',200,'','',NULL,0,200),(892,'2020-03-20T13:04:45.830Z',0,'','',200,'','',NULL,0,200),(894,'2020-03-20T13:04:45.830Z',0,'','',200,'','',NULL,0,200),(896,'2020-03-20T13:24:51.275Z',0,'','',10,'','USER-20200306125258','Revan',0,10),(898,'2020-03-20T13:24:51.275Z',0,'','',-1000,'','USER-20200306125258','Revan',0,-1000),(900,'2020-03-20T13:24:51.275Z',0,'STAFFID-20200314085655','Pramod',3960,'','USER-20200306125258','Revan',0,3960),(912,'2020-04-24T13:31:33.186Z',0,'STAFFID-20200314085655','Pramod',300,'','USER-20200306125258','Revan',0,300),(1192,'2020-04-22T07:25:53.547Z',0,'doctor-20200407165934PM','Pramod Shhelvanth',100,'jgjg','pat-20200410115726AM','demo',0,100),(1284,'2020-05-08T15:00:06.808Z',0,'doctor-20200407165934PM','Pramod Shhelvanth',1000,'','USER-20200306125258','Revan',0,1000),(1286,'2020-05-08T15:02:17.950Z',0,'doctor-20200407165934PM','Pramod Shhelvanth',1000,'','USER-20200306125258','Revan',0,1000);
/*!40000 ALTER TABLE `pharmacy_bill_basic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pharmacy_bill_details`
--

DROP TABLE IF EXISTS `pharmacy_bill_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pharmacy_bill_details` (
  `id` int NOT NULL,
  `amount` float NOT NULL,
  `batch_num` varchar(255) DEFAULT NULL,
  `expiry_date` varchar(255) DEFAULT NULL,
  `medicine_category` varchar(255) DEFAULT NULL,
  `medicine_category_id` int NOT NULL,
  `medicine_name` varchar(255) DEFAULT NULL,
  `pharmacy_id` int NOT NULL,
  `quantity` float NOT NULL,
  `saleprice` float NOT NULL,
  `pid` int NOT NULL,
  `medicine_batch` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKe1fwojj2y7dqgn9sw13ey58n2` (`pid`),
  CONSTRAINT `FKe1fwojj2y7dqgn9sw13ey58n2` FOREIGN KEY (`pid`) REFERENCES `pharmacy_bill_basic` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pharmacy_bill_details`
--

LOCK TABLES `pharmacy_bill_details` WRITE;
/*!40000 ALTER TABLE `pharmacy_bill_details` DISABLE KEYS */;
INSERT INTO `pharmacy_bill_details` VALUES (865,20,'852','2020-03-26T18:30:00.000Z','test',799,'Demo',838,2,10,864,0),(867,20,'852','2020-03-26T18:30:00.000Z','test',799,'Demo',838,2,10,866,0),(874,20,'852','2020-03-26T18:30:00.000Z','test',799,'Demo',838,2,10,873,0),(883,20,'852','2020-03-26T18:30:00.000Z','test',799,'Demo',838,2,10,882,0),(885,2000,'869','2020-03-26T18:30:00.000Z','test',799,'Demo',838,100,20,884,0),(887,2000,'869','2020-03-26T18:30:00.000Z','test',799,'Demo',838,100,20,886,0),(889,200,'869','2020-03-26T18:30:00.000Z','test',799,'Demo',838,10,20,888,0),(891,200,'869','2020-03-26T18:30:00.000Z','test',799,'Demo',838,10,20,890,0),(893,200,'869','2020-03-26T18:30:00.000Z','test',799,'Demo',838,10,20,892,0),(895,200,'869','2020-03-26T18:30:00.000Z','test',799,'Demo',838,10,20,894,0),(897,10,'852','2020-03-26T18:30:00.000Z','test',799,'Demo',838,1,10,896,852),(899,-1000,'852','2020-03-26T18:30:00.000Z','test',799,'Demo',838,-100,10,898,852),(901,3960,'869','2020-03-26T18:30:00.000Z','test',799,'Demo',838,198,20,900,869),(913,300,'872','2020-04-02T18:30:00.000Z','test',800,'demo2',855,10,30,912,872),(1193,100,'1191','2020-05-01T18:30:00.000Z','test',800,'demo2',855,2,50,1192,1191),(1285,1000,'1281','2020-06-05T18:30:00.000Z','test',800,'demo2',855,10,100,1284,1281),(1287,1000,'1281','2020-06-05T18:30:00.000Z','test',800,'demo2',855,10,100,1286,1281);
/*!40000 ALTER TABLE `pharmacy_bill_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `Batchstock` AFTER INSERT ON `pharmacy_bill_details` FOR EACH ROW UPDATE hospital_management.medicine_batch_details SET medicine_batch_details.available_quantity=medicine_batch_details.available_quantity-NEW.quantity WHERE medicine_batch_details.id=NEW.medicine_batch */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `phone_call_log_list`
--

DROP TABLE IF EXISTS `phone_call_log_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phone_call_log_list` (
  `id` int NOT NULL,
  `call_duretion` varchar(255) DEFAULT NULL,
  `call_type` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `next_fallow_up_date` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phone_call_log_list`
--

LOCK TABLES `phone_call_log_list` WRITE;
/*!40000 ALTER TABLE `phone_call_log_list` DISABLE KEYS */;
INSERT INTO `phone_call_log_list` VALUES (135,'50','incomingCall','2020-02-24T18:30:00.000Z','','Paramsheelvant','2020-02-26T18:30:00.000Z','sdfghj','1234567899'),(490,'8','incomingCall','2020-02-26T18:30:00.000Z','bjnm,m ','yuoi','2020-02-26T18:30:00.000Z','bhjbmn','46565651321012'),(491,'8','incomingCall','2020-02-26T18:30:00.000Z','bjnm,m ','yuoi','2020-02-26T18:30:00.000Z','bhjbmn','46565651321012'),(774,'asdfgh','incomingCall','2020-03-18T18:30:00.000Z','asdfghjkjhgfd','sdfghj','2020-03-13T18:30:00.000Z','asdfgh','1234567890');
/*!40000 ALTER TABLE `phone_call_log_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `postal_dis_patch_list`
--

DROP TABLE IF EXISTS `postal_dis_patch_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `postal_dis_patch_list` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `from_title` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `reference_no` varchar(255) DEFAULT NULL,
  `to_title` varchar(255) DEFAULT NULL,
  `attachd_document` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postal_dis_patch_list`
--

LOCK TABLES `postal_dis_patch_list` WRITE;
/*!40000 ALTER TABLE `postal_dis_patch_list` DISABLE KEYS */;
INSERT INTO `postal_dis_patch_list` VALUES (705,'Ayodhya','2020-02-10T18:30:00.000Z','gff','ramayana ghjkl','1','raama','uploads/WIN_20200224_16_14_39_Pro.jpg'),(1047,'Ayodhya','2020-02-10T18:30:00.000Z','gff','ramayana ghjkl','1','raama','uploads/WIN_20200224_16_14_39_Pro.jpg');
/*!40000 ALTER TABLE `postal_dis_patch_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `postal_recieve_list`
--

DROP TABLE IF EXISTS `postal_recieve_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `postal_recieve_list` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `attachdocument` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `from_title` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `reference_no` varchar(255) DEFAULT NULL,
  `to_title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postal_recieve_list`
--

LOCK TABLES `postal_recieve_list` WRITE;
/*!40000 ALTER TABLE `postal_recieve_list` DISABLE KEYS */;
INSERT INTO `postal_recieve_list` VALUES (764,'fff',NULL,'Mon Feb 03 2020 00:00:00 GMT+0530 (India Standard Time)','werty yuu','ff','54','dfg'),(775,'1234567','//home//madarsha//Desktop//D//database.sql','Thu Mar 26 2020 00:00:00 GMT+0530 (India Standard Time)','asdfgh','1234567','1234567','123456');
/*!40000 ALTER TABLE `postal_recieve_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescription` (
  `id` int NOT NULL,
  `footer` varchar(255) DEFAULT NULL,
  `header` varchar(255) DEFAULT NULL,
  `opd_id` varchar(255) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription`
--

LOCK TABLES `prescription` WRITE;
/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` VALUES (582,'rrrrrrrrrrrrrrr','pppppppppppppppp','opd123',NULL),(604,'footer','header',NULL,NULL),(605,'fsshd','header','OPDID-20200306012857',NULL),(610,'fsfsf','header','OPDID-20200306030448',NULL),(621,'sdfgh','Header','OPDID-20200306012908',NULL),(626,'dfgf','header','OPDID-20200306051002',NULL),(630,'hkhkhk uukhg','ukjlk','OPDID-20200306054422',NULL),(658,'asdfgh','sdf','IPDID-20200309034621',NULL),(661,'sdfghj','asdfg','IPDID-20200309041736','2020-03-09 16:18:41.908000'),(695,'asdfgh','sdfgh','IPDID-20200309055959','2020-03-10 11:01:13.955000'),(699,'asdfg','qwerty','IPDID-20200309041736','2020-03-10 11:14:42.278000'),(721,'sdfgh','asdfghn','OPDID-20200306051002','2020-03-10 16:45:00.479000');
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `print_setting`
--

DROP TABLE IF EXISTS `print_setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `print_setting` (
  `id` int NOT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `print_footer` varchar(255) DEFAULT NULL,
  `print_header` varchar(255) DEFAULT NULL,
  `setting_for` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `print_setting`
--

LOCK TABLES `print_setting` WRITE;
/*!40000 ALTER TABLE `print_setting` DISABLE KEYS */;
/*!40000 ALTER TABLE `print_setting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_medician`
--

DROP TABLE IF EXISTS `purchase_medician`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase_medician` (
  `id` int NOT NULL,
  `mrp` float NOT NULL,
  `amount` float NOT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `batch_amount` float NOT NULL,
  `batch_no` int NOT NULL,
  `discount` float NOT NULL,
  `expire_date` varchar(255) DEFAULT NULL,
  `medician_category` varchar(255) DEFAULT NULL,
  `medician_name` varchar(255) DEFAULT NULL,
  `net_amount` float NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `packaging_price` varchar(255) DEFAULT NULL,
  `packaging_qty` varchar(255) DEFAULT NULL,
  `quentity` varchar(255) DEFAULT NULL,
  `sale_price` float NOT NULL,
  `tax` float NOT NULL,
  `total` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_medician`
--

LOCK TABLES `purchase_medician` WRITE;
/*!40000 ALTER TABLE `purchase_medician` DISABLE KEYS */;
INSERT INTO `purchase_medician` VALUES (53,888,10000900,'//home//madarsha//Desktop//SPRING//download.jpeg',10000,9,10,'cal02-02-2020ciam','d','dolo650mg',10000,'dfghjk','45','10000','gggg',7000,100,70000000),(54,888,10000900,'//home//madarsha//Desktop//SPRING//download.jpeg',10000,9,10,'cal02-02-2020ciam','d','dolo650mg',10000,'dfghjk','45','10000','gggg',7000,100,70000000),(55,888,10000900,'//home//madarsha//Desktop//SPRING//download.jpeg',10000,9,10,'cal02-02-2020ciam','d','dolo650mg',10000,'dfghjk','45','10000','gggg',7000,100,70000000),(56,888,10000900,'//home//madarsha//Desktop//SPRING//download.jpeg',10000,9,10,'cal02-02-2020ciam','d','dolo650mg',10000,'dfghjk','45','10000','gggg',7000,100,70000000);
/*!40000 ALTER TABLE `purchase_medician` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_medicine_modal`
--

DROP TABLE IF EXISTS `purchase_medicine_modal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase_medicine_modal` (
  `id` int NOT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `discount` float NOT NULL,
  `netamount` float NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `supplier_id` varchar(255) DEFAULT NULL,
  `tax` float NOT NULL,
  `total` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_medicine_modal`
--

LOCK TABLES `purchase_medicine_modal` WRITE;
/*!40000 ALTER TABLE `purchase_medicine_modal` DISABLE KEYS */;
INSERT INTO `purchase_medicine_modal` VALUES (827,'','Wed Mar 18 2020 13:15:41 GMT+0530 (India Standard Time)',0,0,'','',0,0),(828,'','Wed Mar 18 2020 13:15:41 GMT+0530 (India Standard Time)',0,0,'','',0,0),(829,'','Wed Mar 18 2020 13:15:41 GMT+0530 (India Standard Time)',0,0,'','',0,0),(830,'','Wed Mar 18 2020 13:15:41 GMT+0530 (India Standard Time)',0,0,'','',0,0),(1280,'','2020-05-08T14:57:24.614Z',0,200,'','796',0,200),(1282,'','2020-05-08T14:59:18.591Z',0,2000,'','796',0,2000);
/*!40000 ALTER TABLE `purchase_medicine_modal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purpose`
--

DROP TABLE IF EXISTS `purpose`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purpose` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purpose`
--

LOCK TABLES `purpose` WRITE;
/*!40000 ALTER TABLE `purpose` DISABLE KEYS */;
INSERT INTO `purpose` VALUES (1032,'desc','visit');
/*!40000 ALTER TABLE `purpose` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `radiology`
--

DROP TABLE IF EXISTS `radiology`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `radiology` (
  `id` int NOT NULL,
  `category` int NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `report_days` int NOT NULL,
  `short_name` varchar(255) DEFAULT NULL,
  `standard_charge` float NOT NULL,
  `sub_category` varchar(255) DEFAULT NULL,
  `test_name` varchar(255) DEFAULT NULL,
  `test_type` varchar(255) DEFAULT NULL,
  `unit` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `radiology`
--

LOCK TABLES `radiology` WRITE;
/*!40000 ALTER TABLE `radiology` DISABLE KEYS */;
INSERT INTO `radiology` VALUES (1223,1221,'hdhdh','120','40',25,'hghghg',100,'30','hghgh','jhjhj',20);
/*!40000 ALTER TABLE `radiology` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `radiology_category`
--

DROP TABLE IF EXISTS `radiology_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `radiology_category` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `radiology_category`
--

LOCK TABLES `radiology_category` WRITE;
/*!40000 ALTER TABLE `radiology_category` DISABLE KEYS */;
INSERT INTO `radiology_category` VALUES (1221,'fgfg'),(1222,'fgfghfhfh');
/*!40000 ALTER TABLE `radiology_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `radiology_patient`
--

DROP TABLE IF EXISTS `radiology_patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `radiology_patient` (
  `id` int NOT NULL,
  `applied_charge` float NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `radiology_id` int NOT NULL,
  `standard_charge` float NOT NULL,
  `test_report` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `radiology_patient`
--

LOCK TABLES `radiology_patient` WRITE;
/*!40000 ALTER TABLE `radiology_patient` DISABLE KEYS */;
INSERT INTO `radiology_patient` VALUES (1224,100,'hdhdh','120','2020-05-27','hghgh','doctor-20200407165934PM','pat-20200410115726AM',1223,100,'');
/*!40000 ALTER TABLE `radiology_patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `read_notification`
--

DROP TABLE IF EXISTS `read_notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `read_notification` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `notification_id` int NOT NULL,
  `parent_id` int NOT NULL,
  `staff_id` int NOT NULL,
  `student_id` int NOT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `read_notification`
--

LOCK TABLES `read_notification` WRITE;
/*!40000 ALTER TABLE `read_notification` DISABLE KEYS */;
/*!40000 ALTER TABLE `read_notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recieption`
--

DROP TABLE IF EXISTS `recieption`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recieption` (
  `id` varchar(255) NOT NULL,
  `address_line2` varchar(255) DEFAULT NULL,
  `addressline1` varchar(255) DEFAULT NULL,
  `expenducture` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recieption`
--

LOCK TABLES `recieption` WRITE;
/*!40000 ALTER TABLE `recieption` DISABLE KEYS */;
/*!40000 ALTER TABLE `recieption` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reciptionist_profile`
--

DROP TABLE IF EXISTS `reciptionist_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reciptionist_profile` (
  `id` int NOT NULL,
  `basic_salary` float NOT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `cotract_type` varchar(255) DEFAULT NULL,
  `current_address` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `date_of_joining` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `designetion` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `emergency_contact_no` varchar(255) DEFAULT NULL,
  `epf_no` int NOT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `marital_status` varchar(255) DEFAULT NULL,
  `mother_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `permnent_address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `quelification` varchar(255) DEFAULT NULL,
  `reciptionist_profile` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `specilization` varchar(255) DEFAULT NULL,
  `staff_id` varchar(255) DEFAULT NULL,
  `work_experience` varchar(255) DEFAULT NULL,
  `work_shift` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reciptionist_profile`
--

LOCK TABLES `reciptionist_profile` WRITE;
/*!40000 ALTER TABLE `reciptionist_profile` DISABLE KEYS */;
/*!40000 ALTER TABLE `reciptionist_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rediology`
--

DROP TABLE IF EXISTS `rediology`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rediology` (
  `radiology_id` varchar(255) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `category_name` varchar(255) DEFAULT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `charge_id` int NOT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `report_days` varchar(255) DEFAULT NULL,
  `short_name` varchar(255) DEFAULT NULL,
  `standard_charge` varchar(255) DEFAULT NULL,
  `sub_category` varchar(255) DEFAULT NULL,
  `test_name` varchar(255) DEFAULT NULL,
  `test_type` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`radiology_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rediology`
--

LOCK TABLES `rediology` WRITE;
/*!40000 ALTER TABLE `rediology` DISABLE KEYS */;
/*!40000 ALTER TABLE `rediology` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` int NOT NULL,
  `is_superadmin` int NOT NULL,
  `is_system` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles_permissions`
--

DROP TABLE IF EXISTS `roles_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles_permissions` (
  `id` int NOT NULL,
  `can_add` int NOT NULL,
  `can_delete` int NOT NULL,
  `can_edit` int NOT NULL,
  `can_view` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `perm_cat_id` int NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles_permissions`
--

LOCK TABLES `roles_permissions` WRITE;
/*!40000 ALTER TABLE `roles_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sch_settings`
--

DROP TABLE IF EXISTS `sch_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sch_settings` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `class_teacher` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `credit_limit` varchar(255) DEFAULT NULL,
  `cron_secret_key` varchar(255) DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `currency_symbol` varchar(255) DEFAULT NULL,
  `date_format` varchar(255) DEFAULT NULL,
  `dise_code` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fee_due_days` int NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `is_rtl` varchar(255) DEFAULT NULL,
  `lang_id` int NOT NULL,
  `mini_logo` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `opd_record_month` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `session_id` int NOT NULL,
  `start_month` varchar(255) DEFAULT NULL,
  `theme` varchar(255) DEFAULT NULL,
  `time_format` varchar(255) DEFAULT NULL,
  `timezone` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sch_settings`
--

LOCK TABLES `sch_settings` WRITE;
/*!40000 ALTER TABLE `sch_settings` DISABLE KEYS */;
/*!40000 ALTER TABLE `sch_settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule_list`
--

DROP TABLE IF EXISTS `schedule_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule_list` (
  `id` int NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `day` varchar(255) DEFAULT NULL,
  `end_time` varchar(255) DEFAULT NULL,
  `per_patient_time` varchar(255) DEFAULT NULL,
  `slno` varchar(255) DEFAULT NULL,
  `start_time` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `doctor_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule_list`
--

LOCK TABLES `schedule_list` WRITE;
/*!40000 ALTER TABLE `schedule_list` DISABLE KEYS */;
INSERT INTO `schedule_list` VALUES (738,'','Tueday','2020-03-11T12:30:00.087Z','55',NULL,'2020-03-11T12:30:00.166Z','inactive','','P-20200212115220',''),(787,'','Tueday','2020-03-14T04:30:00.294Z','15',NULL,'2020-03-14T04:15:00.554Z','active','','STAFFID-20200314085655',''),(788,'','Monday','2020-03-14T05:15:00.904Z','456',NULL,'2020-03-14T05:00:00.416Z','active','','STAFFID-20200314085655',''),(906,NULL,'Friday','2020-03-22T11:45:00.867Z',NULL,NULL,'2020-03-22T11:30:00.780Z','inactive',NULL,NULL,NULL),(907,NULL,'Monday','2020-03-22T11:45:00.825Z','45',NULL,'2020-03-22T11:45:00.489Z','active',NULL,'STAFFID-20200314085655',NULL),(908,'','Monday','2020-03-22T12:00:00.335Z','55',NULL,'2020-03-22T12:00:00.703Z','inactive','','STAFFID-20200314085655',''),(1293,'','Tueday','2020-05-09T14:30:00.470Z','2',NULL,'2020-05-09T14:00:00.627Z','active','','doctor-20200407165934PM',''),(1294,'','Tueday','2020-05-09T14:30:00.470Z','3887',NULL,'2020-05-09T14:00:00.627Z','active','','doctor-20200407165934PM','');
/*!40000 ALTER TABLE `schedule_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `send_email`
--

DROP TABLE IF EXISTS `send_email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `send_email` (
  `id` int NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  `send_email` bit(1) NOT NULL,
  `send_sms` bit(1) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `send_email`
--

LOCK TABLES `send_email` WRITE;
/*!40000 ALTER TABLE `send_email` DISABLE KEYS */;
INSERT INTO `send_email` VALUES (1314,'dddd',_binary '',_binary '\0','dddd'),(1315,'ffffdfd',_binary '',_binary '','fff');
/*!40000 ALTER TABLE `send_email` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `send_email_to`
--

DROP TABLE IF EXISTS `send_email_to`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `send_email_to` (
  `id` int NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  `mymessage_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKda2w6vqbhrhtm9d02bo6ed3es` (`mymessage_id`),
  CONSTRAINT `FKda2w6vqbhrhtm9d02bo6ed3es` FOREIGN KEY (`mymessage_id`) REFERENCES `send_email` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `send_email_to`
--

LOCK TABLES `send_email_to` WRITE;
/*!40000 ALTER TABLE `send_email_to` DISABLE KEYS */;
INSERT INTO `send_email_to` VALUES (1316,'admin',1315),(1317,'pathologist',1315),(1318,'receptionist',1315);
/*!40000 ALTER TABLE `send_email_to` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `send_notification`
--

DROP TABLE IF EXISTS `send_notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `send_notification` (
  `id` int NOT NULL,
  `created_at` date DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_id` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `publish_date` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  `visible_parent` varchar(255) DEFAULT NULL,
  `visible_staff` varchar(255) DEFAULT NULL,
  `visible_student` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `send_notification`
--

LOCK TABLES `send_notification` WRITE;
/*!40000 ALTER TABLE `send_notification` DISABLE KEYS */;
/*!40000 ALTER TABLE `send_notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setting_charges`
--

DROP TABLE IF EXISTS `setting_charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setting_charges` (
  `id` int NOT NULL,
  `charge_category` varchar(255) DEFAULT NULL,
  `charge_type` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `standard_charge` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setting_charges`
--

LOCK TABLES `setting_charges` WRITE;
/*!40000 ALTER TABLE `setting_charges` DISABLE KEYS */;
INSERT INTO `setting_charges` VALUES (1101,'ww','Procedures','124','fdf','44'),(1106,'ww','Procedures','5758','tyt','500'),(1201,'hdhdh','Investigations','120','fdfd','100'),(1208,'hdhdh','Investigations','252','hfhf','100'),(1227,'ot1','Operation Theatre','124','gfhfhjf','500'),(1232,'ot2','Operation Theatre','124','gfhfhjf','500'),(1237,'ot2','Operation Theatre','123','gfhfhjf','50');
/*!40000 ALTER TABLE `setting_charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sms_config`
--

DROP TABLE IF EXISTS `sms_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sms_config` (
  `id` int NOT NULL,
  `api_id` varchar(255) DEFAULT NULL,
  `authkey` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `senderid` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sms_config`
--

LOCK TABLES `sms_config` WRITE;
/*!40000 ALTER TABLE `sms_config` DISABLE KEYS */;
/*!40000 ALTER TABLE `sms_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `source`
--

DROP TABLE IF EXISTS `source`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `source` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `source`
--

LOCK TABLES `source` WRITE;
/*!40000 ALTER TABLE `source` DISABLE KEYS */;
INSERT INTO `source` VALUES (1040,'sor','source'),(1041,'ss','ss');
/*!40000 ALTER TABLE `source` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `id` int NOT NULL,
  `specialization` varchar(255) DEFAULT NULL,
  `account_number` varchar(255) DEFAULT NULL,
  `account_title` varchar(255) DEFAULT NULL,
  `bank_branch_name` varchar(255) DEFAULT NULL,
  `bank_name` varchar(255) DEFAULT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `current_addrees` varchar(255) DEFAULT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `date_of_joining` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `ifsc_code` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `marital_status` varchar(255) DEFAULT NULL,
  `mother_name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `permnent_address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `staff_id` varchar(255) DEFAULT NULL,
  `work_experiance` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (755,'dfrtgyu','sdfg','rt','dfgh','dfgh','A+','dfgh','Thu Mar 12 2020 16:59:56 GMT+0530 (India Standard Time)','Fri Mar 20 2020 00:00:00 GMT+0530 (India Standard Time)','opd','accountant','2345678','dfghj','sdfghj','Female','23','dfghj','Married','fghjk','dfgh','dfghj','1234567','//home//madarsha//Desktop//D//Myresume.docx','er567','admin','STAFFID-20200312050240','dfghj'),(756,'dfrtgyu','sdfg','rt','dfgh','dfgh','A+','dfgh','Thu Mar 12 2020 16:59:56 GMT+0530 (India Standard Time)','Fri Mar 20 2020 00:00:00 GMT+0530 (India Standard Time)','opd','accountant','2345678','dfghj','sdfghj','Female','23','dfghj','Married','fghjk','dfgh','dfghj','1234567','//home//madarsha//Desktop//D//Myresume.docx','er567','admin','STAFFID-20200312050312','dfghj'),(757,'kjklm,','456212413','hjhk,','jhgkjmhm','jghkjkn','O+','uioljlkjlkj452131','Mon Feb 03 2020 00:00:00 GMT+0530 (India Standard Time)','Sun Mar 01 2020 00:00:00 GMT+0530 (India Standard Time)','reception','receptionist','revanhj1993@gmail.com','hjkjlk','naga','Male','kjlk2521','jhjkj','Single','jlkl','nkjklkm','gfhjhjjh2121','4521211231','//home//madarsha//Desktop//D//database.sql','guhk','receptionist','STAFFID-20200312060310','kjkll.m'),(781,'asdfgh','asdfghj','asdfghj','asdfgh','asdfgh','O+','asdfghj','Thu Mar 07 2030 00:00:00 GMT+0530 (India Standard Time)','Wed Mar 18 2020 00:00:00 GMT+0530 (India Standard Time)','docter','doctor','pramodsheelvant@gmail.com','asdfg','Pramod','Male','asdfghj','Sheelvant','Widowed','asdfgh','asdfg','asdfghj','1234567890','/chrome.dll.sig','asdfgh','doctor','STAFFID-20200314082454','asdfg'),(783,'asdfgh','asdfghj','asdfghj','asdfgh','asdfgh','O+','asdfghj','Thu Mar 07 2030 00:00:00 GMT+0530 (India Standard Time)','Wed Mar 18 2020 00:00:00 GMT+0530 (India Standard Time)','docter','doctor','pramodsheelvant@gmail.com','asdfg','Pramod','Male','asdfghj','Sheelvant','Widowed','asdfgh','asdfg','asdfghj','1234567890','/chrome.dll.sig','asdfgh','doctor','STAFFID-20200314082727','asdfg'),(785,'asdfg','234567','asdfg','asdfg','sdfghj','A+','asdfgh','Thu Mar 19 2020 00:00:00 GMT+0530 (India Standard Time)','Thu Mar 19 2020 00:00:00 GMT+0530 (India Standard Time)','docter','doctor','raam@gmail.com','dfg','Pramod','Male','sdfghj','Sheelvant','Single','sdfg','asdfg','asdfg','1234567890','/database.sql','sdfgh','doctor','STAFFID-20200314085655','sdfgh'),(789,'asdf','dfghj','dfgh','sdfg','sdfgh','A+','asdf','Wed Mar 11 2020 00:00:00 GMT+0530 (India Standard Time)','Fri Mar 27 2020 00:00:00 GMT+0530 (India Standard Time)','reception','receptionist','recep@gmail.com','sdfgh','sadfg','Male','dfgh','sdfgh','Married','asdfg','asdf','sadf','3456789456','/database.sql','sdfg','receptionist','STAFFID-20200314104045','asdf'),(902,'asdfg','asdfg','asdf','cdrtgnkiy','asdfg','A+','asdf','Thu Jan 14 2010 00:00:00 GMT+0530 (India Standard Time)','Sat Mar 21 2020 00:00:00 GMT+0530 (India Standard Time)','pharmacy','pharmacist','Ravan@gmail.com','Dasaratha','Rama','Male','345tfg','Sita','Single','koushalya','asdf','asdfg','9874563210','/WIN_20200224_16_14_39_Pro.jpg','asdf','pharmacist','STAFFID-20200320070613','asdfg');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_attendance`
--

DROP TABLE IF EXISTS `staff_attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_attendance` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `is_active` int NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `staff_attendance_type_id` int NOT NULL,
  `staff_id` int NOT NULL,
  `updated_at` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_attendance`
--

LOCK TABLES `staff_attendance` WRITE;
/*!40000 ALTER TABLE `staff_attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_attendance_type`
--

DROP TABLE IF EXISTS `staff_attendance_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_attendance_type` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `key_value` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_attendance_type`
--

LOCK TABLES `staff_attendance_type` WRITE;
/*!40000 ALTER TABLE `staff_attendance_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_attendance_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_designation`
--

DROP TABLE IF EXISTS `staff_designation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_designation` (
  `id` int NOT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_designation`
--

LOCK TABLES `staff_designation` WRITE;
/*!40000 ALTER TABLE `staff_designation` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_designation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_leave`
--

DROP TABLE IF EXISTS `staff_leave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_leave` (
  `id` int NOT NULL,
  `apply_date` varchar(255) DEFAULT NULL,
  `attach_document` varchar(255) DEFAULT NULL,
  `from_date` varchar(255) DEFAULT NULL,
  `leave_type_id` int NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `staff_id` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `to_date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_leave`
--

LOCK TABLES `staff_leave` WRITE;
/*!40000 ALTER TABLE `staff_leave` DISABLE KEYS */;
INSERT INTO `staff_leave` VALUES (1011,'Wed Apr 22 2020 00:00:00 GMT+0530 (India Standard Time)','uploads/WIN_20200224_16_14_39_Pro.jpg','Thu Apr 16 2020 00:00:00 GMT+0530 (India Standard Time)',0,NULL,'ff','admin','staff-20200402185205PM',NULL,'Thu Apr 16 2020 00:00:00 GMT+0530 (India Standard Time)'),(1012,'Thu Apr 23 2020 00:00:00 GMT+0530 (India Standard Time)','','Thu Apr 16 2020 00:00:00 GMT+0530 (India Standard Time)',935,NULL,'dsfds','admin','staff-20200402185205PM','pending','Wed Apr 15 2020 00:00:00 GMT+0530 (India Standard Time)'),(1019,'Thu Apr 23 2020 00:00:00 GMT+0530 (India Standard Time)','uploads/WIN_20200224_16_14_39_Pro.jpg','Thu Apr 09 2020 00:00:00 GMT+0530 (India Standard Time)',1010,'null','eee','admin',NULL,'disapprove','Thu Apr 16 2020 00:00:00 GMT+0530 (India Standard Time)'),(1021,'Sat Apr 04 2020 00:00:00 GMT+0530 (India Standard Time)','','Fri Apr 24 2020 00:00:00 GMT+0530 (India Standard Time)',935,'null','','admin','doctor-20200404173803PM','disapprove','Thu Apr 30 2020 00:00:00 GMT+0530 (India Standard Time)');
/*!40000 ALTER TABLE `staff_leave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_leave_details`
--

DROP TABLE IF EXISTS `staff_leave_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_leave_details` (
  `id` int NOT NULL,
  `alloted_ieave` varchar(255) DEFAULT NULL,
  `leave_iype_id` int NOT NULL,
  `staff_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_leave_details`
--

LOCK TABLES `staff_leave_details` WRITE;
/*!40000 ALTER TABLE `staff_leave_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_leave_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_leave_request`
--

DROP TABLE IF EXISTS `staff_leave_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_leave_request` (
  `id` int NOT NULL,
  `admin_remark` varchar(255) DEFAULT NULL,
  `applied_by` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `document_file` varchar(255) DEFAULT NULL,
  `employee_remark` varchar(255) DEFAULT NULL,
  `leave_days` int NOT NULL,
  `leave_from` varchar(255) DEFAULT NULL,
  `leave_to` varchar(255) DEFAULT NULL,
  `leave_type_id` int NOT NULL,
  `staff_id` int NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_leave_request`
--

LOCK TABLES `staff_leave_request` WRITE;
/*!40000 ALTER TABLE `staff_leave_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_leave_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_payroll`
--

DROP TABLE IF EXISTS `staff_payroll`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_payroll` (
  `id` int NOT NULL,
  `basic_salary` int NOT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `pay_scale` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_payroll`
--

LOCK TABLES `staff_payroll` WRITE;
/*!40000 ALTER TABLE `staff_payroll` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_payroll` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_payslip`
--

DROP TABLE IF EXISTS `staff_payslip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_payslip` (
  `id` int NOT NULL,
  `basic` int NOT NULL,
  `leave_deduction` int NOT NULL,
  `month` varchar(255) DEFAULT NULL,
  `net_salary` float NOT NULL,
  `payment_date` varchar(255) DEFAULT NULL,
  `payment_mode` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `staff_id` int NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tax` varchar(255) DEFAULT NULL,
  `total_allowance` int NOT NULL,
  `total_deduction` int NOT NULL,
  `year` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_payslip`
--

LOCK TABLES `staff_payslip` WRITE;
/*!40000 ALTER TABLE `staff_payslip` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_payslip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_roles`
--

DROP TABLE IF EXISTS `staff_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_roles` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` int NOT NULL,
  `role_id` int NOT NULL,
  `staff_id` int NOT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_roles`
--

LOCK TABLES `staff_roles` WRITE;
/*!40000 ALTER TABLE `staff_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_timeline`
--

DROP TABLE IF EXISTS `staff_timeline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_timeline` (
  `id` int NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `staff_id` int NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `timeline_date` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_timeline`
--

LOCK TABLES `staff_timeline` WRITE;
/*!40000 ALTER TABLE `staff_timeline` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_timeline` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_type_report`
--

DROP TABLE IF EXISTS `test_type_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_type_report` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `radiology_id` int NOT NULL,
  `reporting_date` varchar(255) DEFAULT NULL,
  `test_name` varchar(255) DEFAULT NULL,
  `test_report` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_type_report`
--

LOCK TABLES `test_type_report` WRITE;
/*!40000 ALTER TABLE `test_type_report` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_type_report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tpa_management`
--

DROP TABLE IF EXISTS `tpa_management`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tpa_management` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `contact_person_name` varchar(255) DEFAULT NULL,
  `contactperson_phone` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tpa_management`
--

LOCK TABLES `tpa_management` WRITE;
/*!40000 ALTER TABLE `tpa_management` DISABLE KEYS */;
/*!40000 ALTER TABLE `tpa_management` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tpa_master`
--

DROP TABLE IF EXISTS `tpa_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tpa_master` (
  `id` int NOT NULL,
  `charge_id` int NOT NULL,
  `organisation` varchar(255) DEFAULT NULL,
  `organisation_charge` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tpa_master`
--

LOCK TABLES `tpa_master` WRITE;
/*!40000 ALTER TABLE `tpa_master` DISABLE KEYS */;
/*!40000 ALTER TABLE `tpa_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tpa_organisation_charges`
--

DROP TABLE IF EXISTS `tpa_organisation_charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tpa_organisation_charges` (
  `id` int NOT NULL,
  `charges` varchar(255) DEFAULT NULL,
  `organisation_id` int NOT NULL,
  `organisation_name` varchar(255) DEFAULT NULL,
  `pid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8bha0apwng6so8vxt0gt9b6yt` (`pid`),
  CONSTRAINT `FK8bha0apwng6so8vxt0gt9b6yt` FOREIGN KEY (`pid`) REFERENCES `setting_charges` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tpa_organisation_charges`
--

LOCK TABLES `tpa_organisation_charges` WRITE;
/*!40000 ALTER TABLE `tpa_organisation_charges` DISABLE KEYS */;
INSERT INTO `tpa_organisation_charges` VALUES (1102,'44',944,'dsds',1101),(1103,'44',945,'uvcvudv',1101),(1104,'44',964,'dsf',1101),(1105,'44',1087,'hdhf',1101),(1107,'500',944,'dsds',1106),(1108,'300',945,'uvcvudv',1106),(1109,'200',964,'dsf',1106),(1110,'100',1087,'hdhf',1106),(1202,'100',944,'dsds',1201),(1203,'100',945,'uvcvudv',1201),(1204,'100',964,'dsf',1201),(1205,'100',1087,'hdhf',1201),(1209,'0',944,'dsds',1208),(1210,'0',945,'uvcvudv',1208),(1211,'0',964,'dsf',1208),(1212,'0',1087,'hdhf',1208),(1228,'500',944,'dsds',1227),(1229,'500',945,'uvcvudv',1227),(1230,'500',964,'dsf',1227),(1231,'500',1087,'hdhf',1227),(1233,'500',944,'dsds',1232),(1234,'500',945,'uvcvudv',1232),(1235,'500',964,'dsf',1232),(1236,'500',1087,'hdhf',1232),(1238,'50',944,'dsds',1237),(1239,'50',945,'uvcvudv',1237),(1240,'50',964,'dsf',1237),(1241,'50',1087,'hdhf',1237);
/*!40000 ALTER TABLE `tpa_organisation_charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_registration`
--

DROP TABLE IF EXISTS `user_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_registration` (
  `id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `signup_date` datetime(6) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_profile` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_registration`
--

LOCK TABLES `user_registration` WRITE;
/*!40000 ALTER TABLE `user_registration` DISABLE KEYS */;
INSERT INTO `user_registration` VALUES (587,'pathologist@gmail.com','9876543210','Revan','12345','pathologist',NULL,'USER-20200306125258',NULL,'male'),(591,'radiologist@gmail.com','8976564356','Uttham','12345','radiologist',NULL,'USER-20200306125416',NULL,'male'),(595,'doctor@gmail.com','8978654798','Pramod Shhelvanth','12345','doctor',NULL,'doctor-20200407165934PM',NULL,'male'),(903,'pharmacist@gmail.com','9874563210','Rama','12345','pharmacist',NULL,'STAFFID-20200320070613',NULL,'Male'),(1058,'raam@gmail.com','4984654115','usdijfdh','pat-1844','patient',NULL,'pat-20200406170925PM',NULL,'Male'),(1065,'hghg@gmail.com','9632587410','ggg','pat99955','patient',NULL,'pat-20200406185521PM',NULL,'Male'),(1083,'patient@gmail.com','9874563210','demo','12345','patient',NULL,'pat-20200410115726AM',NULL,'Male'),(1169,'admin@gmail.com','null','phfh sdfdsf','12345','admin','2020-04-18 18:35:51.000000','admin-20200418183551PM','null','null'),(1178,'doctor@demo.com','98744563210','ddd ddddd','doctor-1157','doctor','2020-04-19 12:55:25.000000','doctor-20200419125525PM','uploads/WIN_20200224_16_14_39_Pro.jpg','Male'),(1291,'ramu@gmail.com','9874563210','ramu','pat-1090','patient',NULL,'pat-20200509195023PM',NULL,'Male'),(1355,'utthamhmanju@gmail.com','9874563210','uttham','pat10262','patient',NULL,'pat-20200716205000PM',NULL,'Male'),(1358,'utthamcsc@gmail.com','9874563210','uttham','pat-5378','patient',NULL,'pat-20200716205334PM',NULL,'Male');
/*!40000 ALTER TABLE `user_registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userlog`
--

DROP TABLE IF EXISTS `userlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userlog` (
  `id` int NOT NULL,
  `ipaddress` varchar(255) DEFAULT NULL,
  `login_datetime` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `user_agent` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlog`
--

LOCK TABLES `userlog` WRITE;
/*!40000 ALTER TABLE `userlog` DISABLE KEYS */;
INSERT INTO `userlog` VALUES (1274,'0:0:0:0:0:0:0:1','2020-05-07 16:11:21','pharmacist','Rama','Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36'),(1275,'0:0:0:0:0:0:0:1','2020-05-07 16:12:06','admin','phfh sdfdsf','Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36'),(1288,'0:0:0:0:0:0:0:1','2020-05-09 17:32:15','patient','demo','Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36'),(1289,'0:0:0:0:0:0:0:1','2020-05-09 19:48:53','doctor','Pramod Shhelvanth','Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36'),(1326,'0:0:0:0:0:0:0:1','2020-06-04 19:34:14','admin','phfh sdfdsf','Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36'),(1365,'0:0:0:0:0:0:0:1','2021-07-31 10:35:41.436','pathologist','Revan','Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36'),(1366,'0:0:0:0:0:0:0:1','2021-07-31 10:23:34.789','doctor','Pramod Shhelvanth','Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36');
/*!40000 ALTER TABLE `userlog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL,
  `childs` varchar(255) DEFAULT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `updated_at` varchar(255) DEFAULT NULL,
  `user_id` int NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `verification_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `driver_contact` varchar(255) DEFAULT NULL,
  `driver_licence` varchar(255) DEFAULT NULL,
  `driver_name` varchar(255) DEFAULT NULL,
  `manufacture_year` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `vehicle_model` varchar(255) DEFAULT NULL,
  `vehicle_no` varchar(255) DEFAULT NULL,
  `vehicle_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (1025,NULL,'ee','ee','ee','eee','ee','ee','eeee6487364873','owened');
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiclecall`
--

DROP TABLE IF EXISTS `vehiclecall`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiclecall` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `amount` float NOT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `driver` varchar(255) DEFAULT NULL,
  `patien_name` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `vehicle_model` varchar(255) DEFAULT NULL,
  `vehicle_no` varchar(255) DEFAULT NULL,
  `vehicleid` int NOT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiclecall`
--

LOCK TABLES `vehiclecall` WRITE;
/*!40000 ALTER TABLE `vehiclecall` DISABLE KEYS */;
INSERT INTO `vehiclecall` VALUES (1027,'hvhuuv',0,'998779',NULL,'2020-04-13T18:30:00.000Z',NULL,NULL,NULL,NULL,NULL,1025,'ggg'),(1028,'hvhuuv',0,'998779',NULL,'2020-04-13T18:30:00.000Z',NULL,NULL,NULL,NULL,NULL,1025,'gfds');
/*!40000 ALTER TABLE `vehiclecall` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicles`
--

DROP TABLE IF EXISTS `vehicles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicles` (
  `id` int NOT NULL,
  `created_at` varchar(255) DEFAULT NULL,
  `driver_contact` varchar(255) DEFAULT NULL,
  `driver_licence` varchar(255) DEFAULT NULL,
  `driver_name` varchar(255) DEFAULT NULL,
  `manufacture_year` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `vehicle_model` varchar(255) DEFAULT NULL,
  `vehicle_no` varchar(255) DEFAULT NULL,
  `vehicle_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicles`
--

LOCK TABLES `vehicles` WRITE;
/*!40000 ALTER TABLE `vehicles` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehicles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitor_list`
--

DROP TABLE IF EXISTS `visitor_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visitor_list` (
  `id` int NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `attached_document` varchar(255) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  `id_card` varchar(255) DEFAULT NULL,
  `in_time` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `number_of_persons` varchar(255) DEFAULT NULL,
  `out_time` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitor_list`
--

LOCK TABLES `visitor_list` WRITE;
/*!40000 ALTER TABLE `visitor_list` DISABLE KEYS */;
INSERT INTO `visitor_list` VALUES (772,'null','uploads/WIN_20200224_16_14_39_Pro.jpg','2020-04-07 12:52:21.000000','voter789','5','Rama','sdfghj','58','67','9876543215','visit'),(1023,NULL,'','2020-04-07 00:00:00.000000','55','7','dd','7','55','7tt','5435425455','Visit'),(1033,NULL,'','2020-04-07 00:00:00.000000','voter','88','rama','njnj','8','88','9876543216','visit'),(1034,NULL,'','2020-04-06 00:00:00.000000','voter','5','Rama','jnj','5','5','9876543210','visit'),(1035,'null','uploadsWIN_20200224_16_14_39_Pro.jpg','2020-04-06 12:41:55.000000','voter789','5','Rama','sdfghj','5','67','9876543215','Visit'),(1036,'null','uploadsWIN_20200224_16_14_39_Pro.jpg','2020-04-06 12:43:26.000000','voter','54','Rama','sdfghj','54','67','9876543234','Visit'),(1037,'null','uploadsWIN_20200224_16_14_39_Pro.jpg','2020-04-06 12:44:13.000000','voter','54','Rama','sdfghj','54','67','9876543234','Visit'),(1038,NULL,'uploads/WIN_20200224_16_14_39_Pro.jpg','2020-04-06 13:05:41.000000','voi123','5','rdc','nn','5','67','9855865656','visit');
/*!40000 ALTER TABLE `visitor_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitors_book`
--

DROP TABLE IF EXISTS `visitors_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visitors_book` (
  `id` int NOT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `id_proof` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `in_time` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `no_of_pepple` int NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `out_time` varchar(255) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitors_book`
--

LOCK TABLES `visitors_book` WRITE;
/*!40000 ALTER TABLE `visitors_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `visitors_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitors_purpose`
--

DROP TABLE IF EXISTS `visitors_purpose`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visitors_purpose` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `visitors_purpose` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitors_purpose`
--

LOCK TABLES `visitors_purpose` WRITE;
/*!40000 ALTER TABLE `visitors_purpose` DISABLE KEYS */;
/*!40000 ALTER TABLE `visitors_purpose` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'hospital_management'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-31 10:51:57
