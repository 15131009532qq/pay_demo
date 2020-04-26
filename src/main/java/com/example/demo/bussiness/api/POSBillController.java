package com.example.demo.bussiness.api;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.model.POSConstant;
import com.example.demo.bussiness.model.ResultModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Description 结账支付路由层
 * @ClassName POSBillController
 * @Autor DZT
 * @Date 2019/4/17 10:12
 * @Version 1.0
 */
@RestController
public class POSBillController{

    private static final Logger log = LoggerFactory.getLogger(POSBillController.class);

    @Resource
    @Qualifier(value = "goods")
    private OrderCreateToOrderPayTemplate orderCreateToOrderPayTemplateGoods;
    @Resource
    @Qualifier(value = "timeCards")
    private OrderCreateToOrderPayTemplate orderCreateToOrderPayTemplateTimeCards;
    @Resource
    @Qualifier(value = "appointments")
    private OrderCreateToOrderPayTemplate orderCreateToOrderPayTemplateAppointments;
    @Resource
    @Qualifier(value = "memberStores")
    private OrderCreateToOrderPayTemplate orderCreateToOrderPayTemplateMemberStores;


    /**
     * 订单结账 0:普通商品 1:服务 2:计次卡 3:会员储值
     * @param jsonObject
     * @return
     */
    @RequestMapping(value = "/api/v1.2/pos/endBill/orderSettleAccounts",method = RequestMethod.POST)
    public ResultModel orderSettleAccounts(@ModelAttribute("json") JSONObject jsonObject) {
        JSONObject result=null;
        Map<String,String>  map=JSONObject.parseObject(jsonObject.toJSONString(),Map.class);
        try {
            //进行支付处理
            switch (jsonObject.getString("type")){
                case POSConstant.GOODS_PRODUCT:result=orderCreateToOrderPayTemplateGoods.orderCreateAndPay(map);break;
                case POSConstant.SERVICES_PRODUCT:result=orderCreateToOrderPayTemplateAppointments.orderCreateAndPay(map);break;
                case POSConstant.TIMESCARD_PRODUCT:result=orderCreateToOrderPayTemplateTimeCards.orderCreateAndPay(map);break;
                case POSConstant.MEMBER_STORE_PRODUCT:result=orderCreateToOrderPayTemplateMemberStores.orderCreateAndPay(map);break;
                default:
                    return ResultModel.getErrorResult(400,"没有创建对应的订单类型");
            }
        }catch (Exception e){
            log.error("支付异常[{}]",e);
        }
       return ResultModel.getSuccessResult(result);
    }
}
