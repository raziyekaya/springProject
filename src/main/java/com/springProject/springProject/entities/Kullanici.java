package com.springProject.springProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
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
	public Long getKid() {
		return kid;
	}
	public void setKid(Long kid) {
		this.kid = kid;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	

}
