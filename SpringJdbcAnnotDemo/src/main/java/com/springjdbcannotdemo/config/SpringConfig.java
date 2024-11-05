package com.springjdbcannotdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbcannotdemo.dao.ProductDao;
import com.springjdbcannotdemo.daoimpl.ProductDaoImpl;

@Configuration
public class SpringConfig {

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = 
				new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/"
				+ "20thaprilj2ee?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jTemplate = new JdbcTemplate();
		jTemplate.setDataSource(getDataSource());
		return jTemplate;
	}
	
	@Bean(name = "daoImpl")
	public ProductDao getDaoImpl() {
		ProductDaoImpl daoImpl = new ProductDaoImpl();
		daoImpl.setjTemplate(getJdbcTemplate());
		return daoImpl;
	}
}
