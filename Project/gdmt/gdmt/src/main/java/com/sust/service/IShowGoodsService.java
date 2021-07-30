package com.sust.service;

import java.util.List;

import com.sust.entity.Buyer;
import com.sust.entity.Seller;

public interface IShowGoodsService {

	public List<Buyer> getMyAllBuyers(String cname)throws Exception;
		
	public List<Seller> getMyAllSellers(String cname)throws Exception;
	
	public List<Seller> getStateSellers(String state,String cname)throws Exception;
	
	public List<Buyer> getStateBuyers(String state,String cname)throws Exception;
	
	public Buyer getOneBuyer(Integer id)throws Exception;
	
	public Seller getOneSeller(Integer id)throws Exception;
}


