package cl.codingdojo.clase.oop;

public class Clase1 {
	
	private String att1;
	private Integer att2;
	
	public Clase1() {
		
	}
	
	public Clase1(String att1, Integer att2) {
		this.att1 = att1;
		this.att2 = att2;
	}
	
	
	
	public String getAtt1() {
		return this.att1;
	}
	
	public void setAtt1(String att1) {
		this.att1 = att1;
	}


	public Integer getAtt2() {
		return att2;
	}


	public void setAtt2(Integer att2) {
		this.att2 = att2;
	}
	
	@Override
	public String toString() {
		return "Att1: " + att1 + ", Att2: " + att2;
	}

}
