package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 实体渠道回调
 * @ClassName PhysicalStorePayCallBack
 * @Autor DZT
 * @Date 2019/6/5 15:52
 * @Version 1.0
 */
public class PhysicalStorePayCallBack extends PayCallBackInter {
    /**
     * 全局日志实例
     */
    private static final Logger log= LoggerFactory.getLogger(PhysicalStorePayCallBack.class);

    @Override
    public JSONObject payCallBack(JSONObject params) {
        log.info("商米支付回调参数:"+params.toJSONString());
        return params;
    }
}
