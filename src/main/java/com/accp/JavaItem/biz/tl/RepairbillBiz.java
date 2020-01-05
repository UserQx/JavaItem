package com.accp.JavaItem.biz.tl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.JavaItem.dao.tl.RbprojectMapper;
import com.accp.JavaItem.dao.tl.RepairbillMapper;
import com.accp.JavaItem.pojo.tl.Repairbill;

@Service
public class RepairbillBiz {

	@Autowired
	private RepairbillMapper billdao;
	
	@Autowired
	private RbprojectMapper billdaos;
	
	public List<Repairbill> allBillShow()
	{
		return billdao.allBillShow();
	}
	
}
