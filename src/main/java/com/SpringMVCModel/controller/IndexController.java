package com.SpringMVCModel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class IndexController {

	@RequestMapping(value="/index")
	public ModelAndView index(){
		return new ModelAndView("/index");
	}
}