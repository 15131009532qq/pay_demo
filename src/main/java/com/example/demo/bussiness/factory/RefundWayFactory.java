package com.example.demo.bussiness.factory;

/**
 * @Date: 2018/11/13 10:49
 * @Description:
 */
public interface RefundWayFactory {

    RefundWay getRefundWay(String orderCode, String payType, String shopId);
}
