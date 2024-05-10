package hm.sb_namedates_mvc_Homework1.controller;

import java.io.IOException;

import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hm.sb_namedates_mvc_Homework1.dto.NameDateListDto;
import hm.sb_namedates_mvc_Homework1.service.AppService;

@Controller
public class AppController {

	private AppService service;

	@Autowired
	public AppController(AppService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getnamedates")
	public String getNamedays(Model model) throws JDOMException, IOException {
		
		NameDateListDto ndlDto = service.getNameDates();
		
		model.addAttribute("ndldto", ndlDto);
		
		return "namedates.html";
	}
	
	
}
