package com.bjpowernode.crm.workbench.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjpowernode.crm.workbench.domain.Clue;
import com.bjpowernode.crm.workbench.mapper.ClueMapper;
import com.bjpowernode.crm.workbench.service.ClueService;

@Service("clueService")
public class ClueServiceImpl implements ClueService {

	@Autowired
	private ClueMapper clueMapper;

	@Override
	public int saveCreateClue(Clue clue) {

		return clueMapper.insertClue(clue);
	}

}
