package com.hys.mybatis.mapper;

import java.util.List;

import com.hys.mybatis.po.User;
import com.hys.mybatis.po.UserQueryVo;

/**
 * 描述：mapper接口，用户管理
 * @author hys
 *
 */
public interface UserMapper {
	
	// 查询用户的总数量
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;
	
	// 根据id查询用户
	public User findUserById(int id);
	
	// 根据包装类综合查询查询用户信息
	public List<User> findUserListByPU(UserQueryVo userQueryVo) throws Exception;

	 // 根据名字查询用户信息
	 public User findUserByName(String name);
	 public List<User> findUsersByName(String name);
	 
	// 添加用户信息
	public void insertUser(User user);
	public void insertUserAll(User user);
	public void insertUserSmall(User user);
	public void insertUserSmall_wt(User user);
	public void insertUserSmall_uuid(User user);
	
	// 删除用户信息
	public void deleteUser(Integer id);
	
	// 修改用户信息
	public void updateUser(User user);
	
	// 根据resultMap映射输出属性
	public User findUserByIdResultMap(int id) throws Exception;
	
	// 动态SQL查询
	public List<User> findUserListByAt(UserQueryVo userQueryVo) throws Exception;
		
	
}
