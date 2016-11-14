package br.com.systemsdevelopment.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import br.com.systemdevelopment.model.Categoria;

@Repository
public class CategoriaDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Categoria categoria){
		manager.persist(categoria);
	}
	
	public Categoria CategoriaById(int codigo){
		Categoria c = new Categoria();
		c = manager.find(Categoria.class, codigo);
		return c;
	}
	
	public void EditarCategoria(Categoria categoria){
		Categoria c = new Categoria();
		c = manager.find(Categoria.class, categoria.getIdCategoria());
		manager.refresh(c);
	}	
	
	public void remover(int idCateg){
		Categoria c = new Categoria();
		c = manager.find(Categoria.class, idCateg);
		manager.remove(c);
	}
	
	public List<Categoria> ListarCategorias() {
		Query q = manager.createQuery("SELECT c FROM Categoria c");
		@SuppressWarnings("unchecked")
		List<Categoria> categoria = q.getResultList();
		return categoria;
	}
}