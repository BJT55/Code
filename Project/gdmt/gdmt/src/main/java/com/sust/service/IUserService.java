package com.sust.service;

import java.util.List;

import com.sust.entity.User;

public interface IUserService {

	public int regist(User user) throws Exception;

	public int removeUserByUserid(Integer userid) throws Exception;

	public int modifyUserByUserid(User user) throws Exception;

	public User login(String user_account, String user_pwd) throws Exception;
	
	public User loginByEmail(String user_account, String user_email) throws Exception;



	
	public int modifyUserState(User user) throws Exception;
	
	public int uploadImageLicense(String url,User user) throws Exception;
	public int uploadImageTax(String url,User user) throws Exception;
	public int uploadImageOrgnum(String url,User user) throws Exception;
	public int uploadImageBank(String url,User user) throws Exception;
	public int uploadImagePermit(String url,User user) throws Exception;
	public int uploadImageCorporative(String url,User user) throws Exception;
	
	//罗
	public List<User> getAllUsers(Integer pageNum, Integer maxPage) throws Exception ;
	
	public User checkInfo(Integer user_id) throws Exception ;

	public int userPass(Integer user_id) throws Exception;
	
	public int userFailToPass(Integer user_id) throws Exception ;
	
	public int updateUserView(Integer user_id, String user_view) throws Exception ;
	
	public User loginByaccount(String user_account) throws Exception ;
	
}
