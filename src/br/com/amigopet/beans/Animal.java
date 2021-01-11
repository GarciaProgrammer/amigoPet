package br.com.amigopet.beans;

import java.io.Serializable;

public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private int id;
	private String nome;
	private String tipo;
	private String raca;
	private char sexo;
	private String descricao;
	
	public Animal() {}

	public Animal(int id, String nome, String tipo, String raca, char sexo, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.sexo = sexo;
		this.descricao = descricao;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	};
	
	
	
	
}
