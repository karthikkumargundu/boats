package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatessentials;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatessentialsService;

@Controller
public class BoatessentialsController {
	@Autowired
	private BoatessentialsService service1;
	
	@GetMapping("/boatessentialslist")
	public String viewEngine(Model model) {
		List<Boatessentials> li1 = service1.getAllBoatessentials();
		model.addAttribute("boatessentialslist", li1);
		return "boatessentialslist";
	}
	
}
