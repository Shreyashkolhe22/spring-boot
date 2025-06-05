package com.example.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {
    @Value("32")
    private int ram;
    private computer con;

    public computer getCon() {
        return con;
    }

    @Autowired
    public void setCon(computer con) {
        this.con = con;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void code()
    {
        con.compile();
    }
}

