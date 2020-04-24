package com.revature.apselection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.apselection.service.APSelectionService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class APSelectionController {
	private APSelectionService apss;
	
	@Autowired
	public void setSpss(APSelectionService apss) {
		this.apss = apss;
	}
	
	@PostMapping("/time-to-words")
	@ResponseBody
	public String getTimeInWords(@RequestBody int h, @RequestBody int m) {
		System.out.println("Controller: getTimeInWords()");
		return apss.getTimeInWords(h, m);
	}
	
//	@GetMapping("/super-human")
//	public List<Hero> getHeroes(){
//		return shs.getHeroes();
//	}
}
