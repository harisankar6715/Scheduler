package com.calcus.schedulerFrontEnd.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.calcus.scheduler.dao.UsersDAO;
import com.calcus.scheduler.model.Users;

@Controller
public class HomeController { 
	
	@Autowired
	Users users;
	
	@Autowired
	UsersDAO usersDAO; 
	
	
	@RequestMapping("/")
	public ModelAndView myfun1()
	{
	  ModelAndView mv=new ModelAndView("/home");
	  return mv;
	} 
	@RequestMapping("/loginhere")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("/login");
		mv.addObject("isUserClickedLoginHere", "true");
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("/register");
	
		mv.addObject("isUserClickedRegisterHere", "true");
		return mv;
	}	
	@RequestMapping(value = "registerme", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute Users users) {
	    usersDAO.saveOrUpdate(users);
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("successMessage", "You are successfully register");
		return "/home";
	}
	@RequestMapping("/login")
	public ModelAndView isValidUser(@RequestParam(value = "name") String Email,
			@RequestParam(value = "password") String password, HttpSession session) {
		ModelAndView mv = new ModelAndView("/info");
		boolean isValidUser = usersDAO.isValidUser(Email, password);
		if (isValidUser == true) {
			session.setAttribute("loggedInUser", users.getName());
			System.out.println(users.getName() + "logged in");
		}else {
		mv.addObject("invalidCredentials", "true");
		mv.addObject("errorMessage", "Invalid Credentials");
		}
	return mv;
	}
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("home");
		session.invalidate();
		session = request.getSession(true);
		mv.addObject("logoutMessage", "You successfully logged out");
		mv.addObject("loggedOut", "true");
		return mv;
	 }
}	
