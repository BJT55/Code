package com.sust.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sust.entity.User;
import com.sust.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/file")
public class FileController {
	@Autowired // 按类型匹配
	private UserServiceImpl userService;
	
	private Logger log = Logger.getLogger(UserContorller.class); // log4j日志

	@RequestMapping("/uploadLicense")
	@ResponseBody
	public String uploadLicense(MultipartFile mfile, HttpSession session)
			throws Exception {
		System.out.println("企业资格证上传");
		User user = (User)session.getAttribute("user");
		System.out.println(user.getUser_pwd());
		// long size = mfile.getSize(); //文件大小
		// System.out.println(size);
		String originalFilename = mfile.getOriginalFilename(); // 文件原始名称	
		System.out.println(originalFilename);
		userService.uploadImageLicense(originalFilename, user);
//		 System.out.println(originalFilename);
		// String contentType = mfile.getContentType(); //文件类型
		// System.out.println(contentType);
		// 真实路径
		String realPath = session.getServletContext().getRealPath("images");
		 System.out.println(realPath);
		mfile.transferTo(new File(realPath + File.separator + originalFilename));
		return originalFilename;
	}
	@RequestMapping("/uploadTax")
	@ResponseBody
	public String uploadTax(MultipartFile mfile, HttpSession session)
			throws Exception {
		User user = (User)session.getAttribute("user");
		// long size = mfile.getSize(); //文件大小
		// System.out.println(size);
		String originalFilename = mfile.getOriginalFilename(); // 文件原始名称
//		 System.out.println(originalFilename);
		userService.uploadImageTax(originalFilename, user);
		// String contentType = mfile.getContentType(); //文件类型
		// System.out.println(contentType);
		// 真实路径
		String realPath = session.getServletContext().getRealPath("images");
		 System.out.println(realPath);
		mfile.transferTo(new File(realPath + File.separator + originalFilename));
		return originalFilename;
	}
	@RequestMapping("/uploadOrgnum")
	@ResponseBody
	public String uploadOrgnum(MultipartFile mfile, HttpSession session)
			throws Exception {
		User user = (User)session.getAttribute("user");
		// long size = mfile.getSize(); //文件大小
		// System.out.println(size);
		String originalFilename = mfile.getOriginalFilename(); // 文件原始名称
//		 System.out.println(originalFilename);
		userService.uploadImageOrgnum(originalFilename, user);
		// String contentType = mfile.getContentType(); //文件类型
		// System.out.println(contentType);
		// 真实路径
		String realPath = session.getServletContext().getRealPath("images");
		 System.out.println(realPath);
		mfile.transferTo(new File(realPath + File.separator + originalFilename));
		return originalFilename;
	}
	@RequestMapping("/uploadBank")
	@ResponseBody
	public String uploadBank(MultipartFile mfile, HttpSession session)
			throws Exception {
		User user = (User)session.getAttribute("user");
		// long size = mfile.getSize(); //文件大小
		// System.out.println(size);
		String originalFilename = mfile.getOriginalFilename(); // 文件原始名称
//		 System.out.println(originalFilename);
		userService.uploadImageBank(originalFilename, user);
		// String contentType = mfile.getContentType(); //文件类型
		// System.out.println(contentType);
		// 真实路径
		String realPath = session.getServletContext().getRealPath("images");
		 System.out.println(realPath);
		mfile.transferTo(new File(realPath + File.separator + originalFilename));
		return originalFilename;
	}
	@RequestMapping("/uploadPermit")
	@ResponseBody
	public String uploadPermit(MultipartFile mfile, HttpSession session)
			throws Exception {
		User user = (User)session.getAttribute("user");
		// long size = mfile.getSize(); //文件大小
		// System.out.println(size);
		String originalFilename = mfile.getOriginalFilename(); // 文件原始名称
//		 System.out.println(originalFilename);
		userService.uploadImagePermit(originalFilename, user);
		// String contentType = mfile.getContentType(); //文件类型
		// System.out.println(contentType);
		// 真实路径
		String realPath = session.getServletContext().getRealPath("images");
		 System.out.println(realPath);
		mfile.transferTo(new File(realPath + File.separator + originalFilename));
		return originalFilename;
	}
	@RequestMapping("/uploadCorporative")
	@ResponseBody
	public String uploadCorporative(MultipartFile mfile, HttpSession session)
			throws Exception {
		User user = (User)session.getAttribute("user");
		// long size = mfile.getSize(); //文件大小
		// System.out.println(size);
		String originalFilename = mfile.getOriginalFilename(); // 文件原始名称
//		 System.out.println(originalFilename);
		userService.uploadImageCorporative(originalFilename, user);
		// String contentType = mfile.getContentType(); //文件类型
		// System.out.println(contentType);
		// 真实路径
		String realPath = session.getServletContext().getRealPath("images");
		 System.out.println(realPath);
		mfile.transferTo(new File(realPath + File.separator + originalFilename));
		return originalFilename;
	}
	

	@RequestMapping("/download")
	public void download(String fileName, HttpServletResponse resp, HttpSession session) throws Exception {
		System.out.println(fileName);
		// 下载时文件名会乱码或不显示，进行转码
		String downloadFielName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
		// 设置响应的内容类型为流的方式
		resp.setContentType("application/octet-stream");
		// 让服务器告诉浏览器它发送的数据属于什么文件类型（流）
		resp.setHeader("content-type", "application/octet-stream");
		// 告诉浏览器这个文件的类型和名字(attachment--以附件的方式)
		resp.setHeader("Content-Disposition", "attachment;filename=" + downloadFielName);

		String realPath = session.getServletContext().getRealPath("images");
		System.out.println("下面是文件路径");
		System.out.println(realPath);
		// 以流的方式将文件从真实的存储地址读回来--内存
		FileInputStream fis = new FileInputStream(realPath + File.separator + fileName);
		ServletOutputStream os = resp.getOutputStream();
		int len = 0;
		// 自定义缓冲区（缓冲区的大小为1024）
		byte[] b = new byte[1024];
		while ((len = fis.read(b)) != -1) {
			os.write(b, 0, len);
		}
		os.close();
		fis.close();
	}

}
