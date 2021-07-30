package com.sust.service;

import java.util.List;

import com.sust.entity.Admin;

public interface IAdminService {
	public int regist(Admin admin) throws Exception ;

	public int removeAdminByAdminid(Integer admin_id) throws Exception ;

	public int modifyAdminByAdminid(Admin admin) throws Exception ;

	public Admin login(String username, String password) throws Exception ;

	public List<Admin> getAllAdmins(Integer pageNum, Integer maxPage) throws Exception ;
	
}
