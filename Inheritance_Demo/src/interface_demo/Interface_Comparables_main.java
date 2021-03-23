package interface_demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

public class Interface_Comparables_main {

	public static void main(String[] args) {
		
		Integer bob = 99;
		

		
		ArrayList<Integer> myArr = new ArrayList<>();
		
		myArr.add(14); myArr.add(99); myArr.add(2); myArr.add(27); myArr.add(68); //myArr.add("bob");
		
		System.out.println(myArr);
		
		Collections.sort(myArr);
		
		System.out.println(myArr);
		
		System.out.println( Integer.valueOf(23) < Integer.valueOf(45) );
	}

}
















//System.out.print("Integer to Integer:  ");
//System.out.println((Integer.valueOf(3)).compareTo(Integer.valueOf(59)));
//
//System.out.print("String to String:  ");
//System.out.println("AF".compareTo("AB"));
//
//Calendar date1 = new GregorianCalendar(2021, 03, 19);
////Date date1 = new Date(2013, 1, 1);
//    
//Calendar date2 = new GregorianCalendar(2020, 01, 31);
////Date date2 = new Date(2012, 1, 1);
//
//System.out.print("Date to Date:  ");
//System.out.println(date1.compareTo(date2));

