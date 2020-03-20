package com.andy.sample.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andy.sample.common.ResponseData;
import com.andy.sample.service.OrderService;

@RestController
@RequestMapping("/sample")
public class SampleController {
    
    @Autowired
    private OrderService orderService;

    @PostMapping("/test")
    public ResponseData<?> test(@RequestParam("orderId") String orderId, @RequestParam("amount") BigDecimal amount) {
        orderService.saveOrder(orderId, amount);
        return new ResponseData<>();
    }

}
