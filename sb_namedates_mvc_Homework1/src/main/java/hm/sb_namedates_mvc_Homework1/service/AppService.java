package hm.sb_namedates_mvc_Homework1.service;

import java.io.IOException;
import java.util.List;

import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import hm.sb_namedates_mvc_Homework1.dto.NameDateDto;
import hm.sb_namedates_mvc_Homework1.dto.NameDateListDto;
import hm.sb_namedates_mvc_Homework1.model.XmlFormat;
import hm.sb_namedates_mvc_Homework1.parser.XMLParser;

@Service
public class AppService {

	private XMLParser parser;

	@Autowired
	public AppService(XMLParser parser) {
		super();
		this.parser = parser;
	}

	public NameDateListDto getNameDates() throws JDOMException, IOException {
		
		NameDateListDto ndlDto = null;
		
		RestTemplate rt = new RestTemplate();
		XmlFormat xmlFormat = rt.getForObject("http://localhost:8081/getnamedates", XmlFormat.class);
		
		List<NameDateDto> nameDateDtos = parser.getNameDates(xmlFormat.getXmlFormatNameDates());
		
		ndlDto = new NameDateListDto(nameDateDtos);
		
		return ndlDto;
	}
	
	
	
}
