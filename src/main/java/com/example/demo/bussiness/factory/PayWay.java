package com.example.demo.bussiness.factory;


import com.alibaba.fastjson.JSONObject;

public abstract class PayWay {

  public abstract JSONObject pay(JSONObject params);
}
