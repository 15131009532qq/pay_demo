package com.example.demo.config;

import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.impl.AppointmentOrder;
import com.example.demo.bussiness.factory.impl.GoodsOrder;
import com.example.demo.bussiness.factory.impl.MemberStore;
import com.example.demo.bussiness.factory.impl.TimeCardOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

//  @Bean(value = "goods")
//  public OrderCreateToOrderPayTemplate getGoods() {
//    return new GoodsOrder();
//  }
//
//  @Bean(value = "appointments")
//  public OrderCreateToOrderPayTemplate getAppointments() {
//    return new AppointmentOrder();
//  }
//
//  @Bean(value = "timeCards")
//  public OrderCreateToOrderPayTemplate getTimeCards() {
//    return new TimeCardOrder();
//  }
//
//  @Bean(value = "memberStores")
//  public OrderCreateToOrderPayTemplate getmemberStores() {
//    return new MemberStore();
//  }

}
