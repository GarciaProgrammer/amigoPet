package br.com.amigopet.beans;

import java.io.Serializable;

public class UsuarioBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private String email;
	private String senha;
	private String celular;
	
	public UsuarioBean() {}
	
	public UsuarioBean(int id, String nome, String email, String senha, String celular) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.celular = celular;
	}

	public UsuarioBean(int id, String nome, String email, String celular) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
	
	
	
		
}
