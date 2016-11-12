package br.com.systemsdevelopment.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import br.com.systemdevelopment.model.Editora;

@Repository
public class EditoraDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Editora editora){
		manager.persist(editora);
	}
	
	public void remover(int idEdit){
		Editora e = new Editora();
		e = manager.find(Editora.class, idEdit);
		manager.remove(e);
	}	
}
