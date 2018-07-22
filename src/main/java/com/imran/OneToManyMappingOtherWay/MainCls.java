package com.imran.OneToManyMappingOtherWay;

import java.util.ArrayList;
import java.util.List;

public class MainCls {

	public static void main(String[] args) {
		System.out.println("===================================== One To Many ==================================");
		Service serviceObj= new Service();
		
		
		AddressEntity addressObj1 = new AddressEntity();
		addressObj1.setCity("Dhaka");
		addressObj1.setCountry("Bangladesh");
		
		AddressEntity addressObj2 = new AddressEntity();
		addressObj2.setCity("Tokyo");
		addressObj2.setCountry("Japan");
		
		AddressEntity addressObj3 = new AddressEntity();
		addressObj3.setCity("Chicago");
		addressObj3.setCountry("America");
		
		EmployeeEntity empObj = new EmployeeEntity();
		empObj.setName("MD BaBu HOSSAIN");
		empObj.setGender("Male");
		
		List<AddressEntity> addressList = new ArrayList<>();
		
	//	addressObj2 = serviceObj.findByIdAddress(1);
		
		
		addressList.add(addressObj1); 
		addressList.add(addressObj2); 
		
		empObj.setAddressList(addressList);

		
		

		
	//   serviceObj.save(empObj);
		
		
	//	empObj = serviceObj.findByIdEmployee(1);
		 
		 
		System.out.println("Employee: "+empObj);

		
		
		
		
		
		


		

	}

}
