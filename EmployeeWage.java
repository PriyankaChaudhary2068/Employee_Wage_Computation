package com.bridgelabz.employeeWage;

public class EmployeeWage {

    static final int IS_PRESENT = 1;

    public static void main(String[] args) {
    	
        System.out.println("Welcome to Employee Wage Computation Program");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
        
    }
}



	


