package com.chandan;
import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Runner r=ctx.getBean(Runner.class,"tr");
		r.runner();
		
		

	}

}
