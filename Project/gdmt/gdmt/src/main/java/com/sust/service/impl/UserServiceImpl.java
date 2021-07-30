package com.sust.service.impl;


import com.sust.service.IUserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.sust.dao.IUserDao;
import com.sust.entity.User;
import com.sust.utils.MD5;


@Service // 标记当前类为一个和业务类(sprin组件，默认是单例模式)---<bean
			// id=com.isscolleg.service.impl.UserServiceImpl></bean>
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao; // 依赖注入

	@Override
	public int regist(User user) throws Exception {
		String newPass = new MD5().getMD5ofStr(user.getUser_pwd());
		user.setUser_pwd(newPass);
		return userDao.regist(user);
	}

	@Override
	public int removeUserByUserid(Integer userid) throws Exception {

		return userDao.removeUserByUserid(userid);
	}

	@Override
	public int modifyUserByUserid(User user) throws Exception {
		String newPass = new MD5().getMD5ofStr(user.getUser_pwd());
		user.setUser_pwd(newPass);
		return userDao.modifyUserByUserid(user);
	}

	@Override
	public User login(String user_account, String user_pwd) throws Exception {

		String newPass = new MD5().getMD5ofStr(user_pwd);

		return userDao.login(user_account, newPass);
	}
	


	@Override
	public int modifyUserState(User user) throws Exception {
		return 0;
//		if ("true".equals(user.getState())) {
//			user.setState("false");
//		} else {
//			user.setState("true");
//		}
//		return userDao.modifyUserState(user);
	}

	public User loginByEmail(String user_account, String user_email) throws Exception {
		// TODO 自动生成的方法存根
		return userDao.loginByEmail(user_account, user_email);
	}
	
	// 上传营业执照
	@Override
	public int uploadImageLicense(String url,User user) throws Exception {
		System.out.println(url);
		user.setUser_license(url);
		System.out.println("impl存入数据库: "+user.toString());
		return userDao.uploadLicense(url, user.getUser_id());
	}
	// 上传税务登记证
	@Override
	public int uploadImageTax(String url,User user) throws Exception {
		user.setUser_tax(url);
		System.out.println("impl存入数据库: "+user.toString());
		return userDao.uploadTax(url, user.getUser_id());
	}
	// 上传组织机构代码证
	@Override
	public int uploadImageOrgnum(String url,User user) throws Exception {
		user.setUser_orgnum(url);
		System.out.println("impl存入数据库: "+user.toString());
		return userDao.uploadOrgnum(url, user.getUser_id());
	}
	// 上传开户许可证
	@Override
	public int uploadImagePermit(String url,User user) throws Exception {
		user.setUser_permit(url);
		System.out.println("impl存入数据库: "+user.toString());
		return userDao.uploadPermit(url, user.getUser_id());
	}
	// 上传煤炭经营许可证
	@Override
	public int uploadImageBank(String url,User user) throws Exception {
		user.setUser_bankaccount(url);
		System.out.println("impl存入数据库: "+user.toString());
		return userDao.uploadBank(url, user.getUser_id());
	}
	// 上传法人身份证
	@Override
	public int uploadImageCorporative(String url,User user) throws Exception {
		user.setUser_corporative(url);
		System.out.println("impl存入数据库: "+user.toString());
		return userDao.uploadCorporative(url, user.getUser_id());
	}
	
//罗
	@Override
	public List<User> getAllUsers(Integer pageNum, Integer maxPage) throws Exception {

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
		
		PageHelper.startPage(pageNum, 6);
		return userDao.getAllUsers();
	}
	@Override
	public User checkInfo(Integer user_id) throws Exception {
		
		return userDao.checkInfo(user_id);
	}
	@Override
	public int userPass(Integer user_id) throws Exception {
		
		return userDao.userPass(user_id);
	}
	@Override
	public int userFailToPass(Integer user_id) throws Exception {
		
		return userDao.userFailToPass(user_id);
	}
	
	public int updateUserView(Integer user_id, String user_view) throws Exception {
		return userDao.updateUserView(user_id, user_view);
	}

	public User loginByaccount(String user_account) throws Exception {
		// TODO 自动生成的方法存根
		return userDao.loginByaccount(user_account);
	}
	

}