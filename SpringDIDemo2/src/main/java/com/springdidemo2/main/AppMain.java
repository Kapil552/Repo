package com.springdidemo2.main;

import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdidemo2.entity.Candidate;
import com.springdidemo2.entity.ClassRoom;
import com.springdidemo2.entity.ClassRoom2;
import com.springdidemo2.entity.Container;
import com.springdidemo2.entity.DbConnection;
import com.springdidemo2.entity.PlayList;

public class AppMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("spring_config.xml");
		
//		ClassRoom c = context.getBean("clr", ClassRoom.class);
//		c.getStudentNames().forEach(System.out::println);
		
//		ClassRoom2 cl = context.getBean("clr2", 
//				ClassRoom2.class);
//		String[] arr = cl.getStudentNames();
//		for(String str : arr)
//			System.out.println(str);
		
//		PlayList pl = context.getBean("pls", PlayList.class);
//		pl.getSongs().forEach(System.out::println);
		
//		Candidate cnd = context.getBean("cnd", Candidate.class);
//		Set<Entry<String, String>> eset = 
//				cnd.getInterviews().entrySet();
//		for(Entry<String, String> e : eset)
//			System.out.println(e.getKey() + " : " 
//									+ e.getValue());
		
//		DbConnection con = context.getBean("con", 
//				DbConnection.class);
//		System.out.println(con.getDbProperties());
		
		Container cn = context.getBean("cntr", Container.class);
		System.out.println(cn.getRef1().getX());
		System.out.println(cn.getRef2().getY());
	}
}




