package com.example.order.service;

import com.example.order.model.Order;

import java.util.Collection;

/**
 * @Author: 17204114-李欢
 * @Date: 2021/03/02/13:29
 * @Description:
 */
public interface OrderService {
    Collection<Order> getOrdersByUserId(int userId);
    double getPaidRateBySkuId(int skuId);
    Collection<Integer> getTopSkuByTime(int start, int end);
}
