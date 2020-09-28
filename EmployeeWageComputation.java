package com.bridgelabz.employeecheck;

public class EmployeeWageComputation {
	//variables
	public final String company;
	public final int empWagePerHour;
	public final int maxHoursAMonth;
	public final int workingDayMonth;
	public int totalEmpwage;
	
	public EmployeeWageComputation(String company, int empWagePerHour, int maxHoursAMonth, int workingDayMonth) {
		this.company=company;
		this.empWagePerHour=empWagePerHour;
		this.maxHoursAMonth=maxHoursAMonth;
		this.workingDayMonth=workingDayMonth;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpwage=totalEmpWage;
	}
	@Override
	public String toString() {
		return "Total employee wage for "+company+" is "+totalEmpwage;
	}
}
