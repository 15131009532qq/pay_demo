package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;


import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.PayCallBackFactory;
import com.example.demo.bussiness.factory.PayCallBackInter;
import com.example.demo.bussiness.factory.PayWayFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Description: 会员储值
 * @ClassName: MemberStore
 * @Author: dzt
 * @CreateDate: 2019/8/6 11:31
 * @UpdateUser: dzt
 * @UpdateDate: 2019/8/6 11:31
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class MemberStore extends OrderCreateToOrderPayTemplate {
    private static final Logger log = LoggerFactory.getLogger(MemberStore.class);

    @Autowired
    private PayWayFactory payWayFactory;
    @Autowired
    private PayCallBackFactory payCallBackFactory;

    /**
     * 处理请求的参数信息 修改或者组装
     * @param map
     * @return
     */
    @Override
    public JSONObject reqParamsDeal(Map<String, String> map) {
        return null;
    }

    @Override
    public JSONObject orderCreater(JSONObject params) {
        return null;
    }

    /**
     * 会员储值前处理
     * @param params
     * @return
     */
    @Override
    public JSONObject beforePayInter(JSONObject params) {
        return params;
    }
    /**
     * @Description 会员储值订单支付处理中
     *              参数格式: 支付方式 payType 支付方式包括:0-微信，1-支付宝，2-银行卡，3-现金
     *                      订单编号:orderCode
     *                      授权码:authCode
     *                      组织机构id【门店id】:organizationId
     *                      支付金额【单位元】:amount
     *                      订单类型0:普通商品 1:服务 2:计次卡 3:会员储值【包括储值、提现、转账】:orderType
     * @param params
     * @return
     */
    @Override
    public JSONObject payInter(JSONObject params) {
        log.info("订单支付请求参数信息:"+params.toJSONString());
        return null;
    }

    @Override
    public JSONObject afterPayInter(JSONObject params) {
        return null;
    }
}
