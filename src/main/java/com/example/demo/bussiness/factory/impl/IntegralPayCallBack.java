package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 请输入类描述信息
 * @ClassName IntegralPayCallBack
 * @Autor DZT
 * @Date 2019/10/13 20:35
 * @Version 1.0
 */
public class IntegralPayCallBack extends PayCallBackInter {
    /**
     * 全局变量
     */
    private static final Logger log = LoggerFactory.getLogger(TimeCardPayCallBack.class);
    @Override
    public JSONObject payCallBack(JSONObject params) {
        log.info("积分抵现支付回调参数:"+params.toJSONString());
        return params;
    }
}
