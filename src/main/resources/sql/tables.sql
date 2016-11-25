CREATE DATABASE IF NOT EXISTS brain CHARACTER SET = utf8 COLLATE = utf8_bin;

use brain;

CREATE TABLE IF NOT EXISTS `users`
(
  user_id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT 'user id',
  username VARCHAR(30) NOT NULL COMMENT 'login',
  password VARCHAR(30) NOT NULL COMMENT 'password',
  role_id INT(11) DEFAULT '2' NOT NULL COMMENT 'user role'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1;

CREATE TABLE IF NOT EXISTS `roles`
(
  role_id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT 'role id',
  role VARCHAR(30) NOT NULL COMMENT 'role'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1;

create table if not exists `ads`
(
  ad_id int(11) primary key not null auto_increment comment 'ad_id',
  short_description varchar(40) not null comment 'short description',
  full_description varchar(100) not null comment 'full description',
  ad_type varchar(30) default '1' not null comment 'ad type',
  user_id_ad_got int (11) not null comment 'user_id_ad_got',
  key ad_user_ref (`user_id_ad_got`),
  constraint `myForeignKey` foreign key (`user_id_ad_got`)
  references `users` (`user_id`) on delete cascade on update cascade
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1;

create table if not exists `ad_types`
(
  type_id int(11) primary key not null auto_increment comment 'ad_type',
  ad_type varchar(30) not null comment 'ad_type'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1;