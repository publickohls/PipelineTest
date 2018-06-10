package com.example.PipelineTest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PipelineTestController {

    @RequestMapping("/")
    public String index() {
        return "PipelineTest Running";
    }

}