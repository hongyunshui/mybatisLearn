package com.hys.mybatis.dao.imp;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hys.mybatis.dao.UserDao;
import com.hys.mybatis.po.User;

/**
 * UserDao的接口实现类
 * @author hys
 *
 */
public class UserDaoImp implements UserDao {
	
	private SqlSessionFactory sqlSessionFactory;
	
	// 通过构造方法注入SqlSessionFactory
	public UserDaoImp(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}

	// 通过id进行select
	public User findUserById(int id) throws Exception {
		
		// 获得会话对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 通过SqlSession 操作数据库
		// 第一个参数:映射文件中statement的id，等于namespace+statement的id
		// 第二个参数:指定和映射文件中匹配的parameteType类型的参数
		//selSession.selectOne结果是与映射文件中所匹配的resultType类型的对象
		// selectOne查询出一条记录
		User user = sqlSession.selectOne("test.findUserById", id);
		// 释放资源
		sqlSession.close();
		return user;
	}

	/**
	 * 简单插入用户
	 */
	public void insertUser(User user) throws Exception {
		
		// 获得会话对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 执行插入的操作
		sqlSession.insert("test.insertUserSmall", user);
		// 提交事务
		sqlSession.commit();
		// 释放资源
		sqlSession.close();
		
	}

	/**
	 * 通过id删除用户
	 */
	public void delectUserById(int id) throws Exception {
		
		// 获得会话对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 执行删除的操作
		sqlSession.delete("test.deleteUser", id);
		// 提交事务
		sqlSession.commit();
		// 释放资源
		sqlSession.close();
		
	}
	
	/**
	 * 修改用户
	 * @param user
	 */
	public void updateUser(User user){
		
		// 获得会话对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 执行更新的操作
		sqlSession.update("test.updateUser", user);
		// 提交事务
		sqlSession.commit();
		// 释放资源
		sqlSession.close();
	}

}
