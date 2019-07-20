package com.tcilay.architect.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tcilay
 * @create 2019-07-20 15:45
 */
@Api(value = "Demo for Hello",description = "Hello World")
@RestController("/demo/")
@Slf4j
public class HelloController {

    @ApiImplicitParam(name = "name",value = "名称",required = true)
    @GetMapping("hello")
    public String hello(String name){
        log.info("execute hello method for param is {}",name);
        return "Hello "+name;
    }
}
