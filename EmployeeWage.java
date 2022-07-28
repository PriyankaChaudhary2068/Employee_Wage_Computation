package com.bridgelabz.employeeWage;


public class EmployeeWage {

     public static final int IS_PART_TIME = 1;
	 public static final int IS_FUll_TIME = 2;

	    public static int computeEmployeeWage(String company, int employeeRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth) {
	    	
	        int totalEmployeeHours = 0;
	        int  totalWorkingDays = 0;

	        while (totalEmployeeHours <= maxHoursPerMonth && totalWorkingDays < numberOfWorkingDays) {

	            int employeeHours = 0;
	            totalWorkingDays++;

	            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;

	            switch (employeeCheck) {

	                case IS_FUll_TIME:
	                    employeeHours = 8;
	                    break;

	                case IS_PART_TIME:
	                    employeeHours = 4;
	                    break;

	                default:
	                    employeeHours = 0;
	            }

	            totalEmployeeHours += employeeHours;
	            System.out.println("Day " +totalWorkingDays+  " :"  + " " + "Emp Hrs : " + employeeHours);
	        }
	        int totalEmployeeWage = totalEmployeeHours * employeeRatePerHour;
	        System.out.println("Total Employee wage for company : " + company + " is :" + totalEmployeeWage);
	        return totalEmployeeWage;

	    }

	    public static void main(String[] args) {

	        computeEmployeeWage("WIPRO", 20, 2, 10);
	        computeEmployeeWage("INFOSYS", 10, 3, 20);
	    }
	}


	        		    