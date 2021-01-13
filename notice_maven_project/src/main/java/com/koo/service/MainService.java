package com.koo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.koo.mapper.MainMapper;

@Service
public class MainService {
	
	@Autowired
	private MainMapper mapper;
	
	public ModelMap mainList(Map<String, Object> map) {
		ModelMap modelMap = new ModelMap();
		
		return modelMap;
	}
	
}
