package com.sust.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sust.entity.User;

@Mapper // 标记当前类为一个功能映射类（组件）
public interface IUserDao {
	@Insert("insert into user (user_account,c_name,user_csimple,user_corporative,address,area,regist_fund,user_contact,user_tel,user_pwd,fax,user_email) values(#{user_account},#{c_name},#{user_csimple},#{user_corporative},#{address},#{area},#{regist_fund},#{user_contact},#{user_tel},#{user_pwd},#{fax},#{user_email})")
	public int regist(User user) throws Exception;

	@Delete("delete from users where userid=#{userid}")
	public int removeUserByUserid(Integer userid) throws Exception;

	@Update("update user set user_pwd=#{user_pwd} where user_id=#{user_id}")
	public int modifyUserByUserid(User user) throws Exception;

	@Select("select * from user where user_account=#{user_account} and user_pwd=#{user_pwd}")
	public User login(@Param("user_account") String user_account, @Param("user_pwd") String user_pwd) throws Exception;



	@Update("update user set state=#{state} where userid=#{userid}")
	public int modifyUserState(User user) throws Exception;

	@Select("select * from user where user_account=#{user_account} and user_email=#{user_email}")
	public User loginByEmail(@Param("user_account") String user_account, @Param("user_email") String user_email) throws Exception;
	
	@Update("update user set user_license=#{user_license} where user_id=#{user_id}")
	public int uploadLicense(@Param("user_license") String user_license,@Param("user_id") Integer user_id) throws Exception;
	
	@Update("update user set user_tax=#{user_tax} where user_id=#{user_id}")
	public int uploadTax(@Param("user_tax") String user_tax,@Param("user_id") Integer user_id) throws Exception;
	
	@Update("update user set user_orgnum=#{user_orgnum} where user_id=#{user_id}")
	public int uploadOrgnum(@Param("user_orgnum") String user_orgnum,@Param("user_id") Integer user_id) throws Exception;
	
	@Update("update user set user_bankaccount=#{user_bankaccount} where user_id=#{user_id}")
	public int uploadBank(@Param("user_bankaccount") String user_bankaccount,@Param("user_id") Integer user_id) throws Exception;
	
	@Update("update user set user_permit=#{user_permit} where user_id=#{user_id}")
	public int uploadPermit(@Param("user_permit") String user_permit,@Param("user_id") Integer user_id) throws Exception;
	
	@Update("update user set user_corporative=#{user_corporative} where user_id=#{user_id}")
	public int uploadCorporative(@Param("user_corporative") String user_corporative,@Param("user_id") Integer user_id) throws Exception;
	
	//罗
	@Select("select * from user where user_state='未审核' or user_state='未通过'")
	public List<User> getAllUsers() throws Exception ;
	
	@Select("select * from user where user_id=#{user_id}")
	public User checkInfo(@Param("user_id") Integer user_id) throws Exception ;
	
	@Update("update user set user_state='已审核' where user_id=#{user_id}")
	public int userPass(@Param("user_id") Integer user_id) throws Exception ;
	
	@Update("update user set user_state='未通过' where user_id=#{user_id}")
	public int userFailToPass(@Param("user_id") Integer user_id) throws Exception ;
	
	@Update("update user set user_view=#{user_view} where user_id=#{user_id}")
	public int updateUserView(@Param("user_id") Integer user_id,@Param("user_view") String user_view) throws Exception ;



	@Select("select * from user where user_account=#{user_account} ")
	public User loginByaccount(@Param("user_account") String user_account) throws Exception;
	
}
