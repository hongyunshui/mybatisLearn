package com.hys.mybatis.po;

import java.util.Date;
import java.util.List;

/**
 * <p>Description:pojo</p>
 * @author hys
 *
 */
public class User {

	// 属性名和数据库表的字段对应
	private int id ;
	private String username; //用户名
	private String password; //密码
	private String phone; // 电话
	private String email; //邮箱
	private Date created; // 注册日期
	private Date updated; // 更新时间
	// 用户订单
	private List<Order> order;
	
	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public User(int id, String username, String password, Date created,
			Date updated) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.created = created;
		this.updated = updated;
	}

	public User(String username, String password, String phone,
			String email, Date created, Date updated) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.created = created;
		this.updated = updated;
	}
	
	public User(String username, String password, Date created, Date updated) {
		super();
		this.username = username;
		this.password = password;
		this.created = created;
		this.updated = updated;
	}

	public User(int id, String username, String password, String phone,
			String email, Date created, Date updated) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.created = created;
		this.updated = updated;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	
}
