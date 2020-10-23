package com.everis.reniec.controllers;

import com.everis.reniec.services.IReniecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReniecController {
	
	@Autowired
	private IReniecService iReniecService;
	
	@GetMapping("/external/reniec/validate")
	public String getNameEntity() {
		return iReniecService.isReniec();
		
	}
}
