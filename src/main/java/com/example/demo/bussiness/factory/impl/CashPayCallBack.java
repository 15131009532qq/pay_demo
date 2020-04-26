package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 现金支付回调
 * @ClassName: CashPayCallBack
 * @Author: dzt
 * @CreateDate: 2018/12/12 18:04
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/12 18:04
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class CashPayCallBack extends PayCallBackInter {
    private static final Logger log = LoggerFactory.getLogger(CardPayCallBack.class);

    @Override
    public JSONObject payCallBack(JSONObject params) {
        log.info("现金支付回调参数:"+params.toJSONString());
        return params;
    }
}
