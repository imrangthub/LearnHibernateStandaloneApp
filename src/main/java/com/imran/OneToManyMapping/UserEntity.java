package com.imran.OneToManyMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "one_to_many_user_tbl")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;
    
    
	@ManyToOne(optional = true)
	@JoinColumn(name = "departmentId")
	private DepartmentEntity departmentEntity;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public DepartmentEntity getDepartmentEntity() {
		return departmentEntity;
	}


	public void setDepartmentEntity(DepartmentEntity departmentEntity) {
		this.departmentEntity = departmentEntity;
	}


	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", age=" + age + ", departmentEntity=" + departmentEntity
				+ "]";
	}
	
	
	
	

}
