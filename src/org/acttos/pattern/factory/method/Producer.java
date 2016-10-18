package org.acttos.pattern.factory.method;

import org.acttos.pattern.factory.Product;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Producer {
	
	/**
	 * We receive an implement of IMethodFactory to do the producing.
	 * @param factory the implement of IMethodFactory which does nothing but defining.
	 * @return a product created by the give factory.
	 */
	public static Product create(IMethodFactory factory) {
		Product product = factory.create();
		
		return product;
	}
	
	public static void main(String[] args) {
		/**
		 * These lines below are a directly invoking of the implements of the interface.
		 */
		System.out.println("These lines below are a directly invoking of the implements of the interface."
				+ "\n================================================================================\n");
		IMethodFactory beijingFactory = new MethodFactoryBeijingImpl();
		Product beijingP = beijingFactory.create();
		
		System.out.println("A product called '" + beijingP.getName() + "' has been created.\n");
		
		IMethodFactory shanghaiFactory = new MethodFactoryShanghaiImpl();
		Product shanghaiP = shanghaiFactory.create();
		
		System.out.println("A product called '" + shanghaiP.getName() + "' has been created.\n");
		
		/**
		 * These lines below create a product with the given implement of IMethodFactory.
		 */
		System.out.println("These lines below create a product with the given implement of IMethodFactory."
				+ "\n================================================================================\n");
//		Product product = Producer.create(beijingFactory);
		Product product = Producer.create(shanghaiFactory);
		
		System.out.println("A product called '" + product.getName() + "' has been created.\n");
		
	}
}
