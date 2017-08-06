package com.SpringMVCModel.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVCModel.po.TestC;
import com.SpringMVCModel.service.TestCService;

@Controller
@RequestMapping("/testc")
public class TestCController {
	@Autowired
	private TestCService testCservice;
	
	@RequestMapping(value="/findTestCByPage",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> findTestCByParamPageView(@RequestBody TestC testC){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testCservice.findTestCByParamPageView(testC));
		return map;
	}
	
	@RequestMapping(value="/addTestC",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> addTestC(@RequestBody TestC testCVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testCservice.addTestC(testCVo));
		return map;
	}
	                        
	@RequestMapping(value="/findTestCById",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> findTestCById(@RequestBody TestC testCVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testCservice.findTestCById(testCVo.getId()));
		return map;
	}
	
	@RequestMapping(value="/editTestC",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> editTestC(@RequestBody TestC testCVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testCservice.editTestC(testCVo));
		return map;
	}
	
	@RequestMapping(value="/deleteTestC",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> deleteTestC(@RequestParam Integer id){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testCservice.deleteTestCById(id));
		return map;
	}
	
	@RequestMapping(value="/index")
	public ModelAndView index(){
		return new ModelAndView("/testC/index");
	}
	@RequestMapping(value="/add")
	public ModelAndView add(){
		return new ModelAndView("/testC/add");
	}
	@RequestMapping(value="/edit")
	public ModelAndView edit(){
		return new ModelAndView("/testC/edit");
	}
	@RequestMapping(value="/detail")
	public ModelAndView detail(){
		return new ModelAndView("/testC/detail");
	}
}
