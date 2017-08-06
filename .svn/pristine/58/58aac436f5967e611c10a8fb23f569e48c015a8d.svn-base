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

import com.SpringMVCModel.po.TestA;
import com.SpringMVCModel.service.TestAService;

@Controller
@RequestMapping("/testa")
public class TestAController {
	@Autowired
	private TestAService testAservice;
	
	@RequestMapping(value="/findTestAByPage",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> findTestAByParamPageView(@RequestBody TestA testA){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testAservice.findTestAByParamPageView(testA));
		return map;
	}
	
	@RequestMapping(value="/addTestA",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> addTestA(@RequestBody TestA testAVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testAservice.addTestA(testAVo));
		return map;
	}
	                        
	@RequestMapping(value="/findTestAById",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> findTestAById(@RequestBody TestA testAVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testAservice.findTestAById(testAVo.getId()));
		return map;
	}
	
	@RequestMapping(value="/editTestA",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> editTestA(@RequestBody TestA testAVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testAservice.editTestA(testAVo));
		return map;
	}
	
	@RequestMapping(value="/deleteTestA",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> deleteTestA(@RequestParam Integer id){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testAservice.deleteTestAById(id));
		return map;
	}
	
	@RequestMapping(value="/index")
	public ModelAndView index(){
		return new ModelAndView("/testA/index");
	}
	@RequestMapping(value="/add")
	public ModelAndView add(){
		return new ModelAndView("/testA/add");
	}
	@RequestMapping(value="/edit")
	public ModelAndView edit(){
		return new ModelAndView("/testA/edit");
	}
	@RequestMapping(value="/detail")
	public ModelAndView detail(){
		return new ModelAndView("/testA/detail");
	}
}
