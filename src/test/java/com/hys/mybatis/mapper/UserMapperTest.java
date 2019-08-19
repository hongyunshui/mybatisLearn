package com.hys.mybatis.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hys.mybatis.po.User;

public class UserMapperTest {

	@Test
	public void testFindUserById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUsersByName() throws IOException {
		// mybatis配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		System.out.println(inputStream);
		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 通过sqlSession 操作数据库
		List<User> userlist = sqlSession.selectList("test.findUserByName","zhang");
		System.out.println(userlist);
		User user = sqlSession.selectOne("test.findUserById", 10);
		System.out.println(user);
		// 释放资源
		sqlSession.close();
	}

}
