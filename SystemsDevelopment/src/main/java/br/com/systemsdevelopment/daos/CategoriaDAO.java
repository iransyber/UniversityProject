package br.com.systemsdevelopment.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


import br.com.systemdevelopment.model.Categoria;

@Repository
public class CategoriaDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Categoria categoria){
		manager.persist(categoria);
	}
}
