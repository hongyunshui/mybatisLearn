package com.hys.mybatis.first;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hys.mybatis.po.User;


public class MybatisFirst {
	// 根据id查询用户的信息，得到一条记录结果
	@Test
	public void findUserByIdTest() throws IOException{
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		System.out.println(inputStream);
		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到SqlSession
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		// 通过SqlSession 操作数据库
		// 第一个参数:映射文件中statement的id，等于namespace+statement的id
		// 第二个参数:指定和映射文件中匹配的parameteType类型的参数
		//selSession.selectOne结果是与映射文件中所匹配的resultType类型的对象
		// selectOne查询出一条记录
		User user = sqlSession.selectOne("test.findUserById", 10);
		if(user != null){
			System.out.println(user.getCreated());
			System.out.println(user.getId());
			System.out.println(user.getUsername());
			System.out.println(user.getPhone());
			System.out.println(user.getPassword());
			System.out.println(user.getUpdated());
		}
		// 释放资源
		sqlSession.close();
	}
	
	
	/**
	 * 根据用户名称模糊查询用户信息可能返回多条数据
	 * @throws IOException
	 */
	@Test
	public void findUserByNameTest() throws IOException{
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		System.out.println(inputStream);
		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到SqlSession
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		// 通过SqlSession 操作数据库
		// 第一个参数:映射文件中statement的id，等于namespace+statement的id
		// 第二个参数:指定和映射文件中匹配的parameteType类型的参数
		// userlist中的user和映射文件中resultType所指定的类型一致
		List<User> userlist = sqlSession.selectList("test.findUserByName", "小");
		System.out.println(userlist);
		/*User user = sqlSession.selectOne("test.findUserById", 10);
		System.out.println(user);*/
		System.out.println(new Date());
		// 释放资源
		sqlSession.close();
	}
	
	/**
	 * 插入用户
	 * @throws IOException
	 */
	@Test
	public void insertUser() throws IOException{
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		System.out.println(inputStream);
		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到SqlSession
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		// 通过SqlSession 操作数据库
		// 第一个参数:映射文件中statement的id，等于namespace+statement的id
		// 第二个参数:指定和映射文件中匹配的parameteType类型的参数
		// userlist中的user和映射文件中resultType所指定的类型一致
		User user = new User("小11","123456",new Date(),new Date());
		sqlSession.insert("test.insertUserSmall_wt", user );
		sqlSession.commit(true);
		// 释放资源
		sqlSession.close();
	}
	
	/**
	 * 删除用户
	 * @throws IOException
	 */
	@Test
	public void deleteUser() throws IOException{
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		System.out.println(inputStream);
		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到SqlSession
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		// 通过SqlSession 操作数据库
		// 第一个参数:映射文件中statement的id，等于namespace+statement的id
		// 第二个参数:指定和映射文件中匹配的parameteType类型的参数
		sqlSession.delete("test.deleteUser", 66833);
		sqlSession.commit(true);
		// 释放资源
		sqlSession.close();
	}
	
	/**
	 * 修改用户
	 * @throws IOException
	 */
	@Test
	public void updataUser() throws IOException{
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		System.out.println(inputStream);
		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到SqlSession
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		// 通过SqlSession 操作数据库
		// 第一个参数:映射文件中statement的id，等于namespace+statement的id
		// 第二个参数:指定和映射文件中匹配的parameteType类型的参数
		sqlSession.update("test.updateUser", new User(66837,"hys1","lslls",
				new Date(),new Date()));
		sqlSession.commit(true);
		// 释放资源
		sqlSession.close();
	}
}
