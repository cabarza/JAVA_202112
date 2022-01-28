package cl.codingdojo.asce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cities")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column(columnDefinition = "char(35)", length = 35)
	private String name;
	
	@Column(columnDefinition = "char(3)", length = 3)
	private String countryCode;
	
	@Column(columnDefinition = "char(20)", length = 20)
	private String district;
	
	private Integer population;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
}
