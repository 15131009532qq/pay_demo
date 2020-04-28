package com.example.demo.bussiness.factory;

import com.alibaba.fastjson.JSONObject;
import java.util.Map;

public abstract class OrderCreateToOrderPayTemplate {

  public abstract boolean support(String type);

  public abstract JSONObject reqParamsDeal(Map<String, String> map);

  public abstract JSONObject orderCreater(JSONObject params);

  public abstract JSONObject beforePayInter(JSONObject params);

  public abstract JSONObject payInter(JSONObject params);

  public abstract JSONObject afterPayInter(JSONObject params);

  public JSONObject orderCreateProcess(JSONObject params) {
    return this.orderCreater(params);
  }

  public JSONObject payProcess(Map<String, String> map) {
    //请求参数处理 修改和组装
    JSONObject reqJSONObject = this.reqParamsDeal(map);
    //订单支付预处理
    JSONObject prePayJSONObject = this.beforePayInter(reqJSONObject);
    //订单支付中
    JSONObject payProcessJSONObject = this.payInter(prePayJSONObject);
    //订单支付后后处理
    JSONObject payAfterJSONObject = this.afterPayInter(payProcessJSONObject);
    return payAfterJSONObject;
  }

  public JSONObject orderCreateAndPay(Map<String, String> map) {
    //追加时间节点
    //请求参数处理 修改和组装
    JSONObject reqJSONObject = this.reqParamsDeal(map);
    //订单创建
    JSONObject orderCreateJSONObject = this.orderCreateProcess(reqJSONObject);
    //订单支付预处理
    JSONObject prePayJSONObject = this.beforePayInter(orderCreateJSONObject);
    //进行时间追加
    //订单支付中
    JSONObject payProcessJSONObject = this.payInter(prePayJSONObject);
    //订单支付后处理
    JSONObject payAfterJSONObject = this.afterPayInter(payProcessJSONObject);
    return payAfterJSONObject;
  }
}


