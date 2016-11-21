package br.com.systemsdevelopment.daos;

import java.util.List;
import java.util.jar.Attributes.Name;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public void EditarUsuario(Usuario usuario){
		Usuario u = new Usuario();
		u = manager.find(Usuario.class, usuario.getIdUsuario());
		u.setNome(usuario.getNome());
		u.setStatus(usuario.getStatus());
		manager.persist(u);
		
	}
	
	public void remover(int idUsuario){
		Usuario u = new Usuario();
		u = manager.find(Usuario.class, idUsuario);
		manager.remove(u);
	
	}
	
	public List<Usuario> ListarUsuario(){
		
		Query q = manager.createQuery("SELECT U FROM Categoria u");
		@SuppressWarnings("unchecked")
		List<Usuario> usuario = q.getResultList();
		return usuario;
		
	}
}

