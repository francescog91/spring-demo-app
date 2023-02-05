package com.francesco.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	
	private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String sayHello() {
    	logger.info("sayHello - print message");
    	
        return "Hello World";
    }
}
