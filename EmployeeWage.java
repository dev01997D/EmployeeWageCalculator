package com.bridgelabz.employeecheck;
import java.util.ArrayList;

public class EmployeeWage implements EmployeeWageBuilder{
	//constants
	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	//variables
	private int noOfCompany=0;
	private ArrayList<EmployeeWageComputation> compEmpWageArrayList;

	public EmployeeWage() {
		compEmpWageArrayList=new ArrayList<>();
	}
	public void addCompanyEmpWage(String company, int empWagePerHour, int maxHoursAMonth, int workingDayMonth) {
		EmployeeWageComputation newCompanyObj=new EmployeeWageComputation(company, empWagePerHour, maxHoursAMonth, workingDayMonth);
		compEmpWageArrayList.add(newCompanyObj);
	}

	public void computeEmpWage() {
		for(int i=0; i<compEmpWageArrayList.size(); i++) {
			EmployeeWageComputation newCompanyObj=compEmpWageArrayList.get(i);
			newCompanyObj.setTotalEmpWage(this.getTotalWage(newCompanyObj));
			System.out.println(newCompanyObj);
			System.out.println("\n");
		}
	}
	public int getTotalWage(EmployeeWageComputation employeewage) {
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
