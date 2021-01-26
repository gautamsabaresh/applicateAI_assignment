Please do create database and connect it to the application. Update the database name, username and password for the MySQL database in application.properties file.
Path for appplication.properties is :applicate_assignment\src\main\resources\application.propertiies.

The test cases are written in the path:
applicate_assignment\src\test\java\com\project\applicate_assignment\ApplicateAssignmentApplicationTests.java

------------------------------------------------------------
Database creation query:

CREATE DATABASE retail;

Table creation query:
Catablog table:
CREATE TABLE `catalog` (
  `sku_code` int NOT NULL AUTO_INCREMENT,
  `sku_name` varchar(45) NOT NULL,
  `sku_description` longtext NOT NULL,
  `brand_name` varchar(45) NOT NULL,
  `brand_description` varchar(45) NOT NULL,
  `supplier_id` int NOT NULL,
  PRIMARY KEY (`sku_code`),
  UNIQUE KEY `sku_code_UNIQUE` (`sku_code`),
  KEY `supplier_id_idx` (`supplier_id`),
  CONSTRAINT `supplier_id` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) 

Supplier table:
CREATE TABLE `supplier` (
  `supplier_id` int NOT NULL AUTO_INCREMENT,
  `supplier_name` varchar(45) NOT NULL,
  PRIMARY KEY (`supplier_id`),
  UNIQUE KEY `supplier_ID_UNIQUE` (`supplier_id`)
) 

--------------------------------------------------------------
