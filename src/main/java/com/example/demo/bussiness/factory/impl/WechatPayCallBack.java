package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 微信支付回调
 * @ClassName: WechatPayCallBack
 * @Author: dzt
 * @CreateDate: 2018/12/13 11:37
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/13 11:37
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class WechatPayCallBack extends PayCallBackInter {

    private static final Logger log = LoggerFactory.getLogger(WechatPayCallBack.class);
    /**
     * @param params
     * @return
     */
    @Override
    public JSONObject payCallBack(JSONObject params) {
       return null;
    }
}
