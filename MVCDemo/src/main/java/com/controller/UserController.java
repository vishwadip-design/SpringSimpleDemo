package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/add")
	public ModelAndView addData(HttpServletRequest request,HttpServletResponse response)
	{	
		System.out.println("welcome to first page");
		
		int i = Integer.parseInt(request.getParameter("t1"));
		
		System.out.println("value of i:"+i);
		
		int j = Integer.parseInt(request.getParameter("t2"));
		
		System.out.println("value of j:"+j);
		
		int k = i + j;
		
		System.out.println("addition is:"+k);
		
		ModelAndView view= new ModelAndView();
		
		view.setViewName("display.jsp");
		
		view.addObject("result", k);
		
		return view;
		//return "display.jsp";
	}
}
