package com.example.mvcspring1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeconfig {
    @RequestMapping("/")
    public String home()
    {
        System.out.println("method called");
        return "index";
    }
    @RequestMapping("/add")
    public String add(student student)
    {
        return "result";
    }

}