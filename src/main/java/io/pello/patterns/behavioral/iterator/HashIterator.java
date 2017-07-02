package io.pello.patterns.behavioral.iterator;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Implements iterator interface
 * @author Pello Xabier Altadill Izura
 * @param <T>
 * @greetz any
 */
public class HashIterator<S,T> implements Iterator<T> {
	private Hashtable<S,T> items;
	Enumeration keys;
	Object current;
	
	public HashIterator (Hashtable<S,T> items) {
		this.items = items;
		keys = items.keys();
		current = keys.nextElement();
	}
	
	@Override
	public void first() {
		current = items.keys().nextElement();
	}

	@Override
	public void next() {
		current = items.keys().nextElement();
	}

	@Override
	public boolean isDone() {
		return items.keys().hasMoreElements();
	}

	@Override
	public T currentItem() {
		return items.get(current);
	}

}
