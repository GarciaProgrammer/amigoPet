package br.com.amigopet.beans;

import java.io.Serializable;

public class AnimalBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private String tipo;
	private String raca;
	private int idade;
	private String sexo;
	private String descricao;
	private Byte imagem;
	
	public AnimalBean() {}
	
	public AnimalBean( String nome, String tipo, String raca, int idade, String sexo, String descricao, Byte imagemDado ) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.idade = idade;
		this.sexo = sexo;
		this.descricao = descricao;
		this.imagem = imagemDado;
	
	}

	public AnimalBean(int id, String nome, String tipo, String raca, int idade, String sexo, String descricao, Byte imagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.idade = idade;
		this.sexo = sexo;
		this.descricao = descricao;
		this.imagem = imagem;
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
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Byte getImagem() {
		return imagem;
	}

	public void setImagem(Byte imagem) {
		this.imagem = imagem;
	};
	
	
	
	
	
}
