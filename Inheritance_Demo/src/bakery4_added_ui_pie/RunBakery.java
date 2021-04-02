package bakery4_added_ui_pie;

import java.util.ArrayList;

public class RunBakery {

	public static void main(String[] args) {
		System.out.println("running bakery4_added_ui_pie"); // debug

		int dayNum = 0;
		UserInputInterface ui = new UserInputInterface();
		WorkScheduler jobrunner = new WorkScheduler();
		
		while (true) { // the work never ends :)
			dayNum++;
			
			// ----- do input phase -----		
			ui.runUserInterface(dayNum);

			JobList workOrder = ui.getWorkList();


			// ----- do processing phase ----- (cook all cakes)
			jobrunner.processJobs(workOrder);

			System.out.println("print finished"); // debug
			jobrunner.printFinishedList();
			System.out.println("print unfinished"); // debug
			jobrunner.printUnFinishedList();
			// ----- do output phase -----

			ui.printEndOfDayReport();

		}
	}
}
