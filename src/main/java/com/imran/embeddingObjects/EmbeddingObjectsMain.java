package com.imran.embeddingObjects;

import com.imran.crud.StudentEntity;
import com.imran.crud.StudentService;

public class EmbeddingObjectsMain {

	public static void main(String[] args) {

		System.out.println("===================================== Embedding ==================================");

		EmployeeService employeeService= new EmployeeService();
	
		EmployeeEntity obj = new EmployeeEntity();
		EmployeeEntityWithCollection collObj = new EmployeeEntityWithCollection();
		AddressEmbd embObj1 = new AddressEmbd();
		AddressEmbd embObj2 = new AddressEmbd();
		AddressEmbd embObj3 = new AddressEmbd();
		
		embObj1.setCity("Cicago");
		embObj1.setCountry("America");
		
		embObj2.setCity("Vargina");
		embObj2.setCountry("America");
		
		embObj3.setCity("Wasington DC");
		embObj3.setCountry("America");
		
		
		collObj.setName("Imran2");
		collObj.setGender("Male");
		
//		obj.setAddressEmbd(embObj);
//    	employeeService.save(obj);
		
//	
//		collObj.getAddressList().add(embObj1);
//		collObj.getAddressList().add(embObj2);
//		collObj.getAddressList().add(embObj3);
//		
  	//employeeService.save(collObj);		

    	
 
 //   	System.out.println("After update: "+obj);
    	System.out.println("After update: "+employeeService.findByCollId(3));

	}

}
