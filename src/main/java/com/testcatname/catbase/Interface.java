package com.testcatname.catbase;

import java.util.Scanner;

import com.testcatname.catsbase.model.Cat;

public class Interface  {

	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		System.out.println("Give cats name: ");
		String name = getUserInput();
		System.out.println("Give cat guardians name");
		String guardianName = getUserInput();
		System.out.println("Ty");
		
		cat.setName(name);
		cat.setGuardianName(guardianName);
		
			
	}

	public static String getUserInput() {
		return sc.nextLine().trim();
	}
	

}
