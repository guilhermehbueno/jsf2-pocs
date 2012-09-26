package br.com.jsf.poc.view;

import java.util.List;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.jsf.poc.view.example.ServicoAView;
import br.com.jsf.poc.view.model.ServicoA;
import br.com.jsf.poc.view.process.ModelViewProcessor;
import br.com.jsf.poc.view.process.ViewModel;
import br.com.jsf.poc.view.process.ViewModelAttribute;

public class ModelViewProcessorTest {
	
	private static ServicoAView view;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ServicoA model = new ServicoA();
		model.setDescricao("teste");
		model.setNome("Servico A");
		model.setTelefone("11 - 11111111");
		view = new ServicoAView(model);
	}

	@Test
	public void testProcess() {
		ViewModel model = ModelViewProcessor.process(view);
		Assert.assertNotNull(model);
		List<ViewModelAttribute> attributes = model.getAttributes();
		for (ViewModelAttribute viewModelAttribute : attributes) {
			System.out.println(viewModelAttribute.getLabel()+": "+viewModelAttribute.getValue());
		}
	}
}
