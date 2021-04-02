package bakery4_added_ui_pie;

public class WorkScheduler {
	
	
	private JobList processedJobList;
	private JobList finishedJobs;
	private JobList unFinishedJobs;

	public void processJobs(JobList workIn) {
		finishedJobs = new JobList();
		unFinishedJobs = new JobList();
		processedJobList = workIn; // this really needs to be a deep copy
		// do all things
		int OvenA = 20;
		int OvenB = 20;
		int count = 0;
		// version using Oven class instead of variables
		while (OvenA + OvenB > 0 && count < processedJobList.getSize()) {
			if (OvenA >= OvenB) {
				if ((OvenA - processedJobList.getJob(count).getCookingTime()) < 0) {
					processedJobList.getJob(count)
							.setCookingTime(processedJobList.getJob(count).getCookingTime() - OvenA);
					OvenA = 0;
				} else {
					OvenA = OvenA - processedJobList.getJob(count).getCookingTime();
					processedJobList.getJob(count).setCookingTime(0);
				}
			} else {
				if ((OvenB - processedJobList.getJob(count).getCookingTime()) < 0) {
					processedJobList.getJob(count)
							.setCookingTime(processedJobList.getJob(count).getCookingTime() - OvenB);
					OvenB = 0;
				} else {
					OvenB = OvenB - processedJobList.getJob(count).getCookingTime();
					processedJobList.getJob(count).setCookingTime(0);
				}
			}

			count++;
		}

		splitList();
		saveToFiles();
	}

	private void splitList() {
		// adds to finishedJobList
		finishedJobs.clearList();
		unFinishedJobs.clearList();
		for (int i = 0; i < processedJobList.getSize(); i++) {
			if (processedJobList.getJob(i).getCookingTime() == 0) {
				finishedJobs.addJob(processedJobList.getJob(i));
			} else {
				unFinishedJobs.addJob(processedJobList.getJob(i));
			}
		}
	}

	private void saveToFiles() {
		// save a file with finishedJobs info in it
		finishedJobs.saveToFile("finishedJobs");

		// now save as a file to start next day joblist
		unFinishedJobs.saveToFile("workOrder");
	}
	
	public void printFinishedList() {
		finishedJobs.showJobList();
	}
	
	public void printUnFinishedList() {
		unFinishedJobs.showJobList();
	}

}
