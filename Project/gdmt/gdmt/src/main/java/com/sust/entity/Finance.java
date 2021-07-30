package com.sust.entity;

import java.io.Serializable;

public class Finance implements Serializable{
	public Finance() {
		super();
	}
	public Finance(String f_account, String c_name, String f_pwd) {
		super();
		this.f_account = f_account;
		this.c_name = c_name;
		this.f_pwd = f_pwd;
	}
	private static final long serialVersionUID=1L;
	private Integer f_id;
	private String f_account;
	private String c_name;
	private String f_pwd;
	private double f_total;
	private double f_frozen;
	public Integer getF_id() {
		return f_id;
	}
	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}
	public String getF_account() {
		return f_account;
	}
	public void setF_account(String f_account) {
		this.f_account = f_account;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getF_pwd() {
		return f_pwd;
	}
	public void setF_pwd(String f_pwd) {
		this.f_pwd = f_pwd;
	}
	public double getF_total() {
		return f_total;
	}
	public void setF_total(double f_total) {
		this.f_total = f_total;
	}
	public double getF_frozen() {
		return f_frozen;
	}
	public void setF_frozen(double f_frozen) {
		this.f_frozen = f_frozen;
	}
	
}
