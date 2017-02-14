package org.acttos.pattern.inheritance_composition;

import org.acttos.pattern.inheritance_composition.inheritance.AnimalDog;
import org.acttos.pattern.inheritance_composition.inheritance.AnimalEagle;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Inheritance {
	public static void main(String[] args) {
		System.out.println("The implementation AnimalDog.move() is inherited from super class Animal, it depends on the implementation of super class Animal.");
		System.out.println("When someone changes the implementation of super class Animal.move(), the output will change too. A bad design idea.");
		AnimalDog dog = new AnimalDog();
		dog.move();
		
		System.out.println("");
		System.out.println("AnimalEagle implements the inherited methods 'move()', this can permance the feature of 'AnimalEagle' instead of 'Animal'.");
		System.out.println("Even someone changed the implementaion of super class Animal.move(), this output keep still.");
		AnimalEagle eagle = new AnimalEagle();
		eagle.move();
		
		System.out.println("\nMARK:\nThe inheritance design is bad, because the subclass depends on the implementation details of its superclass. If the superclass changes, the subclass may break.");
	}
}
/**
 * The following two items can guide the selection between inheritance and composition:
 * 
 * If there is an IS-A relation, and a class wants to expose all the interface to another class, inheritance is likely to be preferred.
 * If there is a HAS-A relationship, composition is preferred.
 * In summary, Inheritance and composition both have their uses, and it pays to understand their relative merits.
 * 
 */