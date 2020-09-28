package com.bridgelabz.employeecheck;

public class EmpployeeWageMultipleCompanies {
	//constants
	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	
	//variables
	private String company;
	private int empWagePerHour;
	private int maxHoursAMonth;
	private int workingDayMonth;
	private int totalEmpwage;
	
	public EmpployeeWageMultipleCompanies(String company, int empWagePerHour, int maxHoursAMonth, int workingDayMonth) {
		this.company=company;
		this.empWagePerHour=empWagePerHour;
		this.maxHoursAMonth=maxHoursAMonth;
		this.workingDayMonth=workingDayMonth;
	}
	
	public void computeEmpWage() {
		//variables
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		 //Computation
		while(totalEmpHours<maxHoursAMonth && totalWorkingDays<workingDayMonth) {
			totalWorkingDays++;
			int empCheck=(int) (Math.floor(Math.random()*10)%3);
			switch(empCheck) {
			case IS_FULL_TIME:
				empHours=8;
				break;
			case IS_PART_TIME:
				empHours=4;
				break;

			default:
				empHours=0;
			}
			if (totalEmpHours<96) {
				totalEmpHours+=empHours;
				System.out.println("Days : "+totalWorkingDays+"\tEmployee hour : "+empHours+"\tTotal hours "+totalEmpHours);
			}
			else {
				totalEmpHours+=(100-totalEmpHours);
				System.out.println("Days : "+totalWorkingDays+"\tEmployee hour : "+empHours+"\tTotal hours "+totalEmpHours);
				break;
			}
		}
		totalEmpwage=totalEmpHours*empWagePerHour;
	}
	
	@Override
	public String toString() {
		return "Total employee wage for "+company+" is "+totalEmpwage;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpployeeWageMultipleCompanies reliance=new EmpployeeWageMultipleCompanies("Reliance", 12, 100, 20);
		EmpployeeWageMultipleCompanies amazon=new EmpployeeWageMultipleCompanies("Amazon", 15, 110, 22);
		reliance.computeEmpWage();
		System.out.println(reliance);    //Invoking toString method
		amazon.computeEmpWage();
		System.out.println(amazon);
	}

}
