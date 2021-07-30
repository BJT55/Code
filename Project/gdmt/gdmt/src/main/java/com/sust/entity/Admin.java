package com.sust.entity;

import java.io.Serializable;

public class Admin implements Serializable{
	public Admin(String admin_username, String admin_password, String admin_limit, String admin_name,
			String admin_depart, String admin_tel) {
		super();
		this.admin_username = admin_username;
		this.admin_password = admin_password;
		this.admin_limit = admin_limit;
		this.admin_name = admin_name;
		this.admin_depart = admin_depart;
		this.admin_tel = admin_tel;
	}
	
	public Admin() {
		super();
	}
	public Admin(Integer admin_id, String admin_username, String admin_password, String admin_limit, String admin_name,
			String admin_depart, String admin_tel) {
		super();
		this.admin_id = admin_id;
		this.admin_username = admin_username;
		this.admin_password = admin_password;
		this.admin_limit = admin_limit;
		this.admin_name = admin_name;
		this.admin_depart = admin_depart;
		this.admin_tel = admin_tel;
	}
	private static final long serialVersionUID=1L;
	private Integer admin_id;
	private String admin_username;
	private String admin_password;
	private String admin_limit;
	private String admin_name;
	private String admin_depart;
	private String admin_tel;
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_username() {
		return admin_username;
	}
	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getAdmin_limit() {
		return admin_limit;
	}
	public void setAdmin_limit(String admin_limit) {
		this.admin_limit = admin_limit;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_depart() {
		return admin_depart;
	}
	public void setAdmin_depart(String admin_depart) {
		this.admin_depart = admin_depart;
	}
	public String getAdmin_tel() {
		return admin_tel;
	}
	public void setAdmin_tel(String admin_tel) {
		this.admin_tel = admin_tel;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_username=" + admin_username + ", admin_password="
				+ admin_password + ", admin_limit=" + admin_limit + ", admin_name=" + admin_name + ", admin_depart="
				+ admin_depart + ", admin_tel=" + admin_tel + "]";
	}
	
	
}
