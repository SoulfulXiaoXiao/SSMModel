package com.SpringMVCModel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.SpringMVCModel.po.TestA;

/**
 * DAO
 * @author generation自动生成
 * $Date: 2015-09-01 10:19:26 
 */
public interface TestAMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(TestA testA);

    int insertSelective(TestA testA);

    List<TestA> selectByParam(@Param("testAVo")TestA testAVo);

    int updateByPrimaryKeySelective(TestA testA);

    int updateByPrimaryKey(TestA testA);
    
    int selectTestACount(@Param("testAVo")TestA testAVo);
    
    TestA selectByPrimaryKey(Integer id);
      
}