package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sust.dao.IBuyerDao;
import com.sust.entity.Buyer;
import com.sust.service.IBuyerService;
import com.sust.entity.View;

@Service
public class BuyerServiceImpl implements IBuyerService  {
	@Autowired
	private IBuyerDao buyerDao;
	
	
	@Override
	public int add(Buyer buyer) throws Exception {
		// TODO Auto-generated method stub
		return buyerDao.add(buyer);
	}
	
	@Override
	public List<Buyer> getAllBuyers(Integer pageNum, Integer maxPage) throws Exception {
		System.out.println(pageNum + "---" + maxPage);
		if (pageNum == null) {
			pageNum = 1;
		} else if (pageNum <= 0) {
			pageNum = 1;
		} else if (maxPage != null) {
			if (pageNum >= maxPage) {
				pageNum = maxPage;
			}
		}
		// PageHelper.startPage(第几页, 每页显示几条数据);
		// mysql：limit ,只能对紧邻（下）的一条sql语句起作 用
		PageHelper.startPage(pageNum, 6);
		return buyerDao.getAllBuyers();
	}
	
	//罗
	@Override
	public List<Buyer> getAllDealInfos(Integer pageNum, Integer maxPage) throws Exception {

		System.out.println(pageNum + "---" + maxPage);
		if (pageNum == null) {
			pageNum = 1;
		} else if (pageNum <= 0) {
			pageNum = 1;
		} else if (maxPage != null) {
			if (pageNum >= maxPage) {
				pageNum = maxPage;
			}
		}
		
		PageHelper.startPage(pageNum, 6);
		return buyerDao.getAllDealInfos();
	}
	@Override
	public Buyer checkByBuyerId(Integer buyer_id) throws Exception {
		
		return buyerDao.checkByBuyerId(buyer_id);
	}
	
	@Override
	public List<View> getAllChecks(String c_name) throws Exception{
		return buyerDao.getAllChecks(c_name);
	}
	
	@Override
	public int buyerPass(Integer buyer_id) throws Exception {
		return buyerDao.buyerPass(buyer_id);
	}
	
	@Override
	public int buyerFailToPass(Integer buyer_id) throws Exception {
		return buyerDao.buyerFailToPass(buyer_id);
	}
	
	@Override
	public int modifyView(View view) throws Exception {
		return buyerDao.modifyView(view);
	}
	
	
	@Override
	public int buyerDeal(Integer buyer_id) throws Exception {
		return buyerDao.buyerDeal(buyer_id);
	}
	
	
}
