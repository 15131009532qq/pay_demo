package com.example.demo.bussiness.factory.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.PayCallBackFactory;
import com.example.demo.bussiness.factory.PayCallBackInter;
import com.example.demo.bussiness.factory.PayWayFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description: 预约服务订单
 * @ClassName: AppointmentOrder
 * @Author: dzt
 * @CreateDate: 2018/12/10 12:48
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 12:48
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
@Service
public class AppointmentOrder extends OrderCreateToOrderPayTemplate {
    private static final Logger log = LoggerFactory.getLogger(AppointmentOrder.class);
    @Autowired
    private PayCallBackFactory payCallBackFactory;
    @Autowired
    private PayWayFactory payWayFactory;

    /**
     * @Description 请求参数处理 数据组装
     * @param map
     * @return
     */
    @Override
    public JSONObject reqParamsDeal(Map<String, String> map) {
        log.info("请求参数信息:"+map.toString());
        return null;
    }

    /**
     * @Description 服务类订单创建
     * 流程
     *     1、创建服务类的订单信息
     *     2、设置订单状态为待支付状态
     *     3、返回订单号
     * @param params
     * @return
     */
    @Override
    public JSONObject orderCreater(JSONObject params) {
        return null;
    }

    /**
     * @Description 支付之前预处理
     * @param params
     * @return
     */
    @Override
    public JSONObject beforePayInter(JSONObject params) {
            return params;
    }

    /**
     * @Description 支付处理中
     * @param params
     * @return
     */
    @Override
    public JSONObject payInter(JSONObject params) {
        return null;
    }

    /**
     * @Description 预约服务订单支付成功之后的后处理
     * @param params 请求参数信息
     * @return
     */
    @Override
    public JSONObject afterPayInter(JSONObject params) {
        //3、进行支付的回调 暂定回调为同步 暂不异步 0:同步回调 1:异步回调
        if (!"1".equals(params.getString("callBack"))){
            //主动回调 根据异步和同步进行判断
            PayCallBackInter payCallBackInter=this.payCallBackFactory.getPayCallBack(params.getString("payType"));//支付方式
            payCallBackInter.process(params);
            //其他处理 异步
            try {
            }catch (Exception e){
                //异步上传交易数据不影响正常交易！可能需手动补偿
            }
        }else{
            return null;
        }
        return null;
    }
}
