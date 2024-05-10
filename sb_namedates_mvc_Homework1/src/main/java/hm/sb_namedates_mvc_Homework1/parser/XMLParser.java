package hm.sb_namedates_mvc_Homework1.parser;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.springframework.stereotype.Repository;

import hm.sb_namedates_mvc_Homework1.dto.NameDateDto;

@Repository
public class XMLParser {

	public List<NameDateDto> getNameDates(String xmlFormatNameDates) throws JDOMException, IOException {
		
		List<NameDateDto> nameDateDtos = new ArrayList<>();
		
		SAXBuilder sb = new SAXBuilder();
		StringReader reader = new StringReader(xmlFormatNameDates);
		Document doc = sb.build(reader);
		
		Element rootElement = doc.getRootElement();
		List<Element> nameDayElements = rootElement.getChildren("namedate");
		
		for(int index = 0; index < nameDayElements.size(); index++) {
			
			Element currentNameDayElement = nameDayElements.get(index);
			NameDateDto CurrentNameDateDto = new NameDateDto(
					currentNameDayElement.getValue(),
					currentNameDayElement.getAttributeValue("date")
					);
			nameDateDtos.add(CurrentNameDateDto);
		}
		
		return nameDateDtos;
	}

	
	
	
	
}
