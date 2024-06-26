package com.bjpowernode.crm.workbench.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjpowernode.crm.workbench.domain.TranRemark;
import com.bjpowernode.crm.workbench.mapper.TranRemarkMapper;
import com.bjpowernode.crm.workbench.service.TranRemarkService;

@Service("tranRemarkService")
public class TranRemarkServiceImpl implements TranRemarkService {

	@Autowired
	private TranRemarkMapper tranRemarkMapper;

	@Override
	public List<TranRemark> queryTranRemarkForDetailByTranId(String tranId) {

		return tranRemarkMapper.selectTranRemarkForDetailByTranId(tranId);
	}

}
