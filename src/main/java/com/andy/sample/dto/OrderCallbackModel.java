package com.andy.sample.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderCallbackModel {
    private String orderId;
    private BigDecimal amount;
    private String callbackUrl;
}
