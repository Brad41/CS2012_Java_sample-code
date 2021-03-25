package bakery4_added_ui_pie;

import java.util.ArrayList;

public class UserInputInterface {

	JobList listOfJobs = new JobList();

	// TODO load list from workOrder.txt file

	// add new jobs to the list
	// this is hardcoded process - TODO replace with actual UI

	public void runTestCreateJobList() {
		// manually making a list of the cake jobs that need to be baked

		Cake c01 = new Cake(6);
		Cake c02 = new Cake(4);
		Cake c03 = new Cake(7);
		Cake c04 = new Cake(5);
		Cake c05 = new Cake(8);
		Cake c06 = new Cake(10);
		Cake c07 = new Cake(13);
		Cake c08 = new Cake(9);
		Cake c09 = new Cake(7);
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

	// getWorkList()
	public JobList getWorkList() {
		// probably be better to return a clone of jobList
		return listOfJobs;
	}

}
