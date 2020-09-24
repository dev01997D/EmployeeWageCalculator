package com.bridgelabz.employeecheck;

public class EmployeeWage {
	//constants
	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int empWage=0;
		int empHours=0;
		int monthlyWage=0;
		int dayCount=0;
		int wage=0;
		
		//Welcome statement
		System.out.println("Welcome to Employee wage computation");
		
		//Computation
		int empCheck=(int) (Math.floor(Math.random()*10)%3);
		
		//using switch case
		switch(empCheck) {
		case IS_FULL_TIME:
			System.out.println("Full time employee present");
			System.out.println("Days \t perDayHour \tTotal Wage");
			int i=1;
			while(empHours<100) {
				if (empHours<96)
					empHours+=8;
				else
					empHours+=4;
				wage=empHours*20;
				System.out.println(i+" \t "+empHours+" \t \t"+wage);
				i+=1;
			}
			break;
		case IS_PART_TIME:
			System.out.println("Part time employee present");
			System.out.println("Days \t perDayHour \tTotal Wage");
			while(dayCount<20) {
				dayCount+=1;
				empHours+=4;
				wage=empHours*20;
				System.out.println(dayCount+" \t "+empHours+" \t \t"+wage);
			}
			break;
		default:
			System.out.println("Employee absent");
			empHours=0;
			break;
		}
	}
}
