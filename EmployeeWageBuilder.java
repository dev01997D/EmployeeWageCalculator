package com.bridgelabz.employeecheck;

public interface EmployeeWageBuilder {
	public void addCompanyEmpWage(String company, int empWagePerHour, int maxHoursAMonth, int workingDayMonth);
	public void computeEmpWage();
	public int getTotalWage(EmployeeWageComputation employeewage);
}
