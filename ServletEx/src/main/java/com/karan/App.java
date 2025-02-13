package com.karan;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {

        System.out.println( "Hello World!" );
        Tomcat tomcat =new Tomcat();
        tomcat.setPort(8080);   //By default it is 8080


        Context context =tomcat.addContext("",null);
        Tomcat.addServlet(context,"h1",new HelloServlet());
        context.addServletMappingDecoded("/hello","h1");

        tomcat.start();
        tomcat.getServer().await();

    }
}
