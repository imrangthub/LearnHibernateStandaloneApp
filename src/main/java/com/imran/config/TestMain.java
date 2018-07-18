package com.imran.config;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class TestMain {

    public static void main(String[] args) {
    	
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
        	
             // Check MySQL database version
             String sql = "select version()";

             String result = (String) session.createNativeQuery(sql).getSingleResult();
             
             System.out.println("MySql Database Version is:::"+result);
             
             
         } catch (HibernateException e) {
             e.printStackTrace();
         }
      }
}