package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.systemdevelopment.model.Categoria;
import br.com.systemsdevelopment.daos.CategoriaDAO; 
@Controller
@Transactional
public class CategoriaController {

	@Autowired
	private CategoriaDAO context;
	
	@RequestMapping("/categorianovo")
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
	
	@RequestMapping("/categorias")
	public ModelAndView Listar() {
		ModelAndView modelv = new ModelAndView("categorias");
		modelv.addObject("categoriaslista", context.ListarCategorias());
		return modelv;
	}
	
	@RequestMapping("/editacategoria")
	public String editarCategoria(Categoria categoria) {
		context.EditarCategoria(categoria);
		return "categoriaslista";
	}	
	
	@RequestMapping("/categoriabyid")
	public ModelAndView CatById(int codigo) {
		ModelAndView modelv = new ModelAndView("categoriaeditar");
		modelv.addObject("categoriaeditar", context.CategoriaById(codigo));
		return modelv;
	}
}
