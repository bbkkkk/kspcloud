package com.kspcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 *
 * @description: provider 启动后需要过几分钟测试才通，并不是配置错误，这里就要延伸到euraka
 *
 * @author PeterLee
 * @date 2018/3/21 10:29
 * @param
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class KsplcoudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(KsplcoudZuulApplication.class, args);
	}
}
