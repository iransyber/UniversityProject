package br.com.systemdevelopment.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdAutor")
	private int IdAutor;
	@Column(name = "Nome")
	private String Nome;
	@Column(name = "DataNascimento")
	private Date DataNascimento;
	@Column(name = "EspecialidadeLiteraria")
	private int EspecialidadeLiteraria; // Ação, Terror etc...
	@Column(name = "Status")
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
