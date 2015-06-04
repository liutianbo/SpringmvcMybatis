package com.ltb.tmp.mapper;

import com.ltb.tmp.entity.Test;

public interface TestMapper {
	Test getbyid(String id);
	
	void addOne(Test t);
}
