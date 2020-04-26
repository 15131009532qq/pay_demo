package com.example.demo.bussiness.factory.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackInter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 支付宝异步回调
 * @ClassName: AliPayCallBack
 * @Author: dzt
 * @CreateDate: 2018/12/12 16:35
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/12 16:35
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public class AliPayCallBack extends PayCallBackInter {
    private static final Logger log = LoggerFactory.getLogger(AliPayCallBack.class);

    /**
     * @Description 支付宝异步回调流程
     *              1、进行支付宝异步回调的签名验证【先不验签】
     *              2、验证订单号
     *              3、验证金额
     *              4、更新对应的订单信息
     * @param params
     * @return
     */
    @Override
    public JSONObject payCallBack(JSONObject params) {
        String sysPayCnl=params.getString("callBack");
        switch (sysPayCnl){
            case "0":return this.orgainAliPayCallBack(params);
            case "1":return this.ciccAliPayCallBack(params);
            case "2":return this.physicalStoreAliPayCallBack(params);
            default:
                throw new RuntimeException("支付渠道异常");
        }
    }

    /**
     * 原生回调
     * @param params
     * @return
     */
    public JSONObject orgainAliPayCallBack(JSONObject params){
        log.info("支付宝回调参数:"+params.toJSONString());
        params.put("returnCode","SUCCESS");
        params.put("returnMsg","参数校验成功");
        return params;
    }
    /**
     * 原生回调
     * @param params
     * @return
     */
    public JSONObject ciccAliPayCallBack(JSONObject params){
        log.info("支付宝回调参数:"+params.toJSONString());
        return params;
    }
    /**
     * 走商米支付回调
     * @param params
     * @return
     */
    public JSONObject physicalStoreAliPayCallBack(JSONObject params){
        return params;
    }

}
