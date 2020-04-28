package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WechatPayCallBack extends PayCallBackInter {

  private static final Logger log = LoggerFactory.getLogger(WechatPayCallBack.class);

  @Override
  public JSONObject payCallBack(JSONObject params) {
    return null;
  }
}
