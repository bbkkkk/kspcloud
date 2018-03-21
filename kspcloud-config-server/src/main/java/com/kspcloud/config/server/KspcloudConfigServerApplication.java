package com.kspcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 *
 * @description:
 *集群模式需要配置eureka注册中心，并需要在程序的启动类Application加上@EnableEureka的注解。
 * @author PeterLee
 * @date 2018/3/21 11:24
 * @param
 */
@SpringBootApplication
@EnableConfigServer
public class KspcloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KspcloudConfigServerApplication.class, args);
	}
}
