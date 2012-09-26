package br.com.jsf.poc.view.process;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ModelViewProcessor {
	
	public static ViewModel process(Object object){
		List<ViewModelAttribute> attributes = new ArrayList<ViewModelAttribute>();
		try{
		Field [] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			ViewModelAttribute attribute = getViewModelAttributeFrom(field, object);
			if(attribute!=null){
				attributes.add(attribute);
			}
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		ViewModel model = new ViewModel(null, attributes);
		return model;
	}
	
	private static ViewModelAttribute getViewModelAttributeFrom(Field field, Object object) throws IllegalArgumentException, IllegalAccessException{
		field.setAccessible(true);
		ViewModelAttribute attribute = new ViewModelAttribute();
		CustomView annotation = field.getAnnotation(CustomView.class);
		if(annotation==null){
			return null;
		}
		
		attribute.setClazz(annotation.clazz());
		attribute.setLabel(annotation.label());
		attribute.setValue(field.get(object)+"");
		field.setAccessible(false);
		return attribute;
	}

}
