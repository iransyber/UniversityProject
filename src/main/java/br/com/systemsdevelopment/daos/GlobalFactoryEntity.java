package br.com.systemsdevelopment.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class GlobalFactoryEntity {

	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Object entidade){
		manager.persist(entidade);
	}
}
