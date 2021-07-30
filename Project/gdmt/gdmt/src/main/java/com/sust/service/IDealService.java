package com.sust.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sust.entity.Buyer;
import com.sust.entity.Deal;
import com.sust.entity.User;

public interface IDealService {
	
	public int dealMakeById(String dealist,String hanger,Integer goodid,String create_time) throws Exception;
	
	public List<Deal> getAllDeal(Integer pageNum, Integer maxPage,String dealist) throws Exception;
	
	public Deal getDeal(Integer deal_id) throws Exception;
	
	public Integer getAutoId() throws Exception;
}
