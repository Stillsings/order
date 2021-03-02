package com.example.order.service.impl;

import com.example.order.model.Order;
import com.example.order.repo.OrderRepository;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @Author: 17204114-李欢
 * @Date: 2021/03/02/13:35
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Override
    public Collection<Order> getOrdersByUserId(int userId) {
        return orderRepo.findOrderByUserId(userId);
    }

    @Override
    public double getPaidRateBySkuId(int skuId) {
        int paidOrder = orderRepo.getPaidOrderNum();
        int orderNum = (int)orderRepo.count();
        return 1.0 * paidOrder / (paidOrder + orderNum);
    }

    @Override
    public Collection<Integer> getTopSkuByTime(int start, int end) {
        return orderRepo.findOrderSkuTopByTime(start, end);
    }
}
