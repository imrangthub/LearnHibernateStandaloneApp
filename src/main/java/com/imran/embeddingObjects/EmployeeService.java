package com.imran.embeddingObjects;

import org.hibernate.Session;
import com.imran.config.HibernateUtil;

public class EmployeeService {
	
	Session session;
	
	EmployeeService(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public boolean save(EmployeeEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.save(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	
	public boolean save(EmployeeEntityWithCollection obj){
		
    	
    	session.beginTransaction();
    	
    	session.save(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public boolean update(EmployeeEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.update(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	
	
	public EmployeeEntity findById(int id){
		EmployeeEntity obj =  (EmployeeEntity) session.get(EmployeeEntity.class, id);
		return obj;
	}
	
	public EmployeeEntityWithCollection findByCollId(int id){
		EmployeeEntityWithCollection obj =  (EmployeeEntityWithCollection) session.get(EmployeeEntityWithCollection.class, id);
		return obj;
	}
	
	public boolean saveOrUpdate(EmployeeEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.saveOrUpdate(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public boolean delete(EmployeeEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.delete(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	

	


	


}
