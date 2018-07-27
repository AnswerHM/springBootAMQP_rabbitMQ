package com.humin.amqp.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:27/07/201810:02 AM
 */

/**
 * 自定义消息转换模式：默认rabbitMQ是根据java序列化模式进行消息序列化传输的，用此防范，可以将参数转换为json格式。
 */
@Configuration
public class MyAMQPConfig {

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
