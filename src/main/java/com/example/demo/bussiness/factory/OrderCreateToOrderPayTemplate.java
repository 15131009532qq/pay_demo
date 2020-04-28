package com.example.demo.bussiness.factory;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @Description: 支付订单创建和支付订单支付【商品、服务、计次卡】
 * @ClassName: OrderCreateToOrderPayTemplate
 * @Author: dzt
 * @CreateDate: 2018/12/10 10:47
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 10:47
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public abstract class OrderCreateToOrderPayTemplate {

    /**
     * 订单渠道
     */
    public abstract boolean payChannel(String channel);

    /**
     * @Description 用于处理客户端的参数信息 参数映射和组装
     *              订单创建之前
     *              结账之前
     *              ......
     * @param map
     * @return
     */
    public abstract JSONObject reqParamsDeal(Map<String,String> map);

    /**
     * @Description 订单的创建【商品、服务、计次卡、会员储值...】
     * @return
     */
    public abstract JSONObject orderCreater(JSONObject params);

    /**
     * @Description 订单支付之前的预处理
     * @param params
     * @return
     */
    public abstract JSONObject beforePayInter(JSONObject params);

    /**
     * @Description 订单支付 支付方式包括:0-微信，1-支付宝，2-银行卡，3-现金 ,4-会员余额,5-次卡
     *              支付渠道:原生支付、中金、商米
     * @param params
     * @return
     */
    public abstract JSONObject payInter(JSONObject params);

    /**
     * @Description 订单支付成功之后的后处理
     * @param params 请求参数信息 包括 子订单信息  总订单信息
     * @return
     */
    public abstract JSONObject afterPayInter(JSONObject params);
    /**
     * @Description 订单创建的过程
     * @param params
     * @return
     */
    public JSONObject orderCreateProcess(JSONObject params){
        return this.orderCreater(params);
    }
    /**
     * @Description 订单支付的过程 针对已经创建的订单进行支付
     * @param map
     * @return
     */
    public JSONObject payProcess(Map<String,String> map){
        //请求参数处理 修改和组装
        JSONObject reqJSONObject=this.reqParamsDeal(map);
        //订单支付预处理
        JSONObject prePayJSONObject=this.beforePayInter(reqJSONObject);
        //订单支付中
        JSONObject payProcessJSONObject=this.payInter(prePayJSONObject);
        //订单支付后后处理
        JSONObject payAfterJSONObject=this.afterPayInter(payProcessJSONObject);
        return payAfterJSONObject;
    }
    /**
     * @Description 订单创建和订单支付
     * @param map
     * @return
     */
    public JSONObject orderCreateAndPay(Map<String,String> map){
        //追加时间节点
        //请求参数处理 修改和组装
        JSONObject reqJSONObject=this.reqParamsDeal(map);
        //订单创建
        JSONObject orderCreateJSONObject=this.orderCreateProcess(reqJSONObject);
        //订单支付预处理
        JSONObject prePayJSONObject=this.beforePayInter(orderCreateJSONObject);
        //进行时间追加
        //订单支付中
        JSONObject payProcessJSONObject=this.payInter(prePayJSONObject);
        //订单支付后处理
        JSONObject payAfterJSONObject=this.afterPayInter(payProcessJSONObject);
        return payAfterJSONObject;
    }
}


