package com.imran.crud;

import org.hibernate.Session;
import com.imran.config.HibernateUtil;

public class StudentService {
	
	Session session;
	
	StudentService(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	
	public boolean save(StudentEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.save(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public boolean update(StudentEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.update(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	
	
	public StudentEntity findById(int id){
		StudentEntity obj =  (StudentEntity) session.get(StudentEntity.class, id);
		return obj;
	}
	
	public boolean saveOrUpdate(StudentEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.saveOrUpdate(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public boolean delete(StudentEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.delete(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	

	


	


}
