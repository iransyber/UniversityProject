package br.com.systemdevelopment.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

@Entity
public class Locacao {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "IdLocacao")
	private int IdLocacao;
	@Column(name = "Usuario")
	private int Usuario;
	@Column(name = "Item")
	private int Item;
	@Column (name = "DataLocacao")
	private Date DataLocacao;
	@Column (name = "DataDevolucao")
	private Date DataDevolucao;
	@Column (name = "Observacoes")
	private String Observacoes;
	@Column (name = "DevolAtrasada")
	private Boolean DevolAtrasada;
	
	public int getIdLocacao() {
		return IdLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		IdLocacao = idLocacao;
	}
	public int getUsuario() {
		return Usuario;
	}
	public void setUsuario(int usuario) {
		Usuario = usuario;
	}
	public int getItem() {
		return Item;
	}
	public void setItem(int item) {
		Item = item;
	}
	public Date getDataLocacao() {
		return DataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		DataLocacao = dataLocacao;
	}
	public Date getDataDevolucao() {
		return DataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		DataDevolucao = dataDevolucao;
	}
	public String getObservacoes() {
		return Observacoes;
	}
	public void setObservacoes(String observacoes) {
		Observacoes = observacoes;
	}
	public Boolean getDevolAtrasada() {
		return DevolAtrasada;
	}
	public void setDevolAtrasada(Boolean devolAtrasada) {
		DevolAtrasada = devolAtrasada;
	}
}
