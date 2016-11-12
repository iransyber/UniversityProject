package br.com.systemsdevelopment.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import br.com.systemdevelopment.model.Autor;

@Repository
public class AutorDAO {	
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Autor autor){
		manager.persist(autor);
	}
	
	public void remover(int idAutor){
		Autor a = new Autor();
		a = manager.find(Autor.class, idAutor);
		manager.remove(a);	
	}

}
