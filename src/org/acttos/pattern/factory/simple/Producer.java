package org.acttos.pattern.factory.simple;

import org.acttos.pattern.factory.domains.Product;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Producer {
	public static void main(String[] args) {
		Product p = SimpleFactory.create();
		System.out.println("A product called '" + p.getName() + "' has been created.");
	}
}
