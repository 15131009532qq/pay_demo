package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 积分抵现
 * @ClassName IntegralPay
 * @Autor DZT
 * @Date 2019/10/11 11:15
 * @Version 1.0
 */
public class IntegralPay extends PayWay {
    /**
     * 全局日志
     */
    private static final Logger log = LoggerFactory.getLogger(IntegralPay.class);

    /**
     * 计算积分抵现金额
     * @param params
     * @return
     */
    @Override
    public JSONObject pay(JSONObject params) {
        log.info("进行积分抵现支付...");
        //积分扣减这一步需要锁住积分资源
        return null;
    }
}
