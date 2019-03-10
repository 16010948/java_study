package project;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Hw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		LocalDateTime now=LocalDateTime.now();
		//DateTimeFormatter f=DateTimeFormatter("yyyy-MM-dd");
		//System.out.println(f.format("%d-%d-%d %d:%d",now.getYear(),now.getMonth(),now.getDayOfMonth(),now.getHour(),now.getMinute()));
		System.out.println(now);
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(4<=hour && hour <12) System.out.println("Good Morning");
		else if(12<=hour && hour <18) System.out.println("Good Afternoon");
		else if(18<=hour && hour <22) System.out.println("Good Evening");
		else System.out.println("Good Night");
		
	}

}
