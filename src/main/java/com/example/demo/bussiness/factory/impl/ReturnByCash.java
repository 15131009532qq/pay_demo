package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.RefundWay;

/**
 * @Description: 现金退款【目前走线下】
 * @ClassName: ReturnByCash
 * @Author: dzt
 * @CreateDate: 2018/11/23 15:15
 * @UpdateUser: dzt
 * @UpdateDate: 2018/11/23 15:15
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class ReturnByCash extends RefundWay {
    @Override
    public JSONObject returnPay(String orderCode, String totalFee, String returnAmount, JSONObject returnChangeOrder, String orderFlag,String shopId,int childType,String payType) {
        return null;
    }
}
