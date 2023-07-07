package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program started.........");
		// spring jdbc=> JdbcTemplate
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		Scanner sc = new Scanner(System.in);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		INSERT
		Student student = new Student();
		System.out.println("Enter student id :");
		student.setId(sc.nextInt());
		System.out.println("Enter your name :");
		student.setName(sc.next());
		System.out.println("Enter you city :");
		student.setCity(sc.next());

		int result = studentDao.insert(student);
		
		System.out.println("student added " + result);
		// UPDATE
//		Student student=new Student();
//		student.setId(245);
//		student.setName("Raj Kumar");
//		student.setCity("Lucknow");
//		int result = studentDao.change(student);
//		System.out.println("data changed "+result);

		// DELETE
//		int result = studentDao.delete(245);
//		System.out.println("deleted "+result);
//		

//		Student student = studentDao.getStudent(456);
//		System.out.println(student);
//

//		List<Student> students = studentDao.getAllStudents();
//		for (Student s : students) {
//			System.out.println(s);
//
//		}
	}
}
