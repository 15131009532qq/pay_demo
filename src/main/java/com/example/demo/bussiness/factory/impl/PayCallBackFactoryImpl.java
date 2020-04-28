package com.example.demo.bussiness.factory.impl;

import com.example.demo.bussiness.factory.PayCallBackFactory;
import com.example.demo.bussiness.factory.PayCallBackInter;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class PayCallBackFactoryImpl implements PayCallBackFactory {

  private Map<String, PayCallBackInter> payCallBackInterMap = new HashMap<>();

  PayCallBackFactoryImpl() {
    this.payCallBackInterMap.put("0", new WechatPayCallBack());
    this.payCallBackInterMap.put("1", new AliPayCallBack());
    this.payCallBackInterMap.put("2", new CardPayCallBack());
    this.payCallBackInterMap.put("3", new CashPayCallBack());
    this.payCallBackInterMap.put("4", new MemberCallBack());
    this.payCallBackInterMap.put("5", new TimeCardPayCallBack());
    this.payCallBackInterMap.put("7", new IntegralPayCallBack());
  }

  @Override
  public PayCallBackInter getPayCallBack(String payType) {
    return this.payCallBackInterMap.get(payType);
  }
}
