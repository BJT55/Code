package com.sust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sust.dao.IAdminDao;
import com.sust.entity.Admin;
import com.sust.service.IAdminService;
import com.sust.utils.MD5;

@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	private IAdminDao adminDao;
	
	public int regist(Admin admin) throws Exception {

		String newPass = new MD5().getMD5ofStr(admin.getAdmin_password());
		admin.setAdmin_password(newPass);
		return adminDao.regist(admin);
	}

	public int removeAdminByAdminid(Integer admin_id) throws Exception {
	
		return adminDao.removeAdminByAdminid(admin_id);
	}

	public int modifyAdminByAdminid(Admin admin) throws Exception {
		String newPass = new MD5().getMD5ofStr("88888888");
		admin.setAdmin_password(newPass);
		return adminDao.modifyAdminByAdminid(admin);
	}

	public Admin login(String username, String password) throws Exception {
		String newPass = new MD5().getMD5ofStr(password);
		return adminDao.login(username,newPass);
	}

	public List<Admin> getAllAdmins(Integer pageNum, Integer maxPage) throws Exception {
		System.out.println(pageNum + "---" + maxPage);
		if (pageNum == null) {
			pageNum = 1;
		} else if (pageNum <= 0) {
			pageNum = 1;
		} else if (maxPage != null) {
			if (pageNum >= maxPage) {
				pageNum = maxPage;
			}
		}
		// PageHelper.startPage(第几页, 每页显示几条数据);
		// mysql：limit ,只能对紧邻（下）的一条sql语句起作 用
		PageHelper.startPage(pageNum, 6);
		return adminDao.getAllAdmins();
	}

}
