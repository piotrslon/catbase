package com.testcatname.catbase.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.testcatname.catsbase.model.Cat;

@Repository
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
	
	public String tellYourName(int index){
		return "\nThis cat names: " +cats.get(index).getName()+ "\nhe born in: " +cats.get(index).getBirthDate()+"\nhis weight is: "+cats.get(index).getWeight()+"\nand his guargian name is: "+cats.get(index).getGuardianName();
	}

}
