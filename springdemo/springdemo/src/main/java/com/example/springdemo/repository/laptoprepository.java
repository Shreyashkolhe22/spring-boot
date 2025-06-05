package com.example.springdemo.repository;

import com.example.springdemo.model.laptop;
import org.springframework.stereotype.Repository;

@Repository
public class laptoprepository {
    public void save(laptop lap)
    {
        System.out.println("laptop data is saved...");
    }
}
