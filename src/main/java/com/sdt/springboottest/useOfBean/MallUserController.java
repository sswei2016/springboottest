package com.sdt.springboottest.useOfBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weishanshan 2022/8/18
 */
@RestController
public class MallUserController {
    //调用
    @Autowired
    private MessageBuilder messageBuilder;

    @PostMapping("/findAllUser")
    public Object findAllUser(@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNo,
                              @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize){

        messageBuilder.getInstance();
        return null;
    }

    @GetMapping("/findBean")
    public Object findBean(){
        messageBuilder.getInstance();
        return null;
    }

}
