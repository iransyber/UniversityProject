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
	
	public void remover(int idCateg){
		Categoria c = new Categoria();
		c = manager.find(Categoria.class, idCateg);
		manager.remove(c);
	}
}
