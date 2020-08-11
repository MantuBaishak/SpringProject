package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main()");
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		Object obj=null;
		String result=null;
		
		//hold name and location of spring bean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/ApplicationContext.xml");
		//create BeanFactory IOC container
		factory=new XmlBeanFactory(res);
		//get Target bean class object
		obj=factory.getBean("wmg");
		//TypeCasting
		generator=(WishMessageGenerator)obj;
		//invoke the method
		result=generator.generateWishMessage("Mantu");
		System.out.println("Message::"+result);

	}

}
