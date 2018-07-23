package com.imran.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

public class MainClsTow {

	public static void main(String[] args) {
		System.out.println("===================================== Many To Many ==================================");
		ServiceTow serviceObj= new ServiceTow();
		
		List<DepartmentEntity> deptList = new ArrayList<>();
		List<UserEntity> userList = new ArrayList<>();
		
		
		UserEntity userObj1 = new UserEntity();
		userObj1.setName("MD IMRAN HOSSAIN");
		userObj1.setAge(26);

		
		
		UserEntity userObj2 = new UserEntity();
		userObj2.setName("MD BaBU");
		userObj2.setAge(260);

		
		DepartmentEntity deptObj1 = new DepartmentEntity();
		
		deptObj1.setName("Software");
		deptObj1.setDescription("java Group");
		
		DepartmentEntity deptObj2 = new DepartmentEntity();
		
		deptObj2.setName("Hardware");
		deptObj2.setDescription("CCNA Group");
		
		deptList.add(deptObj1);
		deptList.add(deptObj2);
		
		userObj1.setDepartmentList(deptList);
		
		
		
		
    //	serviceObj.saveDept(deptObj1);
		
		
     	serviceObj.saveUser(userObj1);

		 
		 
//		System.out.println("Dept : "+deptObj1);
//		System.out.println("Dept User : "+deptObj1.getUserList());
//		
		System.out.println("User : "+userObj1);
		//System.out.println("Dept User : "+deptObj1.getUserList());

		
		
		
		
		
		


		

	}

}
