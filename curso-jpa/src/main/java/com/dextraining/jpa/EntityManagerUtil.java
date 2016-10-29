package com.dextraining.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

	private static EntityManagerFactory factory;

	// Neste método ele controla se vai criar ou não o EntityManager
	public static EntityManager criarEntityMaganer() {

		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("CURSO_JPA");
		}
		return factory.createEntityManager(); // Neste retorno ele cria o
												// EntityManager

	}

	public static void fechar() {
		if (factory != null) {
			factory.close();
			factory = null;
		}
	}

}
