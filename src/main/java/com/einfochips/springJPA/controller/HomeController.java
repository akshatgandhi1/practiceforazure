package com.einfochips.springJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.springJPA.dao.moviedao;
import com.einfochips.springJPA.model.movie;

@RestController
public class HomeController {
	
	@Autowired
	moviedao md;
	
	@RequestMapping("/")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	@RequestMapping("addmovie")
	public ModelAndView getmovie() {
		return new ModelAndView("addmovie");
	}
	@RequestMapping("insertmovie")
	public ModelAndView getaddmovie(@RequestParam String mname,String direc,String lang) {
		ModelAndView mv=new ModelAndView("movie_add");
		mv.addObject("value2", mname);
		mv.addObject("value3", direc);
		mv.addObject("value4", lang);
		movie m=new movie(5,mname,direc,lang);
	//usere dao
		md.save(m);
		
		
		return mv;
	}
	
	@RequestMapping("viewmovie")
	public ModelAndView getviewmovie() {
		ModelAndView mv=new ModelAndView("viewmovie");
		List<movie> li=md.findAll();
		mv.addObject("movies",li);		
		return mv;
	}
	
	@RequestMapping("updatebyid")
	public ModelAndView getupdatemovie(@RequestParam int mid) {
		
		movie m=md.getById(mid);
		ModelAndView mv=new ModelAndView("update");
		mv.addObject("value1", m);
		return mv;
	}
	
	
	
	@RequestMapping("update")
	public ModelAndView getupdate(@RequestParam int mid,String mname,String direc,String lang) {
		
		ModelAndView mv=new ModelAndView("success");
		mv.addObject("value1", mid);
		mv.addObject("value2", mname);
		mv.addObject("value3", direc);
		mv.addObject("value4", lang);
		movie m=new movie(mid,mname,direc,lang);
	//usere dao
		md.save(m);
		
		
		return mv;
	}
	
	@RequestMapping("viewbylanguage")
	public ModelAndView getlanguage(@RequestParam String lang) {
		ModelAndView mv=new ModelAndView("viewbylanguage");
		List<movie> li=md.findBylanguage(lang);
		mv.addObject("movies", li);
		mv.addObject("lang", lang);
		return mv;
	}
	
	
	
}
