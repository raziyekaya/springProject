package com.springProject.springProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Getter
@Setter
public class Kullanici {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long kid;
//	@NotNull
//	@NotEmpty
//	@Column(unique = true, length = 100)
//	@Size(min = 1, max = 100)
	private String kullaniciAdi;
//	@NotNull
//	@NotEmpty
//	@Column(length = 100)
//	@Size(min = 4, max = 100)
	private String password;
//	@NotNull
//	@NotEmpty
//	@Column(length = 100)
//	@Size(min = 4, max = 100)
	private String adi;

	
	

}
