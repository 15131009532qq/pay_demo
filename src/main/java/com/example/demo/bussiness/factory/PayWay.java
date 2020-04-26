package com.example.demo.bussiness.factory;


import com.alibaba.fastjson.JSONObject;

/**
 * @Description: 不同的支付方式
 * @ClassName: PayWay
 * @Author: dzt
 * @CreateDate: 2018/12/10 11:58
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 11:58
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public abstract class PayWay {
    /**
     * @Description 不同支付方式支付
     * @param params
     * @return
     */
    public abstract JSONObject pay(JSONObject params);
}
