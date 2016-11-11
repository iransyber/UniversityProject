package br.com.systemsdevelopment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.systemdevelopment.model.Categora;
import br.com.systemsdevelopment.daos.CategoriaDAO;

@Controller
public class CategoriaController {

	CategoriaDAO context = new CategoriaDAO();
	
	@RequestMapping("/categoria")
	public String categoria(){
		return "categoria";
	}
	
	@RequestMapping("/salvarcategoria")
	public String SalvarCategoria(Categora categoria){
		context.salvar(categoria);
		return "paginaconfirmacao";
	}
}
