package com.sust.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sust.entity.*;
import com.sust.service.impl.ShowGoodsImpl;



@Controller
@RequestMapping("/User")
public class ShowGoodsController {

	
	private Logger log = Logger.getLogger(ShowGoodsController.class);
	@Autowired
	private ShowGoodsImpl showMyBuyerAndSeller;
	
	@RequestMapping("/allgoods")
	public String showmy( Map<String, Object> map,HttpSession session) throws Exception {
	
		return "allgoods";
	}
	@RequestMapping("/loginnn")
	public String login( Map<String, Object> map,HttpSession session) throws Exception {
	
		
      User  user =     (User) session.getAttribute("user");
		
		//session.setAttribute("user", user);
		
		return "allgoods";
	}


	
	@RequestMapping("/showMyBuyerAndSeller/{state}")

	public String showStateBuyerAndSeller(@PathVariable("state") String state ,Map<String, Object> map,HttpSession session) throws Exception {
		Buyer buyer=new Buyer();
		User user = (User)session.getAttribute("user");
		List<Buyer> buyerList;
		List<Seller> sellerList ;
		if (state.equals("all")) {
			 buyerList = showMyBuyerAndSeller.getMyAllBuyers( user.getC_name());
			 sellerList = showMyBuyerAndSeller.getMyAllSellers(user.getC_name());
			
		}else {
		 buyerList = showMyBuyerAndSeller.getStateBuyers(state, user.getC_name());
		 sellerList = showMyBuyerAndSeller.getStateSellers(state,user.getC_name());
		}
		map.put("buyerList", buyerList);
		map.put("sellerList",sellerList );
		
		
		return "showMyBuyerAndSeller";
	}

	
	
//	@RequestMapping("/showMyBuyerAndSeller/{state}")
//
//	public String showMyBuyerAndSeller(String state,Map<String, Object> map,HttpSession session) throws Exception {
//		Buyer buyer=new Buyer();
//		User user = (User)session.getAttribute("user");
//		
//
//			List<Buyer> buyerList = showMyBuyerAndSeller.getStateBuyers( state,user.getC_name());
//			List<Seller> sellerList = showMyBuyerAndSeller.getStateSellers(state,user.getC_name());
//			map.put("buyerList", buyerList);
//			map.put("sellerList",sellerList );
//		
//			
//		
//		return "showMyBuyerAndSeller";
//	}
//	
	
	
	
	
	@RequestMapping("/showMyBuyerAndSeller/showBuyerDetailsByUserid/{id}")
	public String showBuyerDetailsByUserid(@PathVariable("id") Integer id ,Map<String, Object> map,HttpSession session) throws Exception {
	
		Buyer buyer1 = showMyBuyerAndSeller.getOneBuyer(id);
		map.put("buyer", buyer1);
		
		
		return "buyerDetails";
	}
	
	
	@RequestMapping("/showMyBuyerAndSeller/showSellerDetailsByUserid/{id}")
	public String showSellerDetailsByUserid(@PathVariable("id") Integer id ,Map<String, Object> map,HttpSession session) throws Exception {
	
		Seller seller = showMyBuyerAndSeller.getOneSeller(id);
		map.put("seller", seller);
		
		return "sellerDetails";
	}
	
	
	
	
}
