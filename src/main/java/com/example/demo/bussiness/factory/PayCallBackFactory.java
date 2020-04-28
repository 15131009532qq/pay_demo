package com.example.demo.bussiness.factory;

public interface PayCallBackFactory {

  PayCallBackInter getPayCallBack(String payType);
}
