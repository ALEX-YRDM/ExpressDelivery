# ExpressDelivery

## 马卡巴咖

### 如何运行：

1.数据库

```sql
create database if not exists delivery;
use delivery;
执行sql文件夹下的delivery.sql文件 创建数据库表以及一些数据
```

2.修过application.yml中的数据库配置

3.运行SpringBoot启动类即可

### 访问地址：

1.前端点餐： 127.0.0.1:8080/front/index.html

​	登录页面默认验证码为 0000

2.后台管理： 127.0.0.1:8080/backend/index.html

​	后台默认用户名 admin 密码：123456