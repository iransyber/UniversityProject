package br.com.systemdevelopment.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdItem")
	private int IdItem;
	@Column(name = "Descricao")
	private String Descricao;
	@Column(name = "Categoria")
	private int Categoria;
	@Column(name = "Sinopse")
	private String Sinopse;
	@Column(name = "Autor")
	private int Autor;
	@Column(name = "Editora")
	private int Editora;
	@Column(name = "AnoLancamento")
	private int AnoLancamento;
	@Column(name = "Quantidade")
	private int Quantidade;
	@Column(name = "Ativo")
	private Boolean Ativo;
	
	public String getSinopse() {
		return Sinopse;
	}
	public void setSinopse(String sinopse) {
		Sinopse = sinopse;
	}
	public int getAutor() {
		return Autor;
	}
	public void setAutor(int autor) {
		Autor = autor;
	}
	public int getEditora() {
		return Editora;
	}
	public void setEditora(int editora) {
		Editora = editora;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public int getIdItem() {
		return IdItem;
	}
	public void setIdItem(int idItem) {
		IdItem = idItem;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getCategoria() {
		return Categoria;
	}
	public void setCategoria(int categoria) {
		Categoria = categoria;
	}
	public int getAnoLancamento() {
		return AnoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		AnoLancamento = anoLancamento;
	}
	public Boolean getAtivo() {
		return Ativo;
	}
	public void setAtivo(Boolean ativo) {
		Ativo = ativo;
	}	
}
