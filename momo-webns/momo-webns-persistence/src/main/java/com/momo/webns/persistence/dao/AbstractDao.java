package com.momo.webns.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

public abstract class AbstractDao {
	
	@PersistenceContext//(type = PersistenceContextType.EXTENDED)
	protected EntityManager entityManager;

}
