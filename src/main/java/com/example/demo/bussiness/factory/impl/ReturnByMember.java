package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.RefundWay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReturnByMember extends RefundWay {

  private static final Logger log = LoggerFactory.getLogger(ReturnByMember.class);

  @Override
  public JSONObject returnPay(String orderCode, String totalFee, String returnAmount,
    JSONObject returnChangeOrder, String orderFlag, String shopId, int childType, String payType) {
    return null;
  }
}
