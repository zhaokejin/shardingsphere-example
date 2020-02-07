/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL8我的电脑
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3309
 Source Schema         : ds1

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 06/02/2020 18:35:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cicoding
-- ----------------------------
DROP TABLE IF EXISTS `cicoding`;
CREATE TABLE `cicoding`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `city` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `region` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ld_num` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `unit_num` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cicoding
-- ----------------------------
INSERT INTO `cicoding` VALUES ('0a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('1a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('2a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('3a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('4a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('5a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('6a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('7a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('8a', '深圳', '宝安', '李四', 'A', '2');
INSERT INTO `cicoding` VALUES ('9a', '深圳', '宝安', '李四', 'A', '2');

SET FOREIGN_KEY_CHECKS = 1;
