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

import com.SpringMVCModel.po.TestB;
import com.SpringMVCModel.service.TestBService;

@Controller
@RequestMapping("/testb")
public class TestBController {
	@Autowired
	private TestBService testBservice;
	
	@RequestMapping(value="/findTestBByPage",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> findTestBByParamPageView(@RequestBody TestB testB){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testBservice.findTestBByParamPageView(testB));
		return map;
	}
	
	@RequestMapping(value="/addTestB",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> addTestB(@RequestBody TestB testBVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testBservice.addTestB(testBVo));
		return map;
	}
	                        
	@RequestMapping(value="/findTestBById",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> findTestBById(@RequestBody TestB testBVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testBservice.findTestBById(testBVo.getId()));
		return map;
	}
	
	@RequestMapping(value="/editTestB",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> editTestB(@RequestBody TestB testBVo){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testBservice.editTestB(testBVo));
		return map;
	}
	
	@RequestMapping(value="/deleteTestB",method=RequestMethod.POST,produces="application/json")
	public @ResponseBody Map<String,Object> deleteTestB(@RequestParam Integer id){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", testBservice.deleteTestBById(id));
		return map;
	}
	
	@RequestMapping(value="/index")
	public ModelAndView index(){
		return new ModelAndView("/testB/index");
	}
	@RequestMapping(value="/add")
	public ModelAndView add(){
		return new ModelAndView("/testB/add");
	}
	@RequestMapping(value="/edit")
	public ModelAndView edit(){
		return new ModelAndView("/testB/edit");
	}
	@RequestMapping(value="/detail")
	public ModelAndView detail(){
		return new ModelAndView("/testB/detail");
	}
}
