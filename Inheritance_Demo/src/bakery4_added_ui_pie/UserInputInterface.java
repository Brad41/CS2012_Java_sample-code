package bakery4_added_ui_pie;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInputInterface {

	JobList listOfJobs = new JobList();
	// JobList listOfJobsX = new JobList();

	// TODO load list from workOrder.txt file

	// add new jobs to the listOfJobs

	// this is hard coded process - TODO replace with actual UI

	public JobList runUserInterface(int dayNum) {
		listOfJobs.clearList();
		System.out.println("####################################################");
		System.out.println("Welcome to day number " + dayNum + ".");
		System.out.println("-----------------------------");
		importJobList();
		System.out.println("Jobs from previous day work orders have been added to the job list.");
		showJobList();
		runUserInputMenu();
		System.out.println("Jobs to be run on day " + dayNum + ": ");
		showJobList();
		System.out.println("-----------------------------");
		return getWorkList();
	}

	private void runUserInputMenu() {
		try {
			Scanner inScan = new Scanner(System.in);
			showSelectionMenu_1();
			boolean runLoop = true;
			while (runLoop) {
				String strIn = inScan.nextLine();

				switch (strIn) {
				case "0":
					System.out.println("Sorry to see that you have gone out of business. Good bye");
					System.exit(0);
					break;
				case "1":
					runTestCreateJobList();
					System.out.println("Hard coded jobs have been added.");
					break;
				case "2":
					showJobList();
					break;
				case "3":
					System.out.println("bake!");
					runLoop = false; // escape the while loop
					break;
				case "4":
				
					break; 
				default:
					System.out.println("Invalid input");
				}
				
				showSelectionMenu_1();
			}

		} catch (Exception x) {
			System.out.println(x);
		}
	}
	
	private void showSelectionMenu_1() {
		System.out.println("Please make a selection:"
				+ "\n0 - Quit program " 
				+ "\n1 - Add hard coded job list "
				+ "\n2 - Show current Job List" 
				+ "\n3 - Start baking!");
	}

	public void importJobList() {
		// gets list of previous day unfinished jobs and makes a new jobList
		String pathString = "workOrder.txt";
		ArrayList<String> workInput = new ArrayList<>();

		try {
			File aFile = new File(pathString);
			Scanner myScan = new Scanner(aFile);
			String tempText = "";
			int highestOrderNumberFound = 0;
			// System.out.println("entering scan loop");
			while (myScan.hasNext()) {

				// reading job information from the workOrder.txt file

				// format of workOrder.txt file is:
				// Class
				// cooking time
				// order number

				// get class type of job
				String lineInput = myScan.nextLine();
				// get the time from file needed for this job
				int newTime = myScan.nextInt();
				myScan.nextLine(); // nextInt leaves an extra newline char behind and this cleans it up
				// get the original order number for this job from the file
				int newOrderNumber = myScan.nextInt();
				myScan.nextLine(); // nextInt leaves an extra newline char behind and this cleans it up

				// track largest job number
				if (newOrderNumber > highestOrderNumberFound) {
					highestOrderNumberFound = newOrderNumber;
				}

				if (lineInput.equals("Cake")) {
					// make a Cake object
					Cake tempCake = new Cake(newTime, true); // if Cake make Cake
					tempCake.setThisOrderNumber(newOrderNumber);
					listOfJobs.addJob(tempCake);

				} else if (lineInput.equals("Pie")) {
					// make a Pie object
					Pie tempPie = new Pie(newTime, true); // if Pie make Pie
					tempPie.setThisOrderNumber(newOrderNumber);
					listOfJobs.addJob(tempPie);
				} else {
					throw new Exception("bad file format"); // means it could not find a valid Job Class Name
				}

				Job.setOrderNumber(highestOrderNumberFound); // preps the job orderNumber for entry of new jobs
			}

			myScan.close();

		} catch (Exception x) {
			// if it breaks catch and print out what went wrong
			System.out.println(x);
		}
	}

	public void showJobList() {
		listOfJobs.showJobList();
	}

	public void printEndOfDayReport() {
		System.out.println("*********************************");
		System.out.println("printEndOfDayReport here");
		System.out.println("*********************************");
	}
	
	public JobList getWorkList() {
		// probably be better to return a clone of jobList ... later
		return listOfJobs;
	}

	// hard coded jobs for testing purposes only
	public void runTestCreateJobList() {
		// manually making a list of the cake jobs that need to be baked

		Cake c01 = new Cake(6);
		Cake c02 = new Cake(4);
		Cake c03 = new Cake(7);
		Cake c04 = new Cake(5);
		Pie c05 = new Pie(8);
		Cake c06 = new Cake(10);
		Cake c07 = new Cake(13);
		Cake c08 = new Cake(9);
		Pie c09 = new Pie(7);
		Cake c10 = new Cake(11);
		Cake c11 = new Cake(3);
		Cake c12 = new Cake(7);

		// adding all the cake jobs to the job list
		listOfJobs.addJob(c01);
		listOfJobs.addJob(c02);
		listOfJobs.addJob(c03);
		listOfJobs.addJob(c04);
		listOfJobs.addJob(c05);
		listOfJobs.addJob(c06);
		listOfJobs.addJob(c07);
		listOfJobs.addJob(c08);
		listOfJobs.addJob(c09);
		listOfJobs.addJob(c10);
		listOfJobs.addJob(c11);
		listOfJobs.addJob(c12);
	}

}
