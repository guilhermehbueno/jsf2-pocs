package br.com.jsf.poc.view.process;

import java.util.List;

public class ViewModel {
	
	private final ViewModelAttribute title;
	private final List<ViewModelAttribute> attributes;
	
	public ViewModel(ViewModelAttribute title,
			List<ViewModelAttribute> attributes) {
		super();
		this.title = title;
		this.attributes = attributes;
	}
	
	public ViewModelAttribute getTitle() {
		return title;
	}
	public List<ViewModelAttribute> getAttributes() {
		return attributes;
	}
	

}
