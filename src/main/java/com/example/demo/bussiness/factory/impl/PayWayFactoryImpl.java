package com.example.demo.bussiness.factory.impl;


import com.example.demo.bussiness.factory.PayWay;
import com.example.demo.bussiness.factory.PayWayFactory;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class PayWayFactoryImpl implements PayWayFactory {

  private Map<String, PayWay> payWayMap = new HashMap<>();

  PayWayFactoryImpl() {
    this.payWayMap.put("0", new WechatPay());
    this.payWayMap.put("1", new AliPay());
    this.payWayMap.put("2", new CardPay());
    this.payWayMap.put("3", new CashPay());
    this.payWayMap.put("4", new MemberPay());
    this.payWayMap.put("5", new TimeCardPay());
    this.payWayMap.put("6", new AlipayToCicc());
    this.payWayMap.put("7", new WechatPayToCicc());
    this.payWayMap.put("8", new CardPayToCicc());
    this.payWayMap.put("9", new PhysicalStorePay());
    this.payWayMap.put("10", new MemberStoreToCicc());
    this.payWayMap.put("11", new IntegralPay());
  }

  @Override
  public PayWay getPayWay(String payType, String shopId, String type) {
    return null;
  }
}
