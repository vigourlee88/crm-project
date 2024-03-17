package com.bjpowernode.crm.settings.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.mapper.UserMapper;
import com.bjpowernode.crm.settings.service.UserService;

@Service("userSevice")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryUserByLoginActAndPwd(Map<String, Object> map) {

		return userMapper.selectUserByLoginActAndPwd(map);
	}

	@Override
	public List<User> queryAllUsers() {

		return userMapper.selectAllUsers();
	}

}
