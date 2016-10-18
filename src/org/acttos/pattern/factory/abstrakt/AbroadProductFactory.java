package org.acttos.pattern.factory.abstrakt;

import org.acttos.pattern.factory.domains.AbroadProductA;
import org.acttos.pattern.factory.domains.AbroadProductB;
import org.acttos.pattern.factory.domains.AbstractProductA;
import org.acttos.pattern.factory.domains.AbstractProductB;

/**
 * Only produces abroad products
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class AbroadProductFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see org.acttos.pattern.factory.AbstractFactory#createProductA()
	 */
	@Override
	public AbstractProductA createProductA() {
		return new AbroadProductA();
	}

	/* (non-Javadoc)
	 * @see org.acttos.pattern.factory.AbstractFactory#createProductB()
	 */
	@Override
	public AbstractProductB createProductB() {
		return new AbroadProductB();
	}

}
