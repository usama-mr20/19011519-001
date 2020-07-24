package com.spring.springBoot.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/main")
public class textController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "Hello World !!!";
    }
}
