package com.bookStore.domain;

import java.util.Date;

public class Orders {
	private int id;
	
	private int uid;
	
	private String orderId;
	
	private String orderPrice;
	
	private Date creTime;
	
	private String orderProdInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderProdInfo() {
		return orderProdInfo;
	}

	public void setOrderProdInfo(String orderProdInfo) {
		this.orderProdInfo = orderProdInfo;
	}

	public Date getCreTime() {
		return creTime;
	}

	public void setCreTime(Date creTime) {
		this.creTime = creTime;
	}

}
