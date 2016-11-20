package br.com.systemdevelopment.model;

import javax.persistence.*;

@Entity
public class EspecialidadeLiteraria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEspecialidadeLiteraria")
	private int IdEspecialidadeLiteraria;
	@Column(name = "Descricao")
	private String Descricao;
	@Column(name = "Status")
	private int Status;
	
	public int getIdEspecialidadeLiteraria() {
		return IdEspecialidadeLiteraria;
	}
	public void setIdEspecialidadeLiteraria(int idEspecialidadeLiteraria) {
		IdEspecialidadeLiteraria = idEspecialidadeLiteraria;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
}
