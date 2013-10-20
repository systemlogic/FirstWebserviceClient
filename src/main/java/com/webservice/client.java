package com.webservice;

import localhost.FirstWebservice.Hello_jws.Hello;
import localhost.FirstWebservice.Hello_jws.HelloService;
import localhost.FirstWebservice.Hello_jws.HelloServiceLocator;

public class client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		HelloServiceLocator hsl = new HelloServiceLocator();
		Hello hello = hsl.getHello();
		String str = hello.hi("Sonia");
		int a = 10;
		int b = 15;
		int sum = hello.sum(a, b);
		System.out.println("Sum of a + b = " + sum);
		System.out.println("Message recieved from server is : " + str  );
	}

}
