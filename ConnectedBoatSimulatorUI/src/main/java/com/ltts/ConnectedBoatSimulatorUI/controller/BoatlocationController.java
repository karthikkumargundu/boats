package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatlocation;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatlocationService;
@Controller
public class BoatlocationController {
	@Autowired
	private BoatlocationService service3;
	
	@GetMapping("/boatlocationlist")
	public String viewEngine(Model model) {
		List<Boatlocation> li3 = service3.getAllBoatlocation();
		model.addAttribute("boatlocationlist", li3);
		return "boatlocationlist";
	}
	
}