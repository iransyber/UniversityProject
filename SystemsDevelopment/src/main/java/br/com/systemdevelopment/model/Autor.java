package br.com.systemdevelopment.model;

import java.util.Date;

public class Autor {
	private int IdAutor;
	private String Nome;
	private Date DataNascimento;
	private int EspecialidadeLiteraria; // Ação, Terror etc...
	private int Status; // este campo estatus estara nas damais classes para informar se o mesmo e ativo ou inativo ou excluido etc...
	public int getIdAutor() {
		return IdAutor;
	}
	public void setIdAutor(int idAutor) {
		IdAutor = idAutor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public int getEspecialidadeLiteraria() {
		return EspecialidadeLiteraria;
	}
	public void setEspecialidadeLiteraria(int especialidadeLiteraria) {
		EspecialidadeLiteraria = especialidadeLiteraria;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
}
