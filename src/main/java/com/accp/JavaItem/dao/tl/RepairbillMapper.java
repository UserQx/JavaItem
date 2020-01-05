package com.accp.JavaItem.dao.tl;

import java.util.List;

import com.accp.JavaItem.pojo.tl.Repairbill;

public interface RepairbillMapper {
	
    int deleteByPrimaryKey(Integer repairbillid);

    int insertSelective(Repairbill record);

    Repairbill selectByPrimaryKey(Integer repairbillid);
    
    //显示所有维修订单
    List<Repairbill> allBillShow();

    int updateByPrimaryKeySelective(Repairbill record);


}