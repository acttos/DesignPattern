package org.acttos.pattern.inheritance_composition;

import org.acttos.pattern.inheritance_composition.composition.AnimalDog;
import org.acttos.pattern.inheritance_composition.composition.AnimalDogMoveImpl;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Composition {

	public static void main(String[] args) {
		System.out.println("In composition, we define classes with implemented interfaces which do the real work only for the receiver.");
		System.out.println("Because the interface is designed only for the receiver, so dog Ben and dog Hank can performance the same movement in different ways.");
		System.out.println("");
		
		AnimalDog ben = new AnimalDog(new AnimalDogMoveImpl("Ben, Stand Up!", "Ben, Move!"));
		ben.move();
		
		System.out.println("");
		
		AnimalDog hank = new AnimalDog(new AnimalDogMoveImpl("Hank, Up!", "Hank, Move!"));
		hank.move();
		
		System.out.println("");
		System.out.println("Class AnimalDogMoveImpl is only for the movement of Dog, all the dogs have the same performance in common, so we can define class AnimalDogMoveImpl.");
		System.out.println("Other animals with a certain implementation of IAnimalMove, can perform the same way in commom.");
		
		System.out.println("\nMARK:\nComposition defines different implementations of an interface, every implementation can define the details of movement, and all the implementations have nothing connected, they just work speparatedly. This is a better design.");

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