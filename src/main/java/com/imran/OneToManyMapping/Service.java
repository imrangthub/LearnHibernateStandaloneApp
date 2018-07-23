package com.imran.OneToManyMapping;

import org.hibernate.Session;
import com.imran.config.HibernateUtil;


public class Service {
	
	Session session;
	
	Service(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public boolean saveDept(DepartmentEntity obj){
		

    	session.beginTransaction();
    	
    	session.save(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	public boolean saveUser(UserEntity obj){
		

    	session.beginTransaction();
    	
    	session.save(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public boolean saveOrUpdateUser(UserEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.saveOrUpdate(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public UserEntity findByIdUser(int id){
		UserEntity obj =  (UserEntity) session.get(UserEntity.class, id);
		return obj;
	}
	
	public DepartmentEntity findByIdDept(int id){
		DepartmentEntity obj =  (DepartmentEntity) session.get(DepartmentEntity.class, id);
		return obj;
	}
	
	public boolean deleteDept(DepartmentEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.delete(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	
	public boolean deleteUser(UserEntity obj){
		
    	
    	session.beginTransaction();
    	
    	session.delete(obj);
    	
    	session.getTransaction().commit();
		
		return true;
	}
	

}
