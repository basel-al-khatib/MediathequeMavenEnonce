package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalogue() {
		for (Item i : items)
			i.print();
	}
	
	public void printBooksOnly() {
		throw new UnsupportedOperationException("Not supported yet."); 
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
	}

	public void printCDsOnly() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

}
