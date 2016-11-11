package br.com.systemsdevelopment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Transactional
public class AutorController {
	
	@RequestMapping("/autor")
	public String autor(){
		return "autor";
	}
	
}
