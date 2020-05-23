package com.vjti.seva.ORC.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {
	
	@Id
	private int rollNo;
	private String name;
	private String address;
	private String dob;
	private String city;
	private String password;
	
	public Registration(int rollNo, String name, String address, String dob, String city, String password) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.city = city;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Registration [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", dob=" + dob + ", city="
				+ city + ", password=" + password + "]";
	}

}
