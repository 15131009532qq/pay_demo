package com.example.demo.bussiness.factory;

/**
 * @Description: 不同的支付方式
 * @ClassName: PayWayFactory
 * @Author: dzt
 * @CreateDate: 2018/12/10 11:51
 * @UpdateUser: dzt
 * @UpdateDate: 2018/12/10 11:51
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public interface PayWayFactory {
    /**
     * @Description 支付
     * @return
     */
    PayWay getPayWay(String payType, String shopId, String type);
}
