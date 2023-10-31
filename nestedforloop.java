package weekendnew4pm;

import java.util.Scanner;

public class nestedforloop {

	public static void main(String[] args) {
		System.out.println("enter the table range");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//2
		int n1=sc.nextInt();//5
		for(int j=n;j<=n1;j++)//2 3 4 5
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(j+"*"+i+"="+(j*i));
			}
			
		}
	}

}
