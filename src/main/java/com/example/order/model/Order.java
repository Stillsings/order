package com.example.order.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @Author: 17204114-李欢
 * @Date: 2021/03/02/10:38
 * @Description:
 */
@Table("orders")
public class Order {
    @Id
    private int orderId;
    private int orderTime;
    private int skuId;
    private int userId;
    private int status;
    private double price;
    private double pay;

    public Order() {
    }

    public Order(int orderId, int orderTime, int skuId, int userId, int status, double price, double pay) {
        this.orderId = orderId;
        this.orderTime = orderTime;
        this.skuId = skuId;
        this.userId = userId;
        this.status = status;
        this.price = price;
        this.pay = pay;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(int orderTime) {
        this.orderTime = orderTime;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderTime=" + orderTime +
                ", skuId=" + skuId +
                ", userId=" + userId +
                ", status=" + status +
                ", price=" + price +
                ", pay=" + pay +
                '}';
    }
}
