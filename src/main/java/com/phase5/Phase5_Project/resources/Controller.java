package com.phase5.Phase5_Project.resources;


import org.springframework.web.bind.annotation.RequestMapping;


public class Controller {
	
	 @RequestMapping("/")
	  public String index() {
	    return "index.html";
	  }

}
