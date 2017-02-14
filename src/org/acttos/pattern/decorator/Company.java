package org.acttos.pattern.decorator;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Company {
	
	private IBusiness business;
	public Company(IBusiness business) {
		this.business = business;
	}
	
	public void doBusiness() {
		this.business.operation();
	}
}
