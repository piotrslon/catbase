package com.testcatname.catsbase.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Cat {
	
	private String name;
	private Date today;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	//System.out.println(sdf.format(date))
	private double weight;
	private String guardianName;
	
	public String tellYourName(){
		return "This cat names" +name+ "he born in" +(sdf.format(today))+"his weight is"+weight+"and his guargian name is"+guardianName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

}
