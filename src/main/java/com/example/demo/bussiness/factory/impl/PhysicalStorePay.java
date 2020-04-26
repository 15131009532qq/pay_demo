package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 实体店支付渠道
 *              实际支付渠道是通过android的SDK进行收银台的唤起
 * @ClassName PhysicalStorePay
 * @Autor DZT
 * @Date 2019/6/5 15:35
 * @Version 1.0
 */
public class PhysicalStorePay extends PayWay {
    private static final Logger log = LoggerFactory.getLogger(PhysicalStorePay.class);

    @Override
    public JSONObject pay(JSONObject params) {
        return null;
    }
}
