package bakery2_with_job_joblist_classes;

import java.util.ArrayList;

public class RunBakery {

	public static void main(String[] args) {
		
		JobList jobList = new JobList();
		
		int OvenA = 20;
		int OvenB = 20;		

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
		jobList.addJob(c01);
		jobList.addJob(c02);
		jobList.addJob(c03);
		jobList.addJob(c04);
		jobList.addJob(c05);
		jobList.addJob(c06);
		jobList.addJob(c07);
		jobList.addJob(c08);
		jobList.addJob(c09);
		jobList.addJob(c10);
		jobList.addJob(c11);
		jobList.addJob(c12);

		System.out.println(jobList);

		// cook all cakes

		int count = 0;
		// version using Oven class instead of variables
			while (OvenA + OvenB > 0 && count < jobList.getSize()) {
				if (OvenA >= OvenB) {
					if ((OvenA - jobList.getJob(count).getCookingTime()) < 0) {
						jobList.getJob(count).setCookingTime(jobList.getJob(count).getCookingTime() - OvenA);
						OvenA = 0;
					} else {
						OvenA = OvenA - jobList.getJob(count).getCookingTime();
						jobList.getJob(count).setCookingTime(0);
					}
				} else {
					if ((OvenB - jobList.getJob(count).getCookingTime()) < 0) {
						jobList.getJob(count).setCookingTime(jobList.getJob(count).getCookingTime() - OvenB);
						OvenB = 0;
					} else {
						OvenB = OvenB - jobList.getJob(count).getCookingTime();
						jobList.getJob(count).setCookingTime(0);
					}
				}
				
			count++;
		}
		
		System.out.println("finished processing jobs");
		
		System.out.print("jobList:  ");
		System.out.println(jobList);
	
		FinishedJobList finishedJobs = new FinishedJobList();
		
		//adds to finishedJobList
		for (int i = 0; i < jobList.getSize(); i++) {
			if (jobList.getJob(i).getCookingTime() == 0) {
				finishedJobs.addJob(jobList.getJob(i));
			}
		}
		// save a file with finishedJobs info in it
		finishedJobs.saveToFile();
				
		// removes done items from jobList 
		for (int i = 0; i < finishedJobs.getSize(); i++) {
			jobList.removeJob(finishedJobs.getJob(i));
		}
		// now save as a file to start next day joblist
		jobList.saveToFile();
		
		
		System.out.print("jobList:  ");
		System.out.println(jobList);

		
		// prep for the next 'day'
		OvenA = 20;
		OvenB = 20;
 
		
	}
}
