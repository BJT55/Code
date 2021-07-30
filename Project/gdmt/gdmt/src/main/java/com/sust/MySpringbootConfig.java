package com.sust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sust.interceptors.CheckInterceptor;

@SpringBootConfiguration // 声明此类为 springboot 配置文件类 
public class MySpringbootConfig implements WebMvcConfigurer { 
	@Autowired
	private CheckInterceptor checkInterceptor; 
	
	@Override 
	public void addInterceptors(InterceptorRegistry registry) { 
		registry.addInterceptor(checkInterceptor).addPathPatterns("/file/uploadLicense"); 
		registry.addInterceptor(checkInterceptor).addPathPatterns("/file/uploadTax"); 
		registry.addInterceptor(checkInterceptor).addPathPatterns("/file/uploadOrgnum"); 
		registry.addInterceptor(checkInterceptor).addPathPatterns("/file/uploadBank"); 
		registry.addInterceptor(checkInterceptor).addPathPatterns("/file/uploadPermit"); 
		registry.addInterceptor(checkInterceptor).addPathPatterns("/file/uploadCorporative"); 
	}
}
