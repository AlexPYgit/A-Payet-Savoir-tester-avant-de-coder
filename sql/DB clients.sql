-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema TDD
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `TDD` ;

-- -----------------------------------------------------
-- Schema TDD
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `TDD` DEFAULT CHARACTER SET utf8 ;
USE `TDD` ;

-- -----------------------------------------------------
-- Table `TDD`.`clients`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TDD`.`clients` ;

CREATE TABLE IF NOT EXISTS `TDD`.`clients` (
  `idclient` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(256) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `number_cellphone` INT NULL,
  `brithday` DATE NULL,
  `sexe` VARCHAR(45) NULL,
  `is_active` TINYINT NULL,
  PRIMARY KEY (`idclient`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `number_cellphone_UNIQUE` (`number_cellphone` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
