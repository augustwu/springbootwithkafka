package com.chinatelecom;

import cn.chinatelecom.dp.processengine.sdk.service.KafkaConsumerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.chinatelecom.dp.*"})
@PropertySource(value={"classpath:conf/sdk.properties","application.properties"})
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(111);
	}

}
