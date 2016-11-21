package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.systemdevelopment.model.Editora;
import br.com.systemsdevelopment.daos.EditoraDAO;

@Controller
@Transactional
public class EditoraController {

	@Autowired
	private EditoraDAO context;
	
	@RequestMapping("/editoranovo")
	public String editora(){
		return "editora";
	}	
	
	@RequestMapping("/editoras")
	public ModelAndView Listar() {
		ModelAndView modelv = new ModelAndView("editoras");
		modelv.addObject("categoriaslista", context.ListarEditoras());
		return modelv;
	}
	
	@RequestMapping("/salvareditora")
	public String SalvarEditora(Editora editora){
		context.salvar(editora);
		return "paginaconfirmacao";
	}
	
	@RequestMapping("/removereditora")
	public String RemoverEditora(int idEditora){
		context.remover(idEditora);
		return "exclusoes";
	}
	
	@RequestMapping("/editareditora")
	public String editarEditora(Editora editora){
		context.EditarEditora(editora);
		return "redirect:editoras";
	}
	
	@RequestMapping("/editorabyid")
	public ModelAndView CatById(int codigo){
		ModelAndView modelv = new ModelAndView("editoraeditar");
		modelv.addObject("editoraeditar", context.EditoraById(codigo));
		return modelv;
	}
}
