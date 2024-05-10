package hm.sb_namedates_rest_Homework1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hm.sb_namedates_rest_Homework1.database.Database;
import hm.sb_namedates_rest_Homework1.dto.XmlFormatDto;
import hm.sb_namedates_rest_Homework1.model.NameDate;
import hm.sb_namedates_rest_Homework1.parser.XMLParser;

@Service
public class AppService {

	private Database db;
	private XMLParser parser;
	
	@Autowired
	public AppService(Database db, XMLParser parser) {
		super();
		this.db = db;
		this.parser = parser;
	}

	public XmlFormatDto getNameDates() {
		
		XmlFormatDto xmlFormatDto = null;
		List<NameDate> nameDatesList = db.getNameDates();
		
		xmlFormatDto = parser.getNameDatesXmlFormat(nameDatesList);
		
		return xmlFormatDto;
	}

	
	
	
	
}
