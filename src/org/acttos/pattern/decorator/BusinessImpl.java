package org.acttos.pattern.decorator;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class BusinessImpl implements IBusiness {

	@Override
	public void operation() {
		System.out.println("Business.operation() started ...");
		System.out.println("Step 1 ...");
		System.out.println("Step 2 ...");
		System.out.println("Step 3 ...");
		System.out.println("Business.operation() finished ...");
	}

}
