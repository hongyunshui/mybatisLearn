package com.hys.mybatis.dao;

import com.hys.mybatis.po.User;

/**
 * 描述：dao接口，用户管理
 * @author hys
 *
 */
public interface UserDao {
	// 根据id查询用户
	public User findUserById(int id) throws Exception;
	
	// 添加用户信息
	public void insertUser(User user) throws Exception;
	
	// 删除用户信息
	public void delectUserById(int id) throws Exception;
	
	

}
