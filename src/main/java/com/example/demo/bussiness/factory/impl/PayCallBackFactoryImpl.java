package com.example.demo.bussiness.factory.impl;

import com.example.demo.bussiness.factory.PayCallBackFactory;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 支付回调工厂的实现类
 * @ClassName: PayCallBackFactoryImpl
 * @Author: dzt
 * @CreateDate: 2018/12/13 15:37
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/13 15:37
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
@Service
public class PayCallBackFactoryImpl implements PayCallBackFactory {

    private Map<String, PayCallBackInter> payCallBackInterMap = new HashMap<>();

    PayCallBackFactoryImpl(){
        this.payCallBackInterMap.put("0",new WechatPayCallBack());
        this.payCallBackInterMap.put("1",new AliPayCallBack());
        this.payCallBackInterMap.put("2",new CardPayCallBack());
        this.payCallBackInterMap.put("3",new CashPayCallBack());
        this.payCallBackInterMap.put("4",new MemberCallBack());
        this.payCallBackInterMap.put("5",new TimeCardPayCallBack());
        this.payCallBackInterMap.put("7",new IntegralPayCallBack());
    }

    @Override
    public PayCallBackInter getPayCallBack(String payType) {
        return this.payCallBackInterMap.get(payType);
    }
}
