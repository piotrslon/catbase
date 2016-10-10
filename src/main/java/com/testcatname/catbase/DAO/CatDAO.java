package com.testcatname.catbase.DAO;

import java.util.ArrayList;
import java.util.List;

import com.testcatname.catsbase.model.Cat;

public class CatDAO {
	
	List<Cat> cats = new ArrayList<Cat>();
	
	public List<Cat> getCats() {
		return cats;
	}

	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}

	public void addCat(Cat cat) {
		cats.add(cat);
		System.out.println("Done, cats added to collection");
	}

}
