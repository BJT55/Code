package com.sust.entity;

public class Deal {
	public Deal(String dealist, String hanger, String goodid) {
		super();
		this.dealist = dealist;
		this.hanger = hanger;
		this.goodid = goodid;
	}
	private static final long serialVersionUID = -4767175372806961494L;
	private Integer deal_id;
	private String dealist;
	private String hanger;
	private String create_time;
	private String deal_time;
	private String goodid;
	
	public Integer getDeal_id() {
		return deal_id;
	}
	public void setDeal_id(Integer deal_id) {
		this.deal_id = deal_id;
	}
	public String getDealist() {
		return dealist;
	}
	public void setDealist(String dealist) {
		this.dealist = dealist;
	}
	public String getHanger() {
		return hanger;
	}
	public void setHanger(String hanger) {
		this.hanger = hanger;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getDeal_time() {
		return deal_time;
	}
	public void setDeal_time(String deal_time) {
		this.deal_time = deal_time;
	}
	public String getGoodid() {
		return goodid;
	}
	public void setGoodid(String goodid) {
		this.goodid = goodid;
	}
	@Override
	public String toString() {
		return "Deal [deal_id=" + deal_id + ", dealist=" + dealist + ", hanger=" + hanger + ", create_time="
				+ create_time + ", deal_time=" + deal_time + ", goodid=" + goodid + "]";
	}
	public Deal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Deal(String dealist, String hanger, String create_time, String deal_time, String goodid) {
		super();

		this.dealist = dealist;
		this.hanger = hanger;
		this.create_time = create_time;
		this.deal_time = deal_time;
		this.goodid = goodid;
	}
	
	
}
