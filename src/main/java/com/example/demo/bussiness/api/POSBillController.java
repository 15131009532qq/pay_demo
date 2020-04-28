package com.example.demo.bussiness.api;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.factory.OrderPayService;
import com.example.demo.bussiness.model.OrderChannelEnum;
import com.example.demo.bussiness.model.POSConstant;
import com.example.demo.bussiness.model.ResultModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    private OrderPayService orderPayService;


    /**
     * 订单结账 0:普通商品 1:服务 2:计次卡 3:会员储值
     * @param jsonObject
     * @return
     */
    @RequestMapping(value = "orderSettleAccounts",method = RequestMethod.POST)
    public ResultModel orderSettleAccounts(@ModelAttribute("json") JSONObject jsonObject) {
        JSONObject result=null;
        Map<String,String>  map=JSONObject.parseObject(jsonObject.toJSONString(),Map.class);
        //检查参数
        if (!Arrays.stream(OrderChannelEnum.values()).anyMatch(e->e.getType().equals(map.get("type")))){
            return ResultModel.getErrorResult(400,"渠道异常！");
        }
        result=orderPayService.support(map.get("type")).orderCreateAndPay(map);
        return ResultModel.getSuccessResult(result);
    }
}
