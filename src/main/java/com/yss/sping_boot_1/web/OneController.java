package com.yss.sping_boot_1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class OneController {
	
	@GetMapping("/a")
	public String hello() {
		return "helloworld";
	}

}
