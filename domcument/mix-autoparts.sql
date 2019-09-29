
DROP TABLE IF EXISTS `auto_car`;
CREATE TABLE `auto_car` (
  `autocar_id` varchar(20) NOT NULL,
  `autocar_no` varchar(125) DEFAULT NULL,
  `autocar_type` char(2) DEFAULT NULL,
  `autocar_owner` varchar(63) DEFAULT NULL,
  `is_del` int(11) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`autocar_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of auto_car
-- ----------------------------
BEGIN;
INSERT INTO `auto_car` VALUES ('154937877539721216', '冀J00001', NULL, '张三', 0, '2019-03-04 13:07:49', 'admin', '2019-03-04 13:07:49', 'admin');
INSERT INTO `auto_car` VALUES ('154938524121042944', '冀J00002', NULL, '李四', 0, '2019-03-04 13:10:23', 'admin', '2019-03-04 13:10:23', 'admin');
INSERT INTO `auto_car` VALUES ('154947192782721024', '冀J00003', NULL, '李四', 0, '2019-03-04 13:44:50', 'admin', '2019-03-04 13:44:50', 'admin');
INSERT INTO `auto_car` VALUES ('196933726956032000', '京L0001', NULL, 'maogx', 1, '2019-06-28 02:24:19', 'wangzong', '2019-06-28 02:25:53', 'wangzong');
COMMIT;

-- ----------------------------
-- Table structure for auto_part
-- ----------------------------
DROP TABLE IF EXISTS `auto_part`;
CREATE TABLE `auto_part` (
  `autopart_id` varchar(40) NOT NULL,
  `autocar_no` varchar(63) DEFAULT NULL,
  `autopart_name` varchar(125) DEFAULT NULL,
  `autopart_price` double DEFAULT NULL,
  `autopart_quantity` int(11) DEFAULT NULL,
  `autopart_total` double DEFAULT NULL,
  `purchaser` varchar(63) DEFAULT NULL,
  `purchase_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `is_del` int(11) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`autopart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of auto_part
-- ----------------------------
BEGIN;
INSERT INTO `auto_part` VALUES ('154212310112669696', '冀J00001', '轮胎', 1290, 4, 5160, 'sdfsad', '2019-03-02 15:26:22', NULL, '2019-03-02 13:04:45', 'admin', '2019-03-02 13:04:46', 'admin');
INSERT INTO `auto_part` VALUES ('154212353255280640', '冀J00003', '刹车片', 500, 4, 2000, 'sdfsad', '2019-03-02 15:26:26', NULL, '2019-03-02 13:04:50', 'admin', '2019-03-02 13:04:50', 'admin');
INSERT INTO `auto_part` VALUES ('154224571149586432', '冀J00002', '轮胎', 1290, 4, 5160, '', '2019-03-07 00:00:00', NULL, '2019-03-02 13:53:23', 'admin', '2019-03-02 13:53:23', 'admin');
INSERT INTO `auto_part` VALUES ('154224571346718720', '冀J00002', '刹车片', 500, 4, 2000, '', '2019-03-07 00:00:00', NULL, '2019-03-02 13:53:23', 'admin', '2019-03-02 13:53:23', 'admin');
INSERT INTO `auto_part` VALUES ('154227148469702656', '冀J00002', '轮胎', 1290, 4, 5160, 'sdfsad', '2019-03-06 00:00:00', NULL, '2019-03-02 14:03:38', 'admin', '2019-03-02 14:03:38', 'admin');
INSERT INTO `auto_part` VALUES ('154227148541005824', '冀J00002', '刹车片', 500, 4, 2000, 'sdfsad', '2019-03-06 00:00:00', NULL, '2019-03-02 14:03:38', 'admin', '2019-03-02 14:03:38', 'admin');
INSERT INTO `auto_part` VALUES ('193475971473608704', '冀J00001', '轮胎', 900, 4, 3600, '张三', '2019-06-05 16:00:00', 0, '2019-06-18 13:24:26', 'zhangsan', '2019-06-18 13:24:26', 'zhangsan');
INSERT INTO `auto_part` VALUES ('196911168009408512', '冀J00002', '轮胎', 900, 4, 3600, '张三', '2019-06-18 16:00:00', 0, '2019-06-28 00:54:41', 'wangzong', '2019-06-28 00:54:41', 'wangzong');
INSERT INTO `auto_part` VALUES ('196911168072323072', '冀J00002', '刹车片', 500, 2, 1000, '张三', '2019-06-18 16:00:00', 0, '2019-06-28 00:54:41', 'wangzong', '2019-06-28 00:54:41', 'wangzong');
COMMIT;

-- ----------------------------
-- Table structure for mo_application
-- ----------------------------
DROP TABLE IF EXISTS `mo_application`;
CREATE TABLE `mo_application` (
  `app_id` varchar(63) NOT NULL,
  `app_name` varchar(63) DEFAULT NULL,
  `app_code` varchar(63) DEFAULT NULL,
  `app_icon_url` varchar(255) DEFAULT NULL,
  `app_url` varchar(255) DEFAULT NULL,
  `app_developer` varchar(63) DEFAULT NULL,
  `is_admin` varchar(2) DEFAULT NULL COMMENT '是否管理模块：0-否；1-是',
  `order_index` int(11) DEFAULT NULL,
  `current_status` char(1) DEFAULT NULL COMMENT '0-正常；1-禁用',
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`app_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_application
-- ----------------------------
BEGIN;
INSERT INTO `mo_application` VALUES ('193387076346056704', '配件采购管理', 'autoparts', 'fa fa-cube', '', '', '0', 1, '0', '2019-06-18 07:31:12', 'admin', '2019-06-18 09:09:47', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for mo_module
-- ----------------------------
DROP TABLE IF EXISTS `mo_module`;
CREATE TABLE `mo_module` (
  `module_id` varchar(63) NOT NULL,
  `app_id` varchar(63) DEFAULT NULL,
  `app_name` varchar(63) DEFAULT NULL,
  `module_name` varchar(63) DEFAULT NULL,
  `module_code` varchar(63) DEFAULT NULL,
  `module_icon_url` varchar(255) DEFAULT NULL,
  `module_url` varchar(255) DEFAULT NULL,
  `is_admin` varchar(2) DEFAULT NULL COMMENT '是否管理模块：0-否；1-是',
  `need_right` varchar(2) DEFAULT NULL COMMENT '是否需要权限：0-否；1-是',
  `order_index` int(11) DEFAULT NULL,
  `current_status` char(1) DEFAULT NULL COMMENT '0-正常；1-禁用',
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`module_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_module
-- ----------------------------
BEGIN;
INSERT INTO `mo_module` VALUES ('193388353008308224', '193387076346056704', '配件采购管理', '汽车配件', 'autoparts', 'fa fa-list', '/autopartlist', '0', '1', 1, '0', '2019-06-18 07:36:16', 'admin', '2019-06-18 09:09:47', 'admin');
INSERT INTO `mo_module` VALUES ('193389185116278784', '193387076346056704', '配件采购管理', '采购录入', 'addpart', 'fa fa-pencil-square-o', '/toaddautopart', '0', '1', 2, '0', '2019-06-18 07:39:35', 'admin', '2019-06-18 09:09:47', 'admin');
INSERT INTO `mo_module` VALUES ('193413838803177472', '193387076346056704', '配件采购管理', '数据查询', 'serach', 'fa fa-search', '/tosearch', '0', '1', 3, '0', '2019-06-18 09:17:33', 'admin', '2019-06-18 09:17:33', 'admin');
INSERT INTO `mo_module` VALUES ('193414250650275840', '193387076346056704', '配件采购管理', '车辆管理', 'car', 'fa fa-car', '/autocarlist', '0', '1', 4, '0', '2019-06-18 09:19:11', 'admin', '2019-06-18 09:19:11', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for mo_module_res
-- ----------------------------
DROP TABLE IF EXISTS `mo_module_res`;
CREATE TABLE `mo_module_res` (
  `resource_id` varchar(63) NOT NULL,
  `app_id` varchar(63) DEFAULT NULL,
  `app_name` varchar(125) DEFAULT NULL,
  `module_id` varchar(63) DEFAULT NULL,
  `module_name` varchar(125) DEFAULT NULL,
  `resource_name` varchar(125) DEFAULT NULL,
  `resource_code` varchar(63) DEFAULT NULL,
  `resource_type` varchar(31) DEFAULT NULL COMMENT '菜单menu\n            操作operator -- create等',
  `resource_icon_url` varchar(255) DEFAULT NULL,
  `resource_url` varchar(255) DEFAULT NULL,
  `need_right` varchar(2) DEFAULT NULL COMMENT '是否需要权限：0-否；1-是',
  `order_index` int(11) DEFAULT NULL,
  `resource_parent_id` bigint(20) DEFAULT NULL,
  `current_status` char(1) DEFAULT NULL COMMENT '0-正常；1-禁用',
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`resource_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_module_res
-- ----------------------------
BEGIN;
INSERT INTO `mo_module_res` VALUES ('193388353008308225', '193387076346056704', '配件采购管理', '193388353008308224', '汽车配件', '汽车配件', 'autoparts_res0', '0', 'fa fa-list', '/autopartlist', '1', 0, NULL, '0', '2019-06-18 07:36:16', 'admin', '2019-06-18 09:09:47', 'admin');
INSERT INTO `mo_module_res` VALUES ('193389185116278785', '193387076346056704', '配件采购管理', '193389185116278784', '采购录入', '采购录入', 'addpart_res0', '0', 'fa fa-pencil-square-o', '/toaddautopart', '1', 0, NULL, '0', '2019-06-18 07:39:35', 'admin', '2019-06-18 09:09:47', 'admin');
INSERT INTO `mo_module_res` VALUES ('193413838803177473', '193387076346056704', '配件采购管理', '193413838803177472', '数据查询', '数据查询', 'serach_res0', '0', 'fa fa-search', '/tosearch', '1', 0, NULL, '0', '2019-06-18 09:17:33', 'admin', '2019-06-18 09:17:33', 'admin');
INSERT INTO `mo_module_res` VALUES ('193414250650275841', '193387076346056704', '配件采购管理', '193414250650275840', '车辆管理', '车辆管理', 'car_res0', '0', 'fa fa-car', '/autocarlist', '1', 0, NULL, '0', '2019-06-18 09:19:11', 'admin', '2019-06-18 09:19:11', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for mo_org
-- ----------------------------
DROP TABLE IF EXISTS `mo_org`;
CREATE TABLE `mo_org` (
  `org_id` varchar(63) NOT NULL,
  `party_id` varchar(63) NOT NULL,
  `org_name` varchar(63) DEFAULT NULL,
  `org_short_name` varchar(63) DEFAULT NULL,
  `org_code` varchar(63) DEFAULT NULL,
  `order_index` int(11) DEFAULT NULL,
  `parent_org_id` varchar(63) DEFAULT NULL,
  `manager_id` varchar(63) DEFAULT NULL,
  `contact_address` varchar(1023) DEFAULT NULL,
  `office_address` varchar(1023) DEFAULT NULL,
  `num_employees` int(11) DEFAULT NULL,
  `ticker_symbol` varchar(24) DEFAULT NULL,
  `current_status` varchar(1) DEFAULT NULL,
  `comments` varchar(1023) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`org_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_org
-- ----------------------------
BEGIN;
INSERT INTO `mo_org` VALUES ('193385756855767040', '193385756855767040', '经理办公室', 'ceooffice', '10001', 1, '0', NULL, '', NULL, NULL, NULL, '0', '', '2019-06-18 07:25:57', 'admin', '2019-06-18 07:25:57', 'admin');
INSERT INTO `mo_org` VALUES ('193385913689182208', '193385913689182208', '采购部', 'perchancedept', '10002', 2, '0', NULL, '', NULL, NULL, NULL, '0', '', '2019-06-18 07:26:35', 'admin', '2019-06-18 07:26:35', 'admin');
INSERT INTO `mo_org` VALUES ('193386090374238208', '193386090374238208', '车队', 'cardept', '10003', 3, '0', NULL, '', NULL, NULL, NULL, '0', '', '2019-06-18 07:27:17', 'admin', '2019-06-18 07:27:17', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for mo_org_person
-- ----------------------------
DROP TABLE IF EXISTS `mo_org_person`;
CREATE TABLE `mo_org_person` (
  `org_person_id` varchar(63) NOT NULL,
  `org_id` varchar(63) DEFAULT NULL,
  `person_id` varchar(63) DEFAULT NULL,
  `from_date` timestamp NULL DEFAULT NULL,
  `thru_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`org_person_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_org_person
-- ----------------------------
BEGIN;
INSERT INTO `mo_org_person` VALUES ('159376436426313721', '0', '159376436426313728', '2019-03-28 12:57:52', NULL);
INSERT INTO `mo_org_person` VALUES ('193386400916312065', '193385756855767040', '193386400916312064', '2019-06-18 07:28:31', NULL);
INSERT INTO `mo_org_person` VALUES ('193386885446504449', '193385913689182208', '193386885446504448', '2019-06-18 07:30:26', NULL);
COMMIT;

-- ----------------------------
-- Table structure for mo_party
-- ----------------------------
DROP TABLE IF EXISTS `mo_party`;
CREATE TABLE `mo_party` (
  `party_id` varchar(32) NOT NULL,
  `party_name` varchar(127) DEFAULT NULL,
  `is_internal` char(1) DEFAULT NULL COMMENT '0-否；1-是',
  `current_status` char(1) DEFAULT NULL COMMENT '0-正常；1-禁用',
  `party_type` char(1) DEFAULT NULL COMMENT '0-人员；1-组织',
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`party_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_party
-- ----------------------------
BEGIN;
INSERT INTO `mo_party` VALUES ('159376436426313728', '系统管理员', NULL, '0', '0', '2019-03-16 11:05:04', 'admin', '2019-03-16 11:05:04', 'admin');
INSERT INTO `mo_party` VALUES ('193385756855767040', '经理办公室', NULL, '0', '1', '2019-06-18 07:25:57', 'admin', '2019-06-18 07:25:57', 'admin');
INSERT INTO `mo_party` VALUES ('193385913689182208', '采购部', NULL, '0', '1', '2019-06-18 07:26:35', 'admin', '2019-06-18 07:26:35', 'admin');
INSERT INTO `mo_party` VALUES ('193386090374238208', '车队', NULL, '0', '1', '2019-06-18 07:27:17', 'admin', '2019-06-18 07:27:17', 'admin');
INSERT INTO `mo_party` VALUES ('193386400916312064', '王总', NULL, '0', '0', '2019-06-18 07:28:31', 'admin', '2019-06-18 07:28:31', 'admin');
INSERT INTO `mo_party` VALUES ('193386885446504448', '张三', NULL, '0', '0', '2019-06-18 07:30:26', 'admin', '2019-06-18 07:30:26', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for mo_person
-- ----------------------------
DROP TABLE IF EXISTS `mo_person`;
CREATE TABLE `mo_person` (
  `person_id` varchar(63) NOT NULL,
  `party_id` varchar(63) NOT NULL,
  `full_name` varchar(63) DEFAULT NULL,
  `salutation` varchar(63) DEFAULT NULL COMMENT 'salutation：0-先生；1-女士；2-小姐；4-太太；8-...',
  `last_name` varchar(63) DEFAULT NULL,
  `first_name` varchar(63) DEFAULT NULL,
  `mid_name` varchar(63) DEFAULT NULL,
  `nickname` varchar(63) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL COMMENT 'gender：0-男；1-女；2-...；4-...',
  `personal_title` varchar(63) DEFAULT NULL COMMENT 'personal_title-头衔、职务、职称',
  `birth_date` timestamp NULL DEFAULT NULL,
  `height` decimal(10,0) DEFAULT NULL,
  `weight` decimal(10,0) DEFAULT NULL,
  `marital_status` varchar(2) DEFAULT NULL COMMENT 'marital_status：0-未婚；1-已婚；2-...；4-...',
  `occupation` varchar(63) DEFAULT NULL,
  `comments` varchar(1023) DEFAULT NULL,
  `card_type` varchar(63) DEFAULT NULL COMMENT '0-身份证、1-护照、2-- 、4-- ',
  `card_id` varchar(1023) DEFAULT NULL,
  `current_status` varchar(1) DEFAULT NULL COMMENT '0-正常；1-删除',
  `order_index` int(11) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`person_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_person
-- ----------------------------
BEGIN;
INSERT INTO `mo_person` VALUES ('159376436426313728', '159376436426313728', '系统管理员', NULL, '', '系统管理员', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, '2019-03-16 11:05:04', 'admin', '2019-03-16 11:05:04', 'admin');
INSERT INTO `mo_person` VALUES ('193386400916312064', '193386400916312064', '王总', NULL, '王', '总', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, '2019-06-18 07:28:31', 'admin', '2019-06-18 07:28:31', 'admin');
INSERT INTO `mo_person` VALUES ('193386885446504448', '193386885446504448', '张三', NULL, '张', '三', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, '2019-06-18 07:30:26', 'admin', '2019-06-18 07:30:26', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for mo_role
-- ----------------------------
DROP TABLE IF EXISTS `mo_role`;
CREATE TABLE `mo_role` (
  `role_id` varchar(63) NOT NULL,
  `role_name` varchar(63) DEFAULT NULL,
  `role_code` varchar(63) DEFAULT NULL,
  `role_desc` varchar(127) DEFAULT NULL,
  `order_index` int(11) DEFAULT NULL,
  `current_status` char(1) DEFAULT NULL COMMENT '0-正常；1-禁用',
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_role
-- ----------------------------
BEGIN;
INSERT INTO `mo_role` VALUES ('193392565108740096', '经理', 'ceo', '经理', NULL, '0', '2019-06-18 07:53:01', 'admin', '2019-06-18 09:19:57', 'admin');
INSERT INTO `mo_role` VALUES ('193392750220152832', '采购员', 'perchancer', '采购员', NULL, '0', '2019-06-18 07:53:45', 'admin', '2019-06-18 09:20:03', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for mo_role_party
-- ----------------------------
DROP TABLE IF EXISTS `mo_role_party`;
CREATE TABLE `mo_role_party` (
  `role_party_id` varchar(63) NOT NULL,
  `role_id` varchar(63) DEFAULT NULL,
  `role_name` varchar(63) DEFAULT NULL,
  `party_id` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`role_party_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_role_party
-- ----------------------------
BEGIN;
INSERT INTO `mo_role_party` VALUES ('193392618661613568', '193392565108740096', '经理', '193386400916312064');
INSERT INTO `mo_role_party` VALUES ('193392797565456384', '193392750220152832', '采购员', '193386885446504448');
COMMIT;

-- ----------------------------
-- Table structure for mo_role_right
-- ----------------------------
DROP TABLE IF EXISTS `mo_role_right`;
CREATE TABLE `mo_role_right` (
  `role_right_id` varchar(63) NOT NULL,
  `resource_id` varchar(63) DEFAULT NULL,
  `role_id` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`role_right_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_role_right
-- ----------------------------
BEGIN;
INSERT INTO `mo_role_right` VALUES ('193414444116742144', '193388353008308225', '193392565108740096');
INSERT INTO `mo_role_right` VALUES ('193414444137713664', '193389185116278785', '193392565108740096');
INSERT INTO `mo_role_right` VALUES ('193414444146102272', '193413838803177473', '193392565108740096');
INSERT INTO `mo_role_right` VALUES ('193414444154490880', '193414250650275841', '193392565108740096');
INSERT INTO `mo_role_right` VALUES ('193414468552757248', '193388353008308225', '193392750220152832');
INSERT INTO `mo_role_right` VALUES ('193414468565340160', '193389185116278785', '193392750220152832');
INSERT INTO `mo_role_right` VALUES ('193414468573728768', '193413838803177473', '193392750220152832');
COMMIT;

-- ----------------------------
-- Table structure for mo_user_login
-- ----------------------------
DROP TABLE IF EXISTS `mo_user_login`;
CREATE TABLE `mo_user_login` (
  `party_id` varchar(32) NOT NULL,
  `user_login_id` varchar(63) DEFAULT NULL,
  `current_password` varchar(255) DEFAULT NULL,
  `password_hint` int(11) DEFAULT NULL,
  `user_name` varchar(63) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `first_name` varchar(40) DEFAULT NULL,
  `email` varchar(63) DEFAULT NULL,
  `mobile` varchar(63) DEFAULT NULL,
  `mobile_country_code` varchar(6) DEFAULT NULL,
  `is_system` char(1) DEFAULT NULL COMMENT 'is_system：0-否；1-是',
  `has_logged_out` char(1) DEFAULT NULL COMMENT 'has_logged_out：0-否；1-是',
  `require_password_change` char(1) DEFAULT NULL COMMENT 'require_password_change：0-不需要；1-需要',
  `last_locale` varchar(255) DEFAULT NULL,
  `last_time_zone` varchar(31) DEFAULT NULL,
  `disabled_time` timestamp NULL DEFAULT NULL,
  `disabled_by` varchar(31) DEFAULT NULL COMMENT 'disabled_by：（user_login_id或party_id）',
  `successive_failed_logins` int(11) DEFAULT NULL,
  `current_status` char(1) DEFAULT NULL COMMENT '0-正常；1-禁用',
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`party_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mo_user_login
-- ----------------------------
BEGIN;
INSERT INTO `mo_user_login` VALUES ('159376436426313728', 'admin', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', NULL, '系统管理员', '', '系统管理员', 'admin@gmail.com', '18600000000', NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '2019-03-16 11:05:04', 'admin', '2019-06-18 14:39:57', 'admin');
INSERT INTO `mo_user_login` VALUES ('193386400916312064', 'wangzong', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', NULL, '王总', '王', '总', '', '', NULL, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '2019-06-18 07:28:31', 'admin', '2019-06-18 07:28:31', 'admin');
INSERT INTO `mo_user_login` VALUES ('193386885446504448', 'zhangsan', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', NULL, '张三', '张', '三', '', '', NULL, '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '2019-06-18 07:30:26', 'admin', '2019-06-18 14:37:58', 'zhangsan');
COMMIT;


0;

-- ----------------------------
-- Table structure for issue
-- ----------------------------
DROP TABLE IF EXISTS `issue`;
CREATE TABLE `issue` (
  `issue_id` varchar(20) NOT NULL,
  `issue_title` varchar(255) DEFAULT NULL,
  `issue_content` varchar(1023) DEFAULT NULL,
  `reporter` varchar(63) DEFAULT NULL,
  `reporter_id` varchar(20) DEFAULT NULL,
  `issue_type` varchar(255) DEFAULT NULL,
  `issue_status` varchar(255) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`issue_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for issue_fix
-- ----------------------------
DROP TABLE IF EXISTS `issue_fix`;
CREATE TABLE `issue_fix` (
  `issue_fix_id` varchar(20) NOT NULL,
  `issue_id` int(11) DEFAULT NULL,
  `issue_fix_content` varchar(1023) DEFAULT NULL,
  `issue_fix_time` timestamp NULL DEFAULT NULL,
  `issue_fix_user_id` varchar(20) DEFAULT NULL,
  `issue_fix_user` varchar(63) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `created_user_login` varchar(63) DEFAULT NULL,
  `last_updated_time` timestamp NULL DEFAULT NULL,
  `last_updated_user_login` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`issue_fix_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for issue_pic
-- ----------------------------
DROP TABLE IF EXISTS `issue_pic`;
CREATE TABLE `issue_pic` (
  `issue_pic_id` varchar(20) NOT NULL,
  `issue_id` varchar(20) DEFAULT NULL,
  `issue_pic_url` varchar(2047) DEFAULT NULL,
  `issue_pic` blob,
  PRIMARY KEY (`issue_pic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

