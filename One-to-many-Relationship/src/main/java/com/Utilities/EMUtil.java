package com.Utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
		
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("faceUnit");
	}
	
	public static EntityManager provideConnection() {
		return emf.createEntityManager();
	}
}
