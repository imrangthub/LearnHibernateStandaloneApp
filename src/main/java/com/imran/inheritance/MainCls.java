package com.imran.inheritance;

import java.util.ArrayList;
import java.util.List;

public class MainCls {

	public static void main(String[] args) {
		System.out.println("===================================== Inheritance ==================================");
		
		Service serviceObj= new Service();
		
		List<EmployeeEntity> employeeList = new ArrayList<>();
		List<AddressEntity> addressList = new ArrayList<>();
		
	
		AddressEntity addressObj1 = new AddressEntity();
		addressObj1.setCity("Dhaka");
		addressObj1.setCountry("Bangladesh");
		
		AddressEntity addressObj2 = new AddressEntity();
		addressObj2.setCity("Parish");
		addressObj2.setCountry("Franch");
		
		EmployeeEntity empObj1 = new EmployeeEntity();
		empObj1.setName("MD IMRAN HOSSAIN");
		empObj1.setGender("Male");

		 
		 
		System.out.println("Employee: "+empObj1);


		

	}

}
