package com.testcatname.catbase.controllers;

import java.text.ParseException;
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
	public String start (Model model) throws ParseException {
		
		catDao.initCats();
		
		//model.addAttribute("name", catDao.getCats().get(0).getName());
		
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
	public String showCats (Model model) throws ParseException {
		
		if (catDao.getCats().size() <1) catDao.initCats();
		String empty = "Catbase is empty";
		List<Cat> catList = null;
		
		if (catDao.getCats().size() != 0) {
			catList = catDao.getCats();
			model.addAttribute("cats", catList);
			model.addAttribute("name", catList.get(0).getName());
		}
		else model.addAttribute("cats", empty);
		
		return "/cats/show";
	}
	
	@RequestMapping("/cats/show/{id}")
    public String catDetails(@PathVariable("id") Integer id, Model model) {
        
		Cat cat = catDao.getCats().get(id);
		model.addAttribute("cat", cat);
		
		
		return "/cats/show";
    }
	
}
