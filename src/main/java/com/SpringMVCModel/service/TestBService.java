package com.SpringMVCModel.service;

import com.SpringMVCModel.po.TestB;

import com.SpringMVCModel.po.PageView;

/**
 * 
 * @author generation自动生成
 * $Date: 2015-09-01 10:19:26 
 */
public interface TestBService {
	public Boolean addTestB(TestB testBVo);

	public TestB findTestBById(Integer id);
	
	public Boolean editTestB(TestB testBVo);
	
	public Boolean deleteTestBById(Integer id);
	
	public PageView<TestB> findTestBByParamPageView(TestB testBVo);
}