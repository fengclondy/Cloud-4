/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.30-log : Database - ssitcloud_device
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssitcloud_device` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssitcloud_device`;

/*Table structure for table `device_config_old` */

DROP TABLE IF EXISTS `device_config_old`;

CREATE TABLE `device_config_old` (
  `device_idx` int(11) NOT NULL COMMENT '设备ID',
  `library_idx` int(11) NOT NULL COMMENT '馆ID',
  `device_ext_tpl_idx` int(11) NOT NULL COMMENT '硬件配置模板ID',
  `device_ext_tpl_flg` int(11) NOT NULL COMMENT '是否采用模板 1是  0否',
  `device_monitor_tpl_idx` int(11) NOT NULL COMMENT '显示配置模板ID',
  `device_monitor_tpl_flg` int(11) NOT NULL COMMENT '显示是否采用模板 1是  0否',
  `device_run_tpl_idx` int(11) NOT NULL COMMENT '设备运行模板ID',
  `device_run_tpl_flg` int(11) NOT NULL COMMENT '运行是否采用模板 1是  0否',
  `device_dbsync_tpl_idx` int(11) NOT NULL COMMENT '数据同步模板ID',
  `device_dbsync_tpl_flg` int(11) NOT NULL COMMENT '同步是否采用模板 1是 0否',
  `createtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `device_config_old` */

insert  into `device_config_old`(`device_idx`,`library_idx`,`device_ext_tpl_idx`,`device_ext_tpl_flg`,`device_monitor_tpl_idx`,`device_monitor_tpl_flg`,`device_run_tpl_idx`,`device_run_tpl_flg`,`device_dbsync_tpl_idx`,`device_dbsync_tpl_flg`,`createtime`) values (31,9,12,1,28,1,7,1,12,1,'2016-06-22 19:11:07'),(31,9,12,0,28,1,7,1,12,1,'2016-06-22 20:45:00'),(31,9,12,1,28,1,7,1,12,1,'2016-06-22 20:45:08'),(31,9,12,0,28,1,7,1,12,1,'2016-06-22 21:11:57'),(54,19,12,1,28,1,7,0,12,1,'2016-06-23 17:48:40'),(55,19,12,1,28,1,7,0,12,1,'2016-06-23 18:08:24'),(56,19,12,1,28,1,7,0,12,1,'2016-06-23 18:19:55'),(64,19,12,1,28,1,7,1,12,1,'2016-06-24 17:22:35'),(64,19,12,0,28,1,7,1,12,1,'2016-06-24 17:22:35'),(67,19,12,1,28,1,7,1,12,1,'2016-06-25 11:29:34'),(67,19,12,0,28,1,7,1,12,1,'2016-06-25 11:29:34'),(72,19,12,1,28,1,7,1,12,1,'2016-06-25 14:23:54'),(73,19,12,1,28,1,7,1,12,1,'2016-06-25 14:39:40'),(74,19,12,1,28,1,7,1,12,1,'2016-06-25 14:45:55'),(75,19,12,1,28,1,7,1,12,1,'2016-06-25 15:03:00'),(76,19,12,1,28,1,7,1,12,1,'2016-06-27 10:44:39'),(76,19,12,0,28,1,7,1,12,1,'2016-06-27 11:37:51'),(23,9,13,0,29,1,6,1,13,1,'2016-07-06 08:43:03'),(23,9,13,0,29,1,6,1,13,0,'2016-07-06 08:46:47'),(23,9,13,0,29,1,6,1,13,1,'2016-07-06 09:42:46'),(23,9,13,0,29,1,6,1,13,0,'2016-07-06 09:48:43'),(23,9,13,0,29,0,6,1,13,0,'2016-07-06 11:04:22'),(23,9,13,0,29,0,6,0,13,0,'2016-07-07 12:48:52'),(4,19,13,1,29,1,6,1,13,1,'2016-07-15 16:08:23'),(4,19,13,1,29,1,6,0,13,1,'2016-07-15 16:08:52'),(4,19,13,1,29,0,6,0,13,1,'2016-07-22 14:51:36'),(108,45,12,1,28,1,7,1,12,1,'2016-07-27 16:18:20'),(111,45,12,1,28,1,7,1,12,1,'2016-07-27 16:19:11'),(112,45,12,1,28,1,7,1,12,1,'2016-07-27 16:19:33'),(113,45,12,1,28,1,7,1,12,1,'2016-07-27 16:19:49'),(114,45,12,1,28,1,7,1,12,1,'2016-07-27 16:20:08'),(115,45,12,1,28,1,7,1,12,1,'2016-07-27 16:20:26'),(110,45,12,1,28,1,7,1,12,1,'2016-07-27 16:20:45'),(109,45,12,1,28,1,7,1,12,1,'2016-07-27 16:21:05'),(49,42,13,1,29,1,6,1,13,1,'2016-08-16 18:01:23'),(62,42,12,1,28,1,7,1,12,1,'2016-08-16 18:01:29'),(48,42,13,1,29,1,6,1,13,1,'2016-08-16 18:01:31'),(50,42,13,1,29,1,6,1,13,1,'2016-08-16 18:01:35'),(63,42,12,1,28,1,7,1,12,1,'2016-08-16 18:01:39'),(64,42,12,1,28,1,7,1,12,1,'2016-08-16 18:01:41'),(47,42,13,1,29,1,6,1,13,1,'2016-08-16 18:01:51'),(65,42,12,1,28,1,7,1,12,1,'2016-08-16 18:01:59'),(61,42,12,1,28,1,7,1,12,1,'2016-08-16 18:02:39'),(55,43,13,1,29,1,6,1,13,1,'2016-08-17 15:02:39'),(58,43,13,1,29,1,6,1,13,1,'2016-08-17 15:03:03'),(72,43,12,1,28,1,7,1,12,1,'2016-08-17 15:03:13'),(54,43,13,1,29,1,6,1,13,1,'2016-08-17 15:03:17'),(52,43,13,1,29,1,6,1,13,1,'2016-08-17 15:03:25'),(70,43,12,1,28,1,7,1,12,1,'2016-08-17 15:03:27'),(60,43,13,1,29,1,6,1,13,1,'2016-08-17 15:03:29'),(71,43,12,1,28,1,7,1,12,1,'2016-08-17 15:03:45'),(57,43,13,1,29,1,6,1,13,1,'2016-08-17 15:03:48'),(53,43,13,1,29,1,6,1,13,1,'2016-08-17 15:04:00'),(75,43,12,1,28,1,7,1,12,1,'2016-08-17 15:04:06'),(67,43,12,1,28,1,7,1,12,1,'2016-08-17 15:04:34'),(59,43,13,1,29,1,6,1,13,1,'2016-08-17 15:05:00'),(74,43,12,1,28,1,7,1,12,1,'2016-08-17 15:05:14'),(68,43,12,1,28,1,7,1,12,1,'2016-08-17 15:05:18'),(69,43,12,1,28,1,7,1,12,1,'2016-08-17 15:05:34'),(66,43,12,1,28,1,7,1,12,1,'2016-08-17 15:06:00'),(73,43,12,1,28,1,7,1,12,1,'2016-08-17 15:06:06'),(56,43,13,1,29,1,6,1,13,1,'2016-08-17 15:06:25'),(51,43,13,1,29,1,6,1,13,1,'2016-08-17 15:16:16'),(78,44,13,1,29,1,6,1,13,1,'2016-08-18 14:30:03'),(98,44,12,1,28,1,7,1,12,1,'2016-08-18 14:30:05'),(86,44,13,1,29,1,6,1,13,1,'2016-08-18 14:30:15'),(104,44,12,1,28,1,7,1,12,1,'2016-08-18 14:30:17'),(100,44,12,1,28,1,7,1,12,1,'2016-08-18 14:30:25'),(87,44,13,1,29,1,6,1,13,1,'2016-08-18 14:30:31'),(105,44,12,1,28,1,7,1,12,1,'2016-08-18 14:30:33'),(90,44,13,1,29,1,6,1,13,1,'2016-08-18 14:30:45'),(79,44,13,1,29,1,6,1,13,1,'2016-08-18 14:31:01'),(94,44,13,1,29,1,6,1,13,1,'2016-08-18 14:31:08'),(99,44,12,1,28,1,7,1,12,1,'2016-08-18 14:31:18'),(77,44,13,1,29,1,6,1,13,1,'2016-08-18 14:31:20'),(95,44,13,1,29,1,6,1,13,1,'2016-08-18 14:31:26'),(80,44,13,1,29,1,6,1,13,1,'2016-08-18 14:31:28'),(97,44,12,1,28,1,7,1,12,1,'2016-08-18 14:31:30'),(101,44,12,1,28,1,7,1,12,1,'2016-08-18 14:31:40'),(88,44,13,1,29,1,6,1,13,1,'2016-08-18 14:31:44'),(84,44,13,1,29,1,6,1,13,1,'2016-08-18 14:31:56'),(85,44,13,1,29,1,6,1,13,1,'2016-08-18 14:31:58'),(102,44,12,1,28,1,7,1,12,1,'2016-08-18 14:32:08'),(96,44,12,1,28,1,7,1,12,1,'2016-08-18 14:32:24'),(92,44,13,1,29,1,6,1,13,1,'2016-08-18 14:32:26'),(103,44,12,1,28,1,7,1,12,1,'2016-08-18 14:32:32'),(76,44,13,1,29,1,6,1,13,1,'2016-08-23 10:09:17'),(93,44,13,1,29,1,6,1,13,1,'2016-08-23 10:10:27'),(89,44,13,1,29,1,6,1,13,1,'2016-08-23 10:10:35'),(82,44,13,1,29,1,6,1,13,1,'2016-08-25 09:20:08'),(83,44,13,1,29,1,6,1,13,1,'2016-08-25 09:20:34'),(91,44,13,1,29,1,6,1,13,1,'2016-08-25 09:21:32'),(81,44,13,1,29,1,6,1,13,1,'2016-08-25 09:21:37'),(108,45,13,1,29,1,6,1,13,1,'2016-08-25 14:47:30'),(139,45,12,1,28,1,7,1,12,1,'2016-08-25 14:47:44'),(135,45,12,1,28,1,7,1,12,1,'2016-08-25 14:48:06'),(144,45,12,1,28,1,7,1,12,1,'2016-08-25 14:48:16'),(117,45,13,1,29,1,6,1,13,1,'2016-08-25 14:48:30'),(129,45,12,1,28,1,7,1,12,1,'2016-08-25 14:48:32'),(114,45,13,1,29,1,6,1,13,1,'2016-08-25 14:49:09'),(145,45,12,1,28,1,7,1,12,1,'2016-08-25 14:49:31'),(140,45,12,1,28,1,7,1,12,1,'2016-08-25 14:49:33'),(107,45,13,1,29,1,6,1,13,1,'2016-08-25 14:49:40'),(138,45,12,1,28,1,7,1,12,1,'2016-08-25 14:49:42'),(109,45,13,1,29,1,6,1,13,1,'2016-08-25 14:50:22'),(136,45,12,1,28,1,7,1,12,1,'2016-08-25 14:50:30'),(133,45,12,1,28,1,7,1,12,1,'2016-08-25 14:50:54'),(127,45,12,1,28,1,7,1,12,1,'2016-08-25 14:50:57'),(116,45,13,1,29,1,6,1,13,1,'2016-08-25 14:51:01'),(125,45,13,1,29,1,6,1,13,1,'2016-08-25 14:51:05'),(120,45,13,1,29,1,6,1,13,1,'2016-08-25 14:51:28'),(106,45,13,1,29,1,6,1,13,1,'2016-08-25 14:51:52'),(137,45,12,1,28,1,7,1,12,1,'2016-08-25 14:52:04'),(141,45,12,1,28,1,7,1,12,1,'2016-08-25 14:52:16'),(143,45,12,1,28,1,7,1,12,1,'2016-08-25 14:52:22'),(124,45,13,1,29,1,6,1,13,1,'2016-08-25 14:52:35'),(115,45,13,1,29,1,6,1,13,1,'2016-08-25 14:52:53'),(121,45,13,1,29,1,6,1,13,1,'2016-08-25 14:53:10'),(112,45,13,1,29,1,6,1,13,1,'2016-08-25 14:53:12'),(113,45,13,1,29,1,6,1,13,1,'2016-08-25 14:53:29'),(130,45,12,1,28,1,7,1,12,1,'2016-08-25 14:54:40'),(131,45,12,1,28,1,7,1,12,1,'2016-08-25 14:58:01'),(128,45,12,1,28,1,7,1,12,1,'2016-08-25 14:58:21'),(134,45,12,1,28,1,7,1,12,1,'2016-08-25 14:58:23'),(123,45,13,1,29,1,6,1,13,1,'2016-08-25 14:58:25'),(142,45,12,1,28,1,7,1,12,1,'2016-08-25 14:58:42'),(119,45,13,1,29,1,6,1,13,1,'2016-08-25 14:58:43'),(110,45,13,1,29,1,6,1,13,1,'2016-08-25 14:58:54'),(122,45,13,1,29,1,6,1,13,1,'2016-08-25 14:59:06'),(111,45,13,1,29,1,6,1,13,1,'2016-08-25 14:59:41'),(118,45,13,1,29,1,6,1,13,1,'2016-08-25 15:00:41'),(132,45,12,1,28,1,7,1,12,1,'2016-08-25 15:05:28'),(126,45,12,1,28,1,7,1,12,1,'2016-08-25 15:05:42'),(4,19,13,0,29,0,6,0,13,1,'2016-09-12 09:59:26'),(8,19,13,0,29,1,6,0,13,1,'2016-09-20 11:41:39'),(8,19,13,0,29,0,6,0,13,0,'2016-09-20 11:45:41'),(8,19,18,1,44,1,20,1,16,1,'2016-09-20 11:47:11'),(8,19,18,0,44,0,20,0,16,0,'2016-09-20 17:18:44'),(161,1,23,1,55,1,31,1,17,1,'2016-11-11 15:06:36'),(162,1,23,1,55,1,31,1,17,1,'2016-11-14 16:43:56'),(171,1,12,1,28,1,7,1,12,1,'2016-11-17 10:15:53'),(169,1,13,1,29,1,6,1,13,1,'2016-11-17 10:16:36'),(169,2,13,1,29,1,6,1,13,1,'2016-11-17 10:33:20'),(171,2,12,1,28,1,7,1,12,1,'2016-11-17 10:33:20'),(171,1,12,1,28,1,7,1,12,1,'2016-11-17 20:09:58'),(171,2,12,1,28,1,7,1,12,1,'2016-11-17 20:10:51'),(171,1,12,1,28,1,7,1,12,1,'2016-11-17 20:11:58'),(171,2,12,1,28,1,7,1,12,1,'2016-11-17 20:15:35'),(171,1,12,1,28,1,7,1,12,1,'2016-11-17 20:15:52'),(171,2,12,1,28,1,7,1,12,1,'2016-11-17 20:17:25'),(171,2,12,1,28,1,7,1,12,1,'2016-11-17 20:18:46'),(171,2,12,1,28,1,7,1,12,1,'2016-11-17 20:21:21'),(169,1,13,1,29,1,6,1,13,1,'2016-11-17 20:25:14'),(169,2,13,1,29,1,6,1,13,1,'2016-11-17 20:28:56'),(171,2,12,1,28,1,7,1,12,1,'2016-11-17 20:28:56'),(169,1,13,1,29,1,6,1,13,1,'2016-11-17 20:29:14'),(169,2,13,1,29,1,6,1,13,1,'2016-11-17 20:29:31'),(169,2,13,1,29,1,6,1,13,1,'2016-11-17 20:30:07'),(169,2,13,1,29,1,6,1,13,1,'2016-11-18 14:51:48'),(169,1,13,1,29,1,6,1,13,1,'2016-11-18 14:53:18'),(171,1,12,1,28,1,7,1,12,1,'2016-11-18 14:53:18'),(171,2,12,1,28,1,7,1,12,1,'2016-11-18 15:02:02'),(169,2,13,1,29,1,6,1,13,1,'2016-11-18 15:20:06'),(169,1,13,1,29,1,6,1,13,1,'2016-11-18 15:20:54'),(171,1,12,1,28,1,7,1,12,1,'2016-11-18 15:20:54'),(176,1,13,1,29,1,6,1,13,1,'2016-11-18 15:20:54'),(185,1,13,1,29,1,6,1,13,1,'2016-11-18 15:20:54'),(169,2,13,1,29,1,6,1,13,1,'2016-11-18 15:23:32'),(169,1,13,1,29,1,6,1,13,1,'2016-11-18 15:24:20'),(171,2,12,1,28,1,7,1,12,1,'2016-11-18 15:26:05'),(171,1,12,1,28,1,7,1,12,1,'2016-11-18 15:29:35'),(171,2,12,1,28,1,7,1,12,1,'2016-11-18 15:30:24'),(171,1,12,1,28,1,7,1,12,1,'2016-11-18 15:31:27'),(171,2,12,1,28,1,7,1,12,1,'2016-11-18 15:38:49'),(171,1,12,1,28,1,7,1,12,1,'2016-11-18 16:18:46'),(171,2,12,1,28,1,7,1,12,1,'2016-11-18 16:19:18'),(171,1,12,1,28,1,7,1,12,1,'2016-11-18 16:19:37'),(189,2,24,1,56,1,32,1,18,1,'2016-11-21 10:50:48'),(193,3,13,1,29,1,6,1,13,1,'2016-11-22 11:12:16'),(193,3,24,1,56,1,32,1,18,1,'2016-11-22 11:13:08'),(193,3,24,0,56,0,32,0,18,0,'2016-11-22 11:13:21'),(193,3,12,1,28,1,7,1,12,1,'2016-11-22 11:26:50'),(193,3,25,1,57,1,33,1,19,1,'2016-11-22 11:29:03'),(193,3,12,1,28,1,7,1,12,1,'2016-11-22 11:55:07'),(193,3,23,1,55,1,31,1,17,1,'2016-11-22 11:56:45'),(193,3,23,0,55,0,31,0,17,0,'2016-11-22 11:57:32'),(195,5,12,1,28,1,7,1,12,1,'2016-11-22 17:25:22'),(195,5,25,1,57,1,33,1,19,1,'2016-11-22 17:25:59'),(196,5,13,1,29,1,6,1,13,1,'2016-11-23 09:23:02'),(196,5,12,1,28,1,7,1,12,1,'2016-11-23 10:11:36'),(196,5,12,1,58,1,33,1,12,1,'2016-11-23 10:13:45'),(169,2,13,1,29,1,6,1,13,1,'2016-11-24 17:23:55'),(198,5,25,1,58,1,33,1,19,1,'2016-11-28 09:24:03'),(198,5,12,1,28,1,7,1,12,1,'2016-11-28 09:32:08'),(200,3,25,1,58,1,33,1,19,1,'2016-12-07 16:28:16'),(200,3,25,1,58,1,7,1,19,1,'2016-12-07 16:28:46'),(200,3,25,1,58,1,7,1,12,1,'2016-12-07 16:29:40'),(200,3,25,1,58,1,7,1,12,0,'2016-12-07 16:47:44');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;