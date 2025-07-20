package com.example.springbootbasic.implementation;

import com.example.springbootbasic.service.IGreeterService;
import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements IGreeterService {

    @Override
    public String greetUser(String userName) {
        return "Hello "+userName;
    }
}
