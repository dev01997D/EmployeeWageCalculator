package com.bridgelabz.employeecheck;

public class EmployeeWage{
	//constants
	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	//variables
	private int noOfCompany=0;
	private EmployeeWageComputation[] compEmpWageArray;

	public EmployeeWage() {
		compEmpWageArray=new EmployeeWageComputation[5];
	}
	public void addCompanyEmpWage(String company, int empWagePerHour, int maxHoursAMonth, int workingDayMonth) {
		compEmpWageArray[noOfCompany]=new EmployeeWageComputation(company, empWagePerHour, maxHoursAMonth, workingDayMonth);
		noOfCompany++;
	}

	private void computeEmpWage() {
		for(int i=0; i<noOfCompany; i++) {
			compEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(compEmpWageArray[i]));
			System.out.println(compEmpWageArray[i]);
			System.out.println("\n");
		}
	}

	private int computeEmpWage(EmployeeWageComputation employeewage) {
		//variables
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		//Computation
		while(totalEmpHours<employeewage.maxHoursAMonth && totalWorkingDays<employeewage.workingDayMonth) {
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
		return totalEmpHours*employeewage.empWagePerHour;
	}
	public static void main(String[] args) {
		//Welcome statement
		System.out.println("Welcome to Employee wage computation");
		EmployeeWage empWage=new EmployeeWage();
		empWage.addCompanyEmpWage("Reliance", 15, 110, 20);
		empWage.addCompanyEmpWage("Amazon", 18, 115, 22);
		empWage.addCompanyEmpWage("Capgemini", 20, 100, 20);
		empWage.computeEmpWage();
	}

}
