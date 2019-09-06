/*
Navicat MySQL Data Transfer

Source Server         : lo
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : wsmsz

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-09-06 10:55:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_wsmsz_mune
-- ----------------------------
DROP TABLE IF EXISTS `t_wsmsz_mune`;
CREATE TABLE `t_wsmsz_mune` (
  `ID` int(11) NOT NULL,
  `MUNE_NAME` varchar(255) DEFAULT NULL,
  `MUNE_PID` int(11) DEFAULT NULL,
  `MUNE_URL` varchar(255) DEFAULT NULL,
  `MUNE_IMG` varchar(255) DEFAULT NULL,
  `MUNE_DESC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_wsmsz_role
-- ----------------------------
DROP TABLE IF EXISTS `t_wsmsz_role`;
CREATE TABLE `t_wsmsz_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `ROLE_STATE` varchar(255) DEFAULT NULL COMMENT '是否启用',
  `ROLE_DESC` varchar(255) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_wsmsz_role_mune
-- ----------------------------
DROP TABLE IF EXISTS `t_wsmsz_role_mune`;
CREATE TABLE `t_wsmsz_role_mune` (
  `ID` int(11) NOT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  `MUNE_ID` int(11) DEFAULT NULL,
  `DESC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_wsmsz_user
-- ----------------------------
DROP TABLE IF EXISTS `t_wsmsz_user`;
CREATE TABLE `t_wsmsz_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列id',
  `USER_NAME` varchar(200) CHARACTER SET big5 COLLATE big5_bin NOT NULL COMMENT '用户名称',
  `USER_PASSWORD` varchar(200) NOT NULL COMMENT '用户密码',
  `USER_SEX` varchar(20) DEFAULT NULL COMMENT '用户性别',
  `USER_PHONE` varchar(200) DEFAULT NULL COMMENT '电话号码',
  `USER_ROLE` varchar(20) DEFAULT NULL COMMENT '角色',
  `USER_STATE` int(11) DEFAULT NULL COMMENT '是否有效 0 无效，1有效',
  `USER_DESC` varchar(250) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
