package com.funtl.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    //使用@PathVariable接收参数，参数值需要在url进行占位
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return "Hello Nacos Provider " + string;
    }

    @GetMapping(value ="/lb")
    public String lb() {
        return "Hello Nacos Provider, I am from port: " + port;
    }
}
