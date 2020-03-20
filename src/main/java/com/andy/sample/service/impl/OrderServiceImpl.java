package com.andy.sample.service.impl;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.andy.sample.dto.OrderCallbackModel;
import com.andy.sample.retry.OrderCallbackExecutor;
import com.andy.sample.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    
    @Resource
    private OrderCallbackExecutor orderCallbackExecutor;

    @Override
    public void saveOrder(String orderId, BigDecimal amount) {
        // ...
        
        // call another system
        OrderCallbackModel orderCallbackModel = new OrderCallbackModel();
        orderCallbackModel.setOrderId(orderId);
        orderCallbackModel.setAmount(amount);
        orderCallbackModel.setCallbackUrl("http://www.baidu.com");
        orderCallbackExecutor.execute(orderCallbackModel);
    }
}
