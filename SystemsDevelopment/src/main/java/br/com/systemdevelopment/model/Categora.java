package br.com.systemdevelopment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Esta classe serve para indicar se e livro,revista etc...
//A mesma criarei dependencia para o item como indicado no uml da documentação.
//Irei documentar a modificação e enviar para os envolvidos.

@Entity
@Table(name = "Categoria")
public class Categora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdCategoria")
	private int IdCategoria;
	@Column(name = "Descricao")
	private String Descricao;
	@Column(name = "Status")
	private int Status;
	
	public int getIdCategoria() {
		return IdCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
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
