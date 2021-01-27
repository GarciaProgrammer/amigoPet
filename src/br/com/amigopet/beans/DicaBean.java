package br.com.amigopet.beans;

import java.io.Serializable;

public class DicaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String titulo;
	private String descricao;
	
	public DicaBean() {}
	
	public DicaBean(int id, String titulo, String descricao) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
