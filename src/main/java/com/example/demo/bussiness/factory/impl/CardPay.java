package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CardPay extends PayWay {

  private static final Logger log = LoggerFactory.getLogger(CardPay.class);

  @Override
  public JSONObject pay(JSONObject params) {
    log.info("银行卡支付暂时走线下-等待对接中金");
    return null;
  }
}
