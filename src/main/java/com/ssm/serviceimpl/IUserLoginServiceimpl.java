package com.ssm.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ILoginDao;
import com.ssm.dto.UserInfo;
import com.ssm.service.IUserLoginService;
@Service
public class IUserLoginServiceimpl implements IUserLoginService{
	@Autowired
	ILoginDao dao;
	
	@Override
	public boolean Login(String userName, Integer userPwd) {
		// TODO Auto-generated method stub
		boolean isLogin= false;
		List<UserInfo> login = dao.Login(userName,userPwd);
		if (login.size() == 1) {
			isLogin = true;
		}
		return isLogin;
	}

}
