package com.stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("/")
	public String show()
	{
		return "welcome";
	}
	
	@GetMapping("/show/{name}")
	public String show1(@PathVariable String name)
	{
		return "welcome" +name;
	}
}
