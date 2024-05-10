package hm.sb_namedates_mvc_Homework1.dto;

public class NameDateDto {

	private String name;
	private String date;
	
	
	public NameDateDto(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
}
