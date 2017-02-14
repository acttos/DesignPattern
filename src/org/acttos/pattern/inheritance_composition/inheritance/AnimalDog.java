package org.acttos.pattern.inheritance_composition.inheritance;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class AnimalDog extends Animal {

	@Override
	public void eat() {
		System.out.println("Animal Dog eats bones.");
	}
	
	@Override
	public void standUp() {
		System.out.println("Animal Dog stands up");
	}

//	@Override
//	public void move() {
//		this.standUp();
//		System.out.println("Animal Dog moves by feet.");
//	}
	
}
