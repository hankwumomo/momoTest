package com.momo.webns.persistence.dao;

import org.springframework.stereotype.Repository;

import com.momo.webns.service.api.config.SpringQualifier;



@Repository(SpringQualifier.CRUD_DAO)
public class CRUDDaoImpl extends AbstractDao implements CRUDDao {


	@Override
	public <T> T create(T t) {
		entityManager.persist(t);
		entityManager.flush();
		entityManager.refresh(t);
		return t;
	}

	@Override
	public <T> T find(Class<T> type, Object id) {
		return (T) entityManager.find(type, id);
	}

	@Override
	public <T> T update(T t) {
		return (T) entityManager.merge(t);
	}

	@Override
	public <T> void delete(Class<T> type, Object id) {
		Object ref = entityManager.getReference(type, id);
		entityManager.remove(ref);
	}

}
