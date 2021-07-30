package com.sust.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.sust.entity.Buyer;
import com.sust.entity.Deal;
import com.sust.service.impl.BuyerServiceImpl;
import com.sust.service.impl.DealServiceImpl;
import com.sust.service.impl.SellerServiceImpl;

@Controller // 控制器 --servlet
@RequestMapping("/deal")
public class DealController {
	private Logger log = Logger.getLogger(BuyerController.class); // log4j日志

	@Autowired // 按类型匹配
	private DealServiceImpl dealService;
	@Autowired // 按类型匹配
	private BuyerServiceImpl buyerService;
	@Autowired // 按类型匹配
	private SellerServiceImpl sellerService;

	
	
	@RequestMapping("/dealMake")
	public String dealMakeById(String dealist,String hanger,int goodid,Map<String, Object> map,HttpSession session) throws Exception {
//		log.info("摘牌信息为：" + deal);
		System.out.println("deal");
		String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		try {
			int num = dealService.dealMakeById(dealist,hanger,goodid,date);
			if (num > 0) {
				buyerService.buyerDeal(goodid);
				int deal_id=dealService.getAutoId();
				System.out.println(deal_id);
				Deal deal=dealService.getDeal(1);
				session.setAttribute("deal",deal);
				map.put("deal", deal);
				return "dealInfo";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("dealMake", "成功");
		
		return "dealInfo";

	}
	
	@RequestMapping("/dealMake2")
	public String dealMakeById2(String dealist,String hanger,int goodid,Map<String, Object> map,HttpSession session) throws Exception {
//		log.info("摘牌信息为：" + deal);
		System.out.println("deal");
		String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		try {
			int num = dealService.dealMakeById(dealist,hanger,goodid,date);
			if (num > 0) {
				sellerService.sellerDeal(goodid);
				int deal_id=dealService.getAutoId();
				System.out.println(deal_id);
				Deal deal=dealService.getDeal(deal_id);
				session.setAttribute("deal",deal);
				map.put("deal", deal);
				return "dealInfo";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("dealMake", "成功");
		
		return "dealInfo";

	}
	
	@RequestMapping("/getAllDeals/{dealist}")
	public String getAllDeals(@PathVariable("dealist") String dealist,Integer pageNum, Integer maxPage, Map<String, Object> map, HttpSession session) throws Exception {

		
		List<Deal> dealList=dealService.getAllDeal(pageNum, maxPage,dealist);
		PageInfo<Deal> pageInfo = new PageInfo<>(dealList);
		map.put("pageInfo", pageInfo);
		map.put("dealList", dealList);
		return "showAllDeal";
	}
}
