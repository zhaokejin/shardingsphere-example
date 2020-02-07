/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL8我的电脑
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3309
 Source Schema         : sharding-jdbc-read-write_0

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 06/02/2020 14:07:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(64) NOT NULL,
  `city` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (100, '深圳', '李四');
INSERT INTO `user` VALUES (1001, '上海', '李四');
INSERT INTO `user` VALUES (1002, '北京', '张三');

SET FOREIGN_KEY_CHECKS = 1;
