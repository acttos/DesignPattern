package org.acttos.pattern.factory.abstrakt;

import org.acttos.pattern.factory.AbstractProductA;
import org.acttos.pattern.factory.AbstractProductB;

/**
 * The creator of product, the 'createProduct..' methods count is the same as the type of products
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public abstract class AbstractFactory {
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();
}
