package com.sust.service;

import java.util.List;

import com.sust.entity.Buyer;
import com.sust.entity.View;

public interface IBuyerService {
	
	public int add(Buyer buyer) throws Exception;
	public List<Buyer> getAllBuyers(Integer pageNum, Integer maxPage) throws Exception;
   
//罗
	public List<Buyer> getAllDealInfos(Integer pageNum, Integer maxPage) throws Exception ;

	public Buyer checkByBuyerId(Integer buyer_id) throws Exception;
	
	public List<View> getAllChecks(String c_name) throws Exception;
	
	public int buyerPass(Integer buyer_id) throws Exception ;
	
	public int buyerFailToPass(Integer buyer_id) throws Exception ;
	
	public int modifyView(View view) throws Exception ;
	public int buyerDeal(Integer buyer_id) throws Exception ;

}