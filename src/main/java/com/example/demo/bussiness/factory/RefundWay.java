package com.example.demo.bussiness.factory;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

/**
 * @Date: 2018/11/13 10:51
 * @Description:
 */
public abstract class RefundWay {

    /**
     *
     * @param orderCode 原订单编号
     * @param returnAmount 退款金额
     * @param returnChangeOrder 退货订单对象
     * @return
     * @throws IOException
     */
    public abstract JSONObject returnPay(String orderCode, String totalFee, String returnAmount, JSONObject returnChangeOrder, String orderFlag,String shopId,int childType,String payType);

    /**
     * 创建退款流水
     * @param orderCode
     * @param memberCompanyId
     * @param money
     * @param mchId
     * @param retFlowId
     * @param returnCode
     * @return
     */
    public boolean createPayFlow(String orderCode, String memberCompanyId,String money,String payType, String mchId,  String retFlowId, String returnCode){
        return true;
    }
}
