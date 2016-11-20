package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.systemdevelopment.model.EspecialidadeLiteraria;
import br.com.systemsdevelopment.daos.EspecialidadeLiterariaDAO;

@Controller
@Transactional
public class EspecialidadeLiterariaController {
	
	@Autowired
	private EspecialidadeLiterariaDAO context;
	
	@RequestMapping("/especialidadeliterarianovo")
	public String especialidadeliteraria(){
		return "especialidadeliteraria";
	}
	
	@RequestMapping("/salvarespecialidadeliteraria")
	public String SalvarEspecialidadeLiteraria(EspecialidadeLiteraria especialidadeliteraria){
		context.salvar(especialidadeliteraria);
		return "paginaconfirmacao";
	}
	
	@RequestMapping("/removerespecialidadeliteraria")
	public String RemoverEspecialidadeLiteraria(int idEspecialidadeLiteraria){
		context.remover(idEspecialidadeLiteraria);
		return "exclusoes";
	}
	
	@RequestMapping("/editarespecialidadeliteraria")
	public String editarEspecialidadeLiteraria(EspecialidadeLiteraria especialidadeliteraria){
		context.EditarEspecialidadeLiteraria(especialidadeliteraria);
		return "redirect:especialidadesliterarias";
	}
	
	@RequestMapping("/especialidadesliterarias")
	public ModelAndView Listar(){
		ModelAndView modelv = new ModelAndView("especialidadesliterarias");
		modelv.addObject("especialidadeslista", context.ListarEspecialidadesLiterarias());
		return modelv;
	}
	
	@RequestMapping("/especialidadeliterariabyid")
	public ModelAndView CatById(int codigo){
		ModelAndView modelv = new ModelAndView("especialidadeliterariaeditar");
		modelv.addObject("especialidadeliterariaeditar", context.EspecialidadeLiterariaById(codigo));
		return modelv;
	}
}
