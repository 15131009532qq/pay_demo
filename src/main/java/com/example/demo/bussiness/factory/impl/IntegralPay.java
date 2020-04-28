package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegralPay extends PayWay {

  private static final Logger log = LoggerFactory.getLogger(IntegralPay.class);

  @Override
  public JSONObject pay(JSONObject params) {
    log.info("进行积分抵现支付...");
    //积分扣减这一步需要锁住积分资源
    return null;
  }
}
