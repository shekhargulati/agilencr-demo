package com.todo.config;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class ApplicationConfigTest {

	@Test
	public void shouldCreteEntityManager() {
		ApplicationConfig config  = new ApplicationConfig();
		LocalContainerEntityManagerFactoryBean entityManagerFactory = config.entityManagerFactory();
		assertNotNull(entityManagerFactory);
	}

}
