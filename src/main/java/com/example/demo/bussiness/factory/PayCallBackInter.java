package com.example.demo.bussiness.factory;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PayCallBackInter {

  private static final Logger log = LoggerFactory.getLogger(PayCallBackInter.class);

  public abstract JSONObject payCallBack(JSONObject params);

  public JSONObject process(JSONObject params) {
    return null;
  }

}
