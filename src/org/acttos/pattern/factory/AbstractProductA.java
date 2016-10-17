package org.acttos.pattern.factory;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public abstract class AbstractProductA {
	protected String name; 
	/**
	 * Get the name of a product, every product will implement this one
	 * @return the name of the product
	 */
	public String productName() {
		return this.name;
	}
	/**
	 * The market zone method, different products with different implementation
	 * @return the market zone
	 */
	public abstract String marketZone();
}
