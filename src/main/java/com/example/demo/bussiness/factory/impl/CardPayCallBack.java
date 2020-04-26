package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;

/**
 * @Description: 银行卡支付回调
 * @ClassName: CardPayCallBack
 * @Author: dzt
 * @CreateDate: 2018/12/12 18:04
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/12 18:04
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class CardPayCallBack extends PayCallBackInter {
    /**
     * 回调用于验签操作和校验信息的准确性
     * @param params
     * @return
     */
    @Override
    public JSONObject payCallBack(JSONObject params) {
        return null;
    }

}
