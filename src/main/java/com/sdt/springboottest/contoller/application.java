package com.sdt.springboottest.contoller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author weishanshan 2022/8/13
 */
@Controller
public class application {

    @RequestMapping("/test")
    @ApiOperation(value = "这是swagger的测试功能", response = String.class, httpMethod = "GET")
    public String index() {
        System.out.println("hello.springboot的第一个controller");
        return "index";
    }


}
