package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.UserInfo;

public interface ILoginDao {
	
	public List<UserInfo> Login(@Param("userName") String userName ,@Param("userPwd")  String userPwd);
}
