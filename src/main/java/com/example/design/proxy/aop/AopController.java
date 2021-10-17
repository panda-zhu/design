package com.example.design.proxy.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopController {
    @RequestMapping("before")
    public String testBeforeAdvice(){
        return "testBeforeAdvice方法开始执行！";
    }
}
