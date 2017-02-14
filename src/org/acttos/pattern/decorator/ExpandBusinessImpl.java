package org.acttos.pattern.decorator;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class ExpandBusinessImpl extends BusinessImpl {

	@Override
	public void operation() {
		/**
		 * The pre extra operation of expand business in new company, must be invoked at the beginning.
		 */
		this.preExtraOperation();
		
		/**
		 * The traditional business extended from traditional company, we keep all the business of old company and expand them. 
		 */
		super.operation();
		
		/**
		 * The post extra condition of expand business in new company, must be invoked at the ending.
		 */
		this.postExtraOperation();
	}
	
	public void preExtraOperation() {
		System.out.println("Doing the things in preExtraOperation ...");
	}
	
	public void postExtraOperation() {
		System.out.println("Doing the things in postExtraOperation ...");
	}

}
