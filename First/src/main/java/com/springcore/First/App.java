package com.springcore.First;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Hello World !!!!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
}