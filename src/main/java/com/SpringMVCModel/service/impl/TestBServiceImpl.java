package com.SpringMVCModel.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVCModel.dao.TestBMapper;
import com.SpringMVCModel.po.TestB;
import com.SpringMVCModel.po.PageView;
import com.SpringMVCModel.service.TestBService;

/**
 * 
 * @author generation自动生成
 * $Date: 2015-09-01 10:19:26 
 */
@Service
public class TestBServiceImpl implements TestBService {

@Autowired
  TestBMapper testBmapper;
	
	public Boolean addTestB(TestB testBVo) {
		return testBmapper.insert(testBVo) > 0 ? true:false;
	}

	public TestB findTestBById(Integer id) {
		return testBmapper.selectByPrimaryKey(id);
	}

	public Boolean editTestB(TestB testBVo) {
		return testBmapper.updateByPrimaryKeySelective(testBVo)>0?true:false;
	}

	public Boolean deleteTestBById(Integer id) {
		return testBmapper.deleteByPrimaryKey(id)>0?true:false;
	}

	public PageView<TestB> findTestBByParamPageView(TestB testBVo) {
		PageView<TestB> pageView = new PageView<TestB>();

		pageView.setPageNum(testBVo.getPageNum());

		pageView.setPageSize(testBVo.getPageSize());

		testBVo.setPageNum(testBVo.getPageNum()
				* testBVo.getPageSize());

		List<TestB> list = testBmapper.selectByParam(testBVo);

		pageView.setList(list);

		int total = testBmapper.selectTestBCount(testBVo);

		pageView.setTotal(total);

		return pageView;
	}

}
