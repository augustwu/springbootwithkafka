//package com.chinatelecom.configuration;
//
//import cn.chinatelecom.dp.processengine.sdk.service.KafkaConsumer;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
///**
// * Created by wu on 18-2-28.
// */
//
//@Component
//@Configuration
//public class SubKafkaConsumer  extends KafkaConsumer {
//
//
//
//
//    @KafkaListener(topics = "${topic}")
//    protected void handleMessage(String message) {
//
//        System.out.println(message);
//    }
//
//}
