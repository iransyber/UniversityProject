package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.systemdevelopment.model.Categoria;
import br.com.systemsdevelopment.daos.CategoriaDAO; 
@Controller
@Transactional
public class CategoriaController {

	@Autowired
	private CategoriaDAO context;
	
	@RequestMapping("/categoria")
	public String categoria(){
		return "categoria";
	}
	
	@RequestMapping("/salvarcategoria")
	public String SalvarCategoria(Categoria categoria){
		context.salvar(categoria);
		return "paginaconfirmacao";
	}
	
	@RequestMapping("/removercategoria")
	public String RemoverCategoria(int idCategoria){
		context.remover(idCategoria);
		return "exclusoes";
	}
}
