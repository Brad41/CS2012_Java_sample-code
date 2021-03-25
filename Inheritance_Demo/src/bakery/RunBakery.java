package bakery;

import java.util.ArrayList;

public class RunBakery {

	public static void main(String[] args) {

		ArrayList<Cake> jobList = new ArrayList<>();

		int OvenA = 20;
		int OvenB = 20;

		// manually make the days cake jobs
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
		

		// add all the cake jobs to the jobList
		jobList.add(c01);
		jobList.add(c02);
		jobList.add(c03);
		jobList.add(c04);
		jobList.add(c05);
		jobList.add(c06);
		jobList.add(c07);
		jobList.add(c08);
		jobList.add(c09);
		jobList.add(c10);
		jobList.add(c11);
		jobList.add(c12);

		System.out.println(jobList);

		// cook the cakes

		int count = 0; //so that the while loop can work like a for loop
		while (OvenA + OvenB > 0 && count < jobList.size()) {
			if (OvenA >= OvenB) {
				if ((OvenA - jobList.get(count).cookingTime) < 0) {
					jobList.get(count).cookingTime = jobList.get(count).cookingTime - OvenA;
					OvenA = 0;
				} else {
					OvenA = OvenA - jobList.get(count).cookingTime;
					jobList.get(count).cookingTime = 0;
				}
			} else {
				if ((OvenB - jobList.get(count).cookingTime) < 0) {
					jobList.get(count).cookingTime = jobList.get(count).cookingTime - OvenB;
					OvenB = 0;
				} else {
					OvenB = OvenB - jobList.get(count).cookingTime;
					jobList.get(count).cookingTime = 0;
				}
			}

			count++;
		}

		System.out.println("finished while loop");

		ArrayList<Cake> isDone = new ArrayList<>();

		System.out.print("jobList:  ");
		System.out.println(jobList);
		System.out.print("toDone:  ");
		System.out.println(isDone);

		// adds to isDone
		for (int i = 0; i < jobList.size(); i++) {
			if (jobList.get(i).cookingTime == 0) {
				isDone.add(jobList.get(i));
			}
		}
		// save a file with isDone info in it

		// removes done items from jobList
		for (int i = 0; i < isDone.size(); i++) {
			jobList.remove(isDone.get(i));
		}
		// now save as a file to start next day joblist

		System.out.print("jobList:  ");
		System.out.println(jobList);
		System.out.print("toDone:  ");
		System.out.println(isDone);

		// prep for the next 'day'
		OvenA = 20;
		OvenB = 20;

	}

}
