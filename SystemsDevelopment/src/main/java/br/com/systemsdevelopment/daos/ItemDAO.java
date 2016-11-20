package br.com.systemsdevelopment.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.systemdevelopment.model.Item;

@Repository
public class ItemDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Item Item){
		manager.persist(Item);
	}
	
	public void remover(int idItem){
		Item I = new Item();
		I = manager.find(Item.class, idItem);
		manager.remove(I);
	}
	
}
