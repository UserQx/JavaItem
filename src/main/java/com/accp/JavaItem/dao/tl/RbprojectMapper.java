package com.accp.JavaItem.dao.tl;

import com.accp.JavaItem.pojo.tl.Rbproject;

public interface RbprojectMapper {
	
    int deleteByPrimaryKey(Integer rbprojectid);

    int insertSelective(Rbproject record);

    Rbproject selectByPrimaryKey(Integer rbprojectid);

    int updateByPrimaryKeySelective(Rbproject record);

}