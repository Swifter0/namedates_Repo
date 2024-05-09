package hm.sb_namedates_rest_Homework1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hm.sb_namedates_rest_Homework1.database.Database;
import hm.sb_namedates_rest_Homework1.dto.XmlFormatDto;
import hm.sb_namedates_rest_Homework1.model.NameDate;

@Service
public class AppService {

	private Database db;

	@Autowired
	public AppService(Database db) {
		super();
		this.db = db;
	}

	public XmlFormatDto getNameDates() {
		
		XmlFormatDto xmlFormatDto = null;
		List<NameDate> nameDatesList = db.getNameDates();
		
		System.out.println(nameDatesList);
		
		return xmlFormatDto;
	}
	
	
	
}
