package assignment2;

//Task 3 – Create a program which will store students information and print the output.
//Program should ask how many students information you want to store. For each students it should ask name, email, phone, address, status
//Once all entries are done, program should ask which user information you want to fetch and should print the same.
//Note- Use scanner class for dynamic students

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of Students :");	
		int total=sc.nextInt();
		
		System.out.println("Please enter the name :");
		String name=sc.next();
		
		System.out.println("Please enter the email :");
		String email=sc.next();
		
		System.out.println("The details are :" +total +" "+name +" "+ email);
		
		sc.close();
	}

}
