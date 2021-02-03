package com.company.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() 
        return "Hello World from ABC Inc., est 2020.";
>>>>>>> 54c19abe2ca2375b6a54e47f9074ecba1cac83a2
    }
}
