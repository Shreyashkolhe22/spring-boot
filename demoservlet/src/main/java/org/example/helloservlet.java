package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class helloservlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res)
    {
        System.out.println("hello user");
    }
}
