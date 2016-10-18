package org.acttos.pattern.factory.simple;

import org.acttos.pattern.factory.domains.Product;

/**
 * 
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class SimpleFactory {
	private static SimpleFactory instance;

	private SimpleFactory() {
		super();
	}

	public static SimpleFactory instance() {
		if (instance == null) {
			instance = new SimpleFactory();
		}

		return instance;
	}
    
	public static SimpleFactory getInstance() {
		if (instance == null) {
			instance = new SimpleFactory();
		}

		return instance;
	}

	public static Product create() {
		System.out.println("Factory is creating Product ...");
		Product product = new Product();
		
		return product;
	}
}
