package com.resturant.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientUser 
{
	@Id
	private String email;
	private String phoneno;
	private String password;
	
	
	public ClientUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClientUser(String email, String phoneno, String password) {
		super();
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ClientUser [email=" + email + ", phoneno=" + phoneno + ", password=" + password + "]";
	}
}
