package br.com.jsf.poc.view.example;

import br.com.jsf.poc.view.model.ServicoB;
import br.com.jsf.poc.view.process.CustomView;

public class ServicoBView {
	
	public ServicoBView(ServicoB model){
		this.nome = model.getNome();
		this.titulo = model.getTitulo();
		this.endereco = model.getEndereco();
	}
	
	@CustomView(label = "Nome")
	private String nome;
	
	@CustomView(label = "Título")
	private String titulo;
	
	@CustomView(label = "Endereço")
	private String endereco;
	
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
}
