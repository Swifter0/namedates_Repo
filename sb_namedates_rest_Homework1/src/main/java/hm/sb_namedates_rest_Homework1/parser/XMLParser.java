package hm.sb_namedates_rest_Homework1.parser;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.springframework.stereotype.Repository;

import hm.sb_namedates_rest_Homework1.dto.XmlFormatDto;
import hm.sb_namedates_rest_Homework1.model.NameDate;

@Repository
public class XMLParser {

	public XmlFormatDto getNameDatesXmlFormat(List<NameDate> nameDatesList) {
		
		XmlFormatDto formatDto = null;
		
		XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
		Document doc = new Document();
		
		Element rootElement = new Element("namedates");
		
		for(int index = 0; index < nameDatesList.size(); index++) {
			
			NameDate currentNameDate = nameDatesList.get(index);
			Element currentNameDateElement = new Element("namedate");
			
			currentNameDateElement.setAttribute("date",currentNameDate.getDate());
			currentNameDateElement.setText(currentNameDate.getName());
			
			rootElement.addContent(currentNameDateElement);
		}
		
		doc.addContent(rootElement);
		String xmlFormat = outputter.outputString(doc);
		formatDto = new XmlFormatDto(xmlFormat);
		
		return formatDto;
	}

}
