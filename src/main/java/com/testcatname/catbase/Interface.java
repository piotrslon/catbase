package com.testcatname.catbase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.testcatname.catsbase.model.Cat;

public class Interface  {

	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Pattern dataRexgex = Pattern.compile("[0-3]?[0-9].[0-1]?[0-9].([0-9]){4}");
		String bornDateSc;
		String catNameSc;
		boolean lit = true;
		
		do {
			System.out.println("Give cats name: ");
			catNameSc = getUserInput();
			lit = Pattern.matches("[a-zA-Z]+[0-9]*", catNameSc);
			if (lit) cat.setName(catNameSc);
		} while (!lit);
		
		do {
			System.out.println("Give cat born date in format 'dd.MM.yyyy'");
			bornDateSc = getUserInput();
			if(dataRexgex.matcher(bornDateSc).matches()) {
				try {
					cat.setBirthDate(sdf.parse(bornDateSc));
				} catch (ParseException pe) {
					System.out.println("Smf wrong with dataformat! example data: '01.01.2000'");
				}
			}
		} while (cat.getBirthDate() == null);
			
		do {
			try {
				System.out.println("Give cat weight: eg. '4.56'");
				cat.setWeight(Float.valueOf(getUserInput()));
			} catch (NumberFormatException nfe) {
				//nfe.printStackTrace();
				System.out.println("Smf wrong with weightformat '4.56'");
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
