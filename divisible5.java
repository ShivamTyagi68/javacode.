package weekendnew4pm;

import java.util.Scanner;

public class divisible5 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%5==0||num%5==5)
			System.out.println("number is divisible by 5");
		else
		{
			System.out.println("not divisible by 5");
		}
				
	}

}
