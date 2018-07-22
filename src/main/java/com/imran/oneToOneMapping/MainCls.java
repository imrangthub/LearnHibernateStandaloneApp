package com.imran.oneToOneMapping;


public class MainCls {

	public static void main(String[] args) {
		System.out.println("===================================== One To One  ==================================");
		OneToOneMappingService serviceObj= new OneToOneMappingService();
		
		
		AddressEntity addressObj1 = new AddressEntity();
		addressObj1.setCity("Dhaka");
		addressObj1.setCountry("Bangladesh");
		
		AddressEntity addressObj2 = new AddressEntity();
		addressObj2.setCity("Tokyo");
		addressObj2.setCountry("Japan");
		
		EmployeeEntity empObj = new EmployeeEntity();
		empObj.setName("MD IMRAN HOSSAIN");
		empObj.setGender("Male");
		empObj.setAddressEntity(addressObj1);
		
		//serviceObj.saveAddress(addressObj2);
		
	   //  serviceObj.save(empObj);
		
	//	serviceObj.saveAddress(addressObj2);
		
		 empObj = serviceObj.findByIdEmployee(1);
		 
//		 empObj.setAddressEntity(new AddressEntity(2));
//		 serviceObj.saveOrUpdate(empObj);
		 
	//	 serviceObj.delete(empObj);
		
		
	//	serviceObj.deleteAddress(serviceObj.findByIdAddress(1));
		
		 
		 
		 System.err.println("Employee: "+empObj);
		
		
		
		
		
		


		

	}

}
