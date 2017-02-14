package org.acttos.pattern.inheritance_composition.inheritance;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class AnimalEagle extends Animal {

	@Override
	public void eat() {
		System.out.println("Animal Eagle eats small animals.");
	}

	@Override
	public void standUp() {
		System.out.println("Animal Eagle stands up");
	}
	
	@Override
	public void move() {
		this.standUp();
		System.out.println("Animal Eagle moves by flying with wings.");
	}

}
