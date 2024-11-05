package com.manytomanybidemo.main;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manytomanybidemo.pojo.Course;
import com.manytomanybidemo.pojo.Student;

public class AppMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Student s1 = new Student();
		s1.setStudentId(1233);
		s1.setStudentName("Amit");
		
		Student s2 = new Student();
		s2.setStudentId(1234);
		s2.setStudentName("Sumit");
		
		Course c1 = new Course();
		c1.setCourseId(4566);
		c1.setCourseName("cricket");
		
		Course c2 = new Course();
		c2.setCourseId(4567);
		c2.setCourseName("carrom");
		
		Set<Course> cset1 = new HashSet<>();
		cset1.add(c1);
		cset1.add(c2);
		s1.setCourses(cset1);
		
		Set<Course> cset2 = new HashSet<>();
		cset2.add(c2);
		s2.setCourses(cset2);
		
		Set<Student> sset1 = new HashSet<>();
		sset1.add(s1);
		c1.setStudents(sset1);
		
		Set<Student> sset2 = new HashSet<>();
		sset2.add(s1);
		sset2.add(s2);
		c2.setStudents(sset2);
		
		s.persist(s1);
		s.persist(s2);
		s.persist(c1);
		s.persist(c2);
		
		tr.commit();
		System.out.println("objects saved");
		
		sf.close();
	}
}
