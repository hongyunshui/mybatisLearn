package com.hys.mybatis.mapper;
import java.util.List;

import com.hys.mybatis.po.Order;
import com.hys.mybatis.po.OrderCustom;
import com.hys.mybatis.po.User;


/**
 * 订单的mapper
 * @author hys
 *
 */
public interface OrderMapperCustom {

	// 查询订单关联查询用户信息
	public List<OrderCustom>  findOrderUser() throws Exception;
	
	// 查询订单关联查询用户使用resultMap
	public List<Order> findOrderUserMap() throws Exception;
	
	// 查询订单关联用户及订单明细 resultMap findOrderUserItemMap
	public List<Order> findOrderUserItemMap() throws Exception;
	
	// 查询用户商品信息
	public List<User> findUserItemMap() throws Exception;
	
	//查询订单关联查询用户，用户信息延迟加载
	public List<Order> findOrderUserLazyLoading() throws Exception;
}
