/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50527
Source Host           : 127.0.0.1:3306
Source Database       : mango_example

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-11-21 11:03:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `card`
-- ----------------------------
DROP TABLE IF EXISTS `card`;
CREATE TABLE `card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `sub_card` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of card
-- ----------------------------
INSERT INTO `card` VALUES ('1', 'zhang', '{\"type\":1,\"content\":\"content\"}');

-- ----------------------------
-- Table structure for `fruit`
-- ----------------------------
DROP TABLE IF EXISTS `fruit`;
CREATE TABLE `fruit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `num` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fruit
-- ----------------------------
INSERT INTO `fruit` VALUES ('1', 'apple', '7');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `content` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `key_uid` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '100', 'hello');
INSERT INTO `message` VALUES ('2', '100', 'hello');
INSERT INTO `message` VALUES ('3', '100', 'hello');
INSERT INTO `message` VALUES ('4', '100', 'hello');
INSERT INTO `message` VALUES ('5', '100', 'hello');
INSERT INTO `message` VALUES ('6', '100', 'hello');
INSERT INTO `message` VALUES ('7', '100', 'hello');
INSERT INTO `message` VALUES ('8', '100', 'hello');
INSERT INTO `message` VALUES ('9', '100', 'hello');
INSERT INTO `message` VALUES ('10', '100', 'hello');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `money` bigint(21) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'pony', '12', '1', '12345', '2017-11-21 08:56:55');
INSERT INTO `user` VALUES ('2', 'tom', '12', '1', '123', '2017-11-20 19:54:30');
INSERT INTO `user` VALUES ('3', 'tom', '14', '0', '1234', '2017-11-16 10:52:00');
INSERT INTO `user` VALUES ('4', 'eve', '11', '0', '123', '2017-11-20 20:05:10');
INSERT INTO `user` VALUES ('6', 'pony', '12', '1', '12345', '2017-11-21 09:02:18');
