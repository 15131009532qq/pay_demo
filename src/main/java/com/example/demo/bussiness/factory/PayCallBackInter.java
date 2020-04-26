package com.example.demo.bussiness.factory;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @Description: 支付回调
 * @ClassName: PayCallBackInter
 * @Author: dzt
 * @CreateDate: 2018/12/10 11:14
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 11:14
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public abstract class PayCallBackInter {
    private static final Logger log = LoggerFactory.getLogger(PayCallBackInter.class);

    /**
     * @return
     * @Description 支付回调0-微信，1-支付宝，2-银行卡，4-会员余额 3-现金 5-次卡
     * * 微信条码支付暂不支持 异步回调
     * * 支付宝条码支付开发文档上标明只有扫码支付有 异步回调 但条码支付的notify_url能触发异步通知 暂定
     * * 其他的支付方式手动触发异步回调
     */
    public abstract JSONObject payCallBack(JSONObject params);

    /**
     * 执行过程 总回调，所有支付和支付通知都会回调导致这，做之后之后的处理
     */
    public JSONObject process(JSONObject params) {
        return null;
    }

}
