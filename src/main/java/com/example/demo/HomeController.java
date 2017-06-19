
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	  @RequestMapping("/")
	   public String index(Model model) {
		  model.addAttribute("message", "HELLO!");
	   return "hello";
	    }
	  @RequestMapping("/login")
	  public String login() {
	      return "login";
	  }
	}
