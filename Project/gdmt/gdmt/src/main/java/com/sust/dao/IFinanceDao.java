package com.sust.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.sust.entity.Finance;

public interface IFinanceDao {
	@Insert("insert into finance (f_account,c_name,f_pwd) values(#{f_account},#{c_name},'11111111')")
	public int createFinance(@Param("f_account") String f_account,@Param("c_name") String c_name) throws Exception ;
}
