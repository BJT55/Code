/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50729
Source Host           : localhost:3306
Source Database       : gdmt

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2021-07-22 11:21:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(4) NOT NULL AUTO_INCREMENT,
  `admin_username` varchar(8) NOT NULL,
  `admin_password` varchar(32) NOT NULL,
  `admin_limit` varchar(16) NOT NULL,
  `admin_name` varchar(8) NOT NULL,
  `admin_depart` varchar(8) NOT NULL,
  `admin_tel` varchar(16) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '21232F297A57A5A743894A0E4A801FC3', '超级管理员', '管理员', '总部', '12345678');
INSERT INTO `admin` VALUES ('2', 'ailee', '89C13583296B3775DC30165021B44D9C', '审核人员', '阿狸', '注册信息部门', '18075384747');
INSERT INTO `admin` VALUES ('3', 'mujin', '15A2BDCCF459B7E41F8C549E011E8FDE', '审核人员', '木头', '交易信息部门', '18075384448');

-- ----------------------------
-- Table structure for buyer
-- ----------------------------
DROP TABLE IF EXISTS `buyer`;
CREATE TABLE `buyer` (
  `buyer_id` int(4) NOT NULL AUTO_INCREMENT,
  `buyer_state` varchar(24) DEFAULT 'mture',
  `buyer_cname` varchar(64) NOT NULL,
  `buyer_num` varchar(32) NOT NULL,
  `buyer_man` varchar(24) NOT NULL,
  `buyer_signer` varchar(24) NOT NULL,
  `buyer_date` varchar(32) NOT NULL,
  `buyer_time` varchar(32) NOT NULL,
  `buyer_kind` varchar(24) NOT NULL,
  `buyer_purnum` double NOT NULL,
  `buyer_trans` varchar(24) NOT NULL,
  `buyer_location` varchar(96) NOT NULL,
  `buyer_pay` varchar(24) NOT NULL,
  `buyer_test` varchar(48) NOT NULL,
  `buyer_payway` varchar(96) NOT NULL,
  `buyer_offer` varchar(16) NOT NULL DEFAULT '0',
  `buyer_promise` varchar(16) NOT NULL DEFAULT '0',
  `qnet` double DEFAULT NULL,
  `sulfur` double DEFAULT NULL,
  `moisture` double DEFAULT NULL,
  `aar` double DEFAULT NULL,
  `volatilize` double DEFAULT NULL,
  `mad` double DEFAULT NULL,
  `stad` double(255,0) DEFAULT NULL,
  `vad` double DEFAULT NULL,
  `qgrd` double DEFAULT NULL,
  `std` double DEFAULT NULL,
  `vd` double DEFAULT NULL,
  `mm` double DEFAULT NULL,
  `st` double DEFAULT NULL,
  `hgi` double DEFAULT NULL,
  `beizhu` text,
  PRIMARY KEY (`buyer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of buyer
-- ----------------------------
INSERT INTO `buyer` VALUES ('1', 'false', '中国国电集团公司', '100', '刘先行', '刘先行', '2021-07-16', '2021-07-16 09:45:09', '褐煤', '1', '火车', '自强西路38号', '1000000', '优', '支付宝', '0', '0', '0', '0', '0', '0', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `buyer` VALUES ('2', 'false', '字节跳动', '200', '张利强', '张立强', '2021-07-08', '2021-07-14 11:09:34', '无烟煤', '2', '铁路', ' 西安市雁塔区锦业1路82号', '2134300', '优', '银行转账', '0', '0', '0', '0', '0', '0', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `buyer` VALUES ('3', 'false', '中国国电集团公司', '300', '王衡化', '王衡化', '2021-02-16', '2021-06-13 14:12:58', '亚煤', '3', '铁路', '西安市碑林区雁塔北路52', '12345645', '良', '银行转账', '0', '0', '0', '0', '0', '0', '0', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `buyer` VALUES ('4', 'false', '字节跳动', '200', '徐泽楷', '徐泽楷', '2001-06-13', '2001-5-9', '无烟煤', '4', '火车', '西安长安区', '1222222000', '优', '支付宝', '0', '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `buyer` VALUES ('5', 'mtrue', '银河航天', '150', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-8-10', '烟煤,原煤', '5', '汽车', '5', '一票结算', '到厂验收', '支付宝', 'radiobutton,', 'radiobutton,', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('6', 'mtrue', '小米科技', '180', '雷军', '雷军', '2010-7-21', '2021-7-2 9.44', '亚煤', '3', '汽车', '西安未央区', '20000', '优', '微信', '0', '0', '0', '2', '2', '4', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `buyer` VALUES ('7', 'mtrue', '猎豹移动', '260', '傅盛', '傅盛', '2011-7-3', '2021-3-5', '亚煤', '4', '汽车', '北京石景山', '1500000', '优', '支付宝', '0', '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `buyer` VALUES ('8', 'mture', '九天微星', '九天微星2015-1', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-7-26', '烟煤,原煤', '5', '火车', '5', '一票结算', '到厂第三方验收', '支付宝', 'radiobutton,', 'radiobutton,', '1', '10', '10', null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('9', 'mture', '九天微星', '', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-7-26', '烟煤,原煤', '5', '火车', '5', '一票结算', '到厂第三方验收', '支付宝', 'radiobutton,', 'radiobutton,', '1', '10', '10', null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('10', 'fpass', '九天微星', '九天微星2015-1', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-7-26', '烟煤,原煤', '5', '火车', '', '一票结算', '到厂第三方验收', '支付宝', 'radiobutton,', 'radiobutton,', '1', '10', '10', null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('11', 'fpass', '九天微星', '银河航天2015-1', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-8-10', '烟煤,原煤', '5', '汽车', '西安', '一票结算', '到厂第三方验收', '支付宝', '0', 'radiobutton,', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('12', 'mture', '九天微星', '九天微星2015-1', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-7-26', '烟煤,原煤', '5', '火车', '', '一票结算', '到厂第三方验收', '支付宝', 'radiobutton,5', 'radiobutton,10', '1', '10', '10', null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('13', 'mture', '九天微星', '九天微星2015-1', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-7-26', '烟煤,原煤', '5', '火车', '', '一票结算', '到厂第三方验收', '支付宝', 'radiobutton,5', 'radiobutton,10', '1', '10', '10', null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('14', 'mture', '银河航天', '银河航天2015-1', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-8-10', '烟煤,混煤', '5', '火车', '西安', '一票结算', '到厂第三方验收', '支付宝', 'on,6', 'on,10', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('15', 'mture', '九天微星', '银河航天2015-1', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-8-10', '烟煤,原煤', '6', '船运', '北京', '一票结算', '到厂验收', '微信', '', '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `buyer` VALUES ('16', 'mture', '银河航天', '九天微星2015-1', '徐泽楷', '徐泽楷', '2021-7-20', '2021-7-26,2021-7-26', '烟煤,原煤', '5', '火车', '西安', '二票结算', '到厂验收', '支付宝', '', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');

-- ----------------------------
-- Table structure for deal
-- ----------------------------
DROP TABLE IF EXISTS `deal`;
CREATE TABLE `deal` (
  `dealist` varchar(96) DEFAULT NULL,
  `hanger` varchar(96) DEFAULT NULL,
  `deal_id` int(4) NOT NULL AUTO_INCREMENT,
  `deal_time` date DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `goodid` int(4) DEFAULT NULL,
  PRIMARY KEY (`deal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deal
-- ----------------------------
INSERT INTO `deal` VALUES ('安徽省沙河制刷厂', '字节跳动', '1', null, '2021-07-22', '1');
INSERT INTO `deal` VALUES ('安徽省沙河制刷厂', '字节跳动', '2', null, '2021-07-22', '1');
INSERT INTO `deal` VALUES ('字节跳动', '安徽省沙河制刷厂', '3', null, '2021-07-22', '2');
INSERT INTO `deal` VALUES ('中国国电集团公司', '安徽省沙河制刷厂', '4', null, '2021-07-22', '3');
INSERT INTO `deal` VALUES ('字节跳动', '安徽省沙河制刷厂', '5', null, '2021-07-22', '4');
INSERT INTO `deal` VALUES ('安徽省沙河制刷厂', '字节跳动', '6', null, '2021-07-22', '2');
INSERT INTO `deal` VALUES ('安徽省沙河制刷厂', '字节跳动', '7', null, '2021-07-22', '2');
INSERT INTO `deal` VALUES ('安徽省沙河制刷厂', '字节跳动', '8', null, '2021-07-22', '3');

-- ----------------------------
-- Table structure for finance
-- ----------------------------
DROP TABLE IF EXISTS `finance`;
CREATE TABLE `finance` (
  `f_id` int(4) NOT NULL AUTO_INCREMENT,
  `f_account` varchar(16) NOT NULL,
  `c_name` varchar(64) NOT NULL,
  `f_pwd` varchar(32) NOT NULL,
  `f_total` double DEFAULT '0',
  `f_frozen` double DEFAULT '0',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of finance
-- ----------------------------

-- ----------------------------
-- Table structure for seller
-- ----------------------------
DROP TABLE IF EXISTS `seller`;
CREATE TABLE `seller` (
  `seller_id` int(4) NOT NULL AUTO_INCREMENT,
  `seller_supnum` double NOT NULL,
  `calorific` double NOT NULL,
  `seller_price` double NOT NULL,
  `sulful` double NOT NULL,
  `seller_origin` varchar(16) NOT NULL,
  `trans_price` double NOT NULL,
  `volatility` double NOT NULL,
  `port` varchar(16) NOT NULL,
  `element` double NOT NULL,
  `moisture` double NOT NULL,
  `seller_state` varchar(8) NOT NULL DEFAULT 'mture',
  `seller_cname` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`seller_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seller
-- ----------------------------
INSERT INTO `seller` VALUES ('1', '5', '5500', '325', '1.2', '大同', '10', '35', '天津港', '30', '12', 'false', '字节跳动');
INSERT INTO `seller` VALUES ('2', '4', '5000', '300', '1.3', '天津', '8', '40', '天津港', '20', '11', 'false', '字节跳动');
INSERT INTO `seller` VALUES ('3', '5', '5100', '300', '1.4', '北京', '10', '55', '天津港', '24', '11', 'false', '字节跳动');
INSERT INTO `seller` VALUES ('4', '4', '4900', '211', '1.2', '上海', '11', '11', '连云港', '21', '11', 'false', '字节跳动');
INSERT INTO `seller` VALUES ('5', '5', '4', '5', '10', '安徽', '500', '2', '连云港', '10', '10', 'mtrue', '字节跳动');
INSERT INTO `seller` VALUES ('6', '5', '4', '5', '10', '桐城', '500', '3', '福州', '4', '5', 'mtrue', '字节跳动');
INSERT INTO `seller` VALUES ('7', '5', '4', '5', '10', '安庆', '500', '3', '厦门', '10', '5', 'mtrue', '字节跳动');
INSERT INTO `seller` VALUES ('8', '5', '4', '5', '10', '安徽', '500', '2', '厦门', '10', '10', 'mtrue', '字节跳动');
INSERT INTO `seller` VALUES ('10', '5', '12', '52', '10', '安庆', '12', '3', '泉州', '10', '10', 'mture', '安徽省沙河制刷厂');
INSERT INTO `seller` VALUES ('11', '55', '55', '52', '10', '安徽', '500', '3', '泉州', '10', '10', 'mture', '安徽省沙河制刷厂');
INSERT INTO `seller` VALUES ('12', '1', '4', '52', '4', '安徽', '500', '3', '山东', '2', '5', 'mture', '安徽省沙河制刷厂');
INSERT INTO `seller` VALUES ('13', '12', '15', '15', '10', '宁波', '5', '11', '宁波', '5', '5', 'mture', '安徽省沙河制刷厂');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(4) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(16) NOT NULL,
  `c_name` varchar(64) NOT NULL,
  `user_csimple` varchar(64) NOT NULL,
  `user_corporative` varchar(16) NOT NULL,
  `address` varchar(64) NOT NULL,
  `area` varchar(32) NOT NULL,
  `regist_fund` double NOT NULL,
  `user_contact` varchar(8) NOT NULL,
  `user_tel` varchar(16) DEFAULT NULL,
  `user_pwd` varchar(128) NOT NULL,
  `fax` varchar(32) NOT NULL,
  `user_email` varchar(32) NOT NULL,
  `user_license` varchar(64) DEFAULT NULL,
  `user_tax` varchar(64) DEFAULT NULL,
  `user_orgnum` varchar(64) DEFAULT NULL,
  `user_bankname` varchar(32) DEFAULT NULL,
  `user_bankaccount` varchar(32) DEFAULT NULL,
  `user_permit` varchar(64) DEFAULT NULL,
  `user_corp` varchar(128) DEFAULT NULL,
  `user_condition` varchar(128) DEFAULT NULL,
  `user_trans` varchar(8) DEFAULT NULL,
  `user_brief` varchar(255) DEFAULT NULL,
  `user_performance` varchar(128) DEFAULT NULL,
  `user_state` varchar(16) DEFAULT '未审核',
  `user_view` tinytext,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_account` (`user_account`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '18075384448', '安徽省沙河制刷厂', '沙河制刷', '徐泽楷', '安徽桐城', '安徽', '1000', '徐泽楷', '', '9F08E0E14EB93C9CD05FDCAE991D5F35', '6089163', '504347744', '八大排序.png', '八大排序.png', '归并排序.png', null, null, null, null, null, null, null, null, '未审核', null);
INSERT INTO `user` VALUES ('3', '18075384445', '北京银河航天科技有限公司', '银河航天', '徐鸣', '北京', '北京', '1000', '徐鸣', '6089163', '123456', '12345', '504347745', null, null, null, null, null, null, null, null, null, null, null, '未审核', null);
INSERT INTO `user` VALUES ('4', '18075384442', '星火卫生用品', '星火卫生', '王玲', '安徽', '安徽', '100', '徐泽开', '6089162', 'E10ADC3949BA59ABBE56E057F20F883E', '123', '504347745', null, null, null, null, null, null, null, null, null, null, null, '未审核', null);
INSERT INTO `user` VALUES ('5', '18075384441', '软通动力', '软通', '杜丹东', '北京', '西安', '1000', '杜丹东', '18075384441', 'E10ADC3949BA59ABBE56E057F20F883E', '123456', '504347744', null, null, null, null, null, null, null, null, null, null, null, '未审核', null);
INSERT INTO `user` VALUES ('7', '18075384440', '字节跳动', '字节', '张一鸣', '北京', '北京', '1000', '张一鸣', '18075384440', 'E10ADC3949BA59ABBE56E057F20F883E', '123456', '504347741@qq.com', null, null, null, null, null, null, null, null, null, null, null, '未审核', null);
INSERT INTO `user` VALUES ('8', '18075384439', '小米科技', '小米', '雷军', '北京', '北京', '1000', '雷军', '18075384439', 'E10ADC3949BA59ABBE56E057F20F883E', '55555', '504348844@qq.com', null, null, null, null, null, null, null, null, null, null, null, '未审核', null);
INSERT INTO `user` VALUES ('9', '18075384451', '猎豹移动', '猎豹', '傅盛', '北京', '北京', '1000', '傅盛', '6089163', '123456', '12412', '504347744@qq.com', null, null, null, null, null, null, null, null, null, null, null, '未审核', null);

-- ----------------------------
-- Table structure for view
-- ----------------------------
DROP TABLE IF EXISTS `view`;
CREATE TABLE `view` (
  `view_id` int(4) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(16) NOT NULL,
  `c_name` varchar(64) NOT NULL,
  `operate` varchar(4) DEFAULT NULL,
  `opinion` tinytext,
  PRIMARY KEY (`view_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of view
-- ----------------------------
INSERT INTO `view` VALUES ('4', '木头', '小米科技', '驳回', ' dghf');
