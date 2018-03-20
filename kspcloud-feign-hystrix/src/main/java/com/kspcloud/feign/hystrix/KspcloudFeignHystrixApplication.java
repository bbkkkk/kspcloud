package com.kspcloud.feign.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @description:
 * 注释掉 EnableHystrix 对熔断不影响，主要看SchedualServiceHi 中fallback注解参数配置
 * @FeignClient(value = "kspd-provider",fallback = SchedualServiceHiHystric.class)
 * @author PeterLee
 * @date 2018/3/20 19:03
 * @param null
 */
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableFeignClients
public class KspcloudFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(KspcloudFeignHystrixApplication.class, args);
	}
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
