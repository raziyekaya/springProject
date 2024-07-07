package com.springProject.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProject.springProject.entities.Kullanici;

@Repository
public interface KullaniciRepository extends JpaRepository<Kullanici, Long>{

	//Kullanici save(Kullanici kullanici);


}
