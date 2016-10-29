package com.dextraining.banco;

import javax.persistence.EntityManager;

import com.dextraining.Service.GenericService;
import com.dextraining.jpa.EntityManagerUtil;

public class BancoService extends GenericService<Banco> {

	public BancoService() {
		super(Banco.class);
		
	}

	

}