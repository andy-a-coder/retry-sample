package com.andy.sample.service;

import java.math.BigDecimal;

public interface OrderService {

    public void saveOrder(String orderId, BigDecimal amount);

}
