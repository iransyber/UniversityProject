package br.com.systemsdevelopment.controllers;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.systemdevelopment.model.Livro;
import br.com.systemsdevelopment.daos.LivroDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Transactional
public class LivroController {
	
	@Autowired
	private LivroDAO context;
	
	@RequestMapping("/livro")
	public String Livro(){
		return ("livro");
	}
	
	@RequestMapping("/salvarlivro")
	public String SalvarLivro(Livro livro){
		context.salvar(livro);
		return ("paginaconfirmacao");
	}
	
	@RequestMapping("/removerLivro")
	public String RemoverLivro(int idLivro){
		context.remover(idLivro);
		return ("exclusoes");
	}
	
}
