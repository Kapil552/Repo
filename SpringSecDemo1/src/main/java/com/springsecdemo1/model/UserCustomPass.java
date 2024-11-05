package com.springsecdemo1.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserCustomPass {

	//Data Members
	private String usrName;
	private String usrPass;
	
	//Method for custom generated password
	public String CustomGeneratedRandomPass() {
		
		//Random Class Object
		Random random=new Random();
		
		//To hold generated password
		String password="";
		
		//for generating alphanumeric password
		final String capitalLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String smallLetter="abcdefghijklmnopqrstuvwxyz";
		final String numericNumber="123456789";
		final String specialSymbol="@#";
		
		String alphaNumericPass=capitalLetter+smallLetter+numericNumber+specialSymbol;
		
		for(int i=0;i<8;i++) {
			password=password+alphaNumericPass.charAt(random.nextInt(alphaNumericPass.length()));
		}
		return password;
	}
	
	
}
