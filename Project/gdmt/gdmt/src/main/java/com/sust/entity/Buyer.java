package com.sust.entity;
import java.io.Serializable;

import lombok.Data;

@Data
public class Buyer  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4767175372806961494L;
	private Integer buyer_id;
	private String buyer_state;
	private String user_account;
	private String buyer_cname;
	private String buyer_num;
	private String buyer_man;
	private String buyer_signer;
	private String buyer_date;
	private String buyer_time;
	private String buyer_kind;
	private Double buyer_purnum;
	private String buyer_trans;
	private String buyer_location;
	private String buyer_pay;
	private String buyer_test;
	private String buyer_payway;
	private String buyer_offer;
	private String buyer_promise;
	private Double qnet;
	private Double sulfur;
	private Double moisture;
	private Double aar;
	private Double volatilize;
	private Double mad;
	private Double stad;
	/**
	 * @return mad
	 */
	public Double getMad() {
		return mad;
	}
	/**
	 * @param mad 要设置的 mad
	 */
	public void setMad(Double mad) {
		this.mad = mad;
	}
	/**
	 * @return stad
	 */
	public Double getStad() {
		return stad;
	}
	/**
	 * @param stad 要设置的 stad
	 */
	public void setStad(Double stad) {
		this.stad = stad;
	}
	/**
	 * @return vad
	 */
	public Double getVad() {
		return vad;
	}
	/**
	 * @param vad 要设置的 vad
	 */
	public void setVad(Double vad) {
		this.vad = vad;
	}
	/**
	 * @return qgrd
	 */
	public Double getQgrd() {
		return qgrd;
	}
	/**
	 * @param qgrd 要设置的 qgrd
	 */
	public void setQgrd(Double qgrd) {
		this.qgrd = qgrd;
	}
	/**
	 * @return std
	 */
	public Double getStd() {
		return std;
	}
	/**
	 * @param std 要设置的 std
	 */
	public void setStd(Double std) {
		this.std = std;
	}
	/**
	 * @return vd
	 */
	public Double getVd() {
		return vd;
	}
	/**
	 * @param vd 要设置的 vd
	 */
	public void setVd(Double vd) {
		this.vd = vd;
	}
	/**
	 * @return mm
	 */
	public Double getMm() {
		return mm;
	}
	/**
	 * @param mm 要设置的 mm
	 */
	public void setMm(Double mm) {
		this.mm = mm;
	}
	/**
	 * @return st
	 */
	public Double getSt() {
		return st;
	}
	/**
	 * @param st 要设置的 st
	 */
	public void setSt(Double st) {
		this.st = st;
	}
	/**
	 * @return hgi
	 */
	public Double getHgi() {
		return hgi;
	}
	/**
	 * @param hgi 要设置的 hgi
	 */
	public void setHgi(Double hgi) {
		this.hgi = hgi;
	}
	/**
	 * @return beizhu
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * @param beizhu 要设置的 beizhu
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	private Double vad;
	private Double qgrd;
	private Double std;
	private Double vd;
	private Double mm;
	private Double st;
	private Double hgi;
	private String beizhu;
	/**
	 * @return buyer_id
	 */
	public Integer getBuyer_id() {
		return buyer_id;
	}
	/**
	 * @param buyer_id 要设置的 buyer_id
	 */
	public void setBuyer_id(Integer buyer_id) {
		this.buyer_id = buyer_id;
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
	 * @return buyer_cname
	 */
	public String getBuyer_cname() {
		return buyer_cname;
	}
	/**
	 * @param buyer_cname 要设置的 buyer_cname
	 */
	public void setBuyer_cname(String buyer_cname) {
		this.buyer_cname = buyer_cname;
	}
	/**
	 * @return buyer_num
	 */
	public String getBuyer_num() {
		return buyer_num;
	}
	/**
	 * @param buyer_num 要设置的 buyer_num
	 */
	public void setBuyer_num(String buyer_num) {
		this.buyer_num = buyer_num;
	}
	/**
	 * @return buyer_man
	 */
	public String getBuyer_man() {
		return buyer_man;
	}
	/**
	 * @param buyer_man 要设置的 buyer_man
	 */
	public void setBuyer_man(String buyer_man) {
		this.buyer_man = buyer_man;
	}
	/**
	 * @return buyer_signer
	 */
	public String getBuyer_signer() {
		return buyer_signer;
	}
	/**
	 * @param buyer_signer 要设置的 buyer_signer
	 */
	public void setBuyer_signer(String buyer_signer) {
		this.buyer_signer = buyer_signer;
	}
	/**
	 * @return buyer_date
	 */
	public String getBuyer_date() {
		return buyer_date;
	}
	/**
	 * @param buyer_date 要设置的 buyer_date
	 */
	public void setBuyer_date(String buyer_date) {
		this.buyer_date = buyer_date;
	}
	/**
	 * @return buyer_time
	 */
	public String getBuyer_time() {
		return buyer_time;
	}
	/**
	 * @param buyer_time 要设置的 buyer_time
	 */
	public void setBuyer_time(String buyer_time) {
		this.buyer_time = buyer_time;
	}
	/**
	 * @return buyer_kind
	 */
	public String getBuyer_kind() {
		return buyer_kind;
	}
	/**
	 * @param buyer_kind 要设置的 buyer_kind
	 */
	public void setBuyer_kind(String buyer_kind) {
		this.buyer_kind = buyer_kind;
	}
	/**
	 * @return buyer_purnum
	 */
	public Double getBuyer_purnum() {
		return buyer_purnum;
	}
	/**
	 * @param buyer_purnum 要设置的 buyer_purnum
	 */
	public void setBuyer_purnum(Double buyer_purnum) {
		this.buyer_purnum = buyer_purnum;
	}
	/**
	 * @return buyer_trans
	 */
	public String getBuyer_trans() {
		return buyer_trans;
	}
	/**
	 * @param buyer_trans 要设置的 buyer_trans
	 */
	public void setBuyer_trans(String buyer_trans) {
		this.buyer_trans = buyer_trans;
	}
	/**
	 * @return buyer_location
	 */
	public String getBuyer_location() {
		return buyer_location;
	}
	/**
	 * @param buyer_location 要设置的 buyer_location
	 */
	public void setBuyer_location(String buyer_location) {
		this.buyer_location = buyer_location;
	}
	/**
	 * @return buyer_pay
	 */
	public String getBuyer_pay() {
		return buyer_pay;
	}
	/**
	 * @param buyer_pay 要设置的 buyer_pay
	 */
	public void setBuyer_pay(String buyer_pay) {
		this.buyer_pay = buyer_pay;
	}
	/**
	 * @return buyer_test
	 */
	public String getBuyer_test() {
		return buyer_test;
	}
	/**
	 * @param buyer_test 要设置的 buyer_test
	 */
	public void setBuyer_test(String buyer_test) {
		this.buyer_test = buyer_test;
	}
	/**
	 * @return buyer_payway
	 */
	public String getBuyer_payway() {
		return buyer_payway;
	}
	/**
	 * @param buyer_payway 要设置的 buyer_payway
	 */
	public void setBuyer_payway(String buyer_payway) {
		this.buyer_payway = buyer_payway;
	}
	/**
	 * @return buyer_offer
	 */
	public String getBuyer_offer() {
		return buyer_offer;
	}
	/**
	 * @param buyer_offer 要设置的 buyer_offer
	 */
	public void setBuyer_offer(String buyer_offer) {
		this.buyer_offer = buyer_offer;
	}
	/**
	 * @return buyer_promise
	 */
	public String getBuyer_promise() {
		return buyer_promise;
	}
	/**
	 * @param buyer_promise 要设置的 buyer_promise
	 */
	public void setBuyer_promise(String buyer_promise) {
		this.buyer_promise = buyer_promise;
	}
	/**
	 * @return qnet
	 */
	public Double getQnet() {
		return qnet;
	}
	/**
	 * @param qnet 要设置的 qnet
	 */
	public void setQnet(Double qnet) {
		this.qnet = qnet;
	}
	/**
	 * @return sulfur
	 */
	public Double getSulfur() {
		return sulfur;
	}
	/**
	 * @param sulfur 要设置的 sulfur
	 */
	public void setSulfur(Double sulfur) {
		this.sulfur = sulfur;
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
	 * @return aar
	 */
	public Double getAar() {
		return aar;
	}
	/**
	 * @param aar 要设置的 aar
	 */
	public void setAar(Double aar) {
		this.aar = aar;
	}
	/**
	 * @return volatilize
	 */
	public Double getVolatilize() {
		return volatilize;
	}
	/**
	 * @param volatilize 要设置的 volatilize
	 */
	public void setVolatilize(Double volatilize) {
		this.volatilize = volatilize;
	}
	public void setBuyer_state(String buyer_state) {
		this.buyer_state = buyer_state;
	}
	public String getBuyer_state() {
		return buyer_state;
	}
	/**
	 * @param buyer_id
	 * @param user_account
	 * @param buyer_cname
	 * @param buyer_num
	 * @param buyer_man
	 * @param buyer_signer
	 * @param buyer_date
	 * @param buyer_time
	 * @param buyer_kind
	 * @param buyer_purnum
	 * @param buyer_trans
	 * @param buyer_location
	 * @param buyer_pay
	 * @param buyer_test
	 * @param buyer_payway
	 * @param buyer_offer
	 * @param buyer_promise
	 */
	public Buyer(Integer buyer_id,String buyer_state, String user_account, String buyer_cname, String buyer_num, String buyer_man,
			String buyer_signer, String buyer_date, String buyer_time, String buyer_kind, Double buyer_purnum,
			String buyer_trans, String buyer_location, String buyer_pay, String buyer_test, String buyer_payway,
			String buyer_offer, String buyer_promise) {
		super();
		this.buyer_id = buyer_id;
		this.buyer_state = buyer_state;
		this.user_account = user_account;
		this.buyer_cname = buyer_cname;
		this.buyer_num = buyer_num;
		this.buyer_man = buyer_man;
		this.buyer_signer = buyer_signer;
		this.buyer_date = buyer_date;
		this.buyer_time = buyer_time;
		this.buyer_kind = buyer_kind;
		this.buyer_purnum = buyer_purnum;
		this.buyer_trans = buyer_trans;
		this.buyer_location = buyer_location;
		this.buyer_pay = buyer_pay;
		this.buyer_test = buyer_test;
		this.buyer_payway = buyer_payway;
		this.buyer_offer = buyer_offer;
		this.buyer_promise = buyer_promise;
	}
	/**
	 * @param buyer_id
	 * @param user_account
	 * @param buyer_cname
	 * @param buyer_num
	 * @param buyer_man
	 * @param buyer_signer
	 * @param buyer_date
	 * @param buyer_time
	 * @param buyer_kind
	 * @param buyer_purnum
	 * @param buyer_trans
	 * @param buyer_location
	 * @param buyer_pay
	 * @param buyer_test
	 * @param buyer_payway
	 * @param buyer_offer
	 * @param buyer_promise
	 * @param qnet
	 * @param sulfur
	 * @param moisture
	 * @param aar
	 * @param volatilize
	 */
	public Buyer(Integer buyer_id,String buyer_state, String user_account, String buyer_cname, String buyer_num, String buyer_man,
			String buyer_signer, String buyer_date, String buyer_time, String buyer_kind, Double buyer_purnum,
			String buyer_trans, String buyer_location, String buyer_pay, String buyer_test, String buyer_payway,
			String buyer_offer, String buyer_promise, Double qnet, Double sulfur, Double moisture, Double aar,
			Double volatilize) {
		super();
		this.buyer_id = buyer_id;
		this.user_account = user_account;
		this.buyer_state = buyer_state;
		this.buyer_cname = buyer_cname;
		this.buyer_num = buyer_num;
		this.buyer_man = buyer_man;
		this.buyer_signer = buyer_signer;
		this.buyer_date = buyer_date;
		this.buyer_time = buyer_time;
		this.buyer_kind = buyer_kind;
		this.buyer_purnum = buyer_purnum;
		this.buyer_trans = buyer_trans;
		this.buyer_location = buyer_location;
		this.buyer_pay = buyer_pay;
		this.buyer_test = buyer_test;
		this.buyer_payway = buyer_payway;
		this.buyer_offer = buyer_offer;
		this.buyer_promise = buyer_promise;
		this.qnet = qnet;
		this.sulfur = sulfur;
		this.moisture = moisture;
		this.aar = aar;
		this.volatilize = volatilize;
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	

	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param buyer_id
	 * @param buyer_state
	 * @param user_account
	 * @param buyer_cname
	 * @param buyer_num
	 * @param buyer_man
	 * @param buyer_signer
	 * @param buyer_date
	 * @param buyer_time
	 * @param buyer_kind
	 * @param buyer_purnum
	 * @param buyer_trans
	 * @param buyer_location
	 * @param buyer_pay
	 * @param buyer_test
	 * @param buyer_payway
	 * @param buyer_offer
	 * @param buyer_promise
	 * @param qnet
	 * @param sulfur
	 * @param moisture
	 * @param aar
	 * @param volatilize
	 * @param mad
	 * @param stad
	 * @param vad
	 * @param qgrd
	 * @param std
	 * @param vd
	 * @param mm
	 * @param st
	 * @param hgi
	 * @param beizhu
	 */
	public Buyer(Integer buyer_id, String buyer_state, String user_account, String buyer_cname, String buyer_num,
			String buyer_man, String buyer_signer, String buyer_date, String buyer_time, String buyer_kind,
			Double buyer_purnum, String buyer_trans, String buyer_location, String buyer_pay, String buyer_test,
			String buyer_payway, String buyer_offer, String buyer_promise, Double qnet, Double sulfur, Double moisture,
			Double aar, Double volatilize, Double mad, Double stad, Double vad, Double qgrd, Double std, Double vd,
			Double mm, Double st, Double hgi, String beizhu) {
		super();
		this.buyer_id = buyer_id;
		this.buyer_state = buyer_state;
		this.user_account = user_account;
		this.buyer_cname = buyer_cname;
		this.buyer_num = buyer_num;
		this.buyer_man = buyer_man;
		this.buyer_signer = buyer_signer;
		this.buyer_date = buyer_date;
		this.buyer_time = buyer_time;
		this.buyer_kind = buyer_kind;
		this.buyer_purnum = buyer_purnum;
		this.buyer_trans = buyer_trans;
		this.buyer_location = buyer_location;
		this.buyer_pay = buyer_pay;
		this.buyer_test = buyer_test;
		this.buyer_payway = buyer_payway;
		this.buyer_offer = buyer_offer;
		this.buyer_promise = buyer_promise;
		this.qnet = qnet;
		this.sulfur = sulfur;
		this.moisture = moisture;
		this.aar = aar;
		this.volatilize = volatilize;
		this.mad = mad;
		this.stad = stad;
		this.vad = vad;
		this.qgrd = qgrd;
		this.std = std;
		this.vd = vd;
		this.mm = mm;
		this.st = st;
		this.hgi = hgi;
		this.beizhu = beizhu;
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Buyer [buyer_id=" + buyer_id + ", buyer_state=" + buyer_state + ", user_account=" + user_account
				+ ", buyer_cname=" + buyer_cname + ", buyer_num=" + buyer_num + ", buyer_man=" + buyer_man
				+ ", buyer_signer=" + buyer_signer + ", buyer_date=" + buyer_date + ", buyer_time=" + buyer_time
				+ ", buyer_kind=" + buyer_kind + ", buyer_purnum=" + buyer_purnum + ", buyer_trans=" + buyer_trans
				+ ", buyer_location=" + buyer_location + ", buyer_pay=" + buyer_pay + ", buyer_test=" + buyer_test
				+ ", buyer_payway=" + buyer_payway + ", buyer_offer=" + buyer_offer + ", buyer_promise=" + buyer_promise
				+ ", qnet=" + qnet + ", sulfur=" + sulfur + ", moisture=" + moisture + ", aar=" + aar + ", volatilize="
				+ volatilize + "]";
	}

	
	
}

