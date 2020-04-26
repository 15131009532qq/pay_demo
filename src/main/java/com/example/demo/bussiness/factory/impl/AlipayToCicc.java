package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 支付宝支付走中金
 * @ClassName: AlipayToCicc
 * @Author: dzt
 * @CreateDate: 2019/1/8 11:48
 * @UpdateUser: dzt
 * @UpdateDate: 2019/1/8 11:48
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class AlipayToCicc extends PayWay {
    private static final Logger log = LoggerFactory.getLogger(AlipayToCicc.class);

    /**
     * 中金支付宝支付流水信息
     * 1、创建中金支付宝支付请求参数信息
     * 2、初始化HttpClient
     * 3、发送request请求
     * 4、初始化HttpResponse
     * 5、返回响应参数信息
     * 6、轮询查询本地订单状态信息
     */
    @Override
    public JSONObject pay(JSONObject params) {
        log.info("POS端支付宝支付请求参数信息:"+params.toJSONString());
        return null;
    }
}
