package com.springsecdemo1.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springsecdemo1.model.UserCustomPass;

@SpringBootApplication
public class CustomPasswordGeneratorApp {

	public static void main(String[] args) {
		
		SpringApplication.run(CustomPasswordGeneratorApp.class, args);
		
		UserCustomPass pass=new UserCustomPass();
		
		System.out.println("\t Generated Password:" +pass.CustomGeneratedRandomPass());

	}

}
