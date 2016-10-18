package org.acttos.pattern.factory.abstrakt;

import org.acttos.pattern.factory.domains.AbstractProductA;
import org.acttos.pattern.factory.domains.AbstractProductB;

/**
 * Here is a demo class shows how to use 'Design Pattern Abstract Factory'.
 * Commonly, we define two products and two types, and one Abstract Factory 
 * with the same count methods of products.
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Producer {

	public static void main(String[] args) {
		/**
		 * Here we define two factories for 'Abroad' and 'Internal' products
		 */
		AbstractFactory abroadProductFactory = new AbroadProductFactory();
		AbstractFactory internalProductFactory = new InternalProductFactory();
		
		/**
		 * Here we define two 'ProductA' with 'Abroad' and 'Internal'
		 */
		AbstractProductA abstractAbroadProductA = abroadProductFactory.createProductA();
		AbstractProductA abstractInternalProductA = internalProductFactory.createProductA();
		
		/**
		 * Here we define two 'ProductB' with 'Abroad' and 'Internal'
		 */
		AbstractProductB abstractAbroadProductB = abroadProductFactory.createProductB();
		AbstractProductB abstractInternalProductB = internalProductFactory.createProductB();
		
		/**
		 * Here we can do anything we want.
		 */
		System.out.println(abroadProductFactory);
		System.out.println(internalProductFactory);
		
		System.out.println(abstractAbroadProductA);
		System.out.println(abstractInternalProductA);
		
		System.out.println(abstractAbroadProductB);
		System.out.println(abstractInternalProductB);
	}
}
