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
		
		//Welcome statement
		System.out.println("Welcome to Employee wage computation");
		
		//Computation
		int empCheck=(int) (Math.floor(Math.random()*10)%3);
		
		//using switch case
		switch(empCheck) {
		case IS_FULL_TIME:
			System.out.println("Full time employee present");
			empHours=8;
			break;
		case IS_PART_TIME:
			System.out.println("Part time employee present");
			empHours=4;
			break;
		default:
			System.out.println("Employee absent");
			empHours=0;
			break;
		}
		
		//Daily wage calculation
		empWage=empHours*20;
		
		System.out.println("Employee daily wage is :"+empWage);

	}

}
