package com.central.de.erros.codenation;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
public class IndexController {
	@Controller
			// TODO Auto-generated constructor stub
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}
