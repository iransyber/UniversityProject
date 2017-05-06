package br.com.systemsdevelopment.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.systemdevelopment.model.EspecialidadeLiteraria;

@Repository
public class EspecialidadeLiterariaDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(EspecialidadeLiteraria especialidadeliteraria){
		manager.persist(especialidadeliteraria);
	}
	
	public EspecialidadeLiteraria EspecialidadeLiterariaById(int codigo){
		EspecialidadeLiteraria e = new EspecialidadeLiteraria();
		e = manager.find(EspecialidadeLiteraria.class, codigo);
		return e;
	}
		
	public void EditarEspecialidadeLiteraria(EspecialidadeLiteraria especialidadeliteraria){
		EspecialidadeLiteraria e = new EspecialidadeLiteraria();
		e = manager.find(EspecialidadeLiteraria.class, especialidadeliteraria.getIdEspecialidadeLiteraria());
		e.setDescricao(especialidadeliteraria.getDescricao());
		e.setStatus(especialidadeliteraria.getStatus());
		manager.persist(e);
	}
	
	public void remover(int idEspecialidadeLiteraria){
		EspecialidadeLiteraria e = new EspecialidadeLiteraria();
		e = manager.find(EspecialidadeLiteraria.class, idEspecialidadeLiteraria);
		manager.remove(e);
	}
	
	public List<EspecialidadeLiteraria> ListarEspecialidadesLiterarias(){
		Query q = manager.createQuery("SELECT c FROM EspecialidadeLiteraria c");
		@SuppressWarnings("unchecked")
		List<EspecialidadeLiteraria> especialidadeliteraria = q.getResultList();
		return especialidadeliteraria;
	}
}
