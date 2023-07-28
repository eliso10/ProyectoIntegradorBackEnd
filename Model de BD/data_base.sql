-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema database
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema database
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `database` DEFAULT CHARACTER SET utf8 ;
USE `database` ;

-- -----------------------------------------------------
-- Table `database`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`users` (
  `id_users` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `telephone` VARCHAR(45) NOT NULL,
  `address_id_address` INT NOT NULL,
  `payment_id_payment` INT NOT NULL,
  PRIMARY KEY (`id_users`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `database`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`category` (
  `id_category` INT NOT NULL AUTO_INCREMENT,
  `name_category` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_category`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `database`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`products` (
  `id_products` INT NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(45) NOT NULL,
  `url` VARCHAR(200) NOT NULL,
  `description` VARCHAR(180) NOT NULL,
  `category_id_category` INT NOT NULL,
  PRIMARY KEY (`id_products`),
  INDEX `fk_products_category1_idx` (`category_id_category` ASC) VISIBLE,
  CONSTRAINT `fk_products_category1`
    FOREIGN KEY (`category_id_category`)
    REFERENCES `database`.`category` (`id_category`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `database`.`products_has_users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database`.`products_has_users` (
  `products_id_products` INT NOT NULL,
  `users_id_users` INT NOT NULL,
  INDEX `fk_products_has_users_users1_idx` (`users_id_users` ASC) VISIBLE,
  INDEX `fk_products_has_users_products1_idx` (`products_id_products` ASC) VISIBLE,
  CONSTRAINT `fk_products_has_users_products1`
    FOREIGN KEY (`products_id_products`)
    REFERENCES `database`.`products` (`id_products`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_products_has_users_users1`
    FOREIGN KEY (`users_id_users`)
    REFERENCES `database`.`users` (`id_users`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
