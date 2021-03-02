package com.example.order.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: 17204114-李欢
 * @Date: 2021/03/02/15:01
 * @Description:
 */
@SpringBootConfiguration
@PropertySource(value = {"classpath:order.properties"})
@ConfigurationProperties(prefix = "order")
public class OrderProperties {
    private SwaggerProperties swagger = new SwaggerProperties();

    public SwaggerProperties getSwagger() {
        return swagger;
    }

    public void setSwagger(SwaggerProperties swagger) {
        this.swagger = swagger;
    }
}
