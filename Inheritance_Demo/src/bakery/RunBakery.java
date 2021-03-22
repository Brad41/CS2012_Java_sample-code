package bakery;

import java.util.ArrayList;

public class RunBakery {

	public static void main(String[] args) {

		Oven A = new Oven();
		Oven B = new Oven();

		int OvenA = 20;
		int OvenB = 20;

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

		ArrayList<Cake> jobList = new ArrayList<>();
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

		// cook all cakes

		int count = 0;
		while (OvenA + OvenB > 0 && count < jobList.size() - 1) {
			if (OvenA >= OvenB) {
				if ((OvenA - jobList.get(count).cookingTime) < 0) {
					jobList.get(count).cookingTime = jobList.get(count).cookingTime - OvenA;
					OvenA = 0;
				} else {
					jobList.get(count).cookingTime = 0;
					OvenA = OvenA - jobList.get(count).cookingTime;
				}
			} else {
				if ((OvenB - jobList.get(count).cookingTime) < 0) {
					jobList.get(count).cookingTime = jobList.get(count).cookingTime - OvenB;
					OvenB = 0;
				} else {
					jobList.get(count).cookingTime = 0;
					OvenB = OvenB - jobList.get(count).cookingTime;
				}
			}
			count++;
		}
		System.out.println("finished while loop");
		

		ArrayList<Cake> toDone = new ArrayList<>();

		//adds to toDone
		for (int i = 0; i < jobList.size(); i++) {
			if (jobList.get(i).cookingTime == 0) {
				toDone.add(jobList.get(i));
			}
		}
		
		//adds to toDone
		for (int i = 0; i < toDone.size(); i++) {
			jobList.remove(toDone.get(i));
			System.out.println(toDone.get(i));
		}
		
		OvenA = 20;
		OvenB = 20;
 
		
	}

}
