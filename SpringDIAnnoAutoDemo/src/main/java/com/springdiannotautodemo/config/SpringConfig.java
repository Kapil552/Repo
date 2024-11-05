package com.springdiannotautodemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springdiannotautodemo.entity.Car;
import com.springdiannotautodemo.impl.GlassDoor;
import com.springdiannotautodemo.impl.MetalDoor;
import com.springdiannotautodemo.impl.PlasticDoor;
import com.springdiannotautodemo.interfaces.Door;

@Configuration
@ComponentScan(basePackages = "com.springdiannotautodemo.impl,"
+ "com.springdiannotautodemo.entity")
public class SpringConfig {

}











