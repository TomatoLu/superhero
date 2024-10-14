1、通过 maven build 出 war file

2、执行 docker-compose.yml 将程序 war 直接放进 tomcat 镜像中，同时也会创建 mysql 镜像，
   理论上执行后，可以在本地环境直接访问api（http://localhost:8080/api/superheroes/add,http://localhost:8080/api/superheroes/list）

ps:由于个人电脑硬件问题和网络代理问题，未能成功访问 docker 服务及下载 （mysql）image 进行全面测试
故代码并未通过测试
