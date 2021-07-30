package com.sust.entity;

import java.io.Serializable;

public class View implements Serializable{
	public View() {
		super();
	}
	public View(String admin_name, String c_name, String operate, String opinion) {
		super();
		this.admin_name = admin_name;
		this.c_name = c_name;
		this.operate = operate;
		this.opinion = opinion;
	}
	private static final long serialVersionUID=1L;
	private Integer view_id;
	private String admin_name;
	private String c_name;
	private String operate;
	private String opinion;
	public Integer getView_id() {
		return view_id;
	}
	public void setView_id(Integer view_id) {
		this.view_id = view_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	@Override
	public String toString() {
		return "View [admin_name=" + admin_name + ", c_name=" + c_name + ", operate=" + operate + ", opinion=" + opinion
				+ "]";
	}
}
