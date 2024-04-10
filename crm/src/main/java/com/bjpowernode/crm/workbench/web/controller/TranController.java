package com.bjpowernode.crm.workbench.web.controller;

import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjpowernode.crm.commons.contants.Contants;
import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.settings.domain.DicValue;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.DicValueService;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.workbench.service.CustomerService;
import com.bjpowernode.crm.workbench.service.TranService;

@Controller
public class TranController {

	@Autowired
	private DicValueService dicValueService;

	@Autowired
	private UserService userService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private TranService tranService;

	@RequestMapping("/workbench/transaction/index.do")
	public String index(HttpServletRequest request) {
		// 调用service层方法，查询动态数据
		List<DicValue> stageList = dicValueService.queryDicValueByTypeCode("stage");
		List<DicValue> transactionTypeList = dicValueService.queryDicValueByTypeCode("transactionType");
		List<DicValue> sourceList = dicValueService.queryDicValueByTypeCode("source");
		// 把数据保存到request
		request.setAttribute("stageList", stageList);
		request.setAttribute("transactionTypeList", transactionTypeList);
		request.setAttribute("sourceList", sourceList);

		// 请求转发
		return "workbench/transaction/index";
	}

	@RequestMapping("/workbench/transaction/toSave.do")
	public String toSave(HttpServletRequest request) {
		// 调用service层方法，查询动态数据
		List<User> userList = userService.queryAllUsers();
		List<DicValue> stageList = dicValueService.queryDicValueByTypeCode("stage");
		List<DicValue> transactionTypeList = dicValueService.queryDicValueByTypeCode("transactionType");
		List<DicValue> sourceList = dicValueService.queryDicValueByTypeCode("source");

		// 把数据保存到作用域request中
		request.setAttribute("userList", userList);
		request.setAttribute("stageList", stageList);
		request.setAttribute("transactionTypeList", transactionTypeList);
		request.setAttribute("sourceList", sourceList);

		// 请求转发
		return "workbench/transaction/save";
	}

	@RequestMapping("/workbench/transaction/getPossibilityByStage.do")
	public @ResponseBody Object getPossibilityByStage(String stageValue) {
		// 解析properties配置文件，根据阶段获取可能性
		ResourceBundle bundle = ResourceBundle.getBundle("possibility");
		String possibility = bundle.getString(stageValue);
		// 返回响应信息
		return possibility;
	}

	@RequestMapping("/workbench/transaction/queryCustomerNameByName.do")
	public @ResponseBody Object queryCustomerNameByName(String customerName) {

		// 调用service层方法，查询所有客户名称
		// List<String> customerNameList = customerService.queryAllCustomerName();
		List<String> customerNameList = customerService.queryCustomerNameByName(customerName);
		// 根据查询结果，返回响应信息
		return customerNameList;// ['xxxx','xxxxx',......
	}

	@RequestMapping("/workbench/transaction/saveCreateTran.do")
	public @ResponseBody Object saveCreateTran(@RequestParam Map<String, Object> map, HttpSession session) {
		// 封装数据
		map.put(Contants.SESSION_USER, session.getAttribute(Contants.SESSION_USER));

		// 根据处理结果，生成响应信息
		ReturnObject returnObject = new ReturnObject();
		try {
			// 调用service层方法，保存创建的交易
			tranService.saveCreateTran(map);
			returnObject.setCode(Contants.RETURN_OBJECT_CODE_SUCCESS);

		} catch (Exception e) {

			e.printStackTrace();
			returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
			returnObject.setMessage("系统忙，请稍后重试....");
		}

		return returnObject;
	}

}
