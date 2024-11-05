package com.springhibernateannotdemo.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.springhibernateannotdemo.pojo.Product;

@Configuration
@ComponentScan(basePackages = 
"com.springhibernateannotdemo.daoimpl")
public class SpringConfig {

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = 
				new DriverManagerDataSource();
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setUrl("jdbc:mysql://localhost:3306/20thaprilj2ee?useSSL=false");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactoryBean() {
		LocalSessionFactoryBean sf = 
				new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
		sf.setAnnotatedClasses(Product.class);
		Properties props = new Properties();
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "validate");
		return sf;
	}
}
