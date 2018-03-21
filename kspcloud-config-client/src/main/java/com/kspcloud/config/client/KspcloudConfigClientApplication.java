package com.kspcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @description:
 * 集群模式需要启动eureka中的配置
 * @author PeterLee
 * @date 2018/3/21 11:25
 * @param
 */
@SpringBootApplication
@RestController
public class KspcloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KspcloudConfigClientApplication.class, args);
	}
	@Value("${foo}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}
}
