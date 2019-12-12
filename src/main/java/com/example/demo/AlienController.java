package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
	@Autowired
	AlineRepo repo;

	@RequestMapping(value="/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping(value="/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		System.out.println("Added a repo");
		return "home.jsp";
	}
	
	@RequestMapping(value="/getAlien")
	public ModelAndView getAliens()
	{
		ModelAndView mv=new ModelAndView();
		List<Alien> alienList=repo.findAll();
		mv.addObject("alienList",alienList);
		mv.setViewName("fetch.jsp");
		return mv;
	}
	@RequestMapping(value="/fetchByName")
	public ModelAndView fetchByName(@RequestParam(value="name") String name)
	{
		ModelAndView mv=new ModelAndView();
		Iterable<Alien> alienList=repo.findByName(name);
		mv.addObject("alienList",alienList);
		mv.setViewName("fetch.jsp");
		return mv;
	}
	@RequestMapping(value="/sortedByName")
	public ModelAndView sortedByName()
	{
		ModelAndView mv=new ModelAndView();
		Iterable<Alien> alienList=repo.fetchBySortedNames();
		mv.addObject("alienList",alienList);
		mv.setViewName("fetch.jsp");
		return mv;
	}
	
	
	@RequestMapping(path="/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
	
	@PostMapping(value="/alien")
	@ResponseBody
	public Alien addAlieen(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
}
