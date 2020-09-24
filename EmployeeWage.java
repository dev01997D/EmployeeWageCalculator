package com.bridgelabz.employeecheck;

public class EmployeeWage {
	//constants
	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Welcome statement
		System.out.println("Welcome to Employee wage computation");
		
		//Computation
		int empCheck=(int) (Math.floor(Math.random()*10)%2);
		if (empCheck==IS_FULL_TIME) {
			System.out.println("Full time employee present");
		}
		else if (empCheck==IS_PART_TIME){
			System.out.println("Part time employee present");
		}

	}

}
