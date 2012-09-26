package br.com.jsf.poc.view.example;

import br.com.jsf.poc.view.model.ServicoC;
import br.com.jsf.poc.view.process.CustomView;

public class ServicoCView {
	
	public ServicoCView(ServicoC model){
		this.nome = model.getNome();
		this.titulo = model.getTitulo();
		this.endereco = model.getEndereco();
		this.telefone = model.getTelefone();
		this.email = model.getEmail();
		this.descricao = model.getDescricao();
	}
	
	@CustomView(label="Nome")
	private String nome;
	
	@CustomView(label="Título")
	private String titulo;
	
	@CustomView(label="Endereço")
	private String endereco;
	
	@CustomView(label="Telefone")
	private String telefone;
	
	@CustomView(label="Email")
	private String email;
	
	@CustomView(label="Descrição")
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
