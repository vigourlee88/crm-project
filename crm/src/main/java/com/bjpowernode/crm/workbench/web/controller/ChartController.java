package com.bjpowernode.crm.workbench.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjpowernode.crm.workbench.domain.FunnelVO;
import com.bjpowernode.crm.workbench.service.TranService;

@Controller
public class ChartController {

	@Autowired
	private TranService tranService;

	@RequestMapping("/workbench/chart/transaction/index.do")
	public String index() {
		// 跳转页面
		return "workbench/chart/transaction/index";

	}

	@RequestMapping("/workbench/chart/transaction/queryCountOfTranGroupByStage.do")
	public @ResponseBody Object queryCountOfTranGroupByStage() {
		// 调用service层，查询数据
		List<FunnelVO> funnelVOList = tranService.queryCountOfTranGroupByStage();
		// 根据查询结果，返回响应信息
		return funnelVOList;
	}
}
