package weekendnew4pm;

import java.util.Scanner;

public class nestedifelse {

	public static void main(String[] args) {
		System.out.println("enter the number..");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks<35)
			System.out.println("failed..");
		else if(marks>=35&&marks<=49)
		{
			System.out.println("passed with 3rd grade");
		}
		else if(marks>=50&&marks<=59)
		{
			System.out.println("passed with 2nd grade");
		}
		else if(marks>=60&&marks<=74)
		{
			System.out.println("passed with Ist grade");
		}
		else if(marks>=75&&marks<=100)
		{
			System.out.println("passed with Distinction grade");
		}
		else
		{
			System.out.println("wrong input");
		}
		
		
		
		
		

	}

}
