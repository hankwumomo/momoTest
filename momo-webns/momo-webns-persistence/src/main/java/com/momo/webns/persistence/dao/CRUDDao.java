package com.momo.webns.persistence.dao;

public interface CRUDDao {
	public <T> T create(T t);
    public <T> T find(Class<T> type,Object id);
    public <T> T update(T t);
    public <T> void delete(Class<T> type,Object id);
}
