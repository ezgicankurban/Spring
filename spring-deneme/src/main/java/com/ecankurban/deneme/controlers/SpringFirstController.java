package com.ecankurban.deneme.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringFirstController {
	
	@RequestMapping("/msg")//localhost da msg ye gidiyor.
	@ResponseBody//bu method bir responsedur diyoruz.
	
	public String getMessage() {
		return "İlk Spring controller Çağrımı gerçekleşti...";
		
	}
	
	@RequestMapping("/name")
	@ResponseBody
	public ModelAndView getOwnerName() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("ownern","Ezgi CANKURBAN");
		mav.setViewName("owner");
		
		return mav;
	}

}
