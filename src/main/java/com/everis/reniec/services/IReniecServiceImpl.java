package com.everis.reniec.services;

import org.springframework.stereotype.Service;

import com.everis.reniec.entities.Reniec;

@Service
public class IReniecServiceImpl implements IReniecService {

	@Override
	public String isReniec() {
		
		Reniec reniec = new Reniec("Reniec");
		System.out.println(reniec.toString());
		
		return reniec.getEntityname();
	}

}
