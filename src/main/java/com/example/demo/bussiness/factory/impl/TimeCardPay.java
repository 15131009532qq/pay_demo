package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 计次卡支付
 * @ClassName: TimeCardPay
 * @Author: dzt
 * @CreateDate: 2018/12/10 12:33
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 12:33
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class TimeCardPay extends PayWay {
    private static final Logger log = LoggerFactory.getLogger(TimeCardPay.class);

    @Override
    public JSONObject pay(JSONObject params) {
        log.info("POS端计次卡支付请求参数信息:"+params.toJSONString());
            return null;
    }
}
