package com.imran.oneToOneBidirectionalMapping;


public class MainCls {

	public static void main(String[] args) {
		System.out.println("===================================== One To One Bidirectional ==================================");
		OneToOneBidirectionalMappingService serviceObj= new OneToOneBidirectionalMappingService();
		
		
		AddressEntity addressObj1 = new AddressEntity();
		addressObj1.setCity("Dhaka");
		addressObj1.setCountry("Bangladesh");
		
		AddressEntity addressObj2 = new AddressEntity();
		addressObj2.setCity("Tokyo");
		addressObj2.setCountry("Japan");
		
		EmployeeEntity empObj = new EmployeeEntity();
		empObj.setName("MD IMRAN HOSSAIN");
		empObj.setGender("Male");
		empObj.setAddressEntity(addressObj2);
		
		// serviceObj.save(empObj);
		
       addressObj1 = serviceObj.findByIdAddress(2);
		 
		 
		System.out.println("aDDRESS: "+addressObj1);
		System.out.println("Employee: "+addressObj1.getEmployeeEntity());
		
		
		
		
		
		


		

	}

}
