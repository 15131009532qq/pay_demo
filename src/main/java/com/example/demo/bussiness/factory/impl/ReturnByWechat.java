package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.RefundWay;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhengbiao
 * @Date: 2018/11/13 10:58
 * @Description:
 */

@Component // 微信方式退款
public class ReturnByWechat extends RefundWay {

    @Override
    public JSONObject returnPay(String orderCode, String totalFee, String returnAmount, JSONObject returnChangeOrder, String orderFlag,String shopId,int childType,String payType) {
        return null;
    }
}
