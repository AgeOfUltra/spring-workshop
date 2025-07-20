package com.bookapp.restapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//Rest api
@RestController
public class GreetController {

    //each method is a rest end point
    // return type can be anything
    @GetMapping("/welcome")
    public String welcomeMessage(){

        return "Welcome to Spring Boot REST API!";
    }

    // way 1 of passing value
    @GetMapping("/hello/{username}")
    public String sayHello(@PathVariable String username){

        return "Hello "+username+"!";
    }
    @GetMapping("/greet-user")
    public String greetUser(@RequestParam String username){

        return "Hello "+username+"!";
    }
}
