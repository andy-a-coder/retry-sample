package com.andy.sample.retry;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.andy.retry.annotation.Retry;
import com.andy.retry.executor.RetryExecutor;
import com.andy.sample.dto.OrderCallbackModel;
import com.andy.sample.error.BizException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class OrderCallbackExecutor implements RetryExecutor<OrderCallbackModel>{

    @Override
    @Retry(retryStrategy = {"3s","5s","10s","1m"})
    public <R> R execute(OrderCallbackModel bizModel) {
        
        log.info("####### start callback");
        
        if(true)
            throw new BizException("####### call back fail");// mock fail case
        
//        RestTemplate restTemplate = new RestTemplate();
//        Map<String, Object> paramMap = new HashMap<>();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        
//        paramMap.put("code", "2000");
//        paramMap.put("status", "success");
//        paramMap.put("message", "save order success");
//        paramMap.put("orderId", bizModel.getOrderId());
//        paramMap.put("amount", bizModel.getAmount());
//        restTemplate.postForEntity(bizModel.getCallbackUrl(), new HttpEntity<>(paramMap, headers), String.class);
        
        log.info("####### callback success");
        return null;
    }

    @Override
    public void onFinallFailCallBack(OrderCallbackModel bizModel) {
        log.info("####### callback finally error, bizModel={}", bizModel);
    }
    
}
