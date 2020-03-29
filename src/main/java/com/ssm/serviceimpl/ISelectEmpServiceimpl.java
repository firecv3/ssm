package com.ssm.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ISelectEmpDao;
import com.ssm.dto.Emp;
import com.ssm.service.ISelectEmpService;
@Service
public class ISelectEmpServiceimpl implements ISelectEmpService{
	@Autowired
	ISelectEmpDao dao;
	@Override
	public List<Emp> SelectEmp() {
		// TODO Auto-generated method stub
		return dao.SelectEmp();
	}

}
