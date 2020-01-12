package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/1.0/sensor/lesense")
public class MockController {
    final static Logger log = LoggerFactory.getLogger(MockController.class);
    @PostMapping
    public void testeSensor(@RequestBody String value) {
        log.info("JSON recebido: \n" + value);
    }
}
