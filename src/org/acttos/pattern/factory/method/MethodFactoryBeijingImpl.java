package org.acttos.pattern.factory.method;

import org.acttos.pattern.factory.domains.BeijingProduct;
import org.acttos.pattern.factory.domains.Product;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class MethodFactoryBeijingImpl implements IMethodFactory {

	/* (non-Javadoc)
	 * @see org.acttos.pattern.factory.method.IMethodFactory#create()
	 */
	@Override
	public Product create() {
		System.out.println("Beijing factory is creating a product ...");
		
		Product product = new BeijingProduct();
		
		return product;
	}

}
