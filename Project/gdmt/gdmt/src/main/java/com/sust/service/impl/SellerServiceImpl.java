package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sust.dao.ISellerDao;
import com.sust.entity.Seller;
import com.sust.service.ISellerService;



@Service
public class SellerServiceImpl implements ISellerService {
	@Autowired
	private ISellerDao sellerDao;
	
	@Override
	public int add(Seller seller) throws Exception {
		// TODO Auto-generated method stub
		return sellerDao.add(seller);
	}

	@Override
	public List<Seller> getAllSellers(Integer pageNum, Integer maxPage) throws Exception {
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
		return sellerDao.getAllSellers();
	}
	
	@Override
	public int sellerDeal(Integer seller_id) throws Exception {
		return sellerDao.sellerDeal(seller_id);
	}
	
	public Seller checkBySellerId(Integer seller_id) throws Exception{
		return sellerDao.checkBySellerId(seller_id);
	}

}
