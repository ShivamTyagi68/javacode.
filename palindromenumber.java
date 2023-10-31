package weekendnew4pm;

import java.util.Scanner;

public class palindromenumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,count=0,sum=0;
		int temp=n;
		while(n>0)
		{
			int t=n%10;
			sum+=t;
			count++;
			rev=(rev*10)+t;
			n/=10;
			
		}
		System.out.println("reverse number:"+rev);
		System.out.println("number of digit:"+count);
		System.out.println("sum of digit:"+sum);
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}

}
