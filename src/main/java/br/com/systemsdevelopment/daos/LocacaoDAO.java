package br.com.systemsdevelopment.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import br.com.systemdevelopment.model.Locacao;

@Repository
public class LocacaoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Locacao locacao){
		manager.persist(locacao);
	}
	
	public Locacao LocacaoById(int codigo){
		Locacao l = new Locacao();
		l = manager.find(Locacao.class, codigo);
		return l;
	}
	
	public void EditarLocacao(Locacao locacao){
		Locacao l = new Locacao();
		l = manager.find(Locacao.class, locacao.getIdLocacao());
		l.setUsuario(locacao.getUsuario());
		l.setItem(locacao.getItem());
		l.setDataLocacao(locacao.getDataLocacao());
		l.setDataDevolucao(locacao.getDataDevolucao());
		l.setObservacoes(locacao.getObservacoes());
		l.setDevolAtrasada(locacao.getDevolAtrasada());
		manager.persist(l);
	}	
	
	public void remover(int idLocacao){
		Locacao l = new Locacao();
		l = manager.find(Locacao.class, idLocacao);
		manager.remove(l);
	}
	
	public List<Locacao> ListarLocacoes(){
		Query q = manager.createQuery("SELECT c FROM Locacao c");
		@SuppressWarnings("unchecked")
		List<Locacao> locacao = q.getResultList();
		return locacao;
	}
}