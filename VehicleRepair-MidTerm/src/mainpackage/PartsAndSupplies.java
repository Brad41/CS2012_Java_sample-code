package mainpackage;

import java.util.ArrayList;

public class PartsAndSupplies {

	public static ArrayList<String> itemsUsed = new ArrayList<>();

	public static String getItem(String item) {
		itemsUsed.add(item);
		return "issued " + item;
	}

	public static void clearList() {
		itemsUsed.clear();
	}

	public static void createRestockOrderFile() {
		// TODO
		// save the itemsUsed to a text file
		clearList();
	}
	
}
