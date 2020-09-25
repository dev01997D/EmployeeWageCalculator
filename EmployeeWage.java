package demo;

public class EmployeeWage{
	//constants
	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	
	//Variables
	static int empWage=0;
	static int empHours=0;
	static int dayCount=0;
	static int wage=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Welcome statement
		System.out.println("Welcome to Employee wage computation");
		
                //Creating object of class Employeewage
		EmployeeWage employeeObject=new EmployeeWage();

		//Computation
		int empCheck=(int) (Math.floor(Math.random()*10)%3);
		
		switch(empCheck) {
		case IS_FULL_TIME:
			employeeObject.fullTimeEmployee();
			break;
		case IS_PART_TIME:
			employeeObject.partTimeEmployee();
			break;
		default:
			employeeObject.employeeAbsent();
		}
		System.out.println("Finally Wage calculated for one month is :"+wage);
	}
	public void fullTimeEmployee() {
		System.out.println("Full time employee present");
		System.out.println("Days \t perDayHour \tTotal Wage");
		dayCount+=1;
		while(empHours<100) {
			if (empHours<96)
				empHours+=8;
			else
				empHours+=4;
			wage=empHours*20;
			System.out.println(dayCount+" \t "+empHours+" \t \t"+wage);
		}
	}
	public void partTimeEmployee() {
		System.out.println("Part time employee present");
		System.out.println("Days \t perDayHour \tTotal Wage");
		while(dayCount<20) {
			dayCount+=1;
			empHours+=4;
			wage=empHours*20;
			System.out.println(dayCount+" \t "+empHours+" \t \t"+wage);
		}
	}
	public void employeeAbsent() {
		System.out.println("Employee absent");
		
		System.out.println("Days \t perDayHour \tTotal Wage");
		System.out.println(dayCount+" \t "+empHours+" \t \t"+wage);
	}
}
