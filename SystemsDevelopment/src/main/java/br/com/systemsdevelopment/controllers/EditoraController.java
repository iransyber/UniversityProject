package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.systemdevelopment.model.Editora;
import br.com.systemsdevelopment.daos.EditoraDAO;

@Controller
@Transactional
public class EditoraController {

	@Autowired
	private EditoraDAO context;
	
	@RequestMapping("/editora")
	public String editora(){
		return "editora";
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
}
