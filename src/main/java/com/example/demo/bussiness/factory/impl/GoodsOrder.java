package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.PayCallBackFactory;
import com.example.demo.bussiness.factory.PayWayFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.example.demo.bussiness.model.OrderChannelEnum.GOODS_CHANNEL;

/**
 * @Description: 普通商品订单的创建【不包含计次卡】
 * @ClassName: GoodsOrder
 * @Author: dzt
 * @CreateDate: 2018/12/10 11:31
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 11:31
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class GoodsOrder extends OrderCreateToOrderPayTemplate {
    private static final Logger log = LoggerFactory.getLogger(GoodsOrder.class);
    @Autowired
    private PayWayFactory payWayFactory;
    @Autowired
    private PayCallBackFactory payCallBackFactory;

    /**
     * 订单渠道
     * @param channel
     * @return
     */
    @Override
    public boolean payChannel(String channel) {
        return GOODS_CHANNEL.getType().equals(channel);
    }

    /**
     * 处理请求的参数信息 修改或者组装
     * @param map
     * @return
     */
    @Override
    public JSONObject reqParamsDeal(Map<String, String> map) {
        return null;
    }

    /**
     * @Description 普通商品类订单
     * 流程
     *     1、创建普通商品类的订单信息
     *     2、设置订单状态为待支付状态
     *     3、返回订单号
     * @param params
     * @return
     */
    @Override
    public JSONObject orderCreater(JSONObject params) {
        return null;
    }

    /**
     * @Description 普通商品类订单支付之前预处理
     * @param params
     * @return
     */
    @Override
    public JSONObject beforePayInter(JSONObject params) {
        return params;
    }

    /**
     * @Description 普通商品类订单支付处理中
     * @param params
     * @return
     */
    @Override
    public JSONObject payInter(JSONObject params) {
        log.info("订单支付请求参数信息:"+params.toJSONString());
        return null;
    }

    /**
     * @Description  普通商品类订单的支付后处理
     * @param params 请求参数信息
     * @return
     */
    @Override
    public JSONObject afterPayInter(JSONObject params) {
            return params;
    }
}
