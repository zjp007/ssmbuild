# ssm框架项目（demo）

## 1.配置环境

- JDK 	        1.8.0_261
- Maven       3.3.9
- Spring         2.3.4
- Tomcat       9.0.39
- Idea             2017.3.7
- MySQL        5.6.50

配置版本

- Mybatis（3.5.2）

- mybatis-spring（2.0.2）

- spring（5.1.9）

- fastjson（1.2.73）

- lombok（1.18.12）

  

  数据库表（数据库-ssmbuild）

  ```sql
  DROP TABLE IF EXISTS `books`;
  CREATE TABLE `books` (
    `bookID` int(10) NOT NULL AUTO_INCREMENT COMMENT '书id',
    `bookName` varchar(100) NOT NULL COMMENT '书名',
    `bookCounts` int(11) NOT NULL COMMENT '数量',
    `detail` varchar(200) NOT NULL COMMENT '描述',
    PRIMARY KEY (`bookID`),
    KEY `bookID` (`bookID`)
  ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
  
  INSERT INTO `books` VALUES ('1', 'Java', '1', '从入门到放弃');
  INSERT INTO `books` VALUES ('2', 'MySQL', '10', '从删库到跑路');
  INSERT INTO `books` VALUES ('3', 'Linux', '5', '冲进门到进牢');
  INSERT INTO `books` VALUES ('4', 'PHP', '1', 'PHP是最好的语言');
  
  ```

