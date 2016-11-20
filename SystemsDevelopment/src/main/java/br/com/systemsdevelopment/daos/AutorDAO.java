package br.com.systemsdevelopment.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import br.com.systemdevelopment.model.Autor;

@Repository
public class AutorDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Autor autor){
		manager.persist(autor);
	}
	
	public Autor AutorById(int codigo){
		Autor a = new Autor();
		a = manager.find(Autor.class, codigo);
		return a;
	}
	
	public void EditarAutor(Autor autor){
		Autor a = new Autor();
		a = manager.find(Autor.class, autor.getIdAutor());
		a.setNome(autor.getNome());
		a.setDataNascimento(autor.getDataNascimento());
		a.setEspecialidadeLiteraria(autor.getEspecialidadeLiteraria());
		a.setStatus(autor.getStatus());
		manager.persist(a);
	}	
	
	public void remover(int idAutor){
		Autor a = new Autor();
		a = manager.find(Autor.class, idAutor);
		manager.remove(a);
	}
	
	public List<Autor> ListarAutores() {
		Query q = manager.createQuery("SELECT c FROM Autor c");
		@SuppressWarnings("unchecked")
		List<Autor> categoria = q.getResultList();
		return categoria;
	}
}