package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.systemdevelopment.model.Locacao;
import br.com.systemsdevelopment.daos.LocacaoDAO; 

@Controller
@Transactional
public class LocacaoController {

	@Autowired
	private LocacaoDAO context;
	
	@RequestMapping("/locacaonovo")
	public String locacao(){
		return "locacao";
	}
	
	@RequestMapping("/salvarlocacao")
	public String SalvarLocacao(Locacao locacao){
		context.salvar(locacao);
		return "paginaconfirmacao";
	}
	
	@RequestMapping("/removerlocacao")
	public String RemoverLocacao(int idLocacao){
		context.remover(idLocacao);
		return "exclusoes";
	}
	
	@RequestMapping("/editarlocacao")
	public String editarLocacao(Locacao locacao) {
		context.EditarLocacao(locacao);
		return "redirect:locacoes";
	}
	
	@RequestMapping("/locacoes")
	public ModelAndView Listar() {
		ModelAndView modelv = new ModelAndView("locacoes");
		modelv.addObject("locacoeslista", context.ListarLocacoes());
		return modelv;
	}	
	
	@RequestMapping("/locacaobyid")
	public ModelAndView CatById(int codigo) {
		ModelAndView modelv = new ModelAndView("locacaoeditar");
		modelv.addObject("locacaoeditar", context.LocacaoById(codigo));
		return modelv;
	}
}
