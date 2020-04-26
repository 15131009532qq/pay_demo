package com.example.demo.bussiness.api;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.PayCallBackFactory;
import com.example.demo.bussiness.factory.PayCallBackInter;
import com.example.demo.bussiness.model.ResultModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Description 支付回调接入层
 * @ClassName POSPaymentController
 * @Autor DZT
 * @Date 2019/4/19 11:56
 * @Version 1.0
 */
@RestController
public class POSPaymentController {
    private static final Logger log = LoggerFactory.getLogger(POSPaymentController.class);

    @Autowired
    private PayCallBackFactory payCallBackFactory;

    /**
     * 微信、支付宝、银行卡支付异步回调
     * @param jsonObject
     * @return
     */
    @PostMapping(value = "payCallBackToCicc")
    public ResultModel payCallBackToCicc(@ModelAttribute(value = "json") JSONObject jsonObject){
        log.error("中金支付回调参数信息:" + jsonObject);
        PayCallBackInter payCallBackInter=this.payCallBackFactory.getPayCallBack("");
        if(payCallBackInter == null){
          throw new RuntimeException("支付方式未知");
        }
        payCallBackInter.process(null);
        return ResultModel.getErrorResult(1,"成功！");
    }
    /**
     * 微信、支付宝、银行卡退款异步回调
     * @param jsonObject
     * @return
     */
    @PostMapping(value = "refundPayCallBackToCicc")
    public ResultModel refundPayCallBackToCicc(@ModelAttribute(value = "json") JSONObject jsonObject) {
        log.error("中金支付退款回调参数信息:" + jsonObject);
        return ResultModel.getErrorResult(1,"通知成功！");
    }

    /**
     * 实体支付渠道 异步回调  支付
     * 商米严选:微信、支付宝、银行卡、刷脸
     * @param jsonObject
     * @return
     */
    @PostMapping(value = "payCallBackToPhysicalStore")
    public ResultModel payCallBackToPhysicalStore(@ModelAttribute(value = "json") JSONObject jsonObject) {
        log.info("商米渠道支付回调参数:"+jsonObject.toJSONString());
        smPay(jsonObject);
        return null;
    }
    /**
     * 实体支付渠道 异步回调  退款
     * 商米严选:微信、支付宝、银行卡、刷脸
     * @param jsonObject
     * @return
     */
    @PostMapping(value = "refundPayCallBackToPhysicalStore")
    public ResultModel refundPayCallBackToPhysicalStore(@ModelAttribute(value = "json") JSONObject jsonObject) {
        log.error("商米支付退款回调参数信息:" + jsonObject);
        smReturnPay(jsonObject);
        return null;
    }

    /**
     * 进行次卡回调成功处理
     * @param returnId
     * @param orderCode
     * @param orderGoods
     * @param id
     * @return
     */
    public boolean timeCardReturn(String  returnId, String orderCode, JSONObject orderGoods, String id){
        // ========================= 退款成功业务处理
        return true;
    }

    /**
     * 商米支付 支付发起-订单创建-返回订单-唤起pos机-第三方商米收银台SDK唤起-发起支付-进行回调
     * @param jsonObject
     * @return
     */
    public ResultModel smPay(JSONObject jsonObject){
        return ResultModel.getSuccessResult(null);
    }

    /**
     * 商米退款
     * @param jsonObject
     * @return
     */
    public ResultModel smReturnPay(JSONObject jsonObject){
        return ResultModel.getSuccessResult(null);
    }

    /**
     * 追加回调锁
     * @param jsonObject
     * @param type
     * @param orderId
     */
    public void addCallBackLock(JSONObject jsonObject, String type, String orderId){
        log.info("加锁[{}]",orderId);
    }

}
