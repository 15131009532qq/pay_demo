package com.example.demo.bussiness.factory;

public interface PayWayFactory {

  PayWay getPayWay(String payType, String shopId, String type);
}
