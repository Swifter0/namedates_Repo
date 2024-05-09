package hm.sb_namedates_rest_Homework1.dto;

public class XmlFormatDto {

	private String xmlFormatNameDates;

	public XmlFormatDto(String xmlFormatNameDates) {
		super();
		this.xmlFormatNameDates = xmlFormatNameDates;
	}

	public String getXmlFormatNameDates() {
		return xmlFormatNameDates;
	}

	public void setXmlFormatNameDates(String xmlFormatNameDates) {
		this.xmlFormatNameDates = xmlFormatNameDates;
	}

	@Override
	public String toString() {
		return "XmlFormatDto [xmlFormatNameDates=" + xmlFormatNameDates + "]";
	}
	
}
