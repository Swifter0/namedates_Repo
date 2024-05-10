package hm.sb_namedates_mvc_Homework1.dto;

import java.util.List;

public class NameDateListDto {

	private List<NameDateDto> nameDates;
	

	public NameDateListDto(List<NameDateDto> nameDates) {
		super();
		this.nameDates = nameDates;
	}
	
	public List<NameDateDto> getNameDates() {
		return nameDates;
	}

	public void setNameDates(List<NameDateDto> nameDates) {
		this.nameDates = nameDates;
	}
	
}
