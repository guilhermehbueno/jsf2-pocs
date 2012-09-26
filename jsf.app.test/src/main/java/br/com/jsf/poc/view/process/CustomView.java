package br.com.jsf.poc.view.process;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomView {
	
	String label();
	String type() default "label";
	String clazz() default "label";

}
