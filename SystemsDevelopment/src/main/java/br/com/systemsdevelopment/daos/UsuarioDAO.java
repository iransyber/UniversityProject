package br.com.systemsdevelopment.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.systemdevelopment.model.Usuario;

@Repository
public class UsuarioDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Usuario usuario){
		manager.persist(usuario);	
	}
	
	public Usuario usuarioById(int codigo){
		Usuario u = new Usuario();
		u = manager.find(Usuario.class, codigo);
		return u;
	}
	

}
