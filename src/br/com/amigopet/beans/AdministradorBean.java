package br.com.amigopet.beans;

import java.io.Serializable;

public class AdministradorBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String email;
	private String senha;
	
	
	public AdministradorBean() {}
	
	public AdministradorBean(int id, String email) {
		this.id = id;
		this.email = email;
	}

	public AdministradorBean(int id, String email, String senha) {
		this.id = id;
		this.email = email;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
	
	
	
	

}
