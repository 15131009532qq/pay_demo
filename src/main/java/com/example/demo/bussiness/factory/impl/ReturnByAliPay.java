package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.RefundWay;

import java.math.BigDecimal;
import java.util.Iterator;

/**
 * @Description: 支付宝退款
 * @ClassName: ReturnByAliPay
 * @Author: dzt
 * @CreateDate: 2018/11/19 18:16
 * @UpdateUser: dzt
 * @UpdateDate: 2018/11/19 18:16
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
//支付宝方式退款
public class ReturnByAliPay extends RefundWay {

    @Override
    public JSONObject returnPay(String orderCode, String totalFee, String returnAmount, JSONObject returnChangeOrder, String orderFlag,String shopId,int childType,String payType) {
        return null;
    }
}
