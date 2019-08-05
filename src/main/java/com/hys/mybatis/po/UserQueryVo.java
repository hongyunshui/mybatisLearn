package com.hys.mybatis.po;

/**
 * 用户包装类型
 * @author hys
 *
 */
public class UserQueryVo  {
	
	// 包装用户所需要的查询条件
	
	// 用户查询条件
	private UserCustom userCustom;

	// 还可以包装订单、商品等查询条件
	
	
	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
}
