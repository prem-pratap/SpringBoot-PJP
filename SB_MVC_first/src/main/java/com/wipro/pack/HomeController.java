package com.wipro.pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home()
	{
		System.out.println("hi");
		return "home";
		
	}
	
	@RequestMapping("login")
	public String login(HttpServletRequest req,HttpServletResponse res) {
		HttpSession session=req.getSession();
		String name=req.getParameter("uname");
		String password=req.getParameter("pwd");
		if(name.equals("Admin") && password.equals("Wipro@123")) {
			req.setAttribute("name", name);
			return "login";
		}
		else {
			req.setAttribute("msg", "Invalid Credentials !!! Please reenter");
			return "error";
		}
	}
		
		
		
	
	
	
}
