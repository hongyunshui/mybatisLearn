package com.hys.mybatis.po;

import java.util.Date;

/**
 * 
 * @author hys
 *
 */
// 通过此类映射订单和用户查询的结果，继承字段较多的pojo类
public class OrderCustom extends Order {
	// 添加用户属性
	private String username; //用户名
	private String phone; // 电话
	private Date updated; // 更新时间
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
