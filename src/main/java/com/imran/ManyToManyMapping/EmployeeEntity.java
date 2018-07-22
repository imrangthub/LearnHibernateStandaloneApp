package com.imran.ManyToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "many_to_many_employee_tbl")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="emp_add_j_tbl", joinColumns=@JoinColumn(name="emp_id"), inverseJoinColumns=@JoinColumn(name="add_id"))
    private List<AddressEntity> addressList;
    
   

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

	public List<AddressEntity> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressEntity> addressList) {
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", gender=" + gender + ", Address="+addressList+"]";
	}


	  

}
