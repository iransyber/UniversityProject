package br.com.systemdevelopment.model;

import java.util.Date;

public class Editora {
	private int IdEditora;
	private String Descricao;
	private Date Ano;
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
	public Date getAno() {
		return Ano;
	}
	public void setAno(Date ano) {
		Ano = ano;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
}
