package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sust.dao.ShowGoodsDao;
import com.sust.entity.Buyer;
import com.sust.entity.Seller;
import com.sust.service.IShowGoodsService;

@Service
public class ShowGoodsImpl implements IShowGoodsService  {
	@Autowired
	private ShowGoodsDao showGoodsDao;

	@Override
	public List<Buyer> getMyAllBuyers(String cname) throws Exception {
		// TODO Auto-generated method stub
		return showGoodsDao.getMyAllBuyers(cname);
	}


	@Override
	public List<Seller> getMyAllSellers(String cname) throws Exception {
		// TODO Auto-generated method stub
		return showGoodsDao.getMyAllSellers(cname);
	}
	
	
	@Override
	public List<Buyer> getStateBuyers(String state, String cname) throws Exception {
		// TODO Auto-generated method stub
		return showGoodsDao.getStateBuyers(state, cname);
	}

@Override
	public List<Seller> getStateSellers(String state, String cname) throws Exception {
		// TODO Auto-generated method stub
		return showGoodsDao.getStateSellers(state, cname);
	}


@Override
public Buyer getOneBuyer(Integer id) throws Exception {
	// TODO Auto-generated method stub
	return showGoodsDao.getOneBuyer(id);
}


@Override
public Seller getOneSeller(Integer id) throws Exception {
	// TODO Auto-generated method stub
	return showGoodsDao.getOneSeller(id);
}

	
	

}
