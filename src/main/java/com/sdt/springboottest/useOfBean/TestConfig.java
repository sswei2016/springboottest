package com.sdt.springboottest.useOfBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weishanshan 2022/8/18
 */
@Configuration
public class TestConfig {
    //想交给Spring管理的方法，去调用想调用的类
    @Bean
    public MessageBuilder messageBuilder(){
        return new MessageBuilder();
    }
}
