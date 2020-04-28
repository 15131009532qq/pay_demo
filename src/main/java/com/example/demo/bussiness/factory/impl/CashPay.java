package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CashPay extends PayWay {

  private static final Logger log = LoggerFactory.getLogger(CardPay.class);

  @Override
  public JSONObject pay(JSONObject params) {
    log.info("现金支付请求参数信息:" + params.toJSONString());
    return null;
  }
}
