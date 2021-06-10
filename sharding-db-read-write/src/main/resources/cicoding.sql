CREATE DATABASE `ds1` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE `ds1slave` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

CREATE TABLE `ds1`.`cicoding` (
  `id` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `region` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `ld_num` varchar(10) NOT NULL,
  `unit_num` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `ds1slave`.`cicoding` (
  `id` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `region` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `ld_num` varchar(10) NOT NULL,
  `unit_num` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8