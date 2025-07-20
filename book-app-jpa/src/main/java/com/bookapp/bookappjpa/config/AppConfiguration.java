package com.bookapp.bookappjpa.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean // bean definition
    ModelMapper mapper(){
        return new ModelMapper();
    }

}
