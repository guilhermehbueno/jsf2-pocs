package br.com.jsf.poc.view.example;

import br.com.jsf.poc.view.model.ServicoA;
import br.com.jsf.poc.view.process.CustomView;

public class ServicoAView {
	
	public ServicoAView(ServicoA model) {
		super();
		this.nome = model.getNome();
		this.descricao = model.getDescricao();
		this.telefone = model.getTelefone();
	}

	@CustomView(clazz = "attribute", label = "Nome", type = "label")
	private String nome;
	
	@CustomView(clazz = "attribute", label = "Descrição", type = "label")
	private String descricao;
	
	@CustomView(clazz = "attribute", label = "Telefone", type = "label")
	private String telefone;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
