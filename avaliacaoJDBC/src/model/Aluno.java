package model;

import java.sql.Date;

public class Aluno {
private Long id;
	
	private String nome;
	
	private String email;
	
	private String cpf;
	
	private String dataNascimento;
	
	private String naturalidade;
	
	private String endereco;
	
	/*Construtor Padrão*/
	public Aluno() {
		
	}
	
	/*Construtor para Lista por ID*/
	public Aluno(Long id) {
		super();
		this.id = id;
	}
	
	/*Construtor Para Listagem*/
	public Aluno(String nome, String email, String cpf, String dataNascimento, String naturalidade, String endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
	}
	
	/*Construtor*/
	public Aluno(Long id, String nome, String email, String cpf, String dataNascimento, String naturalidade, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
	}

	/*Getters e Setters*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
