package com.example.demo.bussiness.factory;

import com.alibaba.fastjson.JSONArray;

/**
 * @Description 进行补偿
 * @ClassName SyncRecordPending
 * @Autor DZT
 * @Date 2019/8/21 10:34
 * @Version 1.0
 */
public abstract class SyncRecordPending {
    /**
     * 进行补偿处理
     * @param jsonArray
     * @param code
     */
    public abstract void toRecordPending(JSONArray jsonArray, String code);
}
