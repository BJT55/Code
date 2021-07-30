package com.sust.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.sust.entity.Buyer;
import com.sust.entity.View;

@Mapper
public interface IBuyerDao {	
	
	
	@Insert("insert into buyer (buyer_cname,buyer_num,buyer_man,buyer_signer,buyer_date,buyer_time,buyer_kind,buyer_purnum,buyer_trans,buyer_location,buyer_pay,buyer_test,buyer_payway,buyer_offer,buyer_promise,qnet,sulfur,moisture,aar,volatilize,mad,stad,vad,qgrd,std,vd,mm,st,hgi,beizhu) "
			+ "values(#{buyer_cname},#{buyer_num},#{buyer_man},#{buyer_signer},#{buyer_date},#{buyer_time},#{buyer_kind},#{buyer_purnum},#{buyer_trans},#{buyer_location},#{buyer_pay},#{buyer_test},#{buyer_payway},#{buyer_offer},#{buyer_promise},#{qnet},#{sulfur},#{moisture},#{aar},#{volatilize},#{mad},#{stad},#{vad},#{qgrd},#{std},#{vd},#{mm},#{st},#{hgi},#{beizhu})")
	public int add(Buyer buyer) throws Exception;
	
	@Select("select * from buyer where buyer_state like'mtrue'")
	public List<Buyer> getAllBuyers() throws Exception;
	
	//罗
	@Select("select * from buyer where buyer_state='mtrue'")
	public List<Buyer> getAllDealInfos() throws Exception ;

	@Select("select * from buyer where buyer_id=#{buyer_id}")
	public Buyer checkByBuyerId(Integer buyer_id);
	
	@Select("select * from view where c_name=#{c_name}")
	public List<View> getAllChecks(@Param("c_name") String c_name) throws Exception ;
	
	@Update("update buyer set buyer_state='true' where buyer_id=#{buyer_id}")
	public int buyerPass(@Param("buyer_id") Integer buyer_id) throws Exception ;
	
	@Update("update buyer set buyer_state='fpass' where buyer_id=#{buyer_id}")
	public int buyerFailToPass(@Param("buyer_id") Integer buyer_id) throws Exception ;
	
	@Insert("insert into view (admin_name,c_name,operate,opinion) values(#{admin_name},#{c_name},#{operate},#{opinion})")
	public int modifyView(View view) throws Exception ;
	
	@Update("update buyer set buyer_state='false' where buyer_id=#{buyer_id}")
	public int buyerDeal(@Param("buyer_id") Integer buyer_id) throws Exception ;
	
	
}