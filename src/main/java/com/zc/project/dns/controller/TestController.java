package com.zc.project.dns.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author corey
 * @creat 2022/5/2 19:45
 * @describe For test mvc.
 */
@RestController
@RequestMapping
@Api("Test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
