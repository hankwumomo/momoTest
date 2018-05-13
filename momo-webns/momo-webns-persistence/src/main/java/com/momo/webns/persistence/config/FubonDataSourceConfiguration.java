package com.momo.webns.persistence.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class FubonDataSourceConfiguration {

	/* ------------ Data Source Properties ------------- */
	@Bean
	@Primary
	@ConfigurationProperties("app.datasource.primary")
	public DataSourceProperties dataSourceProperties() {
	    return new DataSourceProperties();
	}
	
	
	/* ------------ Data Source using HikariCP ------------- */
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "app.datasource.primary.hikari")
	public DataSource dataSource() {
		return createDataSource(dataSourceProperties());
	}

	
	private DataSource createDataSource(DataSourceProperties properties) {
		return DataSourceBuilder.create(properties.getClassLoader()).type(HikariDataSource.class)
				.driverClassName(properties.determineDriverClassName())
				.url(properties.determineUrl())
				.username(properties.determineUsername())
				.password(properties.determinePassword())
				.build();
	}
	
	
}
