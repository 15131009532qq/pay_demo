package com.example.demo.config;

import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.impl.AppointmentOrder;
import com.example.demo.bussiness.factory.impl.GoodsOrder;
import com.example.demo.bussiness.factory.impl.MemberStore;
import com.example.demo.bussiness.factory.impl.TimeCardOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 集合注入
 * @ClassName OrderPay
 * @Autor DZT
 * @Date 2020/4/28 14:24
 * @Version 1.0
 */
@Configuration
public class OrderPayConfig {

    @Bean
    public List<OrderCreateToOrderPayTemplate> rderCreateToOrderPayTemplates(){
        List<OrderCreateToOrderPayTemplate> list=new ArrayList<>();
        list.add(new GoodsOrder());
        list.add(new AppointmentOrder());
        list.add(new TimeCardOrder());
        list.add(new MemberStore());
        return list;
    }
}
