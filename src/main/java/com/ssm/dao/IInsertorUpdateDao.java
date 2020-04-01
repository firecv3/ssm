package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

public interface IInsertorUpdateDao {
	//public List<UserInfo> Login(@Param("userName") String userName ,@Param("userPwd")  Integer userPwd);
	
	//String:ename,job,hiredate
	//Integer:empno,mgr,sal,comm,deptno
	public void InsertDao(@Param("empno")  Integer empno,@Param("ename") String ename,@Param("job") String job,@Param("mgr")  Integer mgr,@Param("hiredate") String hiredate,
			@Param("sal")  Integer sal,@Param("comm")  Integer comm,@Param("deptno")  Integer deptno);
	public void UpdateDao(@Param("empid")  Integer empid,@Param("empno")  Integer empno,@Param("ename") String ename,@Param("job") String job,@Param("mgr")  Integer mgr,@Param("hiredate") String hiredate,
			@Param("sal")  Integer sal,@Param("comm")  Integer comm,@Param("deptno")  Integer deptno);
}
