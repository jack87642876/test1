package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * ��ȡ��������
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	/**
	 * ���涩����Ϣ
	 * @param order
	 */
	void addOrder(Order order);
}
