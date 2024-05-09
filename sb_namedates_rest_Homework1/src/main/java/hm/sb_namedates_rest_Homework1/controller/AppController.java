package hm.sb_namedates_rest_Homework1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.sb_namedates_rest_Homework1.dto.XmlFormatDto;
import hm.sb_namedates_rest_Homework1.service.AppService;

@RestController
public class AppController {

	private AppService service;

	@Autowired
	public AppController(AppService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getnamedates")
	public XmlFormatDto getNameDates() {
		
		XmlFormatDto xmlFormatDto = null;
		
		xmlFormatDto = service.getNameDates();
		
		return xmlFormatDto;
	}
	
	
	
}
