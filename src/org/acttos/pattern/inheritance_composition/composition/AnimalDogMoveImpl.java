package org.acttos.pattern.inheritance_composition.composition;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class AnimalDogMoveImpl implements IAnimalMove {

	private String standUpText;
	private String moveText;
	
	public AnimalDogMoveImpl(String standUpText, String moveText) {
		this.standUpText = standUpText;
		this.moveText = moveText;
	}

	@Override
	public void standUp() {
		System.out.println("Animal Dog's standUpText:" + this.standUpText);
	}

	@Override
	public void move() {
		this.standUp();
		System.out.println("Animal Dog's moveText:" + this.moveText);
	}

}
