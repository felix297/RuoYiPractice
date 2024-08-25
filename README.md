# RuoYi Practice Reporsitory

# 项目结构

1. 打包方式的区别

    父：packaging pom

    子：packaging jar

    > 自行搜索：maven 打包方式的区别

2. 子工程的iml文件为什么可删除

    可以不删，iml保存的是项目的信息，留着也行，ruoyi源码是没删的

3. 项目分层

    引父类pom里面的东西：common项目 大家都会用到的依赖， system 项目引用了common项目的依赖，以此类推

    ruoyi-admin --> ruoyi-framework --> ruoyi-system --> ruoyi-common

    ruoyi-quartz --> ruoyi-common

    rouyi-generator --> ruoyi-common

# 项目启动

ruoyi-admin 是 springboot 的启动类

ruoyi-admin 引入 ruoyi-framework 的 pom，在 ruoyi-framework 中引入 spring boot web starter

> dependencies 和 dependencyManagement 的区别
> spring-boot-starter-parent 和 spring-boot-starter-dependencies 不能被项目直接引入

# 连接数据库

## 添加依赖

mysql

springboot 集成 mybatis

阿里数据库连接池

## springboot 配置 

在 application.yaml 中配置 mybatis 和 druid 相关信息 