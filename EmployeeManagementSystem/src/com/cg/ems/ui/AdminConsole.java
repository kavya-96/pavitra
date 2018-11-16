package com.cg.ems.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.cg.ems.model.Employee;

public class AdminConsole {

	private String currentUser;

	public AdminConsole(String currentUser) {
		super();
		this.currentUser = currentUser;
	}
	 static Scanner scanner = new Scanner(System.in);
	public void start()
	{
		
		int choice = -1;
		
		while (choice != 5) {

			System.out.println("Menu:");
			System.out.println("Enter 1 for add details of employee");

			System.out.println("Enter 2 for updating employee details");
			System.out.println("Enter 3 for displaying all Employee details");
			System.out.println("Enter 4 for Exit");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
		
		
			switch (choice) {
		case 1: addEmployee();	
		
		break;
		}
		}
		
	}
	private void addEmployee() {
		
		System.out.println("Enter Employee Id :");
        String employeeId=scanner.nextLine();
		System.out.println("Enter Employee First Name :");
		String empFirstName=scanner.nextLine();
		System.out.println("Enter Employee Last Name :");
		String empLastName=scanner.nextLine();
		System.out.println("Enter Employee DOB :");
		String empDob=scanner.nextLine();
		System.out.println("Enter date of joining");
		String empDOJ = scanner.nextLine();
		System.out.println("Enter employee department id");
		int empDeptId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee grade");
		String empGrade = scanner.nextLine();
		System.out.println("Enter employee designation");
		String empDesign = scanner.nextLine();
		System.out.println("Enter employee salary");
		int empSalary = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee gender");
		String empGender = scanner.nextLine();
		System.out.println("Enter employee marital status");
		String empMarStatus = scanner.nextLine();
		System.out.println("Enter employee address");
		String empAddress = scanner.nextLine();
		System.out.println("Enter employee contact number");
		String empPhNo=scanner.nextLine();
		System.out.println("Enter employee manager Id");
		String empMgrId = scanner.nextLine();
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		String empDOB=format.format(empDob);
		try {
			Date dob=format.parse(empDOB);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		String empDOJ=format.format(empDOJ);
		try {
			Date doj=format.parse(empDOJ);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		 
		Employee employee=new Employee(employeeId, empFirstName, empLastName, dob, doj, empDeptId, empGrade, empDesign, empSalary, empGender, empMarStatus, empAddress, empPhNo, empMgrId);
		
		
		
	}
}
