package com.spring.jj9.mainpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.jj9.mainpage.service.MainpageService;

import lombok.extern.log4j.Log4j2;

@Log4j2
//@RequestMapping(value="/mainpage")
@Controller
public class MainpageController {
	
	@Autowired
	private MainpageService service;

	
	@GetMapping(value="/mainpage")
	public String mainpage(Model model) { //mainpage.jsp로 가는 메서드
		
		model.addAttribute("categorys", service.readMainCategory()); 
		
		return "mainpage/mainpage";
	}
	
}
