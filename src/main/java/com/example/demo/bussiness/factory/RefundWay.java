package com.example.demo.bussiness.factory;

import com.alibaba.fastjson.JSONObject;

public abstract class RefundWay {

  public abstract JSONObject returnPay(String orderCode, String totalFee, String returnAmount,
    JSONObject returnChangeOrder, String orderFlag, String shopId, int childType, String payType);

  public boolean createPayFlow(String orderCode, String memberCompanyId, String money,
    String payType, String mchId, String retFlowId, String returnCode) {
    return true;
  }
}
