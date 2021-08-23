drop database if exists iot;
drop user 'iot'@'127.0.0.1';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database iot default character set utf8mb4 collate utf8mb4_unicode_ci;
use iot;
create user 'iot'@'127.0.0.1' identified by 'iot123456';
grant all privileges on iot.* to 'iot'@'127.0.0.1';
flush privileges;