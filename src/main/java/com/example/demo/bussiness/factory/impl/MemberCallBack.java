package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:  会员余额支付回调  参数：
 *                                   订单编号
 *                                   订单类型 0：普通商品 1：服务 2：计次卡
 *
 * @ClassName: MemberCallBack
 * @Author: dzt
 * @CreateDate: 2018/12/12 18:05
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/12 18:05
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class MemberCallBack extends PayCallBackInter {

    private static final Logger log = LoggerFactory.getLogger(MemberCallBack.class);

    @Override
    public JSONObject payCallBack(JSONObject params) {
        log.info("会员余额支付回调参数:"+params.toJSONString());
        return params;
    }
}
