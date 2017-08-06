package com.SpringMVCModel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.SpringMVCModel.po.TestB;

/**
 * DAO
 * @author generation自动生成
 * $Date: 2015-09-01 10:19:26 
 */
public interface TestBMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(TestB testB);

    int insertSelective(TestB testB);

    List<TestB> selectByParam(@Param("testBVo")TestB testBVo);

    int updateByPrimaryKeySelective(TestB testB);

    int updateByPrimaryKey(TestB testB);
    
    int selectTestBCount(@Param("testBVo")TestB testBVo);
    
    TestB selectByPrimaryKey(Integer id);
      
}