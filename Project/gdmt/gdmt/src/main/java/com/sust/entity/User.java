package com.sust.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{


	// private static final long serialVersionUID = -7912541194323380270L;
	private static final long serialVersionUID = 1L;

	private Integer user_id;
	private String user_account;
	private String c_name            ;
	private String  user_csimple ;
	private String   user_corporative;
	private String   address;
	private String  area  ;
	private Double  regist_fund ;
	private String    user_contact  ;
	private String    user_tel  ;
	private String user_pwd;
	private String   fax  ;
	private String user_email;
	private String user_license;
	private String user_tax;
	private String user_orgnum;
	private String user_bankname;
	private String user_bankaccount;
	private String user_permit;
	private String user_corp;
	private String user_condition;
	private String user_trans;
	private String user_brief;
	private String user_performance;
	private String user_state;
	private String user_view;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param user_id
	 * @param user_account
	 * @param c_name
	 * @param user_csimple
	 * @param user_corporative
	 * @param address
	 * @param area
	 * @param regist_fund
	 * @param user_contact
	 * @param user_tel
	 * @param fax
	 * @param user_email
	 */
	
	public User(Integer user_id, String user_account, String c_name, String user_csimple, String user_corporative,
			String address, String area, Double regist_fund, String user_contact, String user_tel,String user_pwd, String fax,
			String user_email) {
		super();
		this.user_id = user_id;
		this.user_account = user_account;
		this.c_name = c_name;
		this.user_csimple = user_csimple;
		this.user_corporative = user_corporative;
		this.address = address;
		this.area = area;
		this.regist_fund = regist_fund;
		this.user_contact = user_contact;
		this.user_tel = user_tel;
		this.user_pwd = user_pwd;
		this.fax = fax;
		this.user_email = user_email;
	}


	/**
	 * @param user_account
	 * @param c_name
	 * @param user_csimple
	 * @param user_corporative
	 * @param address
	 * @param area
	 * @param regist_fund
	 * @param user_contact
	 * @param user_tel
	 * @param user_pwd
	 * @param fax
	 * @param user_email
	 * @param user_license
	 * @param user_tax
	 * @param user_orgnum
	 * @param user_bankname
	 * @param user_bankaccount
	 * @param user_permit
	 * @param user_corp
	 * @param user_condition
	 * @param user_trans
	 * @param user_brief
	 * @param user_performance
	 * @param user_state
	 * @param user_view
	 */
	public User(String user_account, String c_name, String user_csimple, String user_corporative, String address,
			String area, Double regist_fund, String user_contact, String user_tel, String user_pwd, String fax,
			String user_email, String user_license, String user_tax, String user_orgnum, String user_bankname,
			String user_bankaccount, String user_permit, String user_corp, String user_condition, String user_trans,
			String user_brief, String user_performance, String user_state, String user_view) {
		super();
		this.user_account = user_account;
		this.c_name = c_name;
		this.user_csimple = user_csimple;
		this.user_corporative = user_corporative;
		this.address = address;
		this.area = area;
		this.regist_fund = regist_fund;
		this.user_contact = user_contact;
		this.user_tel = user_tel;
		this.user_pwd = user_pwd;
		this.fax = fax;
		this.user_email = user_email;
		this.user_license = user_license;
		this.user_tax = user_tax;
		this.user_orgnum = user_orgnum;
		this.user_bankname = user_bankname;
		this.user_bankaccount = user_bankaccount;
		this.user_permit = user_permit;
		this.user_corp = user_corp;
		this.user_condition = user_condition;
		this.user_trans = user_trans;
		this.user_brief = user_brief;
		this.user_performance = user_performance;
		this.user_state = user_state;
		this.user_view = user_view;
	}



	/**
	 * @return user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id 要设置的 user_id
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return user_account
	 */
	public String getUser_account() {
		return user_account;
	}

	/**
	 * @param user_account 要设置的 user_account
	 */
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	/**
	 * @return c_name
	 */
	public String getC_name() {
		return c_name;
	}

	/**
	 * @param c_name 要设置的 c_name
	 */
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	/**
	 * @return user_csimple
	 */
	public String getUser_csimple() {
		return user_csimple;
	}

	/**
	 * @param user_csimple 要设置的 user_csimple
	 */
	public void setUser_csimple(String user_csimple) {
		this.user_csimple = user_csimple;
	}

	/**
	 * @return user_corporative
	 */
	public String getUser_corporative() {
		return user_corporative;
	}

	/**
	 * @param user_corporative 要设置的 user_corporative
	 */
	public void setUser_corporative(String user_corporative) {
		this.user_corporative = user_corporative;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address 要设置的 address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area 要设置的 area
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return regist_fund
	 */
	public Double getRegist_fund() {
		return regist_fund;
	}

	/**
	 * @param regist_fund 要设置的 regist_fund
	 */
	public void setRegist_fund(Double regist_fund) {
		this.regist_fund = regist_fund;
	}

	/**
	 * @return user_contact
	 */
	public String getUser_contact() {
		return user_contact;
	}

	/**
	 * @param user_contact 要设置的 user_contact
	 */
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}

	/**
	 * @return user_tel
	 */
	public String getUser_tel() {
		return user_tel;
	}

	/**
	 * @param user_tel 要设置的 user_tel
	 */
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	/**
	 * @return fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax 要设置的 fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return user_email
	 */
	public String getUser_email() {
		return user_email;
	}

	/**
	 * @param user_email 要设置的 user_email
	 */
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	/**
	 * @return user_license
	 */
	public String getUser_license() {
		return user_license;
	}

	/**
	 * @param user_license 要设置的 user_license
	 */
	public void setUser_license(String user_license) {
		this.user_license = user_license;
	}

	/**
	 * @return user_tax
	 */
	public String getUser_tax() {
		return user_tax;
	}

	/**
	 * @param user_tax 要设置的 user_tax
	 */
	public void setUser_tax(String user_tax) {
		this.user_tax = user_tax;
	}

	/**
	 * @return user_orgnum
	 */
	public String getUser_orgnum() {
		return user_orgnum;
	}

	/**
	 * @param user_orgnum 要设置的 user_orgnum
	 */
	public void setUser_orgnum(String user_orgnum) {
		this.user_orgnum = user_orgnum;
	}

	/**
	 * @return user_bankname
	 */
	public String getUser_bankname() {
		return user_bankname;
	}

	/**
	 * @param user_bankname 要设置的 user_bankname
	 */
	public void setUser_bankname(String user_bankname) {
		this.user_bankname = user_bankname;
	}

	/**
	 * @return user_bankaccount
	 */
	public String getUser_bankaccount() {
		return user_bankaccount;
	}

	/**
	 * @param user_bankaccount 要设置的 user_bankaccount
	 */
	public void setUser_bankaccount(String user_bankaccount) {
		this.user_bankaccount = user_bankaccount;
	}

	/**
	 * @return user_permit
	 */
	public String getUser_permit() {
		return user_permit;
	}

	/**
	 * @param user_permit 要设置的 user_permit
	 */
	public void setUser_permit(String user_permit) {
		this.user_permit = user_permit;
	}

	/**
	 * @return user_corp
	 */
	public String getUser_corp() {
		return user_corp;
	}

	/**
	 * @param user_corp 要设置的 user_corp
	 */
	public void setUser_corp(String user_corp) {
		this.user_corp = user_corp;
	}

	/**
	 * @return user_condition
	 */
	public String getUser_condition() {
		return user_condition;
	}

	/**
	 * @param user_condition 要设置的 user_condition
	 */
	public void setUser_condition(String user_condition) {
		this.user_condition = user_condition;
	}

	/**
	 * @return user_trans
	 */
	public String getUser_trans() {
		return user_trans;
	}

	/**
	 * @param user_trans 要设置的 user_trans
	 */
	public void setUser_trans(String user_trans) {
		this.user_trans = user_trans;
	}

	/**
	 * @return user_brief
	 */
	public String getUser_brief() {
		return user_brief;
	}

	/**
	 * @param user_brief 要设置的 user_brief
	 */
	public void setUser_brief(String user_brief) {
		this.user_brief = user_brief;
	}

	/**
	 * @return user_performance
	 */
	public String getUser_performance() {
		return user_performance;
	}

	/**
	 * @param user_performance 要设置的 user_performance
	 */
	public void setUser_performance(String user_performance) {
		this.user_performance = user_performance;
	}

	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	


	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_state() {
		return user_state;
	}

	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}

	public String getUser_view() {
		return user_view;
	}

	public void setUser_view(String user_view) {
		this.user_view = user_view;
	}

	


	
}
