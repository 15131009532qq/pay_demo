package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.PayCallBackFactory;
import com.example.demo.bussiness.factory.PayCallBackInter;
import com.example.demo.bussiness.factory.PayWayFactory;
import com.example.demo.bussiness.model.POSConstant;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AppointmentOrder extends OrderCreateToOrderPayTemplate {

  @Override
  public boolean support(String type) {
    return POSConstant.SERVICES_PRODUCT.equals(type);
  }

  private static final Logger log = LoggerFactory.getLogger(AppointmentOrder.class);
  @Autowired
  private PayCallBackFactory payCallBackFactory;
  @Autowired
  private PayWayFactory payWayFactory;



  @Override
  public JSONObject reqParamsDeal(Map<String, String> map) {
    log.info("请求参数信息:" + map.toString());
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
    return null;
  }

  @Override
  public JSONObject afterPayInter(JSONObject params) {
    //3、进行支付的回调 暂定回调为同步 暂不异步 0:同步回调 1:异步回调
    if (!"1".equals(params.getString("callBack"))) {
      //主动回调 根据异步和同步进行判断
      PayCallBackInter payCallBackInter = this.payCallBackFactory
        .getPayCallBack(params.getString("payType"));//支付方式
      payCallBackInter.process(params);
      //其他处理 异步
      try {
      } catch (Exception e) {
        //异步上传交易数据不影响正常交易！可能需手动补偿
      }
    } else {
      return null;
    }
    return null;
  }
}
