package com.momo.webns.persistence.dao;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.momo.webns.persistence.domain.funbon.Tuser;
import com.momo.webns.service.api.config.SpringQualifier;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest//(classes = Tutorial2Application.class)
public class TuserDaoImplTest {
	
	@Autowired
	@Qualifier(SpringQualifier.TUSER_DAO)
	private TuserDaoImpl dao;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFind() {
		Tuser tuser = dao.find(Tuser.class, "00135");
		System.out.println(tuser.toString());
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
