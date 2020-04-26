package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Description: 支付宝支付
 * @ClassName: AliPay
 * @Author: dzt
 * @CreateDate: 2018/12/10 12:30
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 12:30
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class AliPay extends PayWay {
    private static final Logger log = LoggerFactory.getLogger(AliPay.class);

//    @Autowired
//    private BasicServiceClient basicServiceClient;
//    @Autowired
//    private PublicServiceClient publicServiceClient;
    /**
     * 支付宝支付流程
     * 1、创建支付宝支付实例 AlipayClient
     * 2、初始化AlipayTradePayRequest请求参数实体
     * 3、发送request请求
     * 4、初始化AlipayTradePayResponse响应参数实体
     * 5、返回响应参数信息
     * 6、轮询查询订单状态等待支付宝回调
     */
    @Override
    public JSONObject pay(JSONObject params) {
        log.info("POS端支付宝支付请求参数信息:"+params.toJSONString());
        return null;
    }
}
