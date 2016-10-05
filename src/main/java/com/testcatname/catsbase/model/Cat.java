package com.testcatname.catsbase.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Cat {
	
	private String name = "Mila";
	private Date today = new Date(0);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	//System.out.println(sdf.format(date))
	private double weight = 3.14;
	private String guardianName = "Angleo";
	
	public String tellYourName(){
		return "This cat names" +name+ "he born in" +(sdf.format(today))+"his weight is"+weight+"and his guargian name is"+guardianName;
	}

}
