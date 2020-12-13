package com.codingdojo.lookify.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.lookify.models.Lookify;
import com.codingdojo.lookify.service.LookifyService;

@Controller
public class LookifyController {
	@Autowired
	private LookifyService lookifyService;
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";	
	}
	@RequestMapping("/dash")
	public String dash(Model model) {
		List<Lookify> lookify = lookifyService.all();
		model.addAttribute("lookify", lookify);
		return "dash.jsp";	
	}
	@RequestMapping("/addnew")
	public String addnewh() {
		return "addnew.jsp";	
	}
	@RequestMapping("/top")
	public String top(Model model) {
		List<Lookify> lookify = lookifyService.findAllByRating();
		ArrayList<Lookify> topten = new ArrayList<Lookify>();

		for(int i=0; i<lookify.size(); i++) {
			topten.add(lookify.get(i));
			if(i==9) {
				break;
			}
	}
		model.addAttribute("topten", topten);
		return "top.jsp";	
	}
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(@ModelAttribute("lookify") Lookify lookify, BindingResult result, Model model){
        if (result.hasErrors()) {
            return "addnew.jsp";
        } else {
            lookifyService.create(lookify);
            return "redirect:/dash";
        }
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id ) {
		lookifyService.delete(id);
		return "redirect:/dash";
	}
	@RequestMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Lookify lookify = lookifyService.find(id);
		model.addAttribute("lookify", lookify);
		return "show.jsp";
		
	}
	
}
