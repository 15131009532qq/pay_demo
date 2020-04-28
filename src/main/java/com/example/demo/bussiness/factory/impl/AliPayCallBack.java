package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AliPayCallBack extends PayCallBackInter {

  private static final Logger log = LoggerFactory.getLogger(AliPayCallBack.class);

  @Override
  public JSONObject payCallBack(JSONObject params) {
    String sysPayCnl = params.getString("callBack");
    switch (sysPayCnl) {
      case "0":
        return this.orgainAliPayCallBack(params);
      case "1":
        return this.ciccAliPayCallBack(params);
      case "2":
        return this.physicalStoreAliPayCallBack(params);
      default:
        throw new RuntimeException("支付渠道异常");
    }
  }

  public JSONObject orgainAliPayCallBack(JSONObject params) {
    log.info("支付宝回调参数:" + params.toJSONString());
    params.put("returnCode", "SUCCESS");
    params.put("returnMsg", "参数校验成功");
    return params;
  }

  public JSONObject ciccAliPayCallBack(JSONObject params) {
    log.info("支付宝回调参数:" + params.toJSONString());
    return params;
  }

  public JSONObject physicalStoreAliPayCallBack(JSONObject params) {
    return params;
  }

}
