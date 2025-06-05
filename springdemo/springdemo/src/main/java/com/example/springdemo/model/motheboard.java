package com.example.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class motheboard {
    @Autowired
    ram r;
    public void callram()
    {
        r.display();
    }

}
