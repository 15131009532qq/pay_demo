package com.example.demo.bussiness.factory.impl;


import com.example.demo.bussiness.factory.PayWay;
import com.example.demo.bussiness.factory.PayWayFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 支付方式工厂
 * @ClassName: PayWayFactoryImpl
 * @Author: dzt
 * @CreateDate: 2018/12/10 11:55
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 11:55
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
@Service
public class PayWayFactoryImpl implements PayWayFactory {

    private Map<String, PayWay> payWayMap= new HashMap<>();

    /**
     * @Description 0-微信，1-支付宝，2-银行卡，3-现金 ,4-会员余额,5-次卡
     *              6-中金支付宝通道 7-中金微信支付通道 8-中金银行卡支付通道 9-具体实体渠道【商米、、、】
     *              10-会员储值【中金储值：微信、支付宝、银行卡】
     */
    PayWayFactoryImpl(){
        this.payWayMap.put("0",new WechatPay());
        this.payWayMap.put("1",new AliPay());
        this.payWayMap.put("2",new CardPay());
        this.payWayMap.put("3",new CashPay());
        this.payWayMap.put("4",new MemberPay());
        this.payWayMap.put("5",new TimeCardPay());
        this.payWayMap.put("6",new AlipayToCicc());
        this.payWayMap.put("7",new WechatPayToCicc());
        this.payWayMap.put("8",new CardPayToCicc());
        this.payWayMap.put("9",new PhysicalStorePay());
        this.payWayMap.put("10",new MemberStoreToCicc());
        this.payWayMap.put("11",new IntegralPay());
    }

    /**
     * @Description 查询对应的支付方式
     *                  1、支付渠道的判断
     *                  2、支付方式
     * @param payType
     * @return
     */
    @Override
    public PayWay getPayWay(String payType,String shopId,String type) {
       return null;
    }
}
