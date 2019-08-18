package com.helloworld.greeting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
    public String sayHello() {
        return "Hello-World";
    }
}
