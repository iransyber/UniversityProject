package br.com.systemsdevelopment.controllers;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.systemdevelopment.model.Item;
import br.com.systemsdevelopment.daos.ItemDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Transactional
public class ItemController {
	
	@Autowired
	private ItemDAO context;
	
	@RequestMapping("/Item")
	public String Item(){
		return ("Item");
	}
	
	@RequestMapping("/salvarItem")
	public String SalvarItem(Item Item){
		context.salvar(Item);
		return ("paginaconfirmacao");
	}
	
	@RequestMapping("/removerItem")
	public String RemoverItem(int idItem){
		context.remover(idItem);
		return ("exclusoes");
	}
	
}
