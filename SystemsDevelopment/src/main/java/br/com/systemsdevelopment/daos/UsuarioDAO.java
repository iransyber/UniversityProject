package br.com.systemsdevelopment.daos;

import java.util.List;

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
	
	public Usuario UsuarioById(int codigo){
		Usuario u = new Usuario();
		u = manager.find(Usuario.class, codigo);
		return u;
	}
	
	public boolean UsuarioExiste(String usuario, String senha){
		Query q = manager.createQuery("SELECT u FROM Usuario u where (u.Login="+usuario+") and (u.Senha="+senha+")");
		Usuario u = (Usuario) q.getSingleResult();
		if (u != null){
			return true;
		}else{
			return false;			
		}
	}
	
	public void EditarUsuario(Usuario usuario){
		Usuario u = new Usuario();
		u = manager.find(Usuario.class, usuario.getIdUsuario());
		u.setNome(usuario.getNome());
		u.setEmail(usuario.getEmail());
		u.setCPF(usuario.getCPF());
		u.setLogin(usuario.getLogin());
		u.setSenha(usuario.getSenha());
		u.setStatus(usuario.getStatus());
		manager.persist(u);
	}	
	
	public void remover(int idCateg){
		Usuario u = new Usuario();
		u = manager.find(Usuario.class, idCateg);
		manager.remove(u);
	}
	
	public List<Usuario> ListarUsuarios() {
		Query q = manager.createQuery("SELECT c FROM Usuario c");
		@SuppressWarnings("unchecked")
		List<Usuario> usuario = q.getResultList();
		return usuario;
	}
}