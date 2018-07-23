package com.imran.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

public class MainClsTow {

	public static void main(String[] args) {
		System.out.println("===================================== One To Many ==================================");
		Service serviceObj= new Service();
		
		
		UserEntity userObj1 = new UserEntity();
		userObj1.setName("MD IMRAN HOSSAIN");
		userObj1.setAge(26);
		userObj1.setDepartmentEntity(new DepartmentEntity(1));
		
		
		UserEntity userObj2 = new UserEntity();
		userObj2.setName("MD BaBU");
		userObj2.setAge(260);
		userObj2.setDepartmentEntity(new DepartmentEntity(1));
		
		DepartmentEntity deptObj1 = new DepartmentEntity();
		
		deptObj1.setName("Software");
		deptObj1.setDescription("java developer");
	
		
	   // serviceObj.saveDept(deptObj1);
		
	    serviceObj.saveUser(userObj2);
	    
	    deptObj1 =     serviceObj.findByIdDept(1);
	    userObj1 =     serviceObj.findByIdUser(1);
		
		
	//	empObj = serviceObj.findByIdEmployee(1);
		 
		 
//		System.out.println("Dept : "+deptObj1);
//		System.out.println("Dept User : "+deptObj1.getUserList());
//		
		System.out.println("User : "+userObj1);
		//System.out.println("Dept User : "+deptObj1.getUserList());

		
		
		
		
		
		


		

	}

}
