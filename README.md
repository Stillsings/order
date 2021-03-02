# **订单处理**
## 系统简介

* 采用Java语言完成

* 采用Restful设计风格，基于SpringBoot、SpringMVC、Spring、Spring data jdbc、
Swagger，数据库采用嵌入式H2数据库

* 运行所需环境：jdk8以上环境

## 完成点
* 模拟数据源（已完成）

* 订单处理服务（已完成）

## 运行方式
1. 将项目git clone到本地后
2. 进入项目文件夹
3. 进入target文件夹，项目已经编译打包好，因为SpringBoot已经内置了Tomcat服务器
4. 运行cmd
5. 输入java -jar ./order-0.0.1-SNAPSHOT.jar即可运行程序


![image](https://github.com/Stillsings/order/blob/master/public/run.png)

## 功能点验证
#### **模拟数据源**
用户100人，商品100种，订单数量1000

****
#### **支持通过用户id获取用户订单历史**
返回结果为用户的历史订单集
测试地址：http://localhost:8080/api/v1/orders/user/{userId}

例如：查询用户id为1的数据
http://localhost:8080/api/v1/orders/user/1

postman测试结果：

![image](https://github.com/Stillsings/order/blob/master/public/post1.png)

chrome测试结果

![image](https://github.com/Stillsings/order/blob/master/public/chrome1.png)
****
#### **支持按skuId查询从下单到实际付款概率**
返回结果为实际付款概率
测试地址：http://localhost:8080/api/v1/orders/paidOrderRate/{skuId}

例如：查询商品id为1的数据
http://localhost:8080/api/v1/orders/paidOrderRate/1

postman测试结果：

![image](https://github.com/Stillsings/order/blob/master/public/post2.png)

chrome测试结果

![image](https://github.com/Stillsings/order/blob/master/public/chrome2.png)
****
#### **支持按时段获得成交量最高的sku top10**
返回结果为时间段内Top10销量的商品skuid

测试地址：http://localhost:8080/api/v1/orders/skuTop10/start/{start}/end/{end}

例如：查询时间戳在1614142877与1615142877成交量最高的sku top10数据
http://localhost:8080/api/v1/orders/skuTop10/start/1614142877/end/1615142877

postman测试结果：

![image](https://github.com/Stillsings/order/blob/master/public/post3.png)

chrome测试结果

![image](https://github.com/Stillsings/order/blob/master/public/chrome3.png)
## API
可通过Swagger访问API
http://localhost:8080/swagger-ui.html

![image](https://github.com/Stillsings/order/blob/master/public/swagger.png)