package br.com.systemdevelopment.model;

import javax.persistence.*;

@Entity
public class Editora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEditora")
	private int IdEditora;
	@Column(name = "Descricao")
	private String Descricao;
	@Column(name = "Ano")
	private int Ano;
	@Column(name = "Status")
	private int Status;
	public int getIdEditora() {
		return IdEditora;
	}
	public void setIdEditora(int idEditora) {
		IdEditora = idEditora;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
}
