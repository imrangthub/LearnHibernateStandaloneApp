package com.imran.ManyToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "many_to_many_address_tbl")
public class AddressEntity {
	
	public AddressEntity(){}
	
	public AddressEntity(int id){
		this.id=id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;
    
    
    @ManyToMany(cascade=CascadeType.ALL, mappedBy="addressList")
    private List<EmployeeEntity> empList;
    
    
    
  

	public List<EmployeeEntity> getEmpList() {
		return empList;
	}

	public void setEmpList(List<EmployeeEntity> empList) {
		this.empList = empList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", city=" + city + ", country=" + country + "";
	}


	
	
	

    
    
    
    
    
    

}
