package br.com.systemsdevelopment.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.systemdevelopment.model.Editora;

@Repository
public class EditoraDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Editora editora){
		manager.persist(editora);
	}
	
	public Editora EditoraById(int codigo){
		Editora e = new Editora();
		e = manager.find(Editora.class, codigo);
		return e;
	}
	
	public void EditarEditora(Editora editora){
		Editora e = new Editora();
		e = manager.find(Editora.class, editora.getIdEditora());
		e.setNome(editora.getNome());
		e.setObservacoes(editora.getObservacoes());
		manager.persist(e);
	}
	
	public void remover(int idEdit){
		Editora e = new Editora();
		e = manager.find(Editora.class, idEdit);
		manager.remove(e);
	}
	
	public List<Editora> ListarEditoras(){
		Query q = manager.createQuery("SELECT e FROM Editora e");
		@SuppressWarnings("unchecked")
		List<Editora> editora = q.getResultList();
		return editora;
	}
}
