package com.imran.inheritance;

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
@Table(name = "inheritance_address_tbl")
public class AddressEntity extends BaseEntity {
	
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
    
    
	@ManyToOne(optional = true)
	@JoinColumn(name = "employeeId")
	private EmployeeEntity employeeEntity;
	
   

	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}

	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
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
