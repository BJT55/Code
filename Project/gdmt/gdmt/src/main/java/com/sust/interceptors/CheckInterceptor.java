package com.sust.interceptors;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@SuppressWarnings("deprecation")
@Component
@Configuration
public class CheckInterceptor extends HandlerInterceptorAdapter {
	@Override 
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
			Object handler, Exception ex) throws Exception { 
		super.afterCompletion(request, response, handler, ex); 
	} 
	
	@Override 
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
			Object handler, ModelAndView modelAndView) throws Exception { 
//		super.postHandle(request, response, handler, modelAndView); 
//		if(modelAndView != null){
//            Map<String, String> map = new HashMap<String, String>();
//            modelAndView.addAllObjects(map);
//        }
		
		
	} 
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, 
			Object handler) throws Exception { 
		// 判断是否为文件上传请求
        if (request instanceof MultipartHttpServletRequest) {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            Map<String, MultipartFile> files = multipartRequest.getFileMap();
            Iterator<String> iterator = files.keySet().iterator();
            //对多部件请求资源进行遍历
            while (iterator.hasNext()) {
                String formKey = (String) iterator.next();
                MultipartFile multipartFile = multipartRequest.getFile(formKey);
                String filename=multipartFile.getOriginalFilename();
                //判断是否为限制文件类型
                if (checkFile(filename)) {
                	System.out.println("upload successfully!");
                    return true;
                } 
            }
        }
        request.getRequestDispatcher("user/login").forward(request, response);
        System.out.println("failed to upload.");
        return false;

	} 
	
	private boolean checkFile(String fileName) {
        //设置允许上传文件类型
        String suffixList = "jpg,png,ico,bmp,jpeg";
        // 获取文件后缀
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        if (suffixList.contains(suffix.trim().toLowerCase())) {
            return true;
        }
        return false;
    }
}
