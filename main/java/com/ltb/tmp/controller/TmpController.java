package com.ltb.tmp.controller;

import java.util.logging.Logger;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ltb.tmp.entity.Test;
import com.ltb.tmp.mapper.TestMapper;

@Controller
public class TmpController {
	private static Logger logger = Logger.getLogger("TmpController.class");
	@Resource
	private TestMapper testMapper;
	
	@RequestMapping(value="test.do")
	@ResponseBody
	@Transactional(rollbackFor=Exception.class)
	public String test(){
		Test t = testMapper.getbyid("1");
		Test ad = new Test();
		ad.setAge(20);
		ad.setId(4);
		ad.setName("ceshi");
		testMapper.addOne(ad);
		logger.info("this is a log");
		return t.getName();
	}
}
