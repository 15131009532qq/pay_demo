package com.example.demo.bussiness.factory;

/**
 * @Description 请输入类描述信息
 * @ClassName OrderPayService
 * @Autor DZT
 * @Date 2020/4/28 14:34
 * @Version 1.0
 */
public interface OrderPayService {
    /**
     * 获取支付渠道
     */
    OrderCreateToOrderPayTemplate support(String channel);
}
