package com.imran.ManyToManyMapping;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "many_to_many_user_tbl")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;
    
    

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="user_dept_j_tbl", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="dept_id"))
    private List<DepartmentEntity> departmentList;
	
/*    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="user_dept_join_tbl", joinColumns=@JoinColumn(name="userId"), inverseJoinColumns=@JoinColumn(name="departmentId"))
	private List<DepartmentEntity> departmentList = new ArrayList<DepartmentEntity>();*/



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


	public List<DepartmentEntity> getDepartmentList() {
		return departmentList;
	}


	public void setDepartmentList(List<DepartmentEntity> departmentList) {
		this.departmentList = departmentList;
	}


	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", age=" + age + ", departmentList=" + departmentList + "]";
	}




	
	
	

}
