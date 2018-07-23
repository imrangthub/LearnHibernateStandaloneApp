package com.imran.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "one_to_many_department_tbl")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentId")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
    
    
//	@OneToMany(mappedBy = "departmentEntity", cascade = CascadeType.ALL, targetEntity = UserEntity.class, fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "departmentEntity", cascade = CascadeType.ALL)
	private List<UserEntity> userList = new ArrayList<UserEntity>();


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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<UserEntity> getUserList() {
		return userList;
	}


	public void setUserList(List<UserEntity> userList) {
		this.userList = userList;
	}


	@Override
	public String toString() {
		return "DepartmentEntity [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	public DepartmentEntity(int id){
		this.id = id;
	}
	public DepartmentEntity(){}
	
	
	

	

}
