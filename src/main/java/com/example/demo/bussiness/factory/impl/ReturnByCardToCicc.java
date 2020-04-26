package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.RefundWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Description: 中金银行卡退款
 * @ClassName: ReturnByCardToCicc
 * @Author: dzt
 * @CreateDate: 2019/1/14 11:15
 * @UpdateUser: dzt
 * @UpdateDate: 2019/1/14 11:15
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class ReturnByCardToCicc extends RefundWay {
    private static final Logger log = LoggerFactory.getLogger(ReturnByCardToCicc.class);

    @Override
    public JSONObject returnPay(String orderCode, String totalFee, String returnAmount, JSONObject returnChangeOrder, String orderFlag,String shopId,int childType,String payType) {
        return null;
    }
}
