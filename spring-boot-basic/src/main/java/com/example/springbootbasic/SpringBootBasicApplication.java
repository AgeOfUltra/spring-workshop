package com.example.springbootbasic;

import com.example.springbootbasic.implementation.GreeterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApplication.class, args);

        var context = new AnnotationConfigApplicationContext(GreeterServiceImpl.class);
        var greeter = context.getBean(GreeterServiceImpl.class);
        System.out.println(greeter.greetUser("Tony"));
    }
// this part need to implement CommandLiner
//    private GreeterServiceImpl greeterService;
//    @Autowired
//    public void setGreeterService(GreeterServiceImpl greeterService) {
//        this.greeterService = greeterService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println(greeterService.greetUser("Srikanth"));
//    }
}
