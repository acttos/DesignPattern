package org.acttos.pattern.factory.method;

import org.acttos.pattern.factory.Product;
import org.acttos.pattern.factory.ShanghaiProduct;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class MethodFactoryShanghaiImpl implements IMethodFactory {

	/* (non-Javadoc)
	 * @see org.acttos.pattern.factory.method.IMethodFactory#create()
	 */
	@Override
	public Product create() {
		System.out.println("Shanghai factory is creating a product ...");
		
		Product product = new ShanghaiProduct();

		return product;
	}

}
