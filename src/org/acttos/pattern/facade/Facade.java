package org.acttos.pattern.facade;

import java.util.HashMap;
import java.util.Map;

import org.acttos.pattern.facade.entry.IEntry;
import org.acttos.pattern.facade.entry.domain.EntryInfo;
import org.acttos.pattern.facade.entry.impl.EntryBeijingImpl;
import org.acttos.pattern.facade.entry.impl.EntryGuangzhouImpl;
import org.acttos.pattern.facade.entry.impl.EntryShanghaiImpl;
import org.acttos.pattern.facade.entry.impl.EntryShenzhenImpl;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class Facade {
	private static Map<String,IEntry> entryMap = null;
	
	static {
		entryMap = new HashMap<String,IEntry>();
		entryMap.put("Beijing", new EntryBeijingImpl());
		entryMap.put("Shanghai", new EntryShanghaiImpl());
		entryMap.put("Guangzhou", new EntryGuangzhouImpl());
		entryMap.put("Shenzhen", new EntryShenzhenImpl());
	}
	
	public void handleRequest(EntryInfo entryInfo) {
		//Facade Pattern Example
		try {
			entryMap.get(entryInfo.getCity()).enter(entryInfo);
		} catch (Exception e) {
			this.printError("Sorry, we can NOT handle " + entryInfo.getCity() + "’s cargos for now.");
		}
	}
	
	public void printError(String message) {
		System.out.println("========== ERROR ==========\n" + message + "\n========== ERROR ==========");
	}
	
	public static void main(String[] args) {
		Facade facade = new Facade();
		
		EntryInfo entryInfo = new EntryInfo();
		entryInfo.setCity("Beijing");
		entryInfo.setCargo("Cargo for " + entryInfo.getCity());
		facade.handleRequest(entryInfo);
		
		entryInfo.setCity("Shanghai");
		entryInfo.setCargo("Cargo for " + entryInfo.getCity());
		facade.handleRequest(entryInfo);
		
		entryInfo.setCity("Guangzhou");
		entryInfo.setCargo("Cargo for " + entryInfo.getCity());
		facade.handleRequest(entryInfo);
		
		entryInfo.setCity("Shenzhen");
		entryInfo.setCargo("Cargo for " + entryInfo.getCity());
		facade.handleRequest(entryInfo);
		
		entryInfo.setCity("Nanjing");
		entryInfo.setCargo("Cargo for " + entryInfo.getCity());
		facade.handleRequest(entryInfo);
		
	}

}
