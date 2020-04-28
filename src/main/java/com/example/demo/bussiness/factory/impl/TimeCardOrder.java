package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.PayCallBackFactory;
import com.example.demo.bussiness.factory.PayWayFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static com.example.demo.bussiness.model.OrderChannelEnum.TIME_CARD_CHANNEL;

/**
 * @Description: 计次卡订单
 * @ClassName: TimeCardOrder
 * @Author: dzt
 * @CreateDate: 2018/12/10 13:46
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 13:46
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class TimeCardOrder extends OrderCreateToOrderPayTemplate {
    private static final Logger log = LoggerFactory.getLogger(TimeCardOrder.class);
    @Autowired
    private PayWayFactory payWayFactory;
    @Autowired
    private PayCallBackFactory payCallBackFactory;

    @Override
    public boolean payChannel(String channel) {
        return TIME_CARD_CHANNEL.getMsg().equals(channel);
    }

    /**
     * @Description 请求参数处理 参数组装
     * @param map
     * @return
     */
    @Override
    public JSONObject reqParamsDeal(Map<String, String> map) {
        return null;
    }

    /**
     * 创建计次卡订单信息
     * @param params
     * @return
     */
    @Override
    public JSONObject orderCreater(JSONObject params) {

        return  null;
    }

    /**
     * @Description 计次卡预支付
     * @param params
     * @return
     */
    @Override
    public JSONObject beforePayInter(JSONObject params) {

        return params;
    }
    /**
     * @Description 支付处理中
     *              参数格式: 支付方式 payType 支付方式包括:0-微信，1-支付宝，2-银行卡，3-现金 ,4-会员余额
     *                      订单编号:orderCode
     *                      授权码:authCode
     *                      组织机构id【门店id】:organizationId
     *                      支付金额【单位元】:amount
     *                      订单类型0:普通商品 1:服务 2:计次卡 :orderType
     * @param params
     * @return
     */
    @Override
    public JSONObject payInter(JSONObject params) {
        log.info("计次卡支付请求信息:"+params.toJSONString());
        return null;
    }

    /**
     * @Description 支付成功之后的后处理
     * @param params 请求参数信息
     * @return
     */
    @Override
    public JSONObject afterPayInter(JSONObject params) {
      return null;
    }
}
