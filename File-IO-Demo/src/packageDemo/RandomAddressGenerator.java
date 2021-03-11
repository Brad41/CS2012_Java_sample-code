package packageDemo;

import java.util.ArrayList;
import java.util.Random;

public class RandomAddressGenerator {

	public static void main(String[] args) {
		
		ArrayList<String> emailExt = new ArrayList<>();	
		emailExt.add("gmail.com");
		emailExt.add("yahoo.com");
		emailExt.add("aol.com");
		emailExt.add("hotmail.com");
		emailExt.add("att.net");
		emailExt.add("spectrum.net");
		emailExt.add("calstatela.edu");
		
		Random rndnum = new Random();
		int arrayIndex = rndnum.nextInt(emailExt.size());
		
		System.out.println(emailExt.get(arrayIndex));
		



	}

}
