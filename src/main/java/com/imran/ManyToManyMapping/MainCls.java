package com.imran.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

public class MainCls {

	public static void main(String[] args) {
		System.out.println("===================================== Many To Many ==================================");
		Service serviceObj= new Service();
		
		List<EmployeeEntity> employeeList = new ArrayList<>();
		List<AddressEntity> addressList = new ArrayList<>();
		
	//	addressObj2 = serviceObj.findByIdAddress(1);
		
//		
//		addressList.add(addressObj1); 

		
		
		AddressEntity addressObj1 = new AddressEntity();
		addressObj1.setCity("Dhaka");
		addressObj1.setCountry("Bangladesh");
		
		AddressEntity addressObj2 = new AddressEntity();
		addressObj2.setCity("Parish");
		addressObj2.setCountry("Franch");
		
		AddressEntity addressObj3 = new AddressEntity();
		addressObj3.setCity("Chicago");
		addressObj3.setCountry("America");
		
		EmployeeEntity empObj1 = new EmployeeEntity();
		empObj1.setName("MD IMRAN HOSSAIN");
		empObj1.setGender("Male");
		
		EmployeeEntity empObj2 = new EmployeeEntity();
		empObj2.setName("MD BaBu HOSSAIN");
		empObj2.setGender("Male");
		

		
		addressList.add(addressObj1); 
		addressList.add(addressObj2); 
		addressList.add(addressObj3); 
		
		employeeList.add(empObj1);
		employeeList.add(empObj2);
		
		
	//	empObj1.setAddressList(addressList);
		
	//   serviceObj.save(empObj);
			
		//empObj1 = serviceObj.findByIdEmployee(1);
		
		
		addressObj2.setEmpList(employeeList);
		empObj1.setAddressList(addressList);
		empObj2.setAddressList(addressList);
		
	//	serviceObj.saveAddress(addressObj2);
		
		//  serviceObj.save(empObj1);
		
		empObj1 = serviceObj.findByIdEmployee(3);
		 
		 
		System.out.println("Employee: "+empObj1);
		//System.out.println("Employee: "+empObj1.getAddressList());

		
		
		
		
		
		


		

	}

}
