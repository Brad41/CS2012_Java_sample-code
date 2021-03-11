package packageDemo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomAddressGenerator {

	public static void main(String[] args) {

		String pathString = "";
		String tempText = "";

		ArrayList<String> emailExt = new ArrayList<>();
		emailExt.add("gmail.com");
		emailExt.add("yahoo.com");
		emailExt.add("aol.com");
		emailExt.add("hotmail.com");
		emailExt.add("att.net");
		emailExt.add("spectrum.net");
		emailExt.add("calstatela.edu");

		ArrayList<String> firstnames = new ArrayList<>();
		ArrayList<String> lastnames = new ArrayList<>();
		ArrayList<String> areacodes = new ArrayList<>();

		Random rndnum = new Random();
		int arrayIndex = rndnum.nextInt(emailExt.size());

		System.out.println(emailExt.get(arrayIndex));
		System.out.println(emailExt.get((int) (new Random()).nextInt(emailExt.size())));

		// ---reading form files ---

		// this will expect the file to exist in the default location
		String firstNamePath = "firstNames.txt";
		String lastNamePath = "lastNames.txt";
		String areaCodesPath = "areaCodes.txt";

		try {
			File firstNameFile = new File(firstNamePath);
			File lastNameFile = new File(lastNamePath);
			File areacodesFile = new File(areaCodesPath);
			
			Scanner fnScan = new Scanner(firstNameFile);
			Scanner lnScan = new Scanner(lastNameFile);
			Scanner acScan = new Scanner(areacodesFile);

			while (fnScan.hasNext()) {
				tempText = fnScan.nextLine();
				firstnames.add(tempText);
			}
			
			while (lnScan.hasNext()) {
				tempText = lnScan.nextLine();
				lastnames.add(tempText);
			}
			
			while (acScan.hasNext()) {
				tempText = acScan.nextLine();
				areacodes.add(tempText);
			}

			
			System.out.println(firstnames.get((int) (new Random()).nextInt(firstnames.size())));

			fnScan.close();
			lnScan.close();
			acScan.close();

		} catch (Exception x) {
			// if it breaks catch and print out what went wrong
			System.out.println(x);
		}

		// --- write to file ---
		pathString = "phoneBook.txt";

		try {
			File outputFile = new File(pathString);
			PrintWriter prtout = new PrintWriter(outputFile);

			for (int i = 0; i < 10; i++) {
				
				prtout.println(firstnames.get((int) (new Random()).nextInt(firstnames.size())));
				prtout.println(lastnames.get((int) (new Random()).nextInt(lastnames.size())));
				prtout.println(areacodes.get((int) (new Random()).nextInt(areacodes.size())));
				prtout.println(emailExt.get((int) (new Random()).nextInt(emailExt.size())));
			}

			prtout.flush();
			prtout.close();

		} catch (IOException e) {
			// if something breaks catch and print out what went wrong
			System.err.println(e);
		}

	}

}
