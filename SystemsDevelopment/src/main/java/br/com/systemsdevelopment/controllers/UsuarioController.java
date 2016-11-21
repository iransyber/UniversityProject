package br.com.systemsdevelopment.controllers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioController {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdUsuario")
	private int IdUsuario;
	@Column(name = "Nome")
	private String Nome;
	@Column(name = "Status")
	private int Status;
	public int gerIdUsuario(){
		return IdUsuario;
	}
	
	public void setIdUsuario(int IdUsuario){
		IdUsuario = gerIdUsuario();	
	
 	}
	public String getNome(){
		return Nome;
	}
	public int getIdUsuario() {
		return IdUsuario;
	}

	public int getStatus() {
		return Status;
	}

	public void setNome(String nome){
		Nome = nome;
	}
	public void setStatus(int status){
		Status = status;
	}
}
