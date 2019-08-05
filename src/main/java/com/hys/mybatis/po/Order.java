package com.hys.mybatis.po;

import java.util.List;

public class Order {
	
	private int id;
	private int payment;
	private int payment_type;
	private int post_fee;
	private int status;
	private int user_id;
	// 用户信息
	private User user;
	// 订单明细
	private List<Orderdetail> orderDetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(int payment_type) {
		this.payment_type = payment_type;
	}
	public int getPost_fee() {
		return post_fee;
	}
	public void setPost_fee(int post_fee) {
		this.post_fee = post_fee;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Orderdetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<Orderdetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
}
