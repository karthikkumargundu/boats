package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatlog;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatsensor;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatlogService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatsensorService;

@Controller
public class BoatsensorController {
	@Autowired
	private BoatsensorService service4;
	
	@GetMapping("/boatsensorlist")
	public String viewEngine(Model model) {
		List<Boatsensor> li1 = service4.getAllBoatsensor();
		model.addAttribute("boatsensorlist", li1);
		return "boatsensorlist";
	}
	
}

