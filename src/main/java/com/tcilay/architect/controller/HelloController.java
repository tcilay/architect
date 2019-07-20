package com.tcilay.architect.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tcilay
 * @create 2019-07-20 15:45
 */
@Api(value = "Demo for Hello",description = "Hello World",tags = "Demo for Hello ...")
@RestController("/demo/")
@Slf4j
public class HelloController {

    @ApiOperation(value = "hello Demo",notes = "This is Demo for Hello ...")
    @ApiImplicitParam(name = "name",value = "名称",required = true,dataType = "String")
    @GetMapping("hello")
    public String hello(String name){
        log.info("execute hello method for param is {}",name);
        return "Hello "+name;
    }
}
