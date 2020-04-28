package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegralPayCallBack extends PayCallBackInter {

  private static final Logger log = LoggerFactory.getLogger(TimeCardPayCallBack.class);

  @Override
  public JSONObject payCallBack(JSONObject params) {
    log.info("积分抵现支付回调参数:" + params.toJSONString());
    return params;
  }
}
