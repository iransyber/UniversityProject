package br.com.systemsdevelopment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.systemdevelopment.model.Usuario;
import br.com.systemsdevelopment.daos.UsuarioDAO; 
@Controller
@Transactional
public class UsuarioController {

	@Autowired
	private UsuarioDAO context;
	
	@RequestMapping("/usuarionovo")
	public String usuario(){
		return "usuario";
	}
	
	@RequestMapping("/salvarusuario")
	public String SalvarUsuario(Usuario usuario){
		context.salvar(usuario);
		return "paginaconfirmacao";
	}
	
	@RequestMapping("/login")
	public String EfetuaLogin(String usuario, String senha){
		String pagina = "";
		if (context.UsuarioExiste(usuario, senha)){
			pagina = "redirect: home";
		}else{
			pagina = "redirect: /SystemsDevelopment/";
		}		
	  return pagina;
	}
	
	@RequestMapping("/removerusuario")
	public String RemoverUsuario(int idUsuario){
		context.remover(idUsuario);
		return "exclusoes";
	}
	
	@RequestMapping("/editarUsuario")
	public String editarUsuario(Usuario usuario) {
		context.EditarUsuario(usuario);
		return "redirect:usuario";
	}
	
	@RequestMapping("/usuarios")
	public ModelAndView Listar() {
		ModelAndView modelv = new ModelAndView("usuarios");
		modelv.addObject("usuarioslista", context.ListarUsuarios());
		return modelv;
	}	
	
	@RequestMapping("/usuariobyid")
	public ModelAndView CatById(int codigo) {
		ModelAndView modelv = new ModelAndView("usuarioeditar");
		modelv.addObject("usuarioeditar", context.UsuarioById(codigo));
		return modelv;
	}
}
