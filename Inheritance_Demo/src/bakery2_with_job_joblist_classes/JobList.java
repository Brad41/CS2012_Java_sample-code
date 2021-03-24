package bakery2_with_job_joblist_classes;

import java.util.ArrayList;

public class JobList {
	
	private ArrayList<Job> jobs = new ArrayList<>();
	
	public int getSize() {
		return jobs.size();
	}
	
	public Job getJob(int index) {
		return jobs.get(index);
	}
	
	public void addJob(Job aJob) {
		jobs.add(aJob);
	}
	
	public void removeJob(Job aJob) {
		jobs.remove(aJob);
	}
	
	public void saveToFile() {
		// save the joblist to a date named file at the end of the day
	}
	
	@Override
	public String toString() {
		return "show job list";
	}

}
