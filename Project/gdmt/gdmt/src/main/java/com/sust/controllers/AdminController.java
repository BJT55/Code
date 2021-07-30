package com.sust.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

import javax.jms.Session;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateUserStatement.UserSpecification;
import com.alibaba.druid.sql.visitor.functions.If;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.github.pagehelper.PageInfo;
import com.sust.entity.Admin;
import com.sust.entity.Buyer;
import com.sust.entity.View;
import com.sust.entity.User;
import com.sust.service.impl.AdminServiceImpl;
import com.sust.service.impl.BuyerServiceImpl;
import com.sust.service.impl.FinanceServiceImpl;
import com.sust.service.impl.UserServiceImpl;

import ch.qos.logback.core.net.LoginAuthenticator;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private static final Logger LOG = Logger.getLogger(AdminController.class); 
	@Autowired
	private AdminServiceImpl adminService;
	@Autowired
	private UserServiceImpl userService;
	@Autowired
	private BuyerServiceImpl buyerService;
	@Autowired
	private FinanceServiceImpl financeService;


	@PostMapping("/login")
//	@RequestMapping("/login" )
	public String login(String username,String password,Map <String,Object> map,HttpSession session) throws Exception {
		Admin admin=adminService.login(username, password);
		if(admin!=null) {
			if("超级管理员".equals(admin.getAdmin_limit())) {
				session.setAttribute("admin",admin);
				return "adminSuccess1";
			}else if("注册信息部门".equals(admin.getAdmin_depart())) {
				session.setAttribute("admin",admin);
				List<User> userList = userService.getAllUsers(null, null);
				PageInfo<User> pageInfo = new PageInfo<>(userList);
				map.put("pageInfo", pageInfo);
				map.put("userList", userList);
				return "adminSuccess2";
			}
			else if("交易信息部门".equals(admin.getAdmin_depart())) {
				session.setAttribute("admin",admin);
				List<Buyer> buyerList = buyerService.getAllDealInfos(null, null);
				PageInfo<Buyer> pageInfo = new PageInfo<>(buyerList);
				map.put("pageInfo", pageInfo);
				map.put("buyerList", buyerList);
				return "adminSuccess3";
			}
		}else {
			map.put("loginDefeat", "用户名或密码错误，请重新输入！");
			return "adminLogin";
		}
		return "adminLogin";
	}
	
	@RequestMapping("/logout" )
	public String login(HttpSession session) throws Exception {
		session.invalidate();
		return "adminLogin";
	}
	
	@RequestMapping("/add")
	public String addAdmin(HttpSession session)throws Exception{
		session.invalidate();
		return "adminRegist";
	}
	
	@RequestMapping("/regist" )
	public String regist(Admin admin, Map <String,Object> map)throws Exception{
		LOG.info("admininfo："+admin);
		try {
			int num = adminService.regist(admin);
			if(num>0) {
				map.put("registDefeat","添加成功");
				return "adminRegist";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		map.put("registDefeat","添加失败");
		return "adminRegist";
	}
	
	@RequestMapping("/modify")
	public String modifyAdmin(String username,String password,Map <String,Object> map,HttpSession session)throws Exception{
		
		List<Admin> adminList = adminService.getAllAdmins(null, null);
		PageInfo<Admin> pageInfo = new PageInfo<>(adminList);
		map.put("pageInfo", pageInfo);
		map.put("adminList", adminList);
		return "showAllAdmins";
	}
	
	@RequestMapping("/modifyPassword/{id}/{pageNum}/{maxPage}")
	public String modifyPassword(@PathVariable("id") Integer id, @PathVariable("pageNum") Integer pageNum,
			@PathVariable("maxPage") Integer maxPage, Map<String, Object> map) throws Exception {
		Admin admin = new Admin();
		admin.setAdmin_id(id);
		int num = adminService.modifyAdminByAdminid(admin);
		if (num > 0) {
			map.put("flag", "修改成功！");
		} else {
			map.put("flag", "修改失败！");
		}
		List<Admin> adminList = adminService.getAllAdmins(pageNum, maxPage);
		PageInfo<Admin> pageInfo = new PageInfo<>(adminList);
		map.put("pageInfo", pageInfo);
		map.put("adminList", adminList);
		return "showAllAdmins";

	}

	
	@RequestMapping("/removeAdmin/{id}/{pageNum}/{maxPage}")
	public String removeAdmin(@PathVariable("id") Integer id, Integer pageNum, Integer maxPage, String limit,Map<String, Object> map) throws Exception {
		int num = adminService.removeAdminByAdminid(id);
		if (num > 0) {
			map.put("flag", "删除成功！");
		} else {
			map.put("flag", "删除失败！");
		}
		List<Admin> adminList = adminService.getAllAdmins(pageNum, maxPage);
		PageInfo<Admin> pageInfo = new PageInfo<>(adminList);
		map.put("pageInfo", pageInfo);
		map.put("adminList", adminList);
		return "showAllAdmins";

	}
	
	@RequestMapping("/getAllAdmins")
	public String getAllAdmins(Integer pageNum, Integer maxPage, Map<String, Object> map) throws Exception {

		List<Admin> adminList = adminService.getAllAdmins(pageNum, maxPage);
		PageInfo<Admin> pageInfo = new PageInfo<>(adminList);
		map.put("pageInfo", pageInfo);
		map.put("adminList", adminList);
		return "showAllAdmins";
	}
	
	@RequestMapping("/getAllUsers")
	public String getAllUsers(Integer pageNum, Integer maxPage, Map<String, Object> map, HttpSession session) throws Exception {

		List<User> userList = userService.getAllUsers(pageNum, maxPage);
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		map.put("pageInfo", pageInfo);
		map.put("userList", userList);
		return "adminSuccess2";
	}
	
//	@RequestMapping("/getAllInfos")
//	public String getAllInfos(Map<String, Object> map) throws Exception {
//
//		return "showAllInfo";
//	}
	
	@RequestMapping("/checkByUserId/{id}")
	public String checkInfo(@PathVariable("id") Integer id, Map<String, Object> map,HttpSession session) throws Exception{
		User user=userService.checkInfo(id);
		session.setAttribute("user",user);
		map.put("user", user);
		return "showAllInfo";
	}
	
	@RequestMapping("/checkByBuyerId/{id}")
	public String checkByBuyerId(@PathVariable("id") Integer id, Map<String, Object> map,HttpSession session) throws Exception{
		Buyer buyer=buyerService.checkByBuyerId(id);
		session.setAttribute("buyer",buyer);
		map.put("buyer", buyer);
		String c_name=buyer.getBuyer_cname();
		System.out.println(c_name);
		List<View> checkList = buyerService.getAllChecks(c_name);
		map.put("checkList", checkList);
		return "showAllDealInfo";
	}
	
	@RequestMapping("/userPass/{id}")
	public String userPass(@PathVariable("id") Integer id, Map<String, Object> map) throws Exception{

		userService.userPass(id);
		User user = userService.checkInfo(id);
		String c_name=user.getC_name();
		String f_account=null;
		financeService.createFinance(f_account, c_name);
		List<User> userList = userService.getAllUsers(null, null);
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		map.put("pageInfo", pageInfo);
		map.put("userList", userList);
		return "adminSuccess2";
	}
	
	@RequestMapping("/userFailToPass/{id}")
	public String userFailToPass(@PathVariable("id") Integer id, Map<String, Object> map) throws Exception{

		userService.userFailToPass(id);
		List<User> userList = userService.getAllUsers(null, null);
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		map.put("pageInfo", pageInfo);
		map.put("userList", userList);
		return "adminSuccess2";
	}
	
	@RequestMapping("/buyerPass/{id}")
	public String buyerPass(@PathVariable("id") Integer id, Map<String, Object> map) throws Exception {
		buyerService.buyerPass(id);
		List<Buyer> buyerList = buyerService.getAllDealInfos(null, null);
		PageInfo<Buyer> pageInfo = new PageInfo<>(buyerList);
		map.put("pageInfo", pageInfo);
		map.put("buyerList", buyerList);
		return "adminSuccess3";

	}
	
	@RequestMapping("/buyerFailToPass/{id}")
	public String buyerFailToPass(@PathVariable("id") Integer id, Map<String, Object> map) throws Exception{

		buyerService.buyerFailToPass(id);
		List<Buyer> buyerList = buyerService.getAllDealInfos(null, null);
		PageInfo<Buyer> pageInfo = new PageInfo<>(buyerList);
		map.put("pageInfo", pageInfo);
		map.put("buyerList", buyerList);
		return "adminSuccess3";
	}
	
	@RequestMapping("/updateView" )
	public String updateView(View view, Map <String,Object> map)throws Exception{
		LOG.info("viewinfo："+view);
		try {
			int num = buyerService.modifyView(view);
			if(num>0) {
				return "showAllDealInfo";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		map.put("insertDefeat","添加失败");
		List<View> viewList = buyerService.getAllChecks(view.getC_name());
		map.put("viewList", viewList);
		return "showAllDealInfo";
	}
	
	@RequestMapping("/updateUserView" )
	public String updateUserView(Integer user_id, String user_view, Map <String,Object> map)throws Exception{
		
		try {
			int num = userService.updateUserView(user_id, user_view);
			if(num>0) {
				return "showAllInfo";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		map.put("insertDefeat","添加失败");
		return "showAllInfo";
	}
	
//	@RequestMapping("/getAllChecks")
//	public String getAllChecks(String buyer_cname,Map<String, Object> map, HttpSession session) throws Exception {
//
//		List<Check> checkList = buyerService.getAllChecks(buyer_cname);
//		map.put("checkList", checkList);
//		return "showAllDealInfo";
//	}
}
