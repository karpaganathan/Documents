package jp1;

import java.util.Scanner;

public class jp4 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the marks: ");
	        int marks = scanner.nextInt();
	        scanner.close();

	        int grade = marks / 10;

	        switch (grade) {
	            
	            case 1:
	                System.out.println("Grade: A");
	                break;
	            case 2:
	                System.out.println("Grade: B");
	                break;
	            case 3:
	                System.out.println("Grade: C");
	                break;
	            case 4:
	                System.out.println("Grade: D");
	                break;
	            default:
	                System.out.println("Grade: F");
	        }
	    }
	}
	



		
		
		
		

