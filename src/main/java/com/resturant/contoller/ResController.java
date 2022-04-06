package com.resturant.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.resturant.entities.ClientUser;
import com.resturant.service.ResService;

@Controller
public class ResController
{
	@Autowired
	private ResService service;
	
	@GetMapping(value="/home")
	public String home()
	{
		return "home";
	}
	
	@PostMapping(value="/processform")
	public String add(@ModelAttribute ClientUser user)
	{
		if(user!=null) 
		{
			this.service.addDetails(user);	
		}
		
		return "success";
	}
	
	@PostMapping("/loginform")
	public String clientlogin(@RequestParam("email") String email,@RequestParam("password") String password, Model m)
	
	{
		
	int i=this.service.check(email,password);
	if(i>0) 
	{
		return "home"
	}

	}
}
