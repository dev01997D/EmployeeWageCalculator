package com.bridgelabz.employeecheck;

public class EmployeeWage{
	//constants
	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	public static final int IS_RELIANCE=0;
	public static final int IS_AMAZON=1;
	
	//variables
	public static int empCheck=(int) (Math.floor(Math.random()*10)%3);
	public static int selectCompany=(int) (Math.floor(Math.random()*10)%2);

	public static void main(String[] args) {
		//Welcome statement
		System.out.println("Welcome to Employee wage computation");

                //Creating object of class EmployeewageComputation
		EmployeeWageComputation employeeRelianceFTE=new EmployeeWageComputation(45, 10, 160, 20);
		EmployeeWageComputation employeeReliancePTE=new EmployeeWageComputation(45, 6, 160, 20);
		
		EmployeeWageComputation employeeAmazonFTE=new EmployeeWageComputation(50, 9, 150, 22);
		EmployeeWageComputation employeeAmazonPTE=new EmployeeWageComputation(50, 5, 150, 22);
                EmployeeWageComputation employeeObjectAbsent=new EmployeeWageComputation(0, 0, 0, 0);
        		
		switch(empCheck) {
		case IS_FULL_TIME:
			if (selectCompany==IS_RELIANCE) {
				System.out.println("This is the Portal of Reliance Company for Full Time Employee");
				employeeRelianceFTE.fullTimeEmployee();
			}
			else if(selectCompany==IS_AMAZON){
				System.out.println("This is the Portal of Amazon Company for Full Time Employee");
				employeeAmazonFTE.fullTimeEmployee();
			}
			break;
		case IS_PART_TIME:
			if (selectCompany==IS_RELIANCE) {
				System.out.println("This is the Portal of Reliance Company for Part Time Employee");
				employeeReliancePTE.partTimeEmployee();
			}
			else {
				System.out.println("This is the Portal of Amazon Company for Part Time Employee");
				employeeAmazonPTE.partTimeEmployee();
			}
			break;
		default:
			System.out.println("Employee is Absent in the Company from One Month");
			employeeObjectAbsent.employeeAbsent();
		}
	}
}
