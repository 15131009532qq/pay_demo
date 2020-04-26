package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 银行卡支付  参数：

 * @ClassName: CardPay
 * @Author: dzt
 * @CreateDate: 2018/12/10 12:31
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 12:31
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class CardPay extends PayWay {

    private static final Logger log = LoggerFactory.getLogger(CardPay.class);

    /**
     * @param params
     * @return
     */
    @Override
    public JSONObject pay(JSONObject params) {
        log.info("银行卡支付暂时走线下-等待对接中金");
        return null;
    }
}
