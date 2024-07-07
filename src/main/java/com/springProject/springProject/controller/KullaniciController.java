package com.springProject.springProject.controller;

import java.net.SocketTimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.springProject.entities.Kullanici;
import com.springProject.springProject.services.KullaniciService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class KullaniciController {
	
   private	final KullaniciService kullaniciService;
   
   @Autowired
   public KullaniciController(KullaniciService kullaniciService) {
	   this.kullaniciService=kullaniciService;
   }
   
   
   
   @PostMapping("kaydet")
   public Kullanici kaydet(@RequestBody Kullanici kullanici) {
	   System.out.println(kullanici);
	   
	   return kullaniciService.kaydet(kullanici);
   }

}
