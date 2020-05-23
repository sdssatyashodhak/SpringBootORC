package com.vjti.seva.ORC.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {
	
	@Id
	private int rollno;
	private String fullname;
	private String address;
	private String dob;
	private String city;
	private String password;
	//private String emailid;
	
	public Registration(int rollno, String fullname, String address, String dob, String city, String password) {
		//super();
		this.rollno = rollno;
		this.fullname = fullname;
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
	public int getrollno() {
		return rollno;
	}
	public void setrollno(int rollno) {
		this.rollno = rollno;
	}
	public String getfullname() {
		return fullname;
	}
	public void setfullname(String fullname) {
		this.fullname = fullname;
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
		return "Registration [rollno=" + rollno + ", fullname=" + fullname + ", address=" + address + ", dob=" + dob + ", city="
				+ city + ", password=" + password + "]";
	}

}
