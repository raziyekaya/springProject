package com.springProject.springProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject.springProject.entities.Kullanici;
import com.springProject.springProject.repositories.KullaniciRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KullaniciService {

	final KullaniciRepository kullaniciRepository;
	

	public Kullanici kaydet(Kullanici kullanici) {
		return kullaniciRepository.save(kullanici);
	}

}
