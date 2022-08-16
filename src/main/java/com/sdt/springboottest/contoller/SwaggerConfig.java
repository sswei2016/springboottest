package com.sdt.springboottest.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author weishanshan 2022/8/13
 */
@Configuration
@EnableSwagger2 //开启swagger2
public class SwaggerConfig {

    /**
     * swagger-ui开关
     */
    @Value("${swagger.show}")
    private boolean swaggerShow;

    //配置了swagger的Docker的bean实例
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //包下的类，生成接口文档
                .build();
    }

    //配置Swagger信息
    private ApiInfo apiInfo() {
//        作者信息
        Contact contact = new Contact("", "", "");
        return new ApiInfoBuilder()
                .contact(contact)
                .title("图书管理系统")
                .description("接口文档")
                .termsOfServiceUrl("https://localhost:8181/book/findAll")
                .version("2.9.2")
                .build();
    }

}
