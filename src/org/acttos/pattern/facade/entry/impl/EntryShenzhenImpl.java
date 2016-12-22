package org.acttos.pattern.facade.entry.impl;

import org.acttos.pattern.facade.entry.IEntry;
import org.acttos.pattern.facade.entry.domain.EntryInfo;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class EntryShenzhenImpl implements IEntry {

	/* (non-Javadoc)
	 * @see org.acttos.pattern.facade.entry.IEntry#enter(org.acttos.pattern.facade.entry.domain.EntryInfo)
	 */
	@Override
	public void enter(EntryInfo entryInfo) {
		System.out.println("I am Shenzhen Entry handler, I received a cargo '" + entryInfo.getCargo() + "'.");
	}

}
