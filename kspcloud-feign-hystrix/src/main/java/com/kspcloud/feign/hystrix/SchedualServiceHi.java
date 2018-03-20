package com.kspcloud.feign.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @description:
 * 注释掉 fallback = SchedualServiceHiHystric.class 熔断就失效
 * @author PeterLee
 * @date 2018/3/20 19:02
 * @param
 */
@FeignClient(value = "kspd-provider",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}