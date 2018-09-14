package org.study.shop.web;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
	(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DataSourceTest {

	private static final Logger logger = LoggerFactory.getLogger(DataSourceTest.class);
	@Autowired
	private DataSource ds;
	
	@Test
	public void testConnection() throws Exception {
		logger.info(ds.getConnection().toString());
		Assert.assertNotNull(ds.getConnection());
	}
	
}
