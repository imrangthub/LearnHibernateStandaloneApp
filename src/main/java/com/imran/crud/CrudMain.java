package com.imran.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.imran.config.HibernateUtil;

public class CrudMain {
	
	

	
	public static void main(String[] args) {
		
		System.out.println("===================================== CRUD ==================================");

		    StudentService studentService= new StudentService();
		
        	StudentEntity studentObj = new StudentEntity();
        	
        	studentObj = studentService.findById(1);
        	
        	System.out.println("Before update: "+studentObj);
        	
        	studentObj.setGender("Male update");
        	
        	System.out.println("Before Saved: "+studentObj);
        	
        	studentService.delete(studentObj);
        	
        	System.out.println("After update: "+studentObj);


	}

}
