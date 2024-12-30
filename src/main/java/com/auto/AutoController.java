package com.auto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

	@GetMapping(value = "/get")
	public String get() {
		return "Hello Sangeetha";
	}
}
