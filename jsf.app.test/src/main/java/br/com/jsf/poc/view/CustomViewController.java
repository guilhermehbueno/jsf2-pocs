package br.com.jsf.poc.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import br.com.jsf.poc.view.example.ServicoAView;
import br.com.jsf.poc.view.model.ServicoA;
import br.com.jsf.poc.view.process.ModelViewProcessor;
import br.com.jsf.poc.view.process.ViewModel;

@Named
public class CustomViewController {
	
	private ServicoAView SelectedView;
	
	
	@PostConstruct
	public void init(){
		ServicoA model = new ServicoA();
		model.setDescricao("teste");
		model.setNome("Servico A");
		model.setTelefone("11 - 11111111");
		SelectedView = new ServicoAView(model);
	}
	
	public ViewModel getModel(){
		return ModelViewProcessor.process(SelectedView);
	}
}
