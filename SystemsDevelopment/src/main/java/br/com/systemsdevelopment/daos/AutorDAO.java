package br.com.systemsdevelopment.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import br.com.systemdevelopment.model.Autor;

@Repository
public class AutorDAO {	
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Autor autor){
		manager.persist(autor);
	}
	
	public void remove(int idAutor){
		//manager.remove(id);
	}

}
