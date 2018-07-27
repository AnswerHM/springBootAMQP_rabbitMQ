package com.humin.amqp.service;

import com.humin.amqp.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:27/07/201810:32 AM
 */
@Service
public class BookService {

    @RabbitListener(queues = "humin.news")
    public void receive(Book book){
        System.out.println("收到消息："+book);
    }

    @RabbitListener(queues = "humin")
    public void receivedMessage(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }

}


