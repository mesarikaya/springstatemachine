package com.mes.springstatemachine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mesar on 2/26/2020
 */
@RestController
public class RestApiController {

    @GetMapping("/")
    public String greet() {
        return "Hello!";
    }
}