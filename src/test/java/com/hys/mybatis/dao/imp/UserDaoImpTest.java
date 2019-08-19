package com.hys.mybatis.dao.imp;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.hys.mybatis.po.User;

public class UserDaoImpTest {
	
	private SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 此方法是在执行testFindUserById方法之前执行
	 * @throws IOException
	 */
	@Before
	public void setup() throws IOException{
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		System.out.println(inputStream);
		// 创建会话工厂，传入mybatis的配置文件信息
		this.sqlSessionFactory = 
			new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	/**
	 * 测试UserDaoImp中的findUserById
	 */
	@Test
	public void testFindUserById() {
		int id = 10;
		// 获取会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 执行查询
		User user = sqlSession.selectOne("test.findUserById",id);
		// 输出查询结果
		if(user != null){
			System.out.println(user.getCreated());
			System.out.println(user.getId());
			System.out.println(user.getUsername());
		}
		// 释放资源
		sqlSession.close();
	}
}
