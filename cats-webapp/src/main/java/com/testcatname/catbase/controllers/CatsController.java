package com.testcatname.catbase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testcatname.catbase.DAO.CatDAO;
import com.testcatname.catsbase.model.Cat;

@Controller
public class CatsController {
	
	@Autowired
	private CatDAO catDao;
	
	@RequestMapping("/")
	public String start (Model model) {
		
		return "start";
	}
	
	/*@RequestMapping("/start")
	//@RequestMapping(value = "/start", method = RequestMethod.GET)
	//public String start(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
	public String start(Model model) {
		
		model.addAttribute("name", catDao.getCats().get(0).getName());
		// returns the view name
		return "start";
	}*/
	
	@RequestMapping("/cats/add")
	public String addCats () {
		
		return "/cats/add";
	}
	
	@RequestMapping("/cats/show")
	public String showCats (Model model) {
		
		String empty = "Catbase is empty";
		List<Cat> catList = null;
		
		if (catDao.getCats().size() != 0) {
			catList = catDao.getCats();
			model.addAttribute("name", catList);
		}
		model.addAttribute("name", empty);
		
		return "/cats/show";
	}
	
	@RequestMapping("/cats/{name}")
    public String catsName(@PathVariable("name") String catName) {
        
		catDao.getCats().get(0).setName(catName);
		
		return "start";
    }
	
}
