package com.examplespringjdbc.demospringjdbc.service;

import com.examplespringjdbc.demospringjdbc.model.student;
import com.examplespringjdbc.demospringjdbc.repository.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice {
    private studentrepo repo;

    public studentrepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(studentrepo repo) {
        this.repo = repo;
    }

    public void addstudent(student s1)
    {
        repo.save(s1);
    }

    public List<student> getstudents() {return  repo.findall();

    }
}
