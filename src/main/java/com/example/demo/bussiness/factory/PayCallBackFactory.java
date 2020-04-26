package com.example.demo.bussiness.factory;

/**
 * @Description: 支付回调工厂
 * @ClassName: PayCallBackFactory
 * @Author: dzt
 * @CreateDate: 2018/12/13 15:36
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/13 15:36
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public interface PayCallBackFactory {
    /**
     * @Description 支付回调
     * @return
     */
    PayCallBackInter getPayCallBack(String payType);
}
