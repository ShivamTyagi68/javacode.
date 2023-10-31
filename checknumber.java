package weekendnew4pm;

import java.util.Scanner;

public class checknumber {

	public static void main(String[] args) {
		System.out.println("check the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==0)
	-		System.out.println("number is zero");
		else if(num>=0)
		{
			System.out.println("number is positive ");
		}

		else
		{
			System.out.println("number is negative ");
		}

	}

}
