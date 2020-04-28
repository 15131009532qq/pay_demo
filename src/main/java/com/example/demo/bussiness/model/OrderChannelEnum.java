package com.example.demo.bussiness.model;

import org.springframework.util.Assert;

import java.util.Arrays;

/**
 * @Description 请输入类描述信息
 * @ClassName OrderChannelEnum
 * @Autor DZT
 * @Date 2020/4/28 14:40
 * @Version 1.0
 */
public enum OrderChannelEnum {
    GOODS_CHANNEL("1","商品类订单"),
    APPOINTMENT_CHANNEL("2","服务类订单"),
    MEMBER_STORE_CHANNEL("3","储值类订单"),
    TIME_CARD_CHANNEL("4","计次卡订单");

    private String type;
    private String msg;

    public boolean checkChannel(String channel){
       if (Arrays.stream(values()).anyMatch(e->e.getMsg().equals(channel))){
           return true;
       }else {
           return false;
       }
    }

    OrderChannelEnum(String type, String msg) {
        this.type = type;
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
