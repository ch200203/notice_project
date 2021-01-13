package com.koo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.koo.service.MainService;

@Controller
public class MainController {

	@Autowired
	private MainService service;
	
	@RequestMapping("/mainPage.do")
	public ModelAndView mainPage() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/mainPage");
		return mav;
	}
	
	@RequestMapping("/mainYoo.do")
	public ModelAndView mainYo0() {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", "yoo");
		
		service.mainList(map);
		
		
		return mav;
	}
	
	@RequestMapping("/mainKoo.do")
	public ModelAndView mainKoo() {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", "koo");
		
		service.mainList(map);
		
		return mav;
	}
	
	@RequestMapping("/mainBoard.do")
	public String mainBoard() {
		return "/test/board_list";
	}

	

	public static void main(String[] args) {
		
	}
	
}
