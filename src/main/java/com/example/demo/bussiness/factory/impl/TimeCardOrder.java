package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.model.POSConstant;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TimeCardOrder extends OrderCreateToOrderPayTemplate {

  private static final Logger log = LoggerFactory.getLogger(TimeCardOrder.class);

  @Override
  public boolean support(String type) {
    return POSConstant.TIMESCARD_PRODUCT.equals(type);
  }

  @Override
  public JSONObject reqParamsDeal(Map<String, String> map) {
    return null;
  }

  @Override
  public JSONObject orderCreater(JSONObject params) {

    return null;
  }

  @Override
  public JSONObject beforePayInter(JSONObject params) {

    return params;
  }

  @Override
  public JSONObject payInter(JSONObject params) {
    log.info("计次卡支付请求信息:" + params.toJSONString());
    return null;
  }

  @Override
  public JSONObject afterPayInter(JSONObject params) {
    return null;
  }
}
