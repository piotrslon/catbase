package com.testcatname.catbase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.testcatname.catsbase.model.Cat;

public class Interface  {

	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		
		
		System.out.println("Give cats name: ");
		cat.setName(getUserInput());
		
		do {
		    try {
				System.out.println("Give cat born date");
				cat.setBirthDate(sdf.parse(getUserInput()));
			} catch (ParseException pe) {
				System.out.println("Smf wrong with dataformat, eg. 'dd.MM.yyyy'");
			}
		} while (cat.getBirthDate() == null);
		
		do {
			try {
				System.out.println("Give cat weight: eg. '4.56'");
				cat.setWeight(Float.valueOf(getUserInput()));
			} catch (NumberFormatException nfe) {
				//nfe.printStackTrace();
				System.out.println("Smf wrong with weightformat, eg. '4.56'");
			} 
		} while (cat.getWeight() == null);
		
		System.out.println("Give cat guardians name");
		cat.setGuardianName(getUserInput());
		
		System.out.println(cat.tellYourName());
		
	}

	public static String getUserInput() {
		return sc.nextLine().trim();
	}
	
}
