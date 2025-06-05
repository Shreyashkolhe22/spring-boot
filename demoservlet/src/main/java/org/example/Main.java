package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello, World!");
        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8086);

        Context context=tomcat.addContext("",null);
        Tomcat.addServlet(context,"helloservlet", new helloservlet());
        context.addServletMappingDecoded("/hello","helloservlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}