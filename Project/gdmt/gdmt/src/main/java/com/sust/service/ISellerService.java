package com.sust.service;

import java.util.List;


import com.sust.entity.Seller;

public interface ISellerService {

	
	public int add(Seller seller) throws Exception;
	public List<Seller> getAllSellers(Integer pageNum, Integer maxPage) throws Exception;

	public int sellerDeal(Integer seller_id) throws Exception ;
	public Seller checkBySellerId(Integer seller_id) throws Exception;
}