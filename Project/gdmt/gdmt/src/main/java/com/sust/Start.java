package com.sust;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@MapperScan("com.sust")
public class Start {
	public static void main(String[] args) {
		System.out.println("开始....");
		SpringApplication.run(Start.class, args);
		System.out.println("结束....");
	}
	
	@RequestMapping("/say")
	@ResponseBody
	public String sayHello() {
		System.out.println("hello");
		return "hello,springboot";
	}
	
	@RequestMapping("/index")
	public String toLogin() {
		System.out.println("toLogin...");
		return "login";
	}
	
	@RequestMapping("/findPwd")
	public String findPwd() {
		System.out.println("findPwd...");
		return "findPwd";
	}
	

	@RequestMapping("/admin")
	public String admin() {
		System.out.println("admin");
		return "adminLogin";//逻辑地址—视图名称—默认为请求转发
	}
}
