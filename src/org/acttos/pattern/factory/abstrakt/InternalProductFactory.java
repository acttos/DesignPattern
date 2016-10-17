package org.acttos.pattern.factory.abstrakt;

import org.acttos.pattern.factory.AbstractProductA;
import org.acttos.pattern.factory.AbstractProductB;
import org.acttos.pattern.factory.InternalProductA;
import org.acttos.pattern.factory.InternalProductB;

/**
 * Only produces internal products
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class InternalProductFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see org.acttos.pattern.factory.AbstractFactory#createProductA()
	 */
	@Override
	public AbstractProductA createProductA() {
		return new InternalProductA();
	}

	/* (non-Javadoc)
	 * @see org.acttos.pattern.factory.AbstractFactory#createProductB()
	 */
	@Override
	public AbstractProductB createProductB() {
		return new InternalProductB();
	}

}
