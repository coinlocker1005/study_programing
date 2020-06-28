package com.ito.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


@Controller
public class HelloController {
   
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}

    @RequestMapping("/other")
	public String other() {
			
    	return "redirect:/";
    }

    @RequestMapping("/home")
    public String home() {
    	return "forward:/";
    }
}


