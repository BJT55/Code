package com.sust.entity;
import java.io.Serializable;


import lombok.Data;

@Data
public class Seller implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer seller_id; 
	private String seller_state; 
	private Double seller_supnum;
	private Double calorific;
	private Double seller_price;
	private Double sulful;
	private String seller_origin;
	private Double trans_price;
	private Double volatility;
	private String port;
	private Double element;
	private Double moisture;
	private String  seller_cname;
	
	
	

	/**
	 * @return seller_id
	 */
	public Integer getSeller_id() {
		return seller_id;
	}
	/**
	 * @param seller_id 要设置的 seller_id
	 */
	public void setSeller_id(Integer seller_id) {
		this.seller_id = seller_id;
	}
	/**
	 * @return seller_supnum
	 */
	public Double getSeller_supnum() {
		return seller_supnum;
	}
	/**
	 * @param seller_supnum 要设置的 seller_supnum
	 */
	public void setSeller_supnum(Double seller_supnum) {
		this.seller_supnum = seller_supnum;
	}
	/**
	 * @return calorific
	 */
	public Double getCalorific() {
		return calorific;
	}
	/**
	 * @param calorific 要设置的 calorific
	 */
	public void setCalorific(Double calorific) {
		this.calorific = calorific;
	}
	/**
	 * @return seller_price
	 */
	public Double getSeller_price() {
		return seller_price;
	}
	/**
	 * @param seller_price 要设置的 seller_price
	 */
	public void setSeller_price(Double seller_price) {
		this.seller_price = seller_price;
	}
	/**
	 * @return sulful
	 */
	public Double getSulful() {
		return sulful;
	}
	/**
	 * @param sulful 要设置的 sulful
	 */
	public void setSulful(Double sulful) {
		this.sulful = sulful;
	}
	/**
	 * @return seller_origin
	 */
	public String getSeller_origin() {
		return seller_origin;
	}
	/**
	 * @param seller_origin 要设置的 seller_origin
	 */
	public void setSeller_origin(String seller_origin) {
		this.seller_origin = seller_origin;
	}
	/**
	 * @return trans_price
	 */
	public Double getTrans_price() {
		return trans_price;
	}
	/**
	 * @param trans_price 要设置的 trans_price
	 */
	public void setTrans_price(Double trans_price) {
		this.trans_price = trans_price;
	}
	/**
	 * @return volatility
	 */
	public Double getVolatility() {
		return volatility;
	}
	/**
	 * @param volatility 要设置的 volatility
	 */
	public void setVolatility(Double volatility) {
		this.volatility = volatility;
	}
	/**
	 * @return port
	 */
	public String getPort() {
		return port;
	}
	/**
	 * @param port 要设置的 port
	 */
	public void setPort(String port) {
		this.port = port;
	}
	/**
	 * @return element
	 */
	public Double getElement() {
		return element;
	}
	/**
	 * @param element 要设置的 element
	 */
	public void setElement(Double element) {
		this.element = element;
	}
	/**
	 * @return moisture
	 */
	public Double getMoisture() {
		return moisture;
	}
	/**
	 * @param moisture 要设置的 moisture
	 */
	public void setMoisture(Double moisture) {
		this.moisture = moisture;
	}
	/**
	 * @param seller_state 要设置的 seller_state
	 */
	public void setSeller_state(String seller_state) {
		this.seller_state = seller_state;
	}

	/**
	 * @return seller_state
	 */
	public String getSeller_state() {
		return seller_state;
	}
	/**
	 * @param seller_id
	 * @param seller_supnum
	 * @param calorific
	 * @param seller_price
	 * @param sulful
	 * @param seller_origin
	 * @param trans_price
	 * @param volatility
	 * @param port
	 * @param element
	 * @param moisture
	 */

	

	
	
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */

	
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param seller_state
	 * @param seller_supnum
	 * @param calorific
	 * @param seller_price
	 * @param sulful
	 * @param seller_origin
	 * @param trans_price
	 * @param volatility
	 * @param port
	 * @param element
	 * @param moisture
	 * @param seller_cname
	 */
	public Seller(String seller_state, Double seller_supnum, Double calorific, Double seller_price, Double sulful,
			String seller_origin, Double trans_price, Double volatility, String port, Double element, Double moisture,
			String seller_cname) {
		super();
		this.seller_state = seller_state;
		this.seller_supnum = seller_supnum;
		this.calorific = calorific;
		this.seller_price = seller_price;
		this.sulful = sulful;
		this.seller_origin = seller_origin;
		this.trans_price = trans_price;
		this.volatility = volatility;
		this.port = port;
		this.element = element;
		this.moisture = moisture;
		this.setSeller_cname(seller_cname);
	}
	/**
	 * @param seller_state 要设置的 seller_state
	 */

	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Seller [seller_id=" + seller_id + ", seller_state=" + seller_state + ", seller_supnum=" + seller_supnum
				+ ", calorific=" + calorific + ", seller_price=" + seller_price + ", sulful=" + sulful
				+ ", seller_origin=" + seller_origin + ", trans_price=" + trans_price + ", volatility=" + volatility
				+ ", port=" + port + ", element=" + element + ", moisture=" + moisture + "]";
	}
	/**
	 * @return seller_cname
	 */
	public String getSeller_cname() {
		return seller_cname;
	}
	/**
	 * @param seller_cname 要设置的 seller_cname
	 */
	public void setSeller_cname(String seller_cname) {
		this.seller_cname = seller_cname;
	}


	
	
	
}
