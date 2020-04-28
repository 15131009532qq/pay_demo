package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhysicalStorePay extends PayWay {

  private static final Logger log = LoggerFactory.getLogger(PhysicalStorePay.class);

  @Override
  public JSONObject pay(JSONObject params) {
    return null;
  }
}
