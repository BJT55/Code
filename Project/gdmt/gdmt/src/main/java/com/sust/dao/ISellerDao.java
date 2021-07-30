package com.sust.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import com.sust.entity.Seller;

@Mapper
public interface ISellerDao {

//	@Select("select seller_state from seller")
//	public String getTrueState(String seller_state) throws Exception;
	
	@Insert("insert into seller (seller_supnum,seller_cname,calorific,seller_price,sulful,seller_origin,trans_price,volatility,port,element,moisture) values(#{seller_supnum},#{seller_cname},#{calorific},#{seller_price},#{sulful},#{seller_origin},#{trans_price},#{volatility},#{port},#{element},#{moisture})")
	public int add(Seller seller) throws Exception;
	
	@Select("select * from seller where seller_state like'mtrue'")
	public List<Seller> getAllSellers() throws Exception;
	
	@Update("update seller set seller_state='false' where seller_id=#{seller_id}")
	public int sellerDeal(@Param("seller_id") Integer seller_id) throws Exception ;
	
	@Select("select * from seller where seller_id=#{seller_id}")
	public Seller checkBySellerId(Integer seller_id)throws Exception ;
}
