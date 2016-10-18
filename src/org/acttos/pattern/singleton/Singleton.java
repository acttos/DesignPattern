package org.acttos.pattern.singleton;

/**
 * This class is a demo of showing how to write a singleton class
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Singleton {
	private static Singleton instance;
	
	private Singleton(){
		super();
	}
	
	public static Singleton sharedInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public static Singleton instance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		/**
		 * Both of this lines below are ok. but I prefer the first one.
		 */
//		Singleton singleton = Singleton.sharedInstance();
		Singleton singleton = Singleton.instance();
	}
}
