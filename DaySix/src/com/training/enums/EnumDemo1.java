package com.training.enums;

public class EnumDemo1 {
	public enum Day{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}	

	Day day;

	public EnumDemo1(Day day) {
		this.day=day;
	}


	public void tellMeTheDay() {
		switch(day) {
		case MONDAY:
			System.out.println("Monday is bad");
			break;
		case FRIDAY:
			System.out.println("Friday is better");
			break;
		case SATURDAY:
			System.out.println("Weekend party");
			break;
		case SUNDAY:
			System.out.println("RELAX");
			break;
		default:
			System.out.println("Default case");
		}
	}

	public static void main(String[] args) {

		EnumDemo1 e1=new EnumDemo1(Day.FRIDAY);
		e1.tellMeTheDay();

	}
}

