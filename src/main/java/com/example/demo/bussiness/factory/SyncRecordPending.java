package com.example.demo.bussiness.factory;

import com.alibaba.fastjson.JSONArray;

public abstract class SyncRecordPending {

  public abstract void toRecordPending(JSONArray jsonArray, String code);
}
