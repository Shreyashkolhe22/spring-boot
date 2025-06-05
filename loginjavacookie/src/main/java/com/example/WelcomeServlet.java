package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String user = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    user = c.getValue();
                    break;
                }
            }
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (user != null) {
            out.println("<h2>Welcome, " + user + "!</h2>");
            out.println("<a href='logout'>Logout</a>");
        } else {
            out.println("<h3>You are not logged in. <a href='login.html'>Login here</a></h3>");
        }
    }
}