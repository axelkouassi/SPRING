package com.axel.axel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Car obj = (Car)context.getBean("car");
		obj.drive();
    	
    	//Tire t = (Tire)context.getBean("tire");
    	//System.out.println(t);
    	
    }
}
