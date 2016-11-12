package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.systemdevelopment.model.Autor;
import br.com.systemsdevelopment.daos.AutorDAO;

@Controller
@Transactional
public class AutorController {

	@Autowired
	private AutorDAO context;
	
	@RequestMapping("/autor")
	public String autor(){
		return "autor";
	}
	
	@RequestMapping("/salvarautor")
	public String SalvarAutor(Autor autor){
		context.salvar(autor);
		return("paginaconfirmacao");
	}
	
	@RequestMapping("/removerautor")
	public String RemoverAutor(int idAutor){
		context.remover(idAutor);
		return("exclusoes");
	}
	
}
