package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Description: 会员余额支付 参数：
 * @ClassName: MemberPay
 * @Author: dzt
 * @CreateDate: 2018/12/10 12:32
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 12:32
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class MemberPay extends PayWay {
    private static final Logger log = LoggerFactory.getLogger(MemberPay.class);


    @Override
    public JSONObject pay(JSONObject params) {
        log.info("POS端会员余额支付请求参数信息:"+params.toJSONString());
        return null;
    }
}
