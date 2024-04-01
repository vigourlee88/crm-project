package com.bjpowernode.crm.workbench.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjpowernode.crm.workbench.domain.ClueActivityRelation;
import com.bjpowernode.crm.workbench.mapper.ClueActivityRelationMapper;
import com.bjpowernode.crm.workbench.service.ClueActivityRelationService;

@Service("clueActivityRelationService")
public class ClueActivityRelationServiceImpl implements ClueActivityRelationService {

	@Autowired
	private ClueActivityRelationMapper clueActivityRelationMapper;

	@Override
	public int saveCreateClueActivityRelationByList(List<ClueActivityRelation> list) {

		return clueActivityRelationMapper.insertClueActivityRelationByList(list);
	}

}
