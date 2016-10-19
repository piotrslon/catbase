package com.testcatname.catbase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testcatname.catbase.DAO.CatDAO;

@Controller
public class CatsController {
	
	@Autowired
	private CatDAO catDao;
	
	@RequestMapping("/start")
	//@RequestMapping(value = "/start", method = RequestMethod.GET)
	//public String start(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
	public String start(Model model) {
		
		System.out.println("Done");
		 
		model.addAttribute("name", catDao.getCats().get(0).getName());
		// returns the view name
		return "start";
	}
	
	@RequestMapping("/cats/add")
	public String addCats () {
		
		return "start";
	}
	
	@RequestMapping("/cats/show")
	public String showCats () {
		
		return "start";
	}
	
	@RequestMapping("/cats/{name}")
    public String catsName(@PathVariable("name") String catName) {
        
		catDao.getCats().get(0).setName(catName);
		
		return "start";
    }
	
}
