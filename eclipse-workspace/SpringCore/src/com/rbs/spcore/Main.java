package com.rbs.spcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
//		
		Employee s=(Employee)factory.getBean("e");
		s.show();
		
		Courses c= (Courses) factory.getBean("c");
//		c.showCourses();
		c.showCoursesAndFees();
	}
}