package cl.codingdojo.asce.models.enums;

public enum ContinentEnum {
	ASIA("Asia"),
	EUROPE("Europe"),
	NORTH_AMERICA("North America"),
	AFRICA("Africa"),
	OCEANIA("Oceania"),
	ANTARTICA("Antarctica"),
	SOUTH_AMERICA("South America");
	
	private String name;
	
	private ContinentEnum(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public String toString() {
//		
//	}
	
//	public static ContinentEnum valueOf(String name) {
//		for(ContinentEnum ce: ContinentEnum.values()) {
//			if(ce.getName().equalsIgnoreCase(name)) {
//				return ce;
//			}
//		}
//		throw new IllegalArgumentException();
//	}
}
