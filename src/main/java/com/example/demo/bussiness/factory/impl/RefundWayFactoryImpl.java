package com.example.demo.bussiness.factory.impl;

import com.example.demo.bussiness.factory.RefundWay;
import com.example.demo.bussiness.factory.RefundWayFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date: 2018/11/13 10:55
 * @Description:
 */
@Service
public class RefundWayFactoryImpl implements RefundWayFactory {

    private  Map<String, RefundWay> refundWayMap = new HashMap<>();

    RefundWayFactoryImpl(){
        this.refundWayMap.put("0",new ReturnByWechat());
        this.refundWayMap.put("1",new ReturnByAliPay());
        this.refundWayMap.put("2",new ReturnByCard());
        this.refundWayMap.put("3",new ReturnByCash());
        this.refundWayMap.put("4",new ReturnByMember());
        this.refundWayMap.put("5",new ReturnByWechatToCicc());
        this.refundWayMap.put("6",new ReturnByAlipayToCicc());
        this.refundWayMap.put("7",new ReturnByCardToCicc());
        this.refundWayMap.put("8",new ReturnByPhysicalStorePay());
    }

    @Override
    public RefundWay getRefundWay(String orderCode,String payType,String shopId) {
       return null;
    }
}
