package br.com.systemdevelopment.model;

import javax.persistence.*;

@Entity
public class Editora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEditora")
	private int IdEditora;
	@Column(name = "Nome)")
	private String Nome;
	@Column(name ="Observacoes")
	private String Observacoes;
	@Column(name ="Status")
	private int Status;
	
	
	public int getIdEditora() {
		return IdEditora;
	}
	public void setIdEditora(int idEditora) {
		IdEditora = idEditora;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getObservacoes() {
		return Observacoes;
	}
	public void setObservacoes(String observacoes) {
		Observacoes = observacoes;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}

}
