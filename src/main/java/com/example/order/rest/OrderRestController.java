package com.example.order.rest;

import com.example.order.model.Order;
import com.example.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author: 17204114-李欢
 * @Date: 2021/03/02/14:23
 * @Description:
 */
@RestController
@RequestMapping("/api/v1/orders")
@Api(value = "OrderRestController", tags = "订单接口")
public class OrderRestController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/user/{userId}")
    @ApiOperation(value = "getOrdersByUserId", tags = "通过用户id获取用户订单历史")
    public ResponseEntity<Collection<Order>> getOrdersByUserId(@ApiParam(value = "用户Id")@PathVariable Integer userId){
        Collection<Order> orders = orderService.getOrdersByUserId(userId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/paidOrderRate/{skuId}")
    @ApiOperation(value = "getPaidRateBySkuId", tags = "通过skuId查询订单付款率")
    public ResponseEntity<Double> getPaidRateBySkuId(@ApiParam(value = "商品Id")@PathVariable Integer skuId){
        double rate = orderService.getPaidRateBySkuId(skuId);
        return new ResponseEntity<>(rate, HttpStatus.OK);
    }

    @GetMapping("/skuTop10/start/{start}/end/{end}")
    @ApiOperation(value = "getTopSkuByTime", tags = "通过时间段获得成交量最高的sku top10")
    public ResponseEntity<Collection<Integer>> getTopSkuByTime(@ApiParam(value = "开始时间")@PathVariable Integer start, @ApiParam(value = "结束时间")@PathVariable Integer end){
        Collection<Integer> result = orderService.getTopSkuByTime(start, end);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
