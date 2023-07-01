package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HOME1 {
	@RequestMapping("home1")
	public ModelAndView name(Alien alien, String Mynames) {
		ModelAndView mv = new ModelAndView();
		System.out.println("Luffy always says " + alien.getAname());
		mv.addObject("name", alien);
		mv.addObject("nam", Mynames);
		mv.setViewName("home1");
		System.out.println("Therefore Luffy always says " + Mynames );
		return mv;	
	}
}
