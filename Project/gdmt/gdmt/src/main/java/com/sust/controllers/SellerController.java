package com.sust.controllers;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.assertj.core.internal.Booleans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sust.entity.Seller;
import com.sust.entity.User;
import com.github.pagehelper.PageInfo;
import com.sust.service.impl.SellerServiceImpl;

@Controller // 控制器 --servlet
@RequestMapping("/seller")
public class SellerController {
	private Logger log = Logger.getLogger(SellerController.class); // log4j日志

	@Autowired // 按类型匹配
	private SellerServiceImpl sellerService;

					 
	
//	@RequestMapping("/modifySellerState")
//	public String modifySellerState(Integer seller_id, Integer pageNum, Integer maxPage, Integer seller_state,
//			Map<String, Object> map) throws Exception {
//		Seller seller = new Seller();
//		seller.setSeller_id(seller_id);
//		seller.setSeller_state(seller_state);
//		sellerService.modifySellerState(seller);
//		List<Seller> userList = sellerService.getAllSellers(pageNum, maxPage);
//		map.put("userList", userList);
//		PageInfo<Seller> pageInfo = new PageInfo<>(userList);
//		map.put("pageInfo", pageInfo);
//
//		return "showAllUsers";
//	}
	

	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		//return "top";
		return "redirect:/test.jsp";
	}

	
	@RequestMapping("/sellerGoods")
	public String add(Seller seller,Map<String, Object> map,HttpSession session) throws Exception{
		System.out.println("进入");
		if(seller==null) {
			map.put("addDefeat", "含有非法字符发布失败");
			return "sellerGoods";
		}
		else 	if(seller.getSeller_supnum()==null||seller.getCalorific()==null||seller.getSeller_price()==null||seller.getSulful()==null||seller.getSeller_origin()==null||seller.getTrans_price()==null||seller.getVolatility()==null||seller.getElement()==null||seller.getMoisture()==null)
		{ System.out.println("进入名字错误");
			map.put("addDefeat", "提交失败,有必填项为未填写");
			return "sellerGoods";
		}
		System.out.println(seller);
		
		if(!isNumeric(seller.getSeller_supnum())&&isNumeric(seller.getCalorific())&&isNumeric(seller.getSeller_price())&&isNumeric(seller.getSulful())&&isNumeric(seller.getTrans_price())&&isNumeric(seller.getElement())&&isNumeric(seller.getMoisture())) {
			
			map.put("addDefeat", "含有非法字符发布失败");
			return "sellerGoods";
		}
		try {
			  User  user =     (User) session.getAttribute("user");
			  System.out.println("输出数值");
			  System.out.println(seller.getSeller_price());
//			  System.out.println("shuchu名字");
//			  System.out.println(user.getC_name());
//			  seller.setSeller_cname(user.getC_name());
//			//  System.out.println("shuchu seller 名字");
//			  System.out.println(seller.getSeller_cname());
			int num = sellerService.add(seller);
			if(num > 0) {
				return "baoZhengJin";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("addDefeat", "发布失败");
		return "sellerGoods";
	}
	
	@RequestMapping("/toSellerGoods")
	public String add() throws Exception {

		return "sellerGoods";
	}
	
	
	
	@RequestMapping("/getAllSellers")
	public String getAllSellers(Integer pageNum, Integer maxPage, Map<String, Object> map) throws Exception {

		System.out.println("1");
		System.out.println("进入");
		List<Seller> sellerList = sellerService.getAllSellers(pageNum, maxPage);
		System.out.println("下面输出buy有几条");
		System.out.println(sellerList.size());
		PageInfo<Seller> pageInfo = new PageInfo<>(sellerList);
		map.put("pageInfo", pageInfo);
		map.put("sellerList", sellerList);
		return "showAllSellers";
	}
	
	
	@RequestMapping("/toTop")
	public String toTop() throws Exception {

	//	return "top";
		return "redirect:/test.jsp";
	}
	
	 
	public static boolean isNumeric(Double str1){
		String str=str1.toString();
		Pattern pattern = Pattern.compile("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}");

		Matcher isNum = pattern.matcher(str);

		if( !isNum.matches() ){
		return false;

		}

		return true;

		}


	
//	public static  boolean isNotDouble(double  str1)
//       {
//		String str = String.valueOf(str1);
//		   
//           boolean flag = false;
//           if (str.StartsWith(".") || str.EndsWith("."))
//           {
//               flag = true;
//           }
//           else
//           {
//               for (int i = 0; i < str.Length; i++)
//               {
//                   if (!(char.IsDigit(str,i) || str[i].Equals('.')))
//                   {
//                       flag = true;
//                       break;
//                   }
//               }
//              
//           }
//           return flag;
//       }
	
//	@RequestMapping("/getAllBuyers")
//	public String getAllBuyers(Integer pageNum, Integer maxPage, Map<String, Object> map) throws Exception {
//
//		System.out.println("2");
//		System.out.println("进入");
//		List<Buyer> buyerList = buyerService.getAllBuyers(pageNum, maxPage);
//		PageInfo<Buyer> pageInfo = new PageInfo<>(buyerList);
//		map.put("pageInfo", pageInfo);
//		map.put("sellerList", buyerList);
//		return "showAllSellers";
//	}
	
	@RequestMapping("/checkBySellerId/{id}")
	public String checkByBuyerId(@PathVariable("id") Integer id, Map<String, Object> map,HttpSession session) throws Exception{
		Seller seller=sellerService.checkBySellerId(id);
		session.setAttribute("seller",seller);
		map.put("seller", seller);
		return "sellerDetails";
	}

}
