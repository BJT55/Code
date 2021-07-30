package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sust.dao.IDealDao;
import com.sust.entity.Deal;
import com.sust.entity.User;
import com.sust.service.IDealService;

@Service
public class DealServiceImpl implements IDealService{
	@Autowired
	private IDealDao dealDao;
	
	@Override
	public int dealMakeById(String dealist,String hanger,Integer goodid,String create_time) throws Exception {
		// TODO Auto-generated method stub
		return dealDao.dealMakeById(dealist,hanger,goodid,create_time);
	}
		
		@Override
		public List<Deal> getAllDeal(Integer pageNum, Integer maxPage,String dealist) throws Exception {	
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
			return dealDao.getAllDeal(dealist);
		}
		
		@Override
		public Deal getDeal(Integer deal_id) throws Exception{
			return dealDao.getDeal(deal_id);
		}

		@Override
		public Integer getAutoId() throws Exception{
			return dealDao.getAutoId();
		}

}
