package com.sust.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sust.entity.Deal;
import com.sust.entity.User;

@Mapper
public interface IDealDao {
	
	@Insert("insert into deal (dealist,hanger,goodid,create_time) values(#{dealist},#{hanger},#{goodid},#{create_time})")
	public int dealMakeById(@Param("dealist") String dealist,@Param("hanger") String hanger,@Param("goodid") Integer goodid,@Param("create_time") String create_time) throws Exception;
	
	@Select("select * from deal where dealist=#{dealist}")
	public List<Deal> getAllDeal(@Param("dealist") String dealist) throws Exception;
	
	@Select("select * from deal where deal_id=#{deal_id}")
	public Deal getDeal(@Param("deal_id") Integer deal_id) throws Exception;
	
	@Select("select max(deal_id) from deal")
	public Integer getAutoId() throws Exception;

}
