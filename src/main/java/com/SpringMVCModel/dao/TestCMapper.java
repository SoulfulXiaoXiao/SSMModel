package com.SpringMVCModel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.SpringMVCModel.po.TestC;

/**
 * DAO
 * @author generation自动生成
 * $Date: 2015-09-01 10:19:26 
 */
public interface TestCMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(TestC testC);

    int insertSelective(TestC testC);

    List<TestC> selectByParam(@Param("testCVo")TestC testCVo);

    int updateByPrimaryKeySelective(TestC testC);

    int updateByPrimaryKey(TestC testC);
    
    int selectTestCCount(@Param("testCVo")TestC testCVo);
    
    TestC selectByPrimaryKey(Integer id);
      
}