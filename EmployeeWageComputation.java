package com.bridgelabz.employeecheck;

public class EmployeeWageComputation {
	//Variables
	int empWagePerHour=0;
	int empHoursPerDay=0;
	int empHours=0;
	int dayCount=0;
	int totalWage=0;
	int workDayMonth=0;
	int totalHoursMonth=0;
	//Constructor
	public EmployeeWageComputation(int empWagePerHour, int empHoursPerDay, int totalHoursMonth, int workDayMonth) {
		this.empWagePerHour=empWagePerHour;
		this.empHoursPerDay=empHoursPerDay;
		this.totalHoursMonth=totalHoursMonth;
		this.workDayMonth=workDayMonth;
	}

	public void fullTimeEmployee() {
		System.out.println("Days \t perDayHour \tTotal Wage");
		while(empHours<totalHoursMonth) {
			dayCount+=1;
			if (empHours<(totalHoursMonth-empHoursPerDay))
				empHours+=empHoursPerDay;
			else
			    empHours+=(totalHoursMonth-empHours);
			totalWage=empHours*empWagePerHour;
			System.out.println(dayCount+" \t "+empHours+" \t \t"+totalWage);
		}
		System.out.println("Finally Wage calculated for one month is : "+totalWage);
	}
	
	public void partTimeEmployee() {
		System.out.println("Days \t perDayHour \tTotal Wage");
		while(dayCount<workDayMonth) {
			dayCount+=1;
			empHours+=empHoursPerDay;
			totalWage=empHours*empWagePerHour;
			System.out.println(dayCount+" \t "+empHours+" \t \t"+totalWage);
		}
		System.out.println("Finally Wage calculated for one month is : "+totalWage);
	}
	
	public void employeeAbsent() {
		System.out.println(dayCount+" \t "+empHours+" \t \t"+totalWage);
		System.out.println("Finally Wage calculated for one month is : "+totalWage);
	}
}
