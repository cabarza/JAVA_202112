package cl.codingdojo.asce.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cl.codingdojo.asce.models.enums.ContinentEnum;

@Entity
@Table(name = "countries")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column(columnDefinition = "char(3)", length = 3)
	private String code;
	
	@Column(columnDefinition = "char(52)", length = 52)
	private String name;
	
	@Column(columnDefinition = "enum")
	private String continent;
	
	@Column(columnDefinition = "char(26)", length = 26)
	private String region;
	
	private Double surfaceArea;
	
	private Short indepYear;
	
	private Double lifeExpectancy;
	
	private Double gnp;
	
	private Double gnpOld;
	
	@Column(columnDefinition = "char(45)", length = 45)
	private String localName;
	
	@Column(columnDefinition = "char(45)", length = 45)
	private String governmentForm;
	
	@Column(columnDefinition = "char(60)", length = 60)
	private String headOfState;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "capital")
	private City capital;
	
	@Column(columnDefinition = "char(2)", length = 2)
	private String code2;
	
	@JsonIgnore
	@OneToMany(mappedBy = "country")
	private List<City> cities;
	
	@JsonIgnore
	@OneToMany(mappedBy = "country")
	private List<Language> languages;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(Double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public Short getIndepYear() {
		return indepYear;
	}

	public void setIndepYear(Short indepYear) {
		this.indepYear = indepYear;
	}

	public Double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(Double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Double getGnp() {
		return gnp;
	}

	public void setGnp(Double gnp) {
		this.gnp = gnp;
	}

	public Double getGnpOld() {
		return gnpOld;
	}

	public void setGnpOld(Double gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}
}
