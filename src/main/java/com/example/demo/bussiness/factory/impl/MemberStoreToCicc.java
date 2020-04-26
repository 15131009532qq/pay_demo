package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Description 中金会员储值CICC
 * @ClassName MemberStoreToCicc
 * @Autor DZT
 * @Date 2019/8/9 10:53
 * @Version 1.0
 */
public class MemberStoreToCicc extends PayWay {
    /**
     * 全局日志
     */
    private static final Logger log = LoggerFactory.getLogger(MemberStoreToCicc.class);

    /**
     * 中金储值支付流水信息
     * 1、创建中金储值请求参数信息
     * 2、初始化HttpClient
     * 3、发送request请求
     * 4、初始化HttpResponse
     * 5、返回响应参数信息
     * 6、轮询查询本地订单状态信息
     * @param params
     * @return
     */
    @Override
    public JSONObject pay(JSONObject params) {
        log.info("POS端中金储值请求参数信息:"+params.toJSONString());
        return null;
    }
}
