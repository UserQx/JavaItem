package com.accp.JavaItem.action.tl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.JavaItem.biz.tl.RepairbillBiz;
import com.accp.JavaItem.pojo.tl.Repairbill;

@RestController
@RequestMapping("/api")
public class RepairbillAction {

	@Autowired
	private RepairbillBiz biz;
	
	@GetMapping("/Repairbills")
	public List<Repairbill> allshow()
	{
		return biz.allBillShow();
	}
	
}
