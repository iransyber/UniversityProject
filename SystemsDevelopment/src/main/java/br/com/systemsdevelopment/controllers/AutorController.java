package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.systemdevelopment.model.Autor;
import br.com.systemsdevelopment.daos.AutorDAO; 

@Controller
@Transactional
public class AutorController {

	@Autowired
	private AutorDAO context;
	
	@RequestMapping("/autornovo")
	public String autor(){
		return "autor";
	}
	
	@RequestMapping("/salvarautor")
	public String SalvarAutor(Autor autor){
		context.salvar(autor);
		return "paginaconfirmacao";
	}
	
	@RequestMapping("/removerautor")
	public String RemoverAutor(int idAutor){
		context.remover(idAutor);
		return "exclusoes";
	}
	
	@RequestMapping("/editarautor")
	public String editarAutor(Autor autor) {
		context.EditarAutor(autor);
		return "redirect:autores";
	}
	
	@RequestMapping("/autores")
	public ModelAndView Listar() {
		ModelAndView modelv = new ModelAndView("autores");
		modelv.addObject("autoreslista", context.ListarAutores());
		return modelv;
	}	
	
	@RequestMapping("/autorbyid")
	public ModelAndView CatById(int codigo) {
		ModelAndView modelv = new ModelAndView("autoreditar");
		modelv.addObject("autoreditar", context.AutorById(codigo));
		return modelv;
	}
}
