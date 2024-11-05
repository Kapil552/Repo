package com.springdiannotautodemo1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springdiannotautodemo1.impl,"
 + "com.springdiannotautodemo1.entity")
public class SpringConfig {
	
}
