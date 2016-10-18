package org.acttos.pattern.factory.abstrakt;

import org.acttos.pattern.factory.domains.AbstractProductA;
import org.acttos.pattern.factory.domains.AbstractProductB;

/**
 * The creator of product, the 'createProduct..' methods count is the same as the type of products
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public abstract class AbstractFactory {
	/**
	 * Define a method to produce ProductA.
	 * @return an instance of AbstractProductA.
	 */
	public abstract AbstractProductA createProductA();
	/**
	 * Define a method to produce ProductB.
	 * @return an instance of AbstractProductB.
	 */
	public abstract AbstractProductB createProductB();
}
