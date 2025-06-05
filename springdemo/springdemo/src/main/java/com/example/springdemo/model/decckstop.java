package com.example.springdemo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class decckstop  implements computer {
    public void compile()
    {
        System.out.println("compilinng  deeckstop");
    }
}
