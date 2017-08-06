package com.SpringMVCModel.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVCModel.dao.TestCMapper;
import com.SpringMVCModel.po.TestC;
import com.SpringMVCModel.po.PageView;
import com.SpringMVCModel.service.TestCService;

/**
 * 
 * @author generation自动生成
 * $Date: 2015-09-01 10:19:26 
 */
@Service
public class TestCServiceImpl implements TestCService {

@Autowired
  TestCMapper testCmapper;
	
	public Boolean addTestC(TestC testCVo) {
		return testCmapper.insert(testCVo) > 0 ? true:false;
	}

	public TestC findTestCById(Integer id) {
		return testCmapper.selectByPrimaryKey(id);
	}

	public Boolean editTestC(TestC testCVo) {
		return testCmapper.updateByPrimaryKeySelective(testCVo)>0?true:false;
	}

	public Boolean deleteTestCById(Integer id) {
		return testCmapper.deleteByPrimaryKey(id)>0?true:false;
	}

	public PageView<TestC> findTestCByParamPageView(TestC testCVo) {
		PageView<TestC> pageView = new PageView<TestC>();

		pageView.setPageNum(testCVo.getPageNum());

		pageView.setPageSize(testCVo.getPageSize());

		testCVo.setPageNum(testCVo.getPageNum()
				* testCVo.getPageSize());

		List<TestC> list = testCmapper.selectByParam(testCVo);

		pageView.setList(list);

		int total = testCmapper.selectTestCCount(testCVo);

		pageView.setTotal(total);

		return pageView;
	}

}
