package com.example.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
/*
 * Step : 1 -> Add @Controller
 * RequestMapping -> I want different Pages with different requets, so I use 
 * 									RequestMapping.
 * From these controller is handling the Request.
 * 
 * Step : 2 -> return the  file, so it returns the data in web
 */
@Controller
public class HomeController {
	@RequestMapping("home")
		public String home(HttpServletRequest req) {
				HttpSession session = req.getSession();
				String name = req.getParameter("name");/*Here "name" suggests to the keyword such as 
				which is stated in url*/
				System.out.println("Hi home " + name);
				session.setAttribute("name", name);
				return "home";
		}
}
