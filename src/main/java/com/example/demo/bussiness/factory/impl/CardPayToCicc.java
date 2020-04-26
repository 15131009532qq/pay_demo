package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 银行卡支付走拉卡拉
 * @ClassName: CardPayToCicc
 * @Author: dzt
 * @CreateDate: 2019/1/8 11:51
 * @UpdateUser: dzt
 * @UpdateDate: 2019/1/8 11:51
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class CardPayToCicc extends PayWay {

    /**
     * 中金银行卡支付流水信息
     * 1、创建中金银行卡支付请求参数信息
     * 2、初始化HttpClient
     * 3、发送request请求
     * 4、初始化HttpResponse
     * 5、返回响应参数信息
     * 6、轮询查询本地订单状态信息
     */
    @Override
    public JSONObject pay(JSONObject params) {
        return null;
    }
}

