package com.example.springdemo.service;

import com.example.springdemo.model.laptop;
import com.example.springdemo.repository.laptoprepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class laptopservice {
    @Autowired
    public laptoprepository repo;
    public void addlaptop(laptop lap)
    {
        System.out.println("best gaming performance");
        repo.save(lap);
    }
}
