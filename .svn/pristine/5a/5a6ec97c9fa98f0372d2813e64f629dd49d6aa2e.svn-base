package com.SpringMVCModel.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVCModel.dao.TestAMapper;
import com.SpringMVCModel.po.TestA;
import com.SpringMVCModel.po.PageView;
import com.SpringMVCModel.service.TestAService;

/**
 * 
 * @author generation自动生成
 * $Date: 2015-09-01 10:19:26 
 */
@Service
public class TestAServiceImpl implements TestAService {

@Autowired
  TestAMapper testAmapper;
	
	public Boolean addTestA(TestA testAVo) {
		return testAmapper.insert(testAVo) > 0 ? true:false;
	}

	public TestA findTestAById(Integer id) {
		return testAmapper.selectByPrimaryKey(id);
	}

	public Boolean editTestA(TestA testAVo) {
		return testAmapper.updateByPrimaryKeySelective(testAVo)>0?true:false;
	}

	public Boolean deleteTestAById(Integer id) {
		return testAmapper.deleteByPrimaryKey(id)>0?true:false;
	}

	public PageView<TestA> findTestAByParamPageView(TestA testAVo) {
		PageView<TestA> pageView = new PageView<TestA>();

		pageView.setPageNum(testAVo.getPageNum());

		pageView.setPageSize(testAVo.getPageSize());

		testAVo.setPageNum(testAVo.getPageNum()
				* testAVo.getPageSize());

		List<TestA> list = testAmapper.selectByParam(testAVo);

		pageView.setList(list);

		int total = testAmapper.selectTestACount(testAVo);

		pageView.setTotal(total);

		return pageView;
	}

}
