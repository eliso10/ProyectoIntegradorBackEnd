-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema database
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema database
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `database` DEFAULT CHARACTER SET utf8mb3 ;
USE `database` ;

-- -----------------------------------------------------
-- Table `database`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`address` (
  `id_address` INT NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id_address`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `database`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`category` (
  `id_category` INT NOT NULL AUTO_INCREMENT,
  `name_category` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_category`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `database`.`payment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`payment` (
  `id_payment` INT NOT NULL AUTO_INCREMENT,
  `method` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_payment`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `database`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`products` (
  `id_Products` INT NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(45) NOT NULL,
  `url` VARCHAR(45) NOT NULL,
  `description` VARCHAR(180) NOT NULL,
  `category_id_category` INT NOT NULL,
  PRIMARY KEY (`id_Products`),
  INDEX `fk_Products_Categories1_idx` (`category_id_category` ASC) VISIBLE,
  CONSTRAINT `fk_Products_Categories1`
    FOREIGN KEY (`category_id_category`)
    REFERENCES `database`.`category` (`id_category`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `database`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`users` (
  `id_Users` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `telephone` VARCHAR(45) NOT NULL,
  `Payment_id_payment` INT NOT NULL,
  `Address_id_address` INT NOT NULL,
  PRIMARY KEY (`id_Users`),
  INDEX `fk_Users_Payment1_idx` (`Payment_id_payment` ASC) VISIBLE,
  INDEX `fk_Users_Address1_idx` (`Address_id_address` ASC) VISIBLE,
  CONSTRAINT `fk_Users_Address1`
    FOREIGN KEY (`Address_id_address`)
    REFERENCES `database`.`address` (`id_address`),
  CONSTRAINT `fk_Users_Payment1`
    FOREIGN KEY (`Payment_id_payment`)
    REFERENCES `database`.`payment` (`id_payment`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `database`.`products_has_users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`products_has_users` (
  `Products_id_Products` INT NOT NULL,
  `Users_id_Users` INT NOT NULL,
  INDEX `fk_Products_has_Users_Users1_idx` (`Users_id_Users` ASC) VISIBLE,
  INDEX `fk_Products_has_Users_Products1_idx` (`Products_id_Products` ASC) VISIBLE,
  CONSTRAINT `fk_Products_has_Users_Products1`
    FOREIGN KEY (`Products_id_Products`)
    REFERENCES `database`.`products` (`id_Products`),
  CONSTRAINT `fk_Products_has_Users_Users1`
    FOREIGN KEY (`Users_id_Users`)
    REFERENCES `database`.`users` (`id_Users`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
