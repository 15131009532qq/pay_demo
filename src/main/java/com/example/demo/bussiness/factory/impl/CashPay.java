package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 现金支付 参数：
 *                          订单编号号
 *                          订单类型
 * @ClassName: CashPay
 * @Author: dzt
 * @CreateDate: 2018/12/10 12:32
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 12:32
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class CashPay extends PayWay {
    private static final Logger log = LoggerFactory.getLogger(CardPay.class);
    /**
     * 现金支付走线下
     * @param params
     * @return
     */
    @Override
    public JSONObject pay(JSONObject params) {
        log.info("现金支付请求参数信息:"+params.toJSONString());
        return null;
    }
}
