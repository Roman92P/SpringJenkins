package com.pashkov.SpringAppRoman.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewHelloWorld {
	
	@GetMapping(path="/hello")
	@ResponseBody
	public String viewHello() {
		return "Hello From Jenkins Spring app";
	}

}
