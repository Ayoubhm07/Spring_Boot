package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.config.Greeting;


@RestController
@RequestMapping("/greeting")
class GreetingController {
        private final Greeting greeting;
        public GreetingController(Greeting greeting) {
            this.greeting = greeting;
        }
        @GetMapping
        String getGreeting() {
            return greeting.getName();
        }
        @GetMapping("/coffee")
        String getNameAndCoffee() {
            return greeting.getCoffee();
        }

}

