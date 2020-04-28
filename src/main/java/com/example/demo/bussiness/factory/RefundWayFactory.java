package com.example.demo.bussiness.factory;

public interface RefundWayFactory {

  RefundWay getRefundWay(String orderCode, String payType, String shopId);
}
