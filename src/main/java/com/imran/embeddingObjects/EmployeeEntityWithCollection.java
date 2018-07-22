package com.imran.embeddingObjects;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee_coll_tbl")
public class EmployeeEntityWithCollection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;
    
    
    @ElementCollection
    @JoinTable(name="address_tbl", joinColumns= @JoinColumn(name="id"))
    private List<AddressEmbd> addressList = new ArrayList<>();
    
    

	public List<AddressEmbd> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressEmbd> addressList) {
		this.addressList = addressList;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeEntityWithCollection [id=" + id + ", name=" + name + ", gender=" + gender + ", addressList="
				+ addressList + "]";
	}
	



    
    
    
    
    

}
