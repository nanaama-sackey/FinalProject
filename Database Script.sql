-- MySQL Workbench Synchronization
-- Generated: 2018-04-24 15:47
-- Model: New Model
-- Version: 1.0
-- Project: LibSystem
-- Author: Jean-Sébastien & Nana Ama



DROP TABLE IF EXISTS `library`.`Account` ;

DROP TABLE IF EXISTS `library`.`advert` ;

DROP TABLE IF EXISTS `library`.`Cryptocurrency` ;

DROP TABLE IF EXISTS `library`.`Operation` ;

DROP TABLE IF EXISTS `library`.`wallet` ;

DROP TABLE IF EXISTS `library`.`Users` ;

CREATE DATABASE IF NOT EXISTS `library` DEFAULT CHARACTER SET utf8 ;
USE `library`;
show tables;


CREATE TABLE IF NOT EXISTS `books` (
  `book_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ISBN` INT(11) NULL DEFAULT NULL UNIQUE,
  `author` VARCHAR(100) NULL DEFAULT NULL,
  `title` VARCHAR(100) NULL DEFAULT NULL,
  `descript` VARCHAR(100) NULL DEFAULT NULL,
  `publisher` VARCHAR(150) NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `borrow` (
  `boro_id` INT(11) AUTO_INCREMENT NOT NULL,
  `id` INT(11) NULL DEFAULT NULL,
  `bookid` INT(11) NULL DEFAULT NULL,
  `borodate` DATE NULL DEFAULT NULL,
  `returndate` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`boro_id`),
  INDEX `id` (`id` ASC),
  INDEX `bookid` (`bookid` ASC),
  CONSTRAINT `borrow_ibfk_1`
    FOREIGN KEY (`id`)
    REFERENCES `login` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `borrow_ibfk_2`
    FOREIGN KEY (`bookid`)
    REFERENCES `books` (`book_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `lecturer` (
  `lec_id` INT(11) NOT NULL AUTO_INCREMENT,
  `id` INT(11) NOT NULL,
  `fname` VARCHAR(100) NULL DEFAULT NULL,
  `lname` VARCHAR(100) NULL DEFAULT NULL,
  `department` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`lec_id`),
  INDEX `id` (`id` ASC),
  CONSTRAINT `lecturer_ibfk_1`
    FOREIGN KEY (`id`)
    REFERENCES `login` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `librarian` (
  `lid` INT(11) NOT NULL AUTO_INCREMENT,
  `id` INT(11) NOT NULL,
  `fname` VARCHAR(100) NULL DEFAULT NULL,
  `lname` VARCHAR(100) NULL DEFAULT NULL,
  `position` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`lid`),
  INDEX `id` (`id` ASC),
  CONSTRAINT `librarian_ibfk_1`
    FOREIGN KEY (`id`)
    REFERENCES `login` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `login` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NULL DEFAULT NULL UNIQUE,
  `email` VARCHAR(100) NULL DEFAULT NULL,
  `password` VARCHAR(100) NULL DEFAULT NULL,
  `type` ENUM('librarian', 'student', 'lecturer') NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `student` (
  `sid` INT(11) NOT NULL AUTO_INCREMENT,
  `id` INT(11) NOT NULL,
  `fname` VARCHAR(100) NULL DEFAULT NULL,
  `lname` VARCHAR(100) NULL DEFAULT NULL,
  `major` VARCHAR(100) NULL DEFAULT NULL,
  `year` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`sid`),
  INDEX `id` (`id` ASC),
  CONSTRAINT `student_ibfk_1`
    FOREIGN KEY (`id`)
    REFERENCES `login` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

Insert Books values (1, 1234, "Fredman Schumacher", "Small is beautiful","Textbook", "New York Publisher");
Insert Books values (2, 2314, "Kelly Adjei", "Love is Blind","Storybook", "Leave me not Publisher") ;
Insert Books values (3, 1224, "Stacy Boo", "All Belongs to Goo","Motivational", "Briscy Ltd") ;
Insert Books values (4, 6577, "Mary Asare", "Homegoing","Storybook", "Ghana Press Ltd") ;
Insert Books values (5, 1134, "Laari Smith", "Quantitative Methods","Textbook", "New York Publisher") ;
Insert Books values (6, 5477, "Mike Quaye", "How to make money in 10 days","Motivational", "York Publisher") ;
Insert Books values (7, 1367, " Fred Schumacher", "Small is  never beautiful","Textbook", "New York Publisher") ;
Insert Books values (8, 1356, "Rebecca Awuah", "Statistics Using R","Textbook", "Ashesi Publisher") ;
Insert Books values (9, 1788, "David Ebo", "ICP is bae","Textbook", "Computer Science Publisher") ;
Insert Books values (10, 1974, "Efua Bentil", "Being an FI is super nice","Inspirational", "New York Publisher") ;
Insert Books values (11, 5674, "Ayorkor Korsah", "How to be a guru in the CS feild ","T", "New York Publisher") ;
Insert Books values (12, 7804, "Jean Sebastien", "Togo's History","Research and Project", "Expandables Ltd") ;
Insert Books values (13, 4564, "Derick Osae", "The Beauty of Women","Romance", "Foolish amd Proud Ltd.") ;
Insert Books values (14, 9055, "Chinu Achebe", "The beautiful ones are not yet Born","Textbook", "New York Publisher") ;
Insert Books values (15, 8904, "Stephen Addei", "Leadership and Nation Building","Textbook", "Peace Publish Ltd") ;
Insert Books values (16, 8901, "Stella Morgan", "Understanding English","Literature", "New York Publisher") ;
Insert Books values (17, 6789, "Smith Minton", "Calculus concepts and Connections","Textbook", "Mc Graw Hill") ;
Insert Books values (18, 5569, "Nelly Ocran", "Nature is Beautiful","Earth and Siences", "Pearson") ;
Insert Books values (19, 1132, "Molife Chaplain", "Zimbsssss","Philiospy", "Zimbo Day") ;
Insert Books values (20, 13456, "Kelvina Mc-Carthy", "Grace abounds","Religion", "New York Publisher") ;

select * from borrow;