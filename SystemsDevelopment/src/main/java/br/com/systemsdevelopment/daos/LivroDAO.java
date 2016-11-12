package br.com.systemsdevelopment.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.systemdevelopment.model.Livro;

@Repository
public class LivroDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Livro livro){
		manager.persist(livro);
	}
	
	public void remover(int idLivro){
		Livro l = new Livro();
		l = manager.find(Livro.class, idLivro);
		manager.remove(l);
	}
	
}
