package com.it;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: cyb
 * @create: 2020/7/30 21:39
 */
@RestController
public class TestController {
    @RequestMapping("hello")
    public String hello() {
        return "<h1>hello spring-boot</h1>";
    }

}
