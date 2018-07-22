package com.imran.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.imran.config.HibernateUtil;

public class CrudMain {
	
	

	
	public static void main(String[] args) {
		
		System.out.println("===================================== CRUD ==================================");

		    StudentService studentService= new StudentService();
		
        	StudentEntity studentObj = new StudentEntity();
        	
        	studentService.save(studentObj);
        	
        	System.out.println("After update: "+studentObj);


	}

}
