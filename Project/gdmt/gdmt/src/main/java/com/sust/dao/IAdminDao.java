package com.sust.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sust.entity.Admin;

public interface IAdminDao {
	@Insert("insert into admin (admin_username,admin_password,admin_limit,admin_name,admin_depart,admin_tel) values(#{admin_username},#{admin_password},#{admin_limit},#{admin_name},#{admin_depart},#{admin_tel})")
	public int regist(Admin admin) throws Exception ;

	@Delete("delete from admin where admin_id=#{admin_id}")
	public int removeAdminByAdminid(Integer admin_id) throws Exception ;

	@Update("update admin set admin_password=#{admin_password} where admin_id=#{admin_id}")
	public int modifyAdminByAdminid(Admin admin) throws Exception ;

	@Select("select * from admin where admin_username=#{admin_username} and admin_password=#{admin_password}")
	public Admin login(@Param("admin_username") String username, @Param("admin_password") String password) throws Exception ;

	@Select("select * from admin")
	public List<Admin> getAllAdmins() throws Exception ;
}
