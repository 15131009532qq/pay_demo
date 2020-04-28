package com.example.demo.bussiness.factory.impl;

import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.OrderPayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @Description 请输入类描述信息
 * @ClassName OrderPayServiceImpl
 * @Autor DZT
 * @Date 2020/4/28 14:35
 * @Version 1.0
 */
@Service
public class OrderPayServiceImpl implements OrderPayService {

    @Resource
    List<OrderCreateToOrderPayTemplate> list;

    @Override
    public OrderCreateToOrderPayTemplate support(String channel) {
        Optional<OrderCreateToOrderPayTemplate> orderCreateToOrderPayTemplate=list.stream().filter(e->e.payChannel(channel)).findFirst();
        if (orderCreateToOrderPayTemplate.isPresent()){
            return orderCreateToOrderPayTemplate.get();
        }
        return null;
    }
}
