package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatengine;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatengineService;

@Controller
public class BoatengineController {
	@Autowired
	private BoatengineService service;
	
	@GetMapping("/")
	public String viewEngine(Model model) {
		List<Boatengine> li	 = service.getAllBoatengine();
		model.addAttribute("boatenginelist", li);
		return "boatenginelist";
	}
	

	@RequestMapping("/boatengineslist")
	public ModelAndView firstMethod() {
		return new ModelAndView("boatengineslist");
	}	
	
	
	@RequestMapping("/boatessentialslist")
	public ModelAndView secondMethod() {
		return new ModelAndView("boatessentialslist");
	}	
	
	@RequestMapping("/boateventlist")
	public ModelAndView thirdMethod() {
		return new ModelAndView("boateventlist");
	}	
	@RequestMapping("/boatlocationlist")
	public ModelAndView fourthMethod() {
		return new ModelAndView("boatlocationlist");
	}	
	@RequestMapping("/boatloglist")
	public ModelAndView fivthMethod() {
		return new ModelAndView("boatloglist");
	}	
	@RequestMapping("/boatsensorlist")
	public ModelAndView sixthMethod() {
		return new ModelAndView("boatsensorlist");
	}	
}
