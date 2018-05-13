package com.momo.webns.persistence.dao;

import org.springframework.stereotype.Repository;

import com.momo.webns.service.api.config.SpringQualifier;

@Repository(SpringQualifier.TUSER_DAO)
public class TuserDaoImpl  extends CRUDDaoImpl implements TuserDao {

}
