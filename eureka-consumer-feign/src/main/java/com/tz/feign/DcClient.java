package com.tz.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tz
 * @Classname DcClient
 * @Description feign 接口
 * @Date 2019-08-22 16:42
 */
@FeignClient("eureka-client1")
public interface DcClient {
        @GetMapping("/dc")
        String consumer();
}
