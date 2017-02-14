package org.acttos.pattern.inheritance_composition.composition;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class AnimalDog extends Animal implements IAnimalMove {
	private IAnimalMove movement;
	
	public AnimalDog(IAnimalMove movement) {
		this.movement = movement;
	}

	@Override
	public void standUp() {
		if (null != this.movement) {
			this.movement.standUp();
		} else {
			System.out.println("No movement set, I don't know how to stand up.");
		}
		
	}

	@Override
	public void move() {
		if (null != this.movement) {
			this.movement.move();
		} else {
			System.out.println("No movement set, I don't know how to move.");
		}
	}
	
}
