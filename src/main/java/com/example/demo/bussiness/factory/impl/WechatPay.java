package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 微信支付
 *               参数格式:订单号,
 *                      授权码,
 *                      组织机构id【门店id】,
 *                      支付金额【单位元】,
 *                      订单类型0:普通商品 1:服务 2:计次卡
 *               订单主题:默认采用门店_订单_订单号
 * @ClassName: WechatPay
 * @Author: dzt
 * @CreateDate: 2018/12/10 12:28
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 12:28
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class WechatPay extends PayWay {
    private static final Logger log = LoggerFactory.getLogger(WechatPay.class);

    /**
     * 服务类型支付
     * 走微信支付流程
     * 1、创建微信支付实例
     * 2、调取微信刷卡支付
     * 3、判断微信支付结果
     * 4、等待微信回调
     */
    @Override
    public JSONObject pay(JSONObject params) {
        log.info("POS端微信支付请求参数信息:"+params.toJSONString());
      return null;
    }

}
