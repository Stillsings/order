package com.example.order.repo;

import com.example.order.model.Order;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @Author: 17204114-李欢
 * @Date: 2021/03/02/11:43
 * @Description:
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    @Query("select * from orders where user_id = :userId")
    Collection<Order> findOrderByUserId(@Param("userId") int userId);
    @Query("select count(*) from orders where status = 1")
    int getPaidOrderNum();
    @Query("select sku_id from orders where order_time >= :start and order_time <= :end group by sku_id order by count(order_id) desc limit 0, 10")
    Collection<Integer> findOrderSkuTopByTime(@Param("start") int start, @Param("end") int end);
}
