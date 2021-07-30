package com.sust.controllers;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.support.logging.Log;
import com.sust.entity.User;
import com.sust.service.impl.UserServiceImpl;
import com.sust.utils.RandomValidateCodeUtil;

@Controller // 控制器 --servlet
@RequestMapping("/user") // 通过/user这个字符串找到UserController这个类
public class UserContorller {
	static{
		System.out.println("进入controller");
		} 

	private Logger log = Logger.getLogger(UserContorller.class); // log4j日志

	@Autowired // 按类型匹配
	private UserServiceImpl userService;

	// @RequestMapping("/index") // 通过/index这个字符串找到index这个方法
	// public String index() {
	// System.out.println("index...");
	// return "index"; // 逻辑地址--视图名称 ---默认为请求转发
	// }
	@RequestMapping("/toRegist")
	public String toRegist() {

		return "regist";
	}
	
	
	@RequestMapping("/toTop")
	public String toTop() throws Exception {

	//	return "test";
		return "redirect:/test.jsp";
	}
	
	
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	
	
	@RequestMapping("/toFindPwd")
	public String toFindPwd() {
		return "findPwd";
	}
	
	
	@RequestMapping("/toUpLoadImage")
	public String toUpLoadImage() {
		return "uploadImage";
	}
	
	
	@RequestMapping("/regist")
	
	public String regist(User user, Map<String, Object> map,HttpSession session,String code) throws Exception { // 数据绑定---对象绑定
		log.info("用户信息为：" + user);
		System.out.println("输出注册用户信息");
		 System.out.println(user.getUser_account()+user.getUser_pwd()+user.getUser_email());
		 User result = userService.loginByaccount(user.getUser_account());
		 if(result!=null) {
				System.out.println("进入判断用户已经存在");
			 map.put("registDefeat", "用户已经存在");	return "regist";
		 }
	     String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
			if(user.getUser_account()==null|| user.getC_name()==null||user.getRegist_fund()==null||user.getUser_csimple()==null||user.getUser_corporative()==null||user.getAddress()==null||user.getArea()==null||user.getRegist_fund()==null||user.getUser_contact()==null||user.getUser_pwd()==null||user.getFax()==null||user.getUser_email()==null)
			{	map.put("registDefeat", "注册失败");	return "regist";}
			if(!random.equals(code) || random == null){
				map.put("registDefeat", "验证码输入错误");
				return "regist";
			}
		try {
			int num = userService.regist(user);
			if (num > 0) {
				
				return "login";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(user !=null)
		map.put("registDefeat", "注册失败");
		return "regist";
	}

	@RequestMapping("/login")
	public String login(String user_account, String user_pwd, Map<String, Object> map, HttpSession session,String code)
			throws Exception {
		System.out.println("到达生产login前");
		User user = userService.login(user_account, user_pwd);
		System.out.println("到达login");
	//	System.out.println(user.toString());
		System.out.println("上面为user信息");
		log.info("....." + user);
		System.out.println("userid为");
		//从session中获取随机数
        String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
        System.out.println("random为");
        System.out.println(random);
        
	//	System.out.println(user.getUser_id());
		if (user != null && user.getUser_id() >=0) {
//			if ("false".equals(user.getState())) {
//				map.put("loginDefeat", "账号已经被禁用，请与管理员联系");
//				return "login";
//			}	
			if(!random.equals(code) || random == null){
			map.put("loginDefeat", "验证码输入错误");
			return "login";
		}
			session.setAttribute("user", user);
		
			return "redirect:/test.jsp";
		//	return " ";
		} else {
			map.put("loginDefeat", "用户名称或密码不正确，请重新输入");
			return "login";
		}

	}
	
	
	 /**
     * 生成验证码
     */
    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	@RequestMapping("/findPwd")
	public String findPwd(String user_account, String user_pwd, String user_pwd2 , String user_email ,Map<String, Object> map, HttpSession session)
			throws Exception {
		System.out.println("到达生产findPwd前");
		System.out.println("第一个密码：");
		System.out.println(user_pwd);
		System.out.println("第二个密码：");
		System.out.println(user_pwd2);
		System.out.println("邮箱");
		System.out.println(user_email);
		System.out.println("账号");
		System.out.println(user_account);
		if(!user_pwd.equals(user_pwd2)) {
			System.out.println("两次密码不同");
			map.put("pwdDefeat", "两次密码输入不同，请重新输入");
			return "findPwd";
		}
		User user = userService.loginByEmail(user_account,user_email );
		System.out.println("生成user  byemail成功");
		if(user==null) {
			map.put("accountDefeat", "用户名称或邮箱不正确，请重新输入");
			return "findPwd";
		}
	//	System.out.println(user.toString());
		System.out.println("上面为user信息");
		log.info("....." + user);
		System.out.println("userid为");
	//	System.out.println(user.getUser_id());
		
//			if ("未审核".equals(user.getUser_state())) {		
//				map.put("loginDefeat", "账号还未审核，请与管理员联系");
//				return "login";
			
		if (user!=null) {
			  user.setUser_pwd(user_pwd);
			  System.out.println(user.getUser_pwd());
			  session.setAttribute("user", user);
			  int num = userService.modifyUserByUserid(user);
			return "top";
		} else {
			map.put("loginDefeat", "用户名称或密码不正确，请重新输入");
			return "login";
		}

	}
	
	@RequestMapping("/trade")
	public String trade(int buyer_id) throws Exception {
		 System.out.println("buyer_id is");
		 System.out.println(buyer_id);
		 
		return "top";
	}
	
	

	@RequestMapping("/logout")
	public String logout(HttpSession session) {  
		session.invalidate();
		return "login";
	}
	
	
	
	
	

}