package org.acttos.pattern.decorator;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Decorator {
	public static void main(String[] args) {
		
		/**
		 * At the early days of the company, we do the business which can bring incomes for living ... 
		 */
		IBusiness traditionalBusiness = new BusinessImpl();
		Company traditionalCompany = new Company(traditionalBusiness);
		//The company lives with original business
		traditionalCompany.doBusiness();
		
		/**
		 * The day when company becomes bigger, we expand the business to offer better services for our customers to live longer ...
		 * But we can NOT throw the old business away, we need to keep them and also add some new valuable business too.
		 * 
		 * In ExpandBusinessImpl, we put in the new business and at the same time keep the old business without modifying the BusinessImpl class.
		 */
		IBusiness expandBusiness = new ExpandBusinessImpl();
		Company newCompany = new Company(expandBusiness);
		//The company expanded the business with the old business stays.
		newCompany.doBusiness();
	}
}
/**
 * When you want to add some extra operations to an existed class who implements one or more interfaces, you should prefer Decorator pattern.
 * With Decorator pattern, you don't need to modify the interfaces, just add the extra operations before or after the invoking of the interface.
 * Decorator follows 'Open-Closed Principle'.   
 */