package com.imran.ManyToManyMapping;

import org.hibernate.Session;
import com.imran.config.HibernateUtil;


public class Service {
	
	Session session;
	
	Service(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public boolean save(EmployeeEntity obj){
		

    	session.beginTransaction();
    	
    	session.save(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	public boolean saveAddress(AddressEntity obj){
		

    	session.beginTransaction();
    	
    	session.save(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public boolean saveOrUpdate(EmployeeEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.saveOrUpdate(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public EmployeeEntity findByIdEmployee(int id){
		EmployeeEntity obj =  (EmployeeEntity) session.get(EmployeeEntity.class, id);
		return obj;
	}
	
	public AddressEntity findByIdAddress(int id){
		AddressEntity obj =  (AddressEntity) session.get(AddressEntity.class, id);
		return obj;
	}
	
	public boolean delete(EmployeeEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.delete(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public boolean deleteAddress(AddressEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.delete(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	

}
