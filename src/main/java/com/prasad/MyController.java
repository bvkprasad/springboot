package com.prasad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@ResponseBody
	@RequestMapping("/hi")
	public String sayHi() {
		return "Hello World!!";
	}
}
