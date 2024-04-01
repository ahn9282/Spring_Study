package edu.sejong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainClass2 {
	public static void main(String[] args) {
		String configLocation = "classpath:appCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		
		  System.out.println("나의 이름 : "+myInfo.getName());
		  System.out.println("나의 체중 : "+myInfo.getWeight());
		  System.out.println("나의 키 : "+myInfo.getHeight()); System.out.print("나의 취미 : " + myInfo.getHobbys());
		 

		
		myInfo.getInfo();

	}

}
