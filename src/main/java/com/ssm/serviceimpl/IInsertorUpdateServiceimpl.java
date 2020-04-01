package com.ssm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.IInsertorUpdateDao;
import com.ssm.dto.Emp;
import com.ssm.service.IInsertorUpdateService;
@Service
public class IInsertorUpdateServiceimpl implements IInsertorUpdateService{
	@Autowired
	IInsertorUpdateDao dao;
	@Override
	public void InsertorUpdate(Emp e) {
		if (e.getEmpid() == 0) {
			dao.InsertDao(e.getEmpno(), e.getEname(), e.getJob(), e.getMgr(), e.getHiredate(), e.getSal(), e.getComm(), e.getDeptno());
		}else {
			dao.UpdateDao(e.getEmpid(),e.getEmpno(), e.getEname(), e.getJob(), e.getMgr(), e.getHiredate(), e.getSal(), e.getComm(), e.getDeptno());
		}
	}

}
