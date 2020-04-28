package com.example.demo.bussiness.api;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bussiness.factory.OrderCreateToOrderPayTemplate;
import com.example.demo.bussiness.model.ResultModel;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSBillController {

  private static final Logger log = LoggerFactory.getLogger(POSBillController.class);

  @Autowired
  private List<OrderCreateToOrderPayTemplate> orderCreateToOrderPayTemplateList;

  @RequestMapping(value = "/api/v1.2/pos/endBill/orderSettleAccounts", method = RequestMethod.POST)
  public ResultModel orderSettleAccounts(@ModelAttribute("json") JSONObject jsonObject) {
    JSONObject result = null;
    Map<String, String> map = JSONObject.parseObject(jsonObject.toJSONString(), Map.class);
    try {
      //进行支付处理
      String type = jsonObject.getString("type");
      Optional<OrderCreateToOrderPayTemplate> payTemplate = orderCreateToOrderPayTemplateList.stream()
        .filter(it -> it.support(type)).findFirst();

      if (payTemplate.isPresent()) {
        payTemplate.get().orderCreateAndPay(map);
      }
      return ResultModel.getErrorResult(400, "没有创建对应的订单类型");
    } catch (Exception e) {
      log.error("支付异常[{}]", e);
    }
    return ResultModel.getSuccessResult(result);
  }
}
