package com.sust.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sust.entity.Buyer;
import com.sust.entity.View;
import com.github.pagehelper.PageInfo;
import com.sust.service.impl.BuyerServiceImpl;

@Controller // 控制器 --servlet
@RequestMapping("/buyer")
public class BuyerController {
	private Logger log = Logger.getLogger(BuyerController.class); // log4j日志

	@Autowired // 按类型匹配
	private BuyerServiceImpl buyerService;
	

	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
	//	return "top";
		return "redirect:/test.jsp";
	}
	
	
	@RequestMapping("/buyerGoods")
	public String add(Buyer buyer,Map<String,Object> map) throws Exception {
		System.out.println("进入");
		System.out.println(buyer);
		if(buyer==null)
		{System.out.println("进入cuowu");
			map.put("addDefeat", "提交失败,有必填项为未填写");
	
		}
		
		else 	if(buyer.getBuyer_cname()==null||buyer.getBuyer_num()==null||buyer.getBuyer_man()==null||buyer.getBuyer_signer()==null||buyer.getBuyer_date()==null||buyer.getBuyer_time()==null||buyer.getBuyer_kind()==null||buyer.getBuyer_purnum()==null||buyer.getBuyer_trans()==null||buyer.getBuyer_location()==null||buyer.getBuyer_pay()==null||buyer.getBuyer_test()==null||buyer.getBuyer_payway()==null)
		{ System.out.println("进入名字错误");
			map.put("addDefeat", "提交失败,有必填项为未填写");
		
		}
		else {
			System.out.println("输出按钮信息");
			System.out.println(buyer.getBuyer_offer());System.out.println(	buyer.getBuyer_promise());
		
			if(buyer.getBuyer_offer().contains("on,")) {
				System.out.println("设置offer按钮信息0");
				buyer.setBuyer_offer(buyer.getBuyer_offer().substring(3));
			}
			if(buyer.getBuyer_promise().contains("on,")) {
				System.out.println("输出promise按钮信息0");
				buyer.setBuyer_promise(buyer.getBuyer_promise().substring(3));
			}
			System.out.println("输出切割后按钮信息");
			System.out.println(buyer.getBuyer_offer());System.out.println(	buyer.getBuyer_promise());
			int num = buyerService.add(buyer);
			System.out.println("num为");
			System.out.println(num);
			if(num > 0) {
			//	return "top";
				return "redirect:/test.jsp";
			}
		
		}
		 System.out.println("开始返回");
		return "buyerGoods"; 
		
		
	}
	
	@RequestMapping("/toBuyerGoods")
	public String add() throws Exception {

		return "buyerGoods";
	}
	
	
	@RequestMapping("/toTop")
	public String toTop() throws Exception {

	//	return "top";
		return "redirect:/test.jsp";
	}
	
	
	
	@RequestMapping("/getAllBuyers")
	public String getAllBuyers(Integer pageNum, Integer maxPage, Map<String, Object> map) throws Exception {

		System.out.println("2");
		System.out.println("进入");
		List<Buyer> buyerList = buyerService.getAllBuyers(pageNum, maxPage);
		System.out.println("下面输出buy有几条");
		System.out.println(buyerList.size());
		PageInfo<Buyer> pageInfo = new PageInfo<>(buyerList);
		map.put("pageInfo", pageInfo);
		map.put("buyerList", buyerList);
		return "showAllBuyers";
		
	}
	
	
	@RequestMapping("/checkByBuyerId/{id}")
	public String checkByBuyerId(@PathVariable("id") Integer id, Map<String, Object> map,HttpSession session) throws Exception{
		Buyer buyer=buyerService.checkByBuyerId(id);
		session.setAttribute("buyer",buyer);
		map.put("buyer", buyer);
		return "buyerDetails";
	}
	
	

}