package com.example.demo.controller.demo;

import com.example.demo.config.SpringFoxConfig;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(tags = {SpringFoxConfig.DEMO_TAG})
public class DemoController {

    @GetMapping
    public String demoSayHello() {
        return "Hello! Welcome.";
    }

}
