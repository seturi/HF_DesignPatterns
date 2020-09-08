package headfirst.designpatterns.c09_iterator_composite.iterator.dinermerger_import_iterator;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
