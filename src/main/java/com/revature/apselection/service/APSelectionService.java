package com.revature.apselection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.apselection.repo.APSelectionRepo;
import com.revature.apselection.util.TimeInWords;

@Service
public class APSelectionService {
	private APSelectionRepo apsr;
	
	@Autowired
	public void setAPSelectionRepo(APSelectionRepo apsr) {
		this.apsr = apsr;
	}

	public String getTimeInWords(int h, int m) {
		return TimeInWords.timeInWords(h,m);
	}
	
//	public List<Hero> getHeroes(){
//		System.out.println("getHeroes()");
//		return shr.findAll();
//	}

}
