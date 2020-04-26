package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.RefundWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 商米退款
 * @ClassName ReturnByPhysicalStorePay
 * @Autor DZT
 * @Date 2019/6/5 17:43
 * @Version 1.0
 */
public class ReturnByPhysicalStorePay extends RefundWay {
    /**
     * 全局日志对象
     */
    private static final Logger log = LoggerFactory.getLogger(ReturnByWechatToCicc.class);

    @Override
    public JSONObject returnPay(String orderCode, String totalFee, String returnAmount, JSONObject returnChangeOrder, String orderFlag,String shopId,int childType,String payType) {
        return null;
    }
}
