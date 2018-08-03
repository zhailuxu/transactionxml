package com.learn.java.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.learn.java.bo.TestTransactionProgagationUserBo;
import com.zlx.user.dal.dao.UserDO;
import com.zlx.user.dal.sqlmap.UserDOMapper;

@Configuration
public class TestTransactionProgagationUserBoImpl implements TestTransactionProgagationUserBo {

	@Autowired
	private UserDOMapper userDOMapper;
	
	@Override
	public UserDO select() {
		
		return userDOMapper.selectByPrimaryKey(14);
	}
	@Override  
	public boolean insertUser(UserDO user) {
		boolean result = userDOMapper.insert(user) == 1 ? true : false;
		//if(true ) throw new RuntimeException("error");
		return result ;
	}

}
