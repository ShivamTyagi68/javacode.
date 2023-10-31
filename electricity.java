package weekendnew4pm;

import java.util.Scanner;

public class electricity {

	public static void main(String[] args) {
		System.out.println("enter the electricity bill");
		Scanner sc=new Scanner(System.in);
		int unit=sc.nextInt();
		float amt,bill_amt,surcharge;
		if(unit<=50)
		{
			amt=unit*0.05f;		
		}
		else if(unit<=100)
		{
			amt=unit*1.20f;
		}
		else
		{
			amt=unit*1.50f;
		}
		surcharge=unit*0.2f;
		bill_amt=amt+surcharge;
		System.out.println("total electricity bill:"+bill_amt);
		
}
}
