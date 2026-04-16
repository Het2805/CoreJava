package com.bean;

public class Student {
	
	private int id;
	private String Fname,Lname,Email,Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	private long Mobile;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
